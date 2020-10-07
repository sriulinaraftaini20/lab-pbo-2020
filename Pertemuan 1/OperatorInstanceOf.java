public class OperatorInstanceOf{
	public static void main(String args[]){

	String name = "James";

	//Following will return true since name is type of String
	boolean result = name instanceof String;
	System.out.println( result );
	}
}

/*
	Penjelasan :
	Operator instanceOf digunakan untuk mengecek apakah suatu objek
	termasuk ke dalam class tertentu atau tidak. Nilai yang dikembalikan
	adalah nilai boolean.
	nah diatas kita memiliki variabel name bertipe string, nah kita
	menggunakan operator intanceof dan menggunakan class (string) maka hasil
	output diatas adalah True.


*/