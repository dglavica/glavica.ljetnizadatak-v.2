/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Avalg
 */
@Entity
@Table
public class Tvrtka extends Entitet implements Serializable {

    private String nazivTvrtke, oib, vlasnik, djelatnost;

    @OneToMany(mappedBy = "r1")
    private List<Racun> racuni;

    public List<Racun> getRacuni() {
        return racuni;
    }

    public void setRacuni(List<Racun> racuni) {
        this.racuni = racuni;
    }

    public String getNazivTvrtke() {
        return nazivTvrtke;
    }

    public void setNazivTvrtke(String nazivTvrtke) {
        this.nazivTvrtke = nazivTvrtke;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String getDjelatnost() {
        return djelatnost;
    }

    public void setDjelatnost(String djelatnost) {
        this.djelatnost = djelatnost;
    }

    @Override
    public String toString() {
        return "Tvrtka (" + nazivTvrtke + ')';
    }

}
