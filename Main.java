package main;

public class Main {


    public static void main(String[] args) {
    
        Pbo r =new Pbo();      
        r.setAngka1(100);
        r.setAngka2(5);
        
        int penjumlahan = r.getAngka1() + r.getAngka2();
        int pengurangan = r.getAngka1() - r.getAngka2();
        int perkalian = r.getAngka1() * r.getAngka2();
        int pembagian = r.getAngka1() / r.getAngka2();
        
        System.out.println("Penjumlahan" + r.getAngka1() + " + " + r.getAngka2() + " = " + penjumlahan);
        System.out.println("Pengurangan" + r.getAngka1() + " - " + r.getAngka2() + " = " + pengurangan);
        System.out.println("Perkalian" + r.getAngka1() + " * " + r.getAngka2() + " = " + perkalian);
        System.out.println("Pembagian" + r.getAngka1() + " * " + r.getAngka2() + " = " + pembagian);
        
    }
    
}
