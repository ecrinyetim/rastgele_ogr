import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class App {

    public static void Yaz(String [] dizi){

    for(int i=0;i<dizi.length;i++){
        System.out.print(" " + dizi[i]);
    }
    }
    public static String[]  CevapOlusturma(String... dizi1){
         String cvp;
        Random rnd=new Random();
        for(int i=0;i<dizi1.length;i++){
           int x=rnd.nextInt(5);
           switch(x){
            case 0: cvp="A";dizi1[i]=cvp;break;
            case 1: cvp="B";dizi1[i]=cvp;break;
            case 2: cvp="C";dizi1[i]=cvp;break;
            case 3: cvp="D";dizi1[i]=cvp;break;
            case 4: cvp="E";dizi1[i]=cvp;break;
        }
    } return dizi1;
}
    public static void main(String[] args) {
        
       
        String [] d_cevaplar=new String[10];
        
        CevapOlusturma(d_cevaplar);
          System.out.println("Doğru Cevaplar: "); Yaz(d_cevaplar);
          Scanner scan=new Scanner(System.in);
          System.out.println("\nKaç Öğrenci Olduğunu Giriniz: ");
          int ogrSayı=scan.nextInt();

         String[][] ogrCevapları=new String[ogrSayı][10];
         String[] dizi2=new String[10];
         for(int i=0;i<ogrSayı;i++){
            CevapOlusturma(dizi2);
           for(int j=0;j<10;j++){
            ogrCevapları[i][j]=dizi2[j];
           }

         }
         int sayac=0;
          for(int i=0;i<ogrSayı;i++){
            System.out.print((i+1)+" . Öğrenci Cevapları: ");
           for(int j=0;j<10;j++){
          System.out.print(" "+ ogrCevapları[i][j]);
          if(ogrCevapları[i][j]==d_cevaplar[j]){
           sayac++;
          }
           }
           if(sayac>0){
            System.out.println(" Doğtu Cevap Sayısı: "+ sayac );
           }
           else
           System.out.println(" doğru Cevap Yoktur");
           System.out.println();
          sayac=0;
         }

    }
}
