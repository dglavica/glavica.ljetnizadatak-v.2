/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Avalg
 */
@Entity
@Table
public class NarudzbaCisterne extends Entitet implements Serializable {

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date vrijemeNarudzbe;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date vrijemeIsporuke;
    private BigDecimal kolicina, nabavnaCijena, trosak;

    @ManyToOne
    private BenzinskaCrpka benzinskaCrpka;
    @ManyToOne
    private Gorivo gorivo;

    public Date getVrijemeNarudzbe() {
        return vrijemeNarudzbe;
    }

    public void setVrijemeNarudzbe(Date vrijemeNarudzbe) {
        this.vrijemeNarudzbe = vrijemeNarudzbe;
    }

    public Date getVrijemeIsporuke() {
        return vrijemeIsporuke;
    }

    public void setVrijemeIsporuke(Date vrijemeIsporuke) {
        this.vrijemeIsporuke = vrijemeIsporuke;
    }

    public BigDecimal getKolicina() {
        return kolicina;
    }

    public void setKolicina(BigDecimal kolicina) {
        this.kolicina = kolicina;
    }

    public BigDecimal getNabavnaCijena() {
        return nabavnaCijena;
    }

    public void setNabavnaCijena(BigDecimal nabavnaCijena) {
        this.nabavnaCijena = nabavnaCijena;
    }

    public BigDecimal getTrosak() {
        return trosak;
    }

    public void setTrosak(BigDecimal trosak) {
        this.trosak = trosak;
    }

    public BenzinskaCrpka getBenzinskaCrpka() {
        return benzinskaCrpka;
    }

    public void setBenzinskaCrpka(BenzinskaCrpka benzinskaCrpka) {
        this.benzinskaCrpka = benzinskaCrpka;
    }

    public Gorivo getGorivo() {
        return gorivo;
    }

    public void setGorivo(Gorivo gorivo) {
        this.gorivo = gorivo;
    }

}
