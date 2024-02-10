package TP_2;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        MetierProduitImpl metierProduit = new MetierProduitImpl(new ArrayList<>());


        metierProduit.add(new Produit(1, "nom 1", "marque 1", 20.20, "desc 1", 30));
        metierProduit.add(new Produit(2, "nom 2", "marque 2", 22.22, "desc 2", 30));
        metierProduit.add(new Produit(3, "nom 3", "marque 3", 33.33, "desc 3", 30));

        System.out.println(metierProduit.getAll());
        System.out.println(metierProduit.getById(3L));
        System.out.println(metierProduit.getAll());
        metierProduit.delete(3L);
        System.out.println(metierProduit.getAll());
    }
}
