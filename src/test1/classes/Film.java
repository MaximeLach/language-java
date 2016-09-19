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
    private Genre genre;
    private Acteur acteur;
    private static long nombre;
    
   
    @Override
    public String toString() {
        return "Titre : " + titre  +
                "\nDurée (en mn) : " + dureeEnMinute + 
                "\nSynopsis : " + synopsis +
                "\nAnnée : " + annee +
                "\nGenre : " + genre +
                "\nActeur : " + acteur; //To change body of generated methods, choose Tools | Templates.
    }

    public Film() {
        nombre++;
    }

    public Film(String titre, Integer dureeEnMinute, String synopsis, Integer annee, Genre genre, Acteur acteur) {
        this();
        this.titre = titre;
        this.dureeEnMinute = dureeEnMinute;
        this.synopsis = synopsis;
        this.annee = annee;
        this.genre = genre;
        this.acteur = acteur;
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
