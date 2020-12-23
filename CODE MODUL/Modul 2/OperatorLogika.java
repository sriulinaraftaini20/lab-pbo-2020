public class OperatorLogika{
	public static void main(String args[]){
		boolean a = true;
		boolean b = false;

		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b));
		System.out.println("! (a && b) = " + !(a && b));
	}
}

/*
	Penjelasan :
	 Kode diatas memiliki 2 variabel, yaitu boolean a=true dan boolean b=false.
	 disini kita menggunakan operator logika. 

	 1. a && b = false. Mengapa false ? karena operator dan ini ia hanya menghasilkan
	 	nilai true jika kedua2 nya true.
	 2. a || b = true. mengapa true ? karena operator ini ia akan menghasilkan nilai true
	 	jika kedua2 nya true atau true salah satu darinya.
	 3. ! (a && b) = true. Mengapa true ? karena program akan eksekusi yang ada didalam kurung
	 	terlebih dahulu setelah itu akan dinegasikan.

*/