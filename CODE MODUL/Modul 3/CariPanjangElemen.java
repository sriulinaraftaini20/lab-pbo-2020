public class CariPanjangElemen{
	public static void main(String[] args){
		int x[][][][] = new int[2][][][];
		x[0] = new int[1][][];
		x[0][0] = new int[2][];
		x[0][0][0] = new int[3];
		x[0][0][1] = new int[2];
		x[1] = new int[2][][];
		x[1][0] = new int[1][];
		x[1][0][0] = new int[2];
		x[1][1] = new int[2][];
		x[1][1][0] = new int[1];
		x[1][1][1] = new int[3];
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println(x[0][0].length);
		System.out.println(x[0][0][0].length);
		System.out.println(x[0][0][1].length);
		System.out.println();
		System.out.println(x[1].length);
		System.out.println(x[1][0].length);
		System.out.println(x[1][0][0].length);
		System.out.println(x[1][1].length);
		System.out.println(x[1][1][0].length);
		System.out.println(x[1][1][1].length);
	}
}

/*
Program diatas merupakan program untuk mencari panjang dari
elemen-elemen yang sudah kita deklarasi sebelumnya. 
Ukuran yang disimpan yaitu pada atribut length.
program diatas akan menghasilkan output :
										2
										1
										2
										3
										2

										2
										1
										2
										2
										1
										3
*/