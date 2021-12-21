package com.Proyek.PBO;

import java.io.*;

class Mahasiswa{
    private String NIM, nama, alamat, jurusan;
    private int nilaiTA;
    
    private static String namaUniv;
    
    static String getNamaUniv() {
        return Mahasiswa.namaUniv;
    }
    
    static void setNamaUniv(String namaUniv) {
        Mahasiswa.namaUniv = namaUniv;
    }
    
    Mahasiswa() {
        
    }
    
    Mahasiswa(String NIM, String nama, String alamat, String jurusan, int nilaiTA) {
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
    
    public void penentuanTA() {
        
    } 
    
}

class mhsSI extends Mahasiswa{
    
    public mhsSI(String NIM, String nama, String alamat, String jurusan, int nilaiTA) {
        super(NIM, nama, alamat, jurusan, nilaiTA);
    }
    
    @Override
    public void penentuanTA() {
        if (super.getTA() <= 100 && super.getTA() >= 90) {
            System.out.println("Nilai Tugas Akhir: A");
        }
        else if (super.getTA() < 90 && super.getTA() >= 70) {
            System.out.println("Nilai Tugas Akhir: B");
        }
        else if (super.getTA() < 70 && super.getTA() >= 60) {
            System.out.println("Nilai Tugas Akhir: C");
        }
        else if (super.getTA() < 60) {
            System.out.println("Nilai Tugas Akhir: Tidak Lulus");
        }
    }
}

class mhsTK extends Mahasiswa{
    
    public mhsTK(String NIM, String nama, String alamat, String jurusan, int nilaiTA) {
        super(NIM, nama, alamat, jurusan, nilaiTA);
    }
    
    @Override
    public void penentuanTA() {
        if (super.getTA() <= 100 && super.getTA() >= 85) {
            System.out.println("Nilai Tugas Akhir: A");
        }
        else if (super.getTA() < 85 && super.getTA() >= 65) {
            System.out.println("Nilai Tugas Akhir: B");
        }
        else if (super.getTA() < 65 && super.getTA() >= 55) {
            System.out.println("Nilai Tugas Akhir: C");
        }
        else if (super.getTA() < 55) {
            System.out.println("Nilai Tugas Akhir: Tidak Lulus");
        }
    }
}

class mhsDKV extends Mahasiswa{
    
    public mhsDKV(String NIM, String nama, String alamat, String jurusan, int nilaiTA) {
        super(NIM, nama, alamat, jurusan, nilaiTA);
    }
    
    @Override
    public void penentuanTA() {
        if (super.getTA() <= 100 && super.getTA() >= 80) {
            System.out.println("Nilai Tugas Akhir: A");
        }
        else if (super.getTA() < 80 && super.getTA() >= 75) {
            System.out.println("Nilai Tugas Akhir: B");
        }
        else if (super.getTA() < 75 && super.getTA() >= 65) {
            System.out.println("Nilai Tugas Akhir: C");
        }
        else if (super.getTA() < 65) {
            System.out.println("Nilai Tugas Akhir: Tidak Lulus");
        }
    }
}

public class UTSPBO1 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        
        Mahasiswa mhs = new Mahasiswa("","","","",0);
        String pilih;
        
        do{
            System.out.print("Masukkan nama Universitas: ");
            String namaUniv = br.readLine();
            Mahasiswa.setNamaUniv(namaUniv);
            
            System.out.println("=====Data Mahasiswa=====");
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

            mhs.setNIM(NIM);
            mhs.setNama(nama);
            mhs.setAlamat(alamat);
            mhs.setJurusan(jurusan);
            mhs.setTA(nilaiTA);
            
            
            
            if (sms < 7 && jml > 2 && mhs.getJurusan().equalsIgnoreCase("SI")) {
                System.out.println("Maaf Anda tidak mensanggupi ketentuan untuk mengambil Tugas Akhir");
                System.exit(0);
            }
            else if (sms < 6 && jml > 2 && mhs.getJurusan().equalsIgnoreCase("TK")) {
                System.out.println("Maaf Anda tidak mensanggupi ketentuan untuk mengambil Tugas Akhit");
                System.exit(0);
            }
            else if (sms < 6 && jml > 3 && mhs.getJurusan().equalsIgnoreCase("DKV")) {
                System.out.println("Maaf Anda tidak mensanggupi ketentuan untuk mengambil Tugas Akhit");
                System.exit(0);
            }
            
            System.out.println("\n=====" + Mahasiswa.getNamaUniv() + "=====");
            System.out.println("NIM: " + mhs.getNIM());
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("Alamat: " + mhs.getAlamat());
            System.out.println("Jurusan: " + mhs.getJurusan());

            if (mhs.getJurusan().equalsIgnoreCase("SI")) {
                mhs = new mhsSI(mhs.getNIM(), mhs.getNama(), mhs.getAlamat(), mhs.getJurusan(), mhs.getTA());
                mhs.penentuanTA();
            }
            else if (mhs.getJurusan().equalsIgnoreCase("TK")) {
                mhs = new mhsTK(mhs.getNIM(), mhs.getNama(), mhs.getAlamat(), mhs.getJurusan(), mhs.getTA());
                mhs.penentuanTA();
            }
            else if (mhs.getJurusan().equalsIgnoreCase("DKV")) {
                mhs = new mhsDKV(mhs.getNIM(), mhs.getNama(), mhs.getAlamat(), mhs.getJurusan(), mhs.getTA());
                mhs.penentuanTA();
            }
            
            System.out.println("Apakah Anda ingin memasukkan data lagi ? (Y) Ya ; (T) Tidak ");
            pilih = br.readLine();
            System.out.println("");
            
        } while(pilih.equalsIgnoreCase("Y"));
    }
    
}
