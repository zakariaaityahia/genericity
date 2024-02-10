package TP_2;

public class Produit {
    private int Id;
    private String Nom;
    private String Marque;
    private double Prix;
    private String Description;
    private int nbStock;

    public Produit(int id, String nom, String marque, double prix, String description, int nbStock) {
        Id = id;
        Nom = nom;
        Marque = marque;
        Prix = prix;
        Description = description;
        this.nbStock = nbStock;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double prix) {
        Prix = prix;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getNbStock() {
        return nbStock;
    }

    public void setNbStock(int nbStock) {
        this.nbStock = nbStock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "Id=" + Id +
                ", Nom='" + Nom + '\'' +
                ", Marque='" + Marque + '\'' +
                ", Prix=" + Prix +
                ", Description='" + Description + '\'' +
                ", nbStock=" + nbStock +
                '}';
    }
}
