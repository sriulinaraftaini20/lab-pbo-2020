Nama 	: Sri Ulina Raftaini
Nim	: 1908107010012


>>>>>>Deskripsi program :

Program ini merupakan program untuk mengelola penumpang Bus Trans Koetaradja.
dimana, Bus hanya memiliki 6 kursi, dimana 4 kursi penumpang biasa dan 2 kursi penumpang
prioritas. Kursi prioritas hanya dapat diduduki oleh lansia yang umurnya >=60, anak-anak yang
umurnya =<10 dan ibu yang hamil. Lalu penumpang biasa tidak boleh duduk di kursi prioritas namun
penumpang prioritas boleh duduk di kursi penumpang biasa. Bus juga tidak bisa dinaiki jika kursi bus sudah penuh.

>>>>>>Penjelasan Kelas dan Method :

1. Kelas Penumpang 
-Kelas ini mewakili objek penumpang bus
-Setiap penumpang mempunyai atribut, nama, umur dan ket Hamil atau tidak.

2. Kelas Bus
-Kelas ini untuk mewakili busnya dimana kelas Bus memiliki
atribut objek Penumpang. ada penumpangBiasa berisi minimal 0 dan maximalnya 4 orang
dan juga objek penumpangPrioritas yang berisi minimal 0 dan maximal 2 orang, ini kita isi menggunakan array.

-method getPenumpangBiasa() mengembalikan list penumpang biasa yang diminta, begitu juga 
method getPenumpangPrioritas() mengembalikan list penumpang prioritas yang diminta.

-method getJumlahPenumpangBiasa() mengembalikan jumlah penumpang biasa, dan begitu 
juga dengan getJumlahPenumpangPrioritas() yang mengembalikan jumlah penumpang prioritas.

-method naikanPenumpang() yaitu untuk menambah penumpang kedalam Bus, yang mana akan
diminta data nama, umur dan keterangan hamil atau tidak, dan dari umur diketahui lansia,atau tidak
dan juga keterangan hamil, jika hamil maka masuk ke kursi prioritas, jika lansia maka masuk ke kursi 
prioritas. Batas umur lansia =>60. Lalu jika kursi sudah penuh maka Bus tidak boleh dinaiki oleh penumpang.

-method turunkanPenumpang(nama) method ini berfungsi untuk menerima parameter nama penumpang.

-method toString berfungsi untuk mencetak Penumpang Biasa, Penumpang Prioritas dan Jumlah Penumpang.

3. Kelas Main
Pada method main() kita mendeklarasi sebuah objek Bus. Pada Method ini kita akan 
mensimulasikan proses naik dan turunnya penumpang dari bus. Seperti meminta nama, umur dan ket hamil atau tidak penumpang.



>>>>>>Cara Menjalankan Program :

1. Masuk ke Folder "Praktikum PBO 2020"
	* E:\>cd Praktikum PBO 2020>cd Tugas 1

2. Masuk ke Folder "Tugas 1"
	* E:\>cd Praktikum PBO 2020>cd Tugas 1

2. Complie Code Program
	* E:\Praktikum PBO 2020>cd Tugas 1>javac Main.java

3. Run Program
	*E:\Praktikum PBO 2020>cd Tugas 1>java Main.