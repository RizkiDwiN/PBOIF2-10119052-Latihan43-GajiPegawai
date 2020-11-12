package pboif2.pkg10119052.latihan43.gajipegawai;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program GajiPegawai berbasis objek
 * 
 */
public class Pegawai {
    private String nama, alamat;
    public int uangtransport = 250000;
    public int uangtunjangan = 300000;
    public int gajipokok = 4500000;
    public int totalgaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangtransport() {
        return uangtransport;
    }

    public void setUangtransport(int uangtransport) {
        this.uangtransport = uangtransport;
    }

    public int getUangtunjangan() {
        return uangtunjangan;
    }

    public void setUangtunjangan(int uangtunjangan) {
        this.uangtunjangan = uangtunjangan;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }

    public int getTotalgaji() {
        return totalgaji = uangtunjangan + uangtransport + gajipokok;
    }

    public void setTotalgaji(int totalgaji) {
        this.totalgaji = totalgaji;
    }
    
    public void totalgaji(){
        Scanner input = new Scanner(System.in);
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("------------------------------------");
        System.out.print("Nama Karyawan: ");
        this.nama = input.next();
        System.out.print("Alamat: ");
        this.alamat = input.next();
        System.out.print("Uang Transport: ");
        this.uangtransport = input.nextInt();
        System.out.print("Uang Tunjangan: ");
        this.uangtunjangan = input.nextInt();
        System.out.print("Gaji Pokok: ");
        this.gajipokok = input.nextInt();
    }
    
    public void tampildata(){
      System.out.println("");
      System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
      System.out.println("--------------------------");
      System.out.println("Nama Karyawan: "+getNama());
      System.out.println("Alamat: "+getAlamat());
      System.out.println("Uang Transport: Rp. "+getUangtransport());
      System.out.println("Uang Tunjangan: Rp. 300000");
      System.out.println("Gaji Pokok: Rp. 4500000");
      System.out.println("TOTAL GAJI: Rp."+getTotalgaji());
    }
}
