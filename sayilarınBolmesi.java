

import java.util.ArrayList;

public class sayilarınBolmesi {

/*    1 den 100 kadar olan sayıların 2  ve 5 bolunenlerı lısteleme
           ve   Sayıların toplamlarını bulma    */

    public static void main(String[] args) {

        ArrayList a = new ArrayList();      // a listemızde 2 ye bolunenlerı lıstelıcez
        ArrayList b = new ArrayList();      //  b listemizde 5 e  bolunenlerı listelicez

        // Sayıların Toplamını bulmak ıcın 2 tane ınt deger atamamız lazım

        int c= 0;       // 2 ye bolunenlerın toplamını burda hesaplıcaz
        int d= 0;       // 5 e bolunenlerın  toplamını burda hesaplıcaz

        // For dongumuzu olusturuyoz. 1den 100 kadar
        for (int i=1;i<101;i++){
            if (i%2==0){            // 1 den 100 kadar olan  sayılarda 2ye tam bolunenleri kontrol etcek
                a.add(i);           // sonuc 0 ise a listemıze eklıcek
                c+=i;               // sonuc 0 ise sayıları atadıgımız c ile topluyacak
            }
            if (i%5==0){            // 1 den 100 kadar olan  sayılarda 5e tam bolunenleri kontrol etcek
                b.add(i);           // sonuc 0 ise b listemıze eklıcek
                d+=i;               // sonuc 0 ise sayıları atadıgımız d ile topluyacak
            }

        }

    System.out.println("2 ye Bolunenler\n "+a);
    System.out.println("5 e Bolunenler\n "+b);
    System.out.println("2 ye Bolunenlerın Toplamı : "+c);
    System.out.println("5 ye Bolunenlerın Toplamı : "+d);
    System.out.println("2 ve 5 e bolunenlerın Toplamı : "+(c+d));  // Tum sayıların toplamını bulduk bu sayede

    }

}

