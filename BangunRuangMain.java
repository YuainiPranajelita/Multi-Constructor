package multi.constructor;
import java.util.Scanner;

public class BangunRuangMain {
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        
        System.out.println("=====================================================");
        System.out.println("| Nama \t\t: Yuaini Pranajelita \t\t\t|");
        System.out.println("| NPM \t\t: 21081010204 \t\t\t\t|");
        System.out.println("| Kelas \t: Pemrograman Berorientasi Objek D081\t|");
        System.out.println("=====================================================");
        
        System.out.print ("\n");
        
        System.out.println("\tPROGRAM MULTI CONSTRACTOR BANGUN RUANG\t");
        
        System.out.print("\n");
        
        System.out.println ("Pilihan Menu Bangun Ruang :");
        System.out.println ("1. Kubus");
        System.out.println ("2. Balok");
        System.out.println ("3. Tabung");
        System.out.println ("4. Limas Segi Empat");
        System.out.println ("5. Bola");
        
        System.out.print ("Masukkan Pilihan :");
        int pilihan = input.nextInt();
        
        System.out.print ("\n");
        
        switch (pilihan){
            case 1 :
                System.out.print ("Masukkan sisi : ");
                int sisi = input.nextInt();
                
                System.out.print ("\n");
                
                Kubus kbs = new Kubus (sisi);
                System.out.println ("Sisi Kubus = " +kbs.getside());
                System.out.println ("Volume Kubus = " +kbs.volume());
                break;
                
            case 2 :
                System.out.print ("Masukkan Panjang : ");
                int panjang = input.nextInt();
                System.out.print ("Masukkan Lebar : ");
                int lebar = input.nextInt();
                System.out.print ("Masukkan Tinggi : ");
                int tinggi = input.nextInt();
                
                System.out.print ("\n");
                
                Balok blk = new Balok (panjang, lebar, tinggi);
                System.out.println ("Panjang Balok = " +blk.getlenght());
                System.out.println ("Lebar Balok = " +blk.getwidth());
                System.out.println ("Tinggi Balok = " +blk.getheight());
                System.out.println ("Volume Balok = " +blk.volume());
                break;
              
                
            case 3 :
                System.out.print ("Masukkan Tinggi : ");
                int height = input.nextInt();
                System.out.print ("Masukkan Jari - Jari : ");
                int radius = input.nextInt();
                
                System.out.print ("\n");
                
                Tabung tbg = new Tabung (radius, height);
                System.out.println ("Jari - Jari Tabung = " +tbg.getradius());
                System.out.println ("Tinggi Tabung = " +tbg.getheight());
                System.out.println ("Volume Tabung = " +tbg.volume());
                break;
                
            case 4 :
                System.out.print ("Masukkan Sisi Alas : ");
                int sisi_alas = input.nextInt();
                System.out.print ("Masukkan Tinggi Limas : ");
                int tinggi_limas = input.nextInt();
                
                
                System.out.print ("\n");
                
                LimasSegiEmpat lse = new LimasSegiEmpat (sisi_alas,tinggi_limas);
                System.out.println ("Sisi Alas = " +lse.getsisi_alas());
                System.out.println ("Tinggi Limas = " +lse.gettinggi_limas());
                System.out.println ("Volume Limas = " +lse.volume());
                break;
                
            case 5 :
                System.out.print ("Masukkan Jari - Jari : ");
                int jari = input.nextInt();
                
                System.out.print ("\n");
                
                Bola ball = new Bola (jari);
                System.out.println ("Jari - Jari Bola = "+ball.getradius());
                System.out.println ("Volume Bola = "+ball.volume());
                break;
                
        }
        
    }
    
}
