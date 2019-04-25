/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kategoripesawat;
import java.util.Scanner;
/**
 *
 * @author Wahyu Ari Nugroho
 */
public class KategoriPesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
String nama,alamat;
char kategori;
int bayar=0, kembali=0;
System.out.println("Data Penumpang");
System.out.println("Nama: "); nama=input.next();
System.out.println("Alamat: "); alamat=input.next();
System.out.println("Kategori Pesawat:"); kategori=input.next().charAt(0);
System.out.print("Bayar: Rp."); bayar=input.nextInt();
int a=5000000, b=2000000, c=1000000;
if (kategori=='A'){kembali=bayar-a;}
else if (kategori=='B'){kembali=bayar-b;}
else if(kategori=='C') {kembali=bayar-c;}
System.out.println("Nama: "+nama);
System.out.println("Alamat: "+alamat);
System.out.println("Kembaluan: Rp."+kembali);
    }
    
}
