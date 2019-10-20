import java.util.ArrayList;

public class tekCift {

/*    1 den 100 kadar olan sayıların Tek mı Cıft mı olduguna bakıyoruz */

    public static void main(String[] args) {

        ArrayList a = new ArrayList();      // a listemızde Cift olan sayıları  lıstelıcez
        ArrayList b = new ArrayList();      //  b listemizde Tek  olan sayıları  listelicez



        // For dongumuzu olusturuyoz. 1den 100 kadar
        for (int i=1;i<101;i++){
            if (i%2==0){            // 2 bolumde 0 kalıyorsa sayı cıfttır.
                a.add(i);           // sonuc 0 ise a listemıze eklıcek
            }
            if (i%2==1){            // 2 ye bolumde 1 arta kalıyorsa tek sayıdır.
                b.add(i);           // sonucta 1 kalıyorsa  b listemıze eklıcek

            }

        }

    System.out.println("2 ye Bolunenler\n "+a);
    System.out.println("5 e Bolunenler\n "+b);


    }

}
