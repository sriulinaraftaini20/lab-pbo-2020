//Kelas TesSiswa Yang menggunakan Method Overloading


public class TesSiswa2
{
 	public static void main(String[] ar)
 	{
 		Siswa s = new Siswa();
 		Siswa ss = new Siswa(8030001, "Upin");

 		//ini akan menimbulkan error
 		//Siswa sss = new Siswa(8030002);
 		System.out.println(s.getNrp() + " " + s.getNama());
 		System.out.println(ss.getNrp() + " " + ss.getNama());
 	}
}

/*Penjelasan : Method ini akan error karena
Objek s menggunakan method constructor tanpa parameter sedangkan objek ss menggunakan method
constructor dengan dua parameter (int dan String). Namun andaikan kita menambahkan kode
Siswa sss = new Siswa(8030002);
maka hal ini akan menimbulkan error sebab tidak ada padanan method constructor yang memiliki satu
parameter berupa int.

*/