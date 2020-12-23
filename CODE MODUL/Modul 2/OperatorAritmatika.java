public class OperatorAritmatika{
	public static void main(String args[]){
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;

		System.out.println("a + b = " + (a + b));//1
		System.out.println("a - b = " + (a + b));//2
		System.out.println("a * b = " + (a * b));//3
		System.out.println("b / a = " + (b / a));//4
		System.out.println("b % a = " + (b % a));//5
		System.out.println("c % a = " + (c % a));//6
		System.out.println("a++ = " + (a++));//7
		System.out.println("a-- = " + (a--));//8

		//Check the difference in d++ and ++d
		System.out.println("d++ = " + (d++)); //9
		System.out.println("++d = " + (++d)); //10
	}
}

/*
	Penjalasan :
	kita menggunakan 4 variabel dengan tipe data
	integer, masing2 variabel memiliki nilai, dimana
	variabel a = 10, b = 10, c = 25 dan d = 25. Dsini kita menggunakan
	operator aritmatika.

	1.a+b = 30
	2.a-b = -10
	3.a*b = 200
	4.b/a = 2
	5.b%a = 0
	6.c%a = 5
	7.a++ = 10
	8.a-- = 11
	9.d++ = 25
	10.++d = 27


	Untuk perbedaan antara "d++" dan "++d"
	 jika d++, maka akan dieksekusi deluan nilai 'd' nya, setelah
	 itu maka nilainya akan ditambah dengan 1, sedangkan untuk ++d
	 nilainya pertama akan langsung ditambah. 
*/