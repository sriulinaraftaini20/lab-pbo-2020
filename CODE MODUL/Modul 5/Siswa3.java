//Kelas siswa Yang menggunakan Method Overloading

public class Siswa3
{
 	private int nrp;
 	private String nama;

 	public Siswa()
 	{
 		this.nrp = 12345;
 		this.nama = "nama default";
 	}

 	public Siswa3(int nrp, String nama)
 	{
 		this.nrp = nrp;
 		this.nama = nama;
 	}

 	public void setNrp(int nrp)
 	{
 		this.nrp = nrp;
 	}

 	public int getNrp()
 	{
 		return this.nrp;
 	}

 	public void setNama(String nama)
 	{
 		this.nama = nama;
 	}

 	public String getNama()
 	{
 		return this.nama;
 	}
}


//Penjelasan : Contoh pada class Siswa, kita ingin menambahkan satu method constructor lainnya
/* Method overloading adalah beberapa method yang memiliki nama method yang sama namun berbeda
dari jumlah parameter, tipe data parameter dan urutan parameter. Method overloading dapat berlaku
pada method constructor dan method lainnya. Saat objek menggunakan method yang memiliki method
overloading, maka compiler akan mencari padanan yang paling sesuai dengan method overloading yang
ada. Jika tidak ada padanan maka akan muncul error.*/