package sio.pretp1profus;

public class Personnage {
    /* Classe ayant comme attribut : String nom, int attaque, int defense, int vieActuelle, int vieMax, int critique, int esquive, int soin, String imgURL
    Faire également le constructeur
    * */

    public void seSoigner()
    {
        // Cette fonction est chargée de soigner le personnage à l'aide de la statistique en soin
    }
    public int subirDegats(int degat)
    {
        // Cette fonction est chargée de faire perdre des points de vie aux joueurs en prenant en compte son esquive et sa défense.
        return 0;
    }
    public int alea()
    {
        return (int)(Math.random() * 101);  // 0 to 100
    }
    public int attaqueTotal()
    {
        // Cette fonction est chargée de donner l'attaque finale du personnage, en prenant en compte les coups critiques.
        return 0;
    }
    public void augmenterAlea()
    {
        // Cette fonction augmente aléatoirement l'une des stats

    }



}
