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
public class Commande {
    private static int compteur = 1;
    
    private int idCommande;
    private Client client;
    private Panier produitsCommandes;
    private float total;
    
    public Commande(Client client, Panier produitsCommandes){
        this.idCommande=compteur++;
        this.client=client;
        this.produitsCommandes=produitsCommandes;
        this.total = produitsCommandes.calculerTotal();
    }
    
    public void afficherDetailsCommande(){
        System.out.println("Client : " + client.getNom() + "commande :");
        produitsCommandes.afficherPanier();
        
    }
    public int getIdCommande() {
        return this.idCommande;
    }

    public Client getClient() {
        return this.client;
    }

    public float getTotal() {
        return this.total;
    }
    
}
