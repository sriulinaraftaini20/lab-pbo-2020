public class CopyArray3{
	public static void main(String[] args){
		String str1 = "Informatika Universitas Syiah Kuala";
		System.out.println(str1.startsWith("Inf"));
		System.out.println(str1.endsWith("kuala"));
		System.out.println(str1.startsWith("Inf", 1));
		System.out.println(str1.startsWith("Inf", 2));
		System.out.println(str1.startsWith("Inf", 3));
	}
}

/*
Program diatas merupakan program untuk mengkopi array
menggunakan Class String memiliki method untuk mengetahui
string berawalan atau berakhiran dengan string tertentu.
Method tersebut akan mengembalikan nilai Boolean. 
keluarran dari program diatas adalah :
										true
										false
										false
										false
										false


*/