public class CobaBreak{
	public static void main(String[] args){
		for (int i=0; i<10; i++){
			for (int j=0; j<i+1; j++){
			
			if (j==5)
				break;
			System.out.print('*');
			}
			System.out.println();	
		}

	}
}

/*
Penjelasan :
	Program diatas merupakan contoh pemakaian dari break, dimana
	break itu sendiri berfungsi untuk keluar dari suatu perulangan.
	Nah pada kode diatas kita memilik "int i" dan "int j", int i
	melakukan perulangan kebawah sebanyak i<10 (0-9) pada baris dan barisnya
	terdapat 1 "*". Sedangkan int j melakukan perulangan kesamping
	dan setiap melakukan perulangan nilai "*" ditambah dengan 1. Namun
	jika "*" sama dengan 0, maka perulangannya akan berhenti.

*/