package datahewan;

import java.util.Scanner;

public class hewanBeraksi {
    public static void main(String[] args) {
        try{
            //IO simple
            Scanner scanner = new Scanner(System.in);

            //array
            hewanDetail[] mhlk = new hewanDetail[2];

            //perulangan
            for(int i=0; i<mhlk.length; i++) {
                System.out.print("Masukkan Jenis hewan "+(i+1)+": ");
                String jenis = scanner.nextLine();
                System.out.print("Masukkan Id hewan    "+(i+1)+": ");
                String idhwn = scanner.nextLine();

            //objek
                mhlk[i] = new hewanDetail(jenis, idhwn);
            }

            //perulangan array
            for(hewanDetail data: mhlk){
                System.out.println("========================");
                System.out.println("Data Hewan: ");
                System.out.println(data.tampilanInfo());
            } 
        }catch (NumberFormatException e){
            System.out.println("error pada nomor: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("error pada format jumlah: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("error umum: "+e.getMessage());
        }
    }
}
