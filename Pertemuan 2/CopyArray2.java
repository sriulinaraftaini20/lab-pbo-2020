public class CopyArray2{
	public static void main(String[] args){
		String str1 = "Pemrograman";
		String str2 = "Java";
		String str3 = "Pemrogram java";

		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);
		System.out.println("String 3 : " + str3);
		System.out.println("String 1 = String 3 ==> " + str2.equals (str3));
		System.out.println("String 2 = String 3 ==> " + str2.equals(str3));
		System.out.println("String 1 + String 2 = String 3 ==> "+(str1+str2).equals(str3));
		String str4 = "Universitas Syiah Kuala";
		String str5 = "universitas Syiah Kuala";
		System.out.println("String 4 : " + str4);
		System.out.println("String 5 : " + str5);
		System.out.println("Perintah Pembandingan dibawah Mengabaikan antara huruf besar dengan huruf kecil");
		System.out.println("String 4 = String 5 ==> " + str4.equalsIgnoreCase(str5));
		System.out.println("String 4 + String 5 = String 5 + String 4 ==> " + (str4 + str5).equalsIgnoreCase(str5 + str4));

	}
}
/*
Program copyarray2 ini sama hal nya seperti code sebelumnya
yang sudah kita lakukan di copyarray1, namun kali ini kita
mengkopi sebuah string menggunakan method equals dan equalsIgnoreCase
dimana method ini digunakan untuk membandingkan kesamaan dua string.
Kedua method tersebut akan mengembalikan nilai boolean.
hasil output dari program diatas adalah :
				String 1 : Pemrograman
				String 2 : Java
				String 3 : Pemrogram java
				String 1 = String 3 ==> false
				String 2 = String 3 ==> false
				String 1 + String 2 = String 3 ==> false
				String 4 : Universitas Syiah Kuala
				String 5 : universitas Syiah Kuala
				Perintah Pembandingan dibawah Mengabaikan antara huruf besar dengan huruf kecil
				String 4 = String 5 ==> true
				String 4 + String 5 = String 5 + String 4 ==> true
				*/