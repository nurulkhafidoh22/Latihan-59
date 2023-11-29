/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program Latihan 59
 */

// Kelas utama untuk karakter
class Karakter {
    String nama;
    int usia;

    Karakter(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    void perkenalkan() {
        System.out.println("Halo, saya " + nama + " dan saya berusia " + usia + " tahun.");
    }
}

// Kelas abstrak Detektif yang mewarisi dari Karakter
abstract class Detektif extends Karakter {
    int kasusTerselesaikan;

    Detektif(String nama, int usia, int kasusTerselesaikan) {
        super(nama, usia);
        this.kasusTerselesaikan = kasusTerselesaikan;
    }

    abstract void selesaikanKasus();
}

// Kelas Conan yang mewarisi dari Detektif
class Conan extends Detektif {
    String[] perangkat;

    Conan(String nama, int usia, int kasusTerselesaikan, String[] perangkat) {
        super(nama, usia, kasusTerselesaikan);
        this.perangkat = perangkat;
    }

    @Override
    void selesaikanKasus() {
        System.out.println(nama + " telah menyelesaikan kasus dengan canggih!");
    }

    void gunakanPerangkat() {
        System.out.println(nama + " menyelesaikan kasus dengan menggunakan perangkat: " + String.join(", ", perangkat));
        System.out.println(nama + " menyelesaikan kasus bersama teman-temannya yaitu : "
                + "\n *Bagian belakang dari kiri ke kanan: \n 1. Kazuha Toyama \n 2. Heiji Hattori \n 3. Sonoko Suzuki \n 4. Ran Mouri"
                + "\n 5. Kogoro Mouri \n 6. Eri Kisaki \n 7. Hiroshi Agasa. \n *Bagian depan dari kiri ke kanan: "
                + "\n 1. Genta Kojima \n 2. Mitsuhiko Tsuburaya \n 3. Conan Edogawa \n 4. Ai Haibara \n 5. Ayumi Yoshida");
    }
}

public class PBOLat59 {
    public static void main(String[] args) {
        // Objek karakter-karakter utama
        Conan conan = new Conan("Conan Edogawa", 7, 50, new String[]{"Krupuk Berbicara dan Dasbor Elastis"});

        // Menampilkan informasi karakter utama
        conan.perkenalkan();
        conan.selesaikanKasus();
        conan.gunakanPerangkat();
    }
}
