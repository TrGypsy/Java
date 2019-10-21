import java.util.Scanner;

public class Kayıt_Olusturma {
    
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        String ad = girdi.next();
        System.out.print("Sifrenizi girinz  : ");
        String sifre = girdi.next();
        System.out.println("Kayıt Olunmustur. ");

        while (true){
            System.out.print("Kullanıcı Adınızı Giriniz 	  : ");
            String kad = girdi.next();
            System.out.print("Sifrenizi girinz  : ");
            String ksifre = girdi.next();

            if((ad.equals(kad)) && (sifre.equals(ksifre))){
                System.out.println("Hosgeldiniz : "+ad);
                break;
            }

            else if ((!ad.equals(kad) && (sifre.equals(ksifre)))){
                System.out.println("Kullanıcı Adınızı Yanlıs Girdiniz ");

            }
            else if ((ad.equals(kad) && (!sifre.equals(ksifre)))){
                System.out.println("Sifrenizi  Yanlıs Girdiniz ");

            }

        }
    }


}
