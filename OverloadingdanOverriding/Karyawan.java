package OverloadingdanOverriding;

/**
 *
 * @author Rayhansyah
 */
public class Karyawan {
    private String nama;
    private double gaji;

    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: $" + gaji);
    }
}

class Manajer extends Karyawan {
    private String departemen;

    public Manajer(String nama, double gaji, String departemen) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Perusahaan: " + departemen);
    }
}


