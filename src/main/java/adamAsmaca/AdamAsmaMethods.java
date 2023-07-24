package adamAsmaca;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdamAsmaMethods {
    String turkceKelimeYolu = "src/main/java/adamAsmaca/TurkeceKelimeler.txt";
    List<String> turkceKelimeler = turkceKelimeOku(turkceKelimeYolu);
    int idxKelime;
    static int hataSayisi;
    String kelime;
    int kelimeSayisi;
    StringBuilder kelimeBul= new StringBuilder();
    Scanner scan = new Scanner(System.in);
    public void giris(){

        System.out.println("=========== ADAM ASMA OYUNU ===========");
        System.out.println("||                                   ||");
        System.out.println("||   Adam Asma oyununa hoşgeldiniz.  ||");
        System.out.println("||                                   ||");
        System.out.println("============> made by msk <============");
        System.out.println("");
        System.out.println("===>>> OYUN YÜKLENİYOR <<<====");
        bekletme(5);
        sayiUret();

        //System.out.println(idxKelime);
        //System.out.println(turkceKelimeler.get(idxKelime));
        hataSayisi=0;
        kelimeSayisi=0;
        cizim();

        kelime=turkceKelimeler.get(idxKelime);
        kelimeIncele(kelime);

        String harf;
        int harfCounter=0;
        List<String> lst =new ArrayList();

        do{
            int hataCounter=0;
            System.out.print("lutfen bir harf giriniz : ");
            harf=scan.next().substring(0,1).toLowerCase();
            if(lst.contains(harf)){
                System.out.println(harf +" harfini daha once girdiniz.");
            }else{
                lst.add(harf);
                for (int i = 0; i <kelime.length() ; i++) {
                    if(kelime.substring(i,i+1).equals(harf)){
                        kelimeBul.replace(i,i+1,harf);
                        hataCounter++;
                        harfCounter++;

                    }
                }
                System.out.println(kelimeBul);
                //System.out.println(harfCounter);

                if(hataCounter==0){
                    hataSayisi++;
                    System.out.println("Hata sayısı : "+hataSayisi);
                    cizim();
                }
            }

    }while (hataSayisi<9 && harfCounter<kelime.length()-kelimeSayisi);
        System.out.println(harfCounter == kelime.length()-kelimeSayisi ? "Oyun bitti kazandiniz" : "Oyun bitti bu seferlik kaybettiniz. Kelime -> "+kelime);
        cikisDevam();
    }
    String sorun;
    private void cizim(){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Cizim();
            }
        });

    }
    private void cikisDevam() {
        kelimeBul.delete(0,kelime.length());
        System.out.print("Devam etmek istiyormusunuz? Devam etmek için 'E', çıkmak için herhangi bir tuşa basınız : ");
        sorun = scan.next().substring(0, 1).toUpperCase();

        if (sorun.equals("E")) {
            giris();
        } else {
            cikis();
        }
    }
    private void cikis(){
        System.out.println("Tebrikler iyi oynadınız. Oyundan Çıktınız.");
    }

    private void kelimeIncele(String kelime){

        for (int i = 0; i < this.kelime.length() ; i++) {
            if(this.kelime.substring(i,i+1).equals(" ")){
                kelimeSayisi++;
            }
        }
        int harfSayisi= this.kelime.length()-kelimeSayisi;
        System.out.println("Metin, "+(kelimeSayisi+1) + " kelime ve "+harfSayisi+" harften oluşuyor.");
        for (int i = 0; i < this.kelime.length() ; i++) {
            if(this.kelime.substring(i,i+1).equals(" ")){
                kelimeBul.insert(i," ");
            }else{
                kelimeBul.insert(i,"_");
            }
        }
        System.out.println(kelimeBul);
    }
   public List<String> turkceKelimeOku(String turkceKelimeYolu){
       List<String> satirlistesi = new ArrayList<>();

       try (BufferedReader br = new BufferedReader(new FileReader(turkceKelimeYolu))) {
            String satir;
           while ((satir = br.readLine()) != null) {
               satirlistesi.add(satir);
           }
       } catch (IOException e) {
           System.out.println("Dosya okuma hatası: " + e.getMessage());
       }
        return satirlistesi;
   }

    public int sayiUret() {
        Random rnd=new Random();
        int min=1;
        int max=turkceKelimeler.size();
        return idxKelime=rnd.nextInt(max-min+1)+min;
    }


    public void bekletme(int noktaSayisi){
        int beklemeSuresi = 500; // Her noktanın ardışık olarak gösterilme süresi (milisaniye cinsinden)

        for (int i = 0; i < noktaSayisi; i++) {
            System.out.print("* ");
            try {
                Thread.sleep(beklemeSuresi);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
