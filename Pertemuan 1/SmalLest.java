public class SmalLest{
	public static void main(String[] args){
		int a, b;

		Mulai:
		for(a=0; a<2; a++){
			for(b=0; b<3; b++){
				if(b==2)
					break Mulai;
				System.out.println("a=" + a + " ; b=" + b);
			}
		}
	}
}


/*
	Penjelasan :
		Dari kode diatas kita memiliki 2 variabel, bertipe int
		Disini kita mencoba untuk menggunakan label break dimana
		label ini akan menghentikan operasi sesuai dengan looping.
		Pada program yang telah kita buat diatas break akan menghentikan 
		operasi pada sistem Mulai artinya akan keluar dari looping 1
		jadi outputnya ialah :
		 a = 0;	b = 0
		 a = 0; b = 1



*/
