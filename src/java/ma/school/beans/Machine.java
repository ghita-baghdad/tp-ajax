/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.school.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author a
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "findByMarque", query = "From Machine where marque=:marque"),
    @NamedQuery(name = "findBetweenDate", query = "From Machine where dateAchat between :d1 and :d2")
})
public class Machine implements Serializable {

    @Id
    @GeneratedValue
    @Expose
    private int id;
    @Expose
    private String reference;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Expose
    private Date dateAchat;
    @Expose
    private double prix;
    @ManyToOne
    @Expose
    private Marque marque;

    public Machine() {
    }

    public Machine(String reference, Date dateAchat, double prix, Marque marque) {
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.marque = marque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

}
