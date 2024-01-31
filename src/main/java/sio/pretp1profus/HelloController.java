package sio.pretp1profus;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private AnchorPane apColosso;
    @FXML
    private AnchorPane apDesert;
    @FXML
    private AnchorPane apForest;
    @FXML
    private AnchorPane apSky;
    @FXML
    private AnchorPane apChoix;
    @FXML
    private AnchorPane apAffCombat;
    @FXML
    private ImageView imgMonstre;
    @FXML
    private ImageView imgPersonnage;
    @FXML
    private AnchorPane apChoixPerso;
    Personnage p;
    Monstre m;
    Monstre monstreDesert1 = new Monstre("Roc", 30, 1000, 1000, 15, 20, 15, 1, "Monstres/Desert.gif");
    Monstre monstreDesert2 = new Monstre("Squelette", 30, 1200, 1200, 20, 20, 15, 1, "Monstres/DesertRoc.gif");
    Monstre monstreColosso1 = new Monstre("Loup", 25, 500, 500, 10, 5, 10, 2, "Monstres/ColossoWolf.gif");
    Monstre monstreColosso2 = new Monstre("Bandit", 30, 550, 550, 15, 10, 15, 2, "Monstres/ColossoBrigand.gif");
    Monstre monstreForest1 = new Monstre("Champignon", 40, 1000, 1000, 25, 2, 15, 3, "Monstres/ForestMushroom.gif");
    Monstre monstreForest2 = new Monstre("Arbre", 45, 1050, 1050, 30, 3, 5, 3, "Monstres/ForestWalker.gif");
    Monstre monstreSky1 = new Monstre("Diablotin", 50, 1300, 1300, 35, 15, 20, 4, "Monstres/SkyDeath.gif");
    Monstre monstreSky2 = new Monstre("Griffon", 55, 1400, 1400, 20, 10, 5, 4, "Monstres/SkyGryphon.gif");
    @FXML
    private Label lblPvActuelPersonnage;
    @FXML
    private Label lblPvMaxPersonnage;
    @FXML
    private Label lblPvActuelAdversaire;
    @FXML
    private Label lblPvMaxAdversaire;
    @FXML
    private ImageView imgMonstre1;
    @FXML
    private Label lblNomAdversaire;
    @FXML
    private AnchorPane apFin;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clearAll();
        visible(apChoixPerso);
    }
    public void changeImageViewImg(ImageView imgView, String linkImage){
        imgView.setImage(new Image(getClass().getResource("/Images/"+linkImage).toExternalForm()));
    }
    public void invisible(AnchorPane ap)
    {
        ap.setVisible(false);
    }
    public void visible(AnchorPane ap)
    {
        ap.setVisible(true);
    }
    public void clearAll()
    {
        invisible(apChoix);
        invisible(apAffCombat);
        invisible(apChoixPerso);
        invisible(apColosso);
        invisible(apSky);
        invisible(apForest);
        invisible(apDesert);
        invisible(apFin);
    }
    public int alea()
    {
        return (int)(Math.random() * 101);  // 0 to 100
    }
    public void changeMap(AnchorPane newAp)
    {
        clearAll();
        visible(newAp);
    }
    public void reloadVita()
    {
        // Cette fonction doit mettre à jour les points de vie en combat.
    }
    public void modeCombat(Monstre m1, Monstre m2)
    {
        visible(apAffCombat);

        if(alea() < 70)
        {
            m = m1;
        }
        else
        {
            m = m2;
        }
        m.setVieActuelle(m.getVieMax());
        changeImageViewImg(imgPersonnage, p.getImgURL());
        changeImageViewImg(imgMonstre, m.getImgURL());
        lblNomAdversaire.setText(m.getNom());
        reloadVita();

    }
    public void attaqueMonstre()
    {
        int pv = p.subirDegats(m.attaqueTotale());
        if(pv <= 0)
        {
            changeMap(apFin);
            invisible(apAffCombat);
        }
        reloadVita();

    }
    public void goToSky(MouseEvent mouseEvent) {
        changeMap(apSky);
        modeCombat(monstreSky1, monstreSky2);

    }

    public void goToForest(MouseEvent mouseEvent) {
        changeMap(apForest);
        modeCombat(monstreForest1, monstreForest2);
    }

    public void goToDesert(MouseEvent mouseEvent) {
        changeMap(apDesert);
        modeCombat(monstreDesert1, monstreDesert2);
    }

    public void goToColosso(MouseEvent mouseEvent) {
        changeMap(apColosso);
        modeCombat(monstreColosso1, monstreColosso2);
    }

    public void goToAttaque(MouseEvent mouseEvent) {
        // Votre personnage attaque l'adversaire. Après cela, c'est l'adversaire qui vous attaque. Si vous tombez à 0, fin du jeux.
        // Si l'adversaire tombe à 0, augmente une des stats aléatoirement

    }

    public void goToFuite(MouseEvent mouseEvent) {
        changeMap(apChoix);
        invisible(apAffCombat);
        attaqueMonstre();
    }

    public void goToSoin(MouseEvent mouseEvent) {
        p.getSoin();
        attaqueMonstre();
    }

    public void goToIsaac(MouseEvent mouseEvent) {
        changeMap(apChoix);
        p = new Personnage("Isaac", 25, 600, 600, 20, 5, 25, 10, "Personnages/Isaac.gif");
        changeImageViewImg(imgPersonnage, p.getImgURL());
    }

    public void GoToGareth(MouseEvent mouseEvent) {
        changeMap(apChoix);
        p = new Personnage("Gareth", 20, 700, 700, 25, 0, 0, 5, "Personnages/Garet.gif");
        changeImageViewImg(imgPersonnage, p.getImgURL());
    }

    public void GoToIvan(MouseEvent mouseEvent) {
        changeMap(apChoix);
        p = new Personnage("Ivan", 15, 500, 500, 15, 30, 75, 20, "Personnages/Ivan.gif");
        changeImageViewImg(imgPersonnage, p.getImgURL());
    }

    public void goToMia(MouseEvent mouseEvent) {
        changeMap(apChoix);
        p = new Personnage("Mia", 15, 650, 650, 10, 30, 50, 20, "Personnages/Mia.gif");
        changeImageViewImg(imgPersonnage, p.getImgURL());
    }


}