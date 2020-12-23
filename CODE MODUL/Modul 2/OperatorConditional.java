public class OperatorConditional{
	public static void main(String args[]){
		int a, b;
		a = 10;
		b = (a == 1) ? 20: 30;
		System.out.println("Value of b is : " + b);

		b = (a == 10) ? 20: 30;
		System.out.println("Value of b is : " + b);
	}
}

/*
	Penjelasan : 
		Kode diatas memiliki 2 variabel yang bertipe int.
		Disini kita menggunakan operator conditional. Operator ini berfungsi
		untuk mengecek nilai boolean. Jika benar nilai yang sebelah kanan yang
		akan diambil dan jika salah mak anilai kiri yang diambil seperti :
		1. nilai a==1 ini false maka nilai sebelah kiri lah yang diambil = 20
		2. nilai a==10 ini true maka nilai yang sebelah kirilah yang diambil.


*/