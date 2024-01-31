package sio.pretp1profus;

public class Personnage {
    private String nom;
    private int attaque;
    private int vieActuelle;
    private int vieMax;
    private int defense;
    private int critique;
    private int esquive;

    private int soin;
    private String imgURL;

    public Personnage(String nom, int attaque, int vieActuelle, int vieMax, int defense, int critique, int esquive, int soin, String imgUrl) {
        this.nom = nom;
        this.attaque = attaque;
        this.vieActuelle = vieActuelle;
        this.vieMax = vieMax;
        this.defense = defense;
        this.critique = critique;
        this.esquive = esquive;
        this.imgURL = imgUrl;
        this.soin = soin;
    }
    public void seSoigner()
    {
        if(this.vieActuelle + this.soin > this.vieMax)
        {
            this.vieActuelle = this.vieMax;
        }
        else
        {
            this.vieActuelle += this.soin;
        }
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
    public int alea()
    {
        return (int)(Math.random() * 101);  // 0 to 100
    }
    public int attaqueTotal()
    {
        int attaqueFinale = this.getAttaque() + this.getAttaque()  * (int) ((alea()-50)*0.1);

        if (alea() <= this.critique)
        {
            attaqueFinale *= 2;
        }

        return attaqueFinale;
    }
    public void augmenterAlea()
    {
        int a = alea();
        if(a < 25)
        {
            this.vieMax += 5;
        } else if (a < 50) {
            this.attaque += 5;
        } else if (a < 75) {
            this.defense += 1;
        }
        else
        {
            this.soin += 5;
        }

    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public int getSoin() {
        return soin;
    }

    public void setSoin(int soin) {
        this.soin = soin;
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


}
