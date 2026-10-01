/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

import java.util.ArrayList;

/**
 *
 * @author TRETEC
 */
public class Magasin {
    private ArrayList<Produit> produits;
    
    public Magasin(){
        this.produits=new ArrayList<>();
    }
    
    public void ajouterProduit(Produit produit) {
        if (produit != null) {
            this.produits.add(produit);
        }
    }
    public void afficherProduitDisponibles(){
        for(Produit p : this.produits){
            p.afficherDetails();
        }
    }
    public Produit trouverProduitParNom(String nom){
        for(Produit p : this.produits){
            if(p.getNom().equalsIgnoreCase(nom)){
                return p;
            }
        }
        return null;
    }
    
    
    
}
