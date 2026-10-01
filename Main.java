/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionmagasin;

import java.util.Scanner;

/**
 *
 * @author TRETEC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //enregistrer l'entree 
        Scanner scanner = new Scanner(System.in);
        
        //creation magasin
        Magasin strad=new Magasin();
        
        //creation d'un client
        Client client1= new Client(1,"kenz", "kza@gmail.com");
        //creation panier
        Panier panier = new Panier();
        
        //creation de porduits
        Produit p1= new Produit(986, "sac",(float) 150.0 ,1);
        Produit p2 = new Produit(2, "haut", (float) 25.50, 12);
        Produit p3 = new Produit(3, "chaussure", (float)59.90, 8);
        
        //ajout des produits
        strad.ajouterProduit(p1);
        strad.ajouterProduit(p2);
        strad.ajouterProduit(p3);
        
        //creation du menu
       int choix;
       do {
            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option (1-5) : ");

            choix = scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("\n--- Produits Disponibles ---");
                    strad.afficherProduitDisponibles();
                    break;

                case 2:
                    System.out.print("\nEntrez le nom du produit à ajouter : ");
                    String nomRecherche = scanner.nextLine();
                    Produit produitTrouve = strad.trouverProduitParNom(nomRecherche);

                    if (produitTrouve != null) {
                        panier.ajouterProduit(produitTrouve);
                        System.out.println(produitTrouve.getNom() + " a bien été ajouté au panier !");
                    } else {
                        System.out.println("Désolé, aucun produit trouvé avec le nom : " + nomRecherche);
                    }
                    break;

                case 3:
                    System.out.println("\n--- Votre Panier ---");
                    panier.afficherPanier();
                    System.out.println("Total actuel : " + panier.calculerTotal() + " €");
                    break;

                case 4:
                    if (panier.getProduits().isEmpty()) {
                        System.out.println("\nVotre panier est vide. Ajoutez d'abord des produits avant de commander.");
                    } else {
                        System.out.println("\n--- Validation de la commande ---");
                        Commande commande = new Commande(client1, panier);
                        commande.afficherDetailsCommande();
                        
                        // Réinitialise le panier après commande validée
                        panier = new Panier();
                        System.out.println("Merci pour votre commande !");
                    }
                    break;

                case 5:
                    System.out.println("\nMerci de votre visite et à bientôt !");
                    break;

                default:
                    System.out.println("\nOption invalide. Veuillez choisir un chiffre entre 1 et 5.");
                    break;
            }

        } while (choix != 5);

        scanner.close();
    }
        
}