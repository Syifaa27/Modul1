import java.util.Scanner;
public class Biodata {
public static void main(String[] args){
    String nama,tempatLahir,bulanLahir,jenisKelamin,alamat,mottoHidup;
    int NIS,tanggalLahir,tahunLahir;
    Scanner masukan = new Scanner(System.in);    
    
    System.out.println("Nama = ");
    nama = masukan.next();
    System.out.println("NIS = ");
    NIS = masukan.nextInt();
    System.out.println("Tempat Lahir = ");
    tempatLahir = masukan.next();
    System.out.println("Tanggal Lahir = ");
    tanggalLahir = masukan.nextInt();
    System.out.println("Bulan Lahir = ");
    bulanLahir = masukan.next();
    System.out.println("Tahun Lahir = ");
    tahunLahir = masukan.nextInt();
    System.out.println("Jenis Kelamin = ");
    jenisKelamin = masukan.next();
    System.out.println("Alamat di Malang = ");
    alamat = masukan.next();
    System.out.println("Motto Hidup = ");
    mottoHidup = masukan.next();
}    
}
