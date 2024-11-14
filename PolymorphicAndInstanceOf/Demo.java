package Jobsheet_11.PolymorphicAndInstanceOf;

import Jobsheet_11.Heterogenous.Dosen;

public class Demo {
    public static void main(String[] args) {
        //Instansiasi object dari class Dosen
        Pegawai pegawai = new Dosen("12345", "James William", "12274");

        //Cek apakah pegawai sebenarnya instance dari Dosen sebelum melakukan downcasting
        if (pegawai instanceof Dosen) {
            //Downcasting ke tipe Dosen
            Dosen dosen = (Dosen) pegawai;
            dosen.displayInfo();
            dosen.mengajar();
        } else {
            System.out.println("Downcasting gagal. Pegawai bukan instance dari Dosen.");
        }
    }
}
