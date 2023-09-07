import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda01 {

    public static void main(String[] args) {

        /*
        1- Lambda "Functional Programming --> method(action) kullanarak programlama
        ** genellikle hazır methodlar kullanılır
        ** az kod yapısıyla kompleks işlemler yapılabilir.

        2- Nasıl yapabilrim den ziyade ne yapabilirim.
        ** "Structured programming" kodları kendimiz yazdığımız
        ** "Functional programming" hazır methodlar kullanarak yazdığımız, kısa öz, hatasız çalışır.

        3- collectionlar kullanılır (List, Queue, Set, vs.)-- map ler kullanılmaz



         */


        List<Integer> number= new ArrayList<>(Arrays.asList(11,22,33,12,13,14,15,16,17,18,19,55,44,77,87,98,96,92,32,99,45,40,10));

        elemanlariYazdirForEach(number);

        elemanlariYazdirLamda(number);

        elemanlariYazdirFunctionLamda(number);

        ciftSayilariYazdirStructered(number);

        System.out.println("\nFunctional cift yazdirma");
        ciftSayilariYazdirFunctional(number);
        System.out.println();
        ciftSayilariYazdirFunctional2(number);

        System.out.println("\n50 sayisinden kücük cift sayilari yazdir");
        elliSayisindenKücükSayilariYazdir(number);





    }

    public static void elliSayisindenKücükSayilariYazdir(List<Integer> number) {
        number.stream().filter(Lamda01::ciftMi).filter(Lamda01::ellidenKücükMü).forEach(Lamda01::yazdir);
    }
    public static Boolean ellidenKücükMü(Integer a){
        return a<50;
    }

    public static void ciftSayilariYazdirFunctional2(List<Integer> number) {
        number.stream().filter(Lamda01::ciftMi).forEach(Lamda01::yazdir);
    }
    public static boolean ciftMi(Integer a){
        boolean ciftMi= a %2==0;

        return ciftMi;
    }

    public static void ciftSayilariYazdirFunctional(List<Integer> number) {

        number.stream().filter(t-> t%2==0).forEach(Lamda01::yazdir);
    }

    public static void ciftSayilariYazdirStructered(List<Integer> number) {
        System.out.println("\nStructered yazdırma");
        for (Integer eachNum:number
             ) {
            if (eachNum %2 ==0){
                System.out.print(eachNum+ " ");
            }
        }
    }

    public static void elemanlariYazdirFunctionLamda(List<Integer> number) {
        System.out.println("\nFunction olark method kullanma");
        number.stream().forEach(Lamda01::yazdir);
    }


    public static void elemanlariYazdirLamda(List<Integer> number) {
        System.out.println("\n\nLamda");

        number.stream().forEach((t) -> System.out.print(t+" "));

    }

    public static void elemanlariYazdirForEach(List<Integer> number) {
        System.out.println("foreach Loop :");
        for (Integer eachNum:number
        ) {
            System.out.print(eachNum+" ");
        }


    }

    public static void yazdir(int t){
        System.out.print(t+" ");
    }

}

