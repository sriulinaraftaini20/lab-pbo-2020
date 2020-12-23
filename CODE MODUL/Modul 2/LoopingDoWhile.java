public class LoopingDoWhile{
	public static void main(String arg[]){
		int i=0;
        do{
            int j=0;
			while (j<i+1){
			    System.out.print('*');
			    j++;
			}
			System.out.println();
			i++;

        } while (i<10);
	}
}

/*
	Penjelasan :
		Dari program diatas kita memiliki variabel i
		dan j. i akan menghasilkan baris yaitu i<10 (0-9)
		setiap baris akan menghasilkan 1 "*". Sedangkan j
		akan menghasilkan "*" kearah kanan dengan menambah
		1 "*" disetiap barisnya.



*/