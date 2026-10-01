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
public class Panier {
    private ArrayList<Produit> produits; 
    
    public Panier(){
        this.produits=new ArrayList<>();
    }
    public ArrayList<Produit> getProduits(){
        return this.produits;
    }
    public void setProduits(ArrayList<Produit> produits){
        this.produits=produits;
    }
    public void ajouterProduit(Produit produit){
        this.produits.add(produit);
    }
    public void supprimerProduit(Produit produit){
        this.produits.remove(produit);
    }
    public void afficherPanier(){
        for( Produit p : this.produits){
           p.afficherDetails();
        }
    }
    public float calculerTotal(){
        float total=0;
        for(Produit p : this.produits){
            total+=p.getPrix();
        }
        return total;
    }
}

