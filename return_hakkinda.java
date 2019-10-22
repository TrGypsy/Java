
public class return_hakkinda {


    public static int toplama(int a,int b,int c){       // c

        int toplama;                                // Degiskenı belirliyoruz
        return toplama =(a+b+c);                    // return degeri atayıp maın clasımızdan ulasıyoruz
    }
    public static int carpma(int a,int b,int c){
        int carpma;
        return carpma=(a*b*c);
    }
    public static float bolme(float e,float d,float f) {

        float bolme;
        return bolme = (e / d / f);

    }


    public static void main(String[] args) {
        System.out.println("Toplamları : "+toplama(5,4,3));
        System.out.println("Carpımları : "+carpma(5,4,3));
        System.out.println("Bolum : "+bolme(5,4,3));

    }

}
