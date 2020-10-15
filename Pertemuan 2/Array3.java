import java.util.Scanner;

public class Array3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int items[];
		int sum = 0;
		

		System.out.print("Input Panjang Array : ");
		int n = in.nextInt();

		items = new int[n];

		for (int i=0; i<n; i++){
			System.out.println("Masukkan Index ke- " +i+" : ");
			items[i] = in.nextInt();
		}
		for (int num : items){
			sum += num;
		}

	System.out.print("Jumlahnya adalah : " + sum);
 }
}

/*
Program diatas menjelaskan, user akan input panjang array.
Setelah itu maka user akan input nilai index yang akan diinginkan
dan index dimulai dari 0, karena nilai memory dari array dimulai dari 0.
Misal user input panjang array sebanyak 3
maka keluar output, Masukkan Index ke- 0 :(diinput user) ,Masukkan Index ke- 1 :(diinput user)
Masukkan Index ke- 2 : (diinput user), setelah user selesai input
nilai indexnya, maka akan keluar output jumlah dari  nilai index yang
dimasukkan oleh user. Untuk menghitung jumlahnya kita menggunakan for each dari bahsa java.

*/