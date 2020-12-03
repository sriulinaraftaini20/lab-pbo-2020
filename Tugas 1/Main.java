
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Menu;
        String nama;
        int umur;
        String hamil2;
        boolean hamil1;
        Bus bus = new Bus();
        while (true) {
            
        System.out.println("\n\t>>>>BUS TRANS KOETARADJA<<<<\n");
        String[] menu = {"Naikan Penumpang","Turunkan Penumpang","Lihat Penumpang","Keluar Dari program"};
        int no = 1;
        for (String pilihan : menu) {
            System.out.printf("%d. %s  \n",no++,pilihan);
        }
        System.out.print("Pilih : ");
        Menu = input.next();
        switch (Menu) {
            case "1":
                    System.out.print("\nNama       :");
                    nama = input.next();
                    System.out.print("Umur       :");
                    umur = input.nextInt();
                    
                    while (true) {
                    System.out.print("Hamil(y/n) :");
                    hamil2 = input.next();
                        if (hamil2.equalsIgnoreCase("y")) {
                            hamil1 = true;
                            break;
                        }else if(hamil2.equalsIgnoreCase("n")){
                            hamil1 = false;
                            break;
                        }else{
                            System.out.println("Pilihan anda tidak ada!");
                            System.out.println("-------------------------------------------\n");
                        }    
                    }
                    Penumpang penumpang = new Penumpang(nama,umur,hamil1);
                    if (bus.naikanPenumpang(penumpang)) {
                        System.out.println("Penumpang berhasil naik!");
                        System.out.println("-------------------------------------------\n");
                    }else{
                        System.err.println("Penumpang gagal naik!");
                        System.out.println("-------------------------------------------\n");
                    }
                break;
            case "2":
                    
                    System.out.print("Nama :");
                    nama = input.next();
                    if(bus.turunkanPenumpang(nama)){
                        System.out.println("Penumpang berhasil di turunkan");
                        System.out.println("-------------------------------------------\n");
                    }else{
                        System.out.println("Penumpang tidak di turunkan");
                        System.out.println("-------------------------------------------\n");
                    }

                break;
            case "3":
                    System.out.println(bus.toString());
                break;
            case "4":
                    System.out.println("Anda keluar dari program!");
                    return;
            default:
            System.out.println("Pilihan anda tidak tersedia!");
                break;
        }
        
    }

    }
}
