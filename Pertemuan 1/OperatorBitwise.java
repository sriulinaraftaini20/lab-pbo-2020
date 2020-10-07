public class OperatorBitwise{
	public static void main(String args[]){
		int a = 60;		/*60 = 0011 1100*/
		int b = 13;		/*13 = 0000 1101*/
		int c = 0;

		c = a & b; 		/* 12 = 0000 1100*/
		System.out.println("a & b = " + c); 

		c = a | b;		/* 61 = 0011 1101*/
		System.out.println("a | b = " + c);

		c = a ^ b;		/* 49 = 0011 0001*/
		System.out.println("a ^ b =" + c);

		c = ~ a;			/* -61 = 1100 0011*/
		System.out.println("~a = " + c);

		c = a << 2; 		/* 240 = 1111 0000*/
		System.out.println("a << 2 = " + c);

		c = a >> 2;			/* 15 = 0000 1111*/
		System.out.println("a >> 2 = " + c);

		c = a >>> 2;		/* 15 = 0000 1111*/
		System.out.println("a >>> 2 = " + c);

	}
}

/*
	Penjelasan :
		Kode diatas kita menggunakan operator bitwise. Dimana operator bitwise ini
		operator untuk melakukan operasi pada nilai bit. Nah kode dari kode diatas
		kita memiliki 3 variabel bertipe int.

		1. Untuk c= a & b yang mana nilai dari a dan b harus kedua2 nya benar.
		2. c = a | b yang mana jika nilai dari salah satu variabel tersebut benar 
			maka nilainya bitnya akan benar.
		3. c = a ^ b, ini merupakan operator XOR dimana nilainya akan benar jika salah
			satunya saja benar. selain itu maka akan nol. nah disini hasil dari a^b = 49.
		4. c = ~ a ini merupakan operator dari  complement dimana nilainya akan dinegasikan
			dan akan di tambah 1.
		5. c = a<<2 nah ini merupakan operan yang  menggeser nilai bitnya ke kiri
		5. c = a>>2 nah ini merupakan operan yang  menggeser nilai bitnya ke arah kanan
		5. c = a>>>2 nah ini merupakan operan yang  menggeser nilai bitnya ke kanan dan nilai yang akan digeser
			diisi dengan 0.
*/