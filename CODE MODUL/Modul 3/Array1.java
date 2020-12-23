public class Array1{
	public static void main(String[] args){
		int nilai [] = new int[3];
		nilai[0] = 70;
		nilai[1] = 80;
		nilai[2] = 65;
		double ratarata = 0.0;

		for (int i=0; i<nilai.length; i++)
			ratarata += nilai[i];

			ratarata /= nilai.length;
			System.out.println("Nilai rata-rata = " + ratarata); 
	}
}

/*
Kode diatas contoh dari Array 1 demensi dimana akan
mengeluarkan output : Nilai rata-rata = 71.66666666666667

diatas kita memiliki 3 variabel yaitu "nilai" bertipe int yang merupakan sebuah array
"ratarata" bertipe double memiliki nilai 0.0 yang akan kita ambil inputnya
untuk mendapatkan nilai rata-ratanya dan "i" bertipe integer yang kita pakai
saat melakukan looping. disini kita menggunakan looping biasa.
untuk mendapatkan nilai rata2 kita pakai rumus (nilai rata /= nilai.length)



*/