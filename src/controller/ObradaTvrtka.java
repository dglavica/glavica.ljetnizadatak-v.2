/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Tvrtka;

/**
 *
 * @author Avalg
 */
public class ObradaTvrtka {

    private Connection veza;
    private PreparedStatement izraz;
    private ResultSet rs;

    public ObradaTvrtka() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            veza = DriverManager.getConnection("jdbc:mysql://127.0.0.1/benzinskacrpka", "edunova", "edunova");
        } catch (Exception e) {

        }

    }

    public void zatvoriVezu() {
        try {
            veza.close();

        } catch (SQLException ex) {

        }
    }

    public List<Tvrtka> getTvrtke() {
        List<Tvrtka> tvrtke = new ArrayList<>();
        try {
            izraz = veza.prepareStatement("select * from tvrtka where obrisano=false");
            rs = izraz.executeQuery();
            Tvrtka t;
            while (rs.next()) {
                t = new Tvrtka();
                t.setSifra(rs.getLong("sifra"));
                t.setNazivTvrtke(rs.getString("naziv_tvrtke"));
                t.setOib(rs.getString("oib"));
                t.setVlasnik(rs.getString("vlasnik"));
                t.setDjelatnost(rs.getString("djelatnost"));

                tvrtke.add(t);
            }
            rs.close();
            izraz.close();
        } catch (Exception e) {

        }
        return tvrtke;
    }

    public void kreirajTvrtka(Tvrtka t) {
        try {
            izraz = veza.prepareStatement("insert into tvrtka (naziv_tvrtke, oib, vlasnik, djelatnost) values (?,?,?,?)");
            izraz.setString(1, t.getNazivTvrtke());
            izraz.setString(2, t.getOib());
            izraz.setString(3, t.getVlasnik());
            izraz.setString(4, t.getDjelatnost());
            izraz.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void promjeniTvrtka(Tvrtka t) {
        try {
            izraz = veza.prepareStatement("update tvrtka set naziv_tvrtke =?, oib=?, vlasnik=?, djelatnost=? where sifra=?");
            izraz.setString(1, t.getNazivTvrtke());
            izraz.setString(2, t.getOib());
            izraz.setString(3, t.getVlasnik());
            izraz.setString(4, t.getDjelatnost());
            izraz.setLong(5, t.getSifra());
            izraz.execute();
        } catch (Exception e) {

        }
    }

    public void obrisiTvrtka(Tvrtka t) {
        try {
            izraz = veza.prepareStatement("update tvrtka set obrisano=true where sifra=?");
            izraz.setLong(1, t.getSifra());
            izraz.execute();
        } catch (Exception e) {
        }
    }
}
