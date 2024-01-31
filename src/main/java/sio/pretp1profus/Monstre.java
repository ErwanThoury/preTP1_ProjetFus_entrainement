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

    public String getImgURL() {
        return imgURL;
    }
    public int alea()
    {
        return (int)(Math.random() * 101);  // 0 to 100
    }
    public int subirDegats(int degat)
    {
        if(alea() <= this.esquive)
        {
            return this.vieActuelle;
        }
        degat -= this.defense;
        if (degat <= 0)
            degat = 1;
        this.vieActuelle -= degat;
        return this.vieActuelle;
    }
    public int attaqueTotale()
    {
        int attaqueFinale = this.getAttaque() + this.getAttaque() * (int) ((alea()-50)*0.1);

        if (alea() <= this.critique)
        {
            attaqueFinale *= 2;
        }

        return attaqueFinale;
    }
    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getVieActuelle() {
        return vieActuelle;
    }

    public void setVieActuelle(int vieActuelle) {
        this.vieActuelle = vieActuelle;
    }

    public int getVieMax() {
        return vieMax;
    }

    public void setVieMax(int vieMax) {
        this.vieMax = vieMax;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getCritique() {
        return critique;
    }

    public void setCritique(int critique) {
        this.critique = critique;
    }

    public int getEsquive() {
        return esquive;
    }

    public void setEsquive(int esquive) {
        this.esquive = esquive;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }
}
