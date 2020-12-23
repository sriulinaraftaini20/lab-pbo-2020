public class CopyArray {
		public static void main(String args[]) {
			int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
			int[] array2 = new int[3];

			System.arraycopy(array1,0,array2,0,3);
			System.out.print("Array1 : ");
			for (int i=0; i<array1.length; i++)
				System.out.print(array1[i] + " ");
			System.out.println();

			System.out.print("Array2 : ");
			for (int i=0; i<array2.length; i++)
				System.out.print(array2[i] + " ");
	}
}

/*
Program diatas merupakan program copy array dimana
Isi dari suatu array dapat kita kopi pada array yang 
lain dengan memanfaatkan method "arraycopy(array1,0,array2,0,3)"
pada class System.
dimana : array1 = array asal/sumber pengkopian
		 array2 = array tujuan pengkopian
		 0(setelah array1)= merupakan indeks awal pengkopian pada array asal
		 0(setelah array2)= merupakan indeks awal pengkopian pada array tujuan
		 3 = merupakan banyak elemen yang akan kita kopi
dan program diatas akanmenghasilkan out :
						Array1 : 7 4 8 1 4 1 4
						Array2 : 7 4 8

*/