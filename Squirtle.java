package deneme;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Squirtle extends Pokemon {


    private  String tip;
    private String isim;
    boolean KartKullanildimi;
    private int hasarPuani=30;
    BufferedImage resim;


    public Squirtle(){

        super();


    }

    public Squirtle(String isim,String tip) {


        super(isim,tip);


    }


    public int hasarPuaniGoster(){

        return hasarPuani;

    }

    public boolean isKartKullanildimi() {
        return KartKullanildimi;
    }

    public void setKartKullanildimi() {
        KartKullanildimi = true;
    }

    public void setKartKullanildimiFalse(){

        KartKullanildimi = false;
    }

    public BufferedImage getResimÖn(){

        try{

            resim= ImageIO.read(new File("kart17.jpg"));

        }catch(IOException ex){

        }

        return resim;

    }


    public BufferedImage getResimArka(){

        try{

            resim=ImageIO.read(new File("yok4.png"));

        }catch(IOException ex){


        }

        return resim;

    }
}
