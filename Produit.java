/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

/**
 *
 * @author TRETEC
 */
public class Produit {
    private int id;
    private String nom;
    private float prix;
    private int quantite;

    public Produit(int id, String nom, float prix, int quantite){
        this.id=id;
        this.nom=nom;
        this.prix=prix;
        this.quantite=quantite;
    }

    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public float getPrix(){
        return prix;
    }
    public int getQuantite(){
        return quantite;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setPrix(float prix){
        this.prix=prix;
    }
    public void setQuantite(int quantite){
        this.quantite=quantite;
    }

    public void afficherDetails() {
        System.out.println("Client n°" + this.id + " | Nom : " + this.nom + " | Prix : " + this.prix + "| quantite : " + this.quantite);
    }
}
