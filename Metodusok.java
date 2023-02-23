package metodusok;

public class Metodusok {

    
    public static void main(String[] args) {
       kiir("Elsõ 10 szám összege: "+elso10szam()+"\n");
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

