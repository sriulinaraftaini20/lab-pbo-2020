public class CobaLoopingFor{
	public static void main(String[] args){
		for (int i=0; i<10; i++){
			for (int j=0; j<i+1; j++)
				System.out.print('*');
				System.out.println();
		}
	}
}

/*
Penjelasan :
		Pada kode diatas, terdapat int i dan int j dimana int i
		akan melakukan perulangan kebawah sampai 10 kali dan menghasilkan 1 "*".Int j melakukan
		perulangan kesamping dengan j<i+1 maka setiap, "*" yang dihasilkan oleh int i ditambah
		dengan 1 "*" disetiap barisnya.

*/