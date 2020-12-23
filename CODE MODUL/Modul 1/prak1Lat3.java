/**
* Aplikasi untuk melakukan penambahan 2 nilai integer
* yang diambil dari parameter method main
*/
public class prak1Lat3 {
	public static void main(String[] args) {
		int nilai1 = Integer.parseInt(args[0]);
		int nilai2 = Integer.parseInt(args[1]);
		int hasil = nilai1 + nilai2;
		
		System.out.println("Hasil " +nilai1+ " + " +nilai2+ " = " +hasil);
	}
}