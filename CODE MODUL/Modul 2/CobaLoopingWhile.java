public class CobaLoopingWhile{
	
	public static void main(String[] args){
		int i=0;
		while (i < 10){
			
			int j = 0;
			while (j < i+1){
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

/*
	Penjelasan :
		Kode diatas kita memiliki 2 variabel, dimana
		ada variabel int i dan int j variabel i akan
		menghasilkan perulangan baris dan int i kita beri
		kondisi dengan i < 10 artinya i hanya menghasilkan 
		1"*"saja pada setiap baris. Sedangkan int j akan
		menghasilkan perulangan kesamping dengan kondisi
		int j< i+1, artinya disetiap nilainya akan ditambah
		dengan 1 "*"
*/