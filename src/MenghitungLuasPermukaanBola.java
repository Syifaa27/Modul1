import java.util.Scanner;
public class MenghitungLuasPermukaanBola {
     public static void main(String[]args) {
        int r;
        double phi = 3.14;
      Scanner hitung =new Scanner(System.in);
      System.out.println("SYIFA' AULIYA ASH-SHOLIHAH");
        System.out.print("Masukan jari-jarinya:" );
        r= hitung.nextInt();
        System.out.print("===========================");
        System.out.print("Mengitung Luas Permukaan Bola");
        System.out.print("============================");
        System.out.print("Luas Permukaan Bola= "+(4*phi*r*r));
        
    }

}
