public class OperatorAssignment{
	public static void main(String args[]){
		int a = 10;
		int b = 20;
		int c = 0;

		c = a + b;
		System.out.println("c += a = " + c);

		c += a;
		System.out.println("c += a = " + c);

		c -= a;
		System.out.println("c -= a = " + c);

		c *= a;
		System.out.println("c *= a = " + c);

		a = 10;
		c = 15;
		c /= a;
		System.out.println("c /= a = " + c);

		a = 10;
		c = 15;
		c %= a;
		System.out.println("c %= a = " + c);

		c <<= 2;
		System.out.println("c <<= 2 = " + c);

		c >>= 2;
		System.out.println("c >>= 2 = " + c);

		c >>= 2;
		System.out.println("c >>= 2 = " + c);

		c &= a;
		System.out.println("c &= a = " + c);

		c ^= a;
		System.out.println("c ^= a = " + c);

		c |= a;
		System.out.println("c |= a = " + c);
	}

}


/*
	Penjelasan kode diatas :
	Kode diatas merupakan contoh dari penggunaan dari operator
	assignment. Dimana operator ini gunanya untuk mengurangi,
	atau menambah sebuah variable.
	untuk variable diatas kita punya 3 variable. a, b dan c.

	1. Untuk baris 7-8, itu hanya penjumlahan seperti  biasa
	yaitu nilai c = 0, a=10, b=20, jika c= a+b maka c=30.

	2. baris ke 10-11 juga sama seperti baris sebelumnya,
	artinya sama dengan c = c + a, maka c = 30 + 10 = 40.

	3.baris ke 13-14 juga sama seperti point ke 2  yaitu  c = c - a,
	maka c = 30 - 10 = 20.

	4. untuk baris ke 16-17 juga sama, yaitu c = c * a maka c = 30*10=300
	
	5. baris ke 19-21 kita mau ganti nilai variable a dan c.
	untuk baris 22 kita pakai rumus c /= a ini artinya sama seperti c = c/a
	c = 15/10 a= 1, disini karna kita pakai tipe data desimal sehingga hasilnya
	juga bulat.

	6. Baris 26-27 kita ingin modulus nilai c dengan a, c %= a sama seperti
	c = c % a, c = 15 % 10 = 5, karna sisa bagi nya adalah 5.

	7. Baris 29-30 ini merupakan operator bitwise, dimana nilai c <<= 2 sama
	dengan c = 5<< 2 maka nilai c sekarang adalah 20 karna ini merupakan operator left shift
	sebanyak 2 kali

	8. Baris 32-33 ini merupakan operator bitwise, dimana nilai c >>= 2 sama
	dengan c = 20>> 2 maka nilai c sekarang adalah 5 karna ini merupakan operator right shift
	dua kali.

	9. Baris 35-36 ini merupakan operator bitwise, dimana nilai c >>= 2 sama
	dengan c = 5 >> 2 maka nilai c sekarang adalah 1 karna ini merupakan operator right shift
	dua kali.

	10. Baris ke 38-39 nah ini merupakan dari operator and, dimana keduanya harus bener
	 disini c &= a sama seperti c= c & a, ini salah karna c = 1 & 10.

	11. Baris 41-42 merupakan operator xor dimana c ^= a sama dengan c= c ^a, maka c=0^10.

	12. Baris 44-45 merupakan operator or, dimana jika salahs atunya saja benar maka dia akan true
	c |= a saa seperti c = c | a, maka c = 10 | 10 maka nilai c adalah 10.
*/