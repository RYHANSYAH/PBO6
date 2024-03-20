package OverloadingdanOverriding;

/**
 *
 * @author Rayhansyah
 */
public class Main {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Rayhansyah", 50000);
        Manajer manajer1 = new Manajer("BPK.Alun Sujjada S.Kom,M.T", 800000, "Apple");
  
        System.out.println("Info Karyawan:");
        karyawan1.tampilkanInfo(); 
        System.out.println("---------------------------------");
        System.out.println("\nInfo Manajer:");
        manajer1.tampilkanInfo(); 
    }
}

