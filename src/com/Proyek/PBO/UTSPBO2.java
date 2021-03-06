package com.Proyek.PBO;

import java.io.*;

abstract class Mahasiswa1 {

    private String NIM, nama, alamat, jurusan;
    private int nilaiTA;

    private static String namaUniv;

    static String getNamaUniv() {
        return Mahasiswa1.namaUniv;
    }

    static void setNamaUniv(String namaUniv) {
        Mahasiswa1.namaUniv = namaUniv;
    }

    Mahasiswa1() {

    }

    Mahasiswa1(String NIM, String nama, String alamat, String jurusan, int nilaiTA) {
        this.NIM = NIM;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
        this.nilaiTA = nilaiTA;
    }

    public String getNIM() {
        return this.NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getTA() {
        return this.nilaiTA;
    }

    public void setTA(int nilaiTA) {
        this.nilaiTA = nilaiTA;
    }

    abstract public void penentuanTA();

}

class mhsSI extends Mahasiswa1 {

    public mhsSI(String NIM, String nama, String alamat, String jurusan, int nilaiTA) {
        super(NIM, nama, alamat, jurusan, nilaiTA);
    }

    public mhsSI() {

    }

    @Override
    public void penentuanTA() {
        if (super.getTA() <= 100 && super.getTA() >= 90) {
            System.out.println("Nilai Tugas Akhir: A");
        } else if (super.getTA() < 90 && super.getTA() >= 70) {
            System.out.println("Nilai Tugas Akhir: B");
        } else if (super.getTA() < 70 && super.getTA() >= 60) {
            System.out.println("Nilai Tugas Akhir: C");
        } else if (super.getTA() < 60) {
            System.out.println("Nilai Tugas Akhir: Tidak Lulus");
        }
    }
}

class mhsTK extends Mahasiswa1 {

    public mhsTK(String NIM, String nama, String alamat, String jurusan, int nilaiTA) {
        super(NIM, nama, alamat, jurusan, nilaiTA);
    }

    public mhsTK() {

    }

    @Override
    public void penentuanTA() {
        if (super.getTA() <= 100 && super.getTA() >= 85) {
            System.out.println("Nilai Tugas Akhir: A");
        } else if (super.getTA() < 85 && super.getTA() >= 65) {
            System.out.println("Nilai Tugas Akhir: B");
        } else if (super.getTA() < 65 && super.getTA() >= 55) {
            System.out.println("Nilai Tugas Akhir: C");
        } else if (super.getTA() < 55) {
            System.out.println("Nilai Tugas Akhir: Tidak Lulus");
        }
    }
}

class mhsDKV extends Mahasiswa1 {

    public mhsDKV(String NIM, String nama, String alamat, String jurusan, int nilaiTA) {
        super(NIM, nama, alamat, jurusan, nilaiTA);
    }

    public mhsDKV() {

    }

    @Override
    public void penentuanTA() {
        if (super.getTA() <= 100 && super.getTA() >= 80) {
            System.out.println("Nilai Tugas Akhir: A");
        } else if (super.getTA() < 80 && super.getTA() >= 75) {
            System.out.println("Nilai Tugas Akhir: B");
        } else if (super.getTA() < 75 && super.getTA() >= 65) {
            System.out.println("Nilai Tugas Akhir: C");
        } else if (super.getTA() < 65) {
            System.out.println("Nilai Tugas Akhir: Tidak Lulus");
        }
    }
}

public class UTSPBO2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Mahasiswa1 mhs;
        String pilih;

        do {
            System.out.print("Masukkan nama Universitas: ");
            String namaUniv = br.readLine();
            Mahasiswa1.setNamaUniv(namaUniv);

            System.out.println("=====Data Mahasiswa1=====");
            System.out.print("Masukkan NIM: ");
            String NIM = br.readLine();
            System.out.print("Masukkan Nama: ");
            String nama = br.readLine();
            System.out.print("Masukkan Alamat: ");
            String alamat = br.readLine();
            System.out.print("Masukkan Jurusan: ");
            String jurusan = br.readLine();
            System.out.print("Masukkan Nilai TA: ");
            int nilaiTA = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Semester: ");
            int sms = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Waktu Pengerjaan(semester): ");
            int jml = Integer.parseInt(br.readLine());

            if (jurusan.equalsIgnoreCase("SI")) {
                if (sms < 7 && jml > 2) {
                    System.out.println("Maaf Anda tidak mensanggupi ketentuan untuk mengambil Tugas Akhir");
                    System.exit(0);
                }
                mhs = new mhsSI("", "", "", "", 0);
                mhs.setNIM(NIM);
                mhs.setNama(nama);
                mhs.setAlamat(alamat);
                mhs.setJurusan(jurusan);
                mhs.setTA(nilaiTA);

                mhs = new mhsSI(mhs.getNIM(), mhs.getNama(), mhs.getAlamat(), mhs.getJurusan(), mhs.getTA());

                System.out.println("\n=====" + Mahasiswa1.getNamaUniv() + "=====");
                System.out.println("NIM: " + mhs.getNIM());
                System.out.println("Nama: " + mhs.getNama());
                System.out.println("Alamat: " + mhs.getAlamat());
                System.out.println("Jurusan: " + mhs.getJurusan());
                mhs.penentuanTA();
            } else if (jurusan.equalsIgnoreCase("TK")) {
                if (sms < 6 && jml > 2) {
                    System.out.println("Maaf Anda tidak mensanggupi ketentuan untuk mengambil Tugas Akhit");
                    System.exit(0);
                }
                mhs = new mhsTK("", "", "", "", 0);
                mhs.setNIM(NIM);
                mhs.setNama(nama);
                mhs.setAlamat(alamat);
                mhs.setJurusan(jurusan);
                mhs.setTA(nilaiTA);

                mhs = new mhsTK(mhs.getNIM(), mhs.getNama(), mhs.getAlamat(), mhs.getJurusan(), mhs.getTA());

                System.out.println("\n=====" + Mahasiswa1.getNamaUniv() + "=====");
                System.out.println("NIM: " + mhs.getNIM());
                System.out.println("Nama: " + mhs.getNama());
                System.out.println("Alamat: " + mhs.getAlamat());
                System.out.println("Jurusan: " + mhs.getJurusan());
                mhs.penentuanTA();
            } else if (jurusan.equalsIgnoreCase("DKV")) {
                if (sms < 6 && jml > 3) {
                    System.out.println("Maaf Anda tidak mensanggupi ketentuan untuk mengambil Tugas Akhit");
                    System.exit(0);
                }
                mhs = new mhsDKV("", "", "", "", 0);
                mhs.setNIM(NIM);
                mhs.setNama(nama);
                mhs.setAlamat(alamat);
                mhs.setJurusan(jurusan);
                mhs.setTA(nilaiTA);

                mhs = new mhsDKV(mhs.getNIM(), mhs.getNama(), mhs.getAlamat(), mhs.getJurusan(), mhs.getTA());

                System.out.println("\n=====" + Mahasiswa1.getNamaUniv() + "=====");
                System.out.println("NIM: " + mhs.getNIM());
                System.out.println("Nama: " + mhs.getNama());
                System.out.println("Alamat: " + mhs.getAlamat());
                System.out.println("Jurusan: " + mhs.getJurusan());
                mhs.penentuanTA();
            }

            System.out.println("Apakah Anda ingin memasukkan data lagi ? (Y) Ya ; (T) Tidak ");
            pilih = br.readLine();
            System.out.println("");

        } while (pilih.equalsIgnoreCase("Y"));
    }

}
