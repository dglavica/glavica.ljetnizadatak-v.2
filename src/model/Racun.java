/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Avalg
 */
@Entity
@Table
public class Racun extends Entitet implements Serializable {

    private String nacinPlacanja;
    private BigDecimal pdv;
    @ManyToOne
    private Tvrtka r1;
    @ManyToOne
    private BenzinskaCrpka benzinskaCrpka;

    @OneToMany(mappedBy = "racun")
    private List<Tocenje> tocenja;

    public List<Tocenje> getTocenja() {
        return tocenja;
    }

    public void setTocenja(List<Tocenje> tocenja) {
        this.tocenja = tocenja;
    }

    public String getNacinPlacanja() {
        return nacinPlacanja;
    }

    public void setNacinPlacanja(String nacinPlacanja) {
        this.nacinPlacanja = nacinPlacanja;
    }

    public BigDecimal getPdv() {
        return pdv;
    }

    public void setPdv(BigDecimal pdv) {
        this.pdv = pdv;
    }

    public Tvrtka getR1() {
        return r1;
    }

    public void setR1(Tvrtka r1) {
        this.r1 = r1;
    }

    public BenzinskaCrpka getBenzinskaCrpka() {
        return benzinskaCrpka;
    }

    public void setBenzinskaCrpka(BenzinskaCrpka benzinskaCrpka) {
        this.benzinskaCrpka = benzinskaCrpka;
    }

}
