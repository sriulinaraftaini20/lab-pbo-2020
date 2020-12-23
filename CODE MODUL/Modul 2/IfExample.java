import java.util.Scanner;

public class IfExample{
	public static void main(String[] args){
		int age = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan umur anda : ");
		age = sc.nextInt();

		if (age >= 17)
			System.out.print("Anda sudah boleh buat KTP");
	}
}

/*
	Penjelasan :
		Pada kode diatas kita menggunakan fungsi Scanner dimana fungsi scanner ini
		akan mengambil nilai yang diinput oleh user.
		Disini kita memiliki variabel int age dimana nilainya = 0, kita menggunakan
		fungsi "sc.nextInt()" fungsinya untuk mengambil nilai yang akan dimasukkna oleh user.
		nah jika age yang diinput oleh user >=17 maka outputnya "Anda sudah boleh buat KTP"


*/