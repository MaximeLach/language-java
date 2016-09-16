/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author admin
 */
public class Film {

    private String titre;
    private Integer dureeEnMinute;
    private String synopsis;
    private Integer annee;
    
            
    @Override
    public String toString() {
        return "Titre : " + titre + "\nDurée (mn) : " + "\nSynopsis : " + synopsis + "\nAnnée : " + annee; //To change body of generated methods, choose Tools | Templates.
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDureeEnMinute(Integer dureeEnMinute) {
        this.dureeEnMinute = dureeEnMinute;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public Integer getDureeEnMinute() {
        return dureeEnMinute;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Integer getAnnee() {
        return annee;
    }

}
