package deneme;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Butterfree extends Pokemon{


        boolean KartKullanildimi;
        private String tip;
        private String isim;
        private int hasarPuani=10;
        BufferedImage resim;

        public Butterfree(){

            super();

        }

        public Butterfree (String isim,String tip) {

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

            resim= ImageIO.read(new File("kart10.jpg"));

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
