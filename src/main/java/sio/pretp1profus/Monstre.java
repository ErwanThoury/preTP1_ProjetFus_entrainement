package sio.pretp1profus;

public class Monstre {
    private String nom;
    private int attaque;
    private int vieActuelle;
    private int vieMax;
    private int defense;
    private int critique;
    private int esquive;
    private int zone;
    private String imgURL;

    public Monstre(String nom, int attaque, int vieActuelle, int vieMax, int defense, int critique, int esquive, int zone, String imgURL) {
        this.nom = nom;
        this.attaque = attaque;
        this.vieActuelle = vieActuelle;
        this.vieMax = vieMax;
        this.defense = defense;
        this.critique = critique;
        this.esquive = esquive;
        this.zone = zone;
        this.imgURL = imgURL;
    }


    public int alea()
    {
        return (int)(Math.random() * 101);  // 0 to 100
    }
    public int subirDegats(int degat)
    {
        return 0;
    }
    public int attaqueTotale()
    {


        return 0;
    }

}
