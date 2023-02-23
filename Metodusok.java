package metodusok;

public class Metodusok {

    
    public static void main(String[] args) {
       kiir("Elsõ 10 szám összege: "+elso10szam()+"\n");
       
       int osszeg1, osszeg2, osszeg3;
       int szam1 = 6, szam2 = 3, szam3 = 8, szam4 = 9;
       osszeg1 = osszead(szam1, szam2);
       kiir("%d + %d = %d\n".formatted(szam1, szam2, osszeg1));
       osszeg2 = osszead(szam3, szam4);
       kiir("%d + %d = %d\n".formatted(szam3, szam4, osszeg2));
       osszeg3 = osszead(osszeg1, osszeg2);
       kiir("%d + %d = %d\n".formatted(osszeg1, osszeg2, osszeg3));
    }
    private static int elso10szam(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++){
            osszeg += i;
        }
        return osszeg;
    }
    
    private static int osszead(int a, int b){
        return a+b;
    }
    
    private static void kiir(String szoveg){
        System.out.print(szoveg);
    }
}

