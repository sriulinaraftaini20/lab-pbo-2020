public class CobaContinue{
	public static void main(String arg[]){
		for (int i=0; i<10; i++){    //loop for ke-1
			for (int j=0; j<i+1; j++){ //loop for ke-2
			    if(j==5)
                continue;
                
			    System.out.print('*');
			}
			System.out.println();
		}
    }
}

/*
	Penjelasan :
		Kondisi continue akan melanjutkan ketahap selanjutnya
		pada perulangan. int i diberi kondisi i < 10 (0-9)
		i akan menghasilkan 1 "*" disetiap barisnya. Sedangkan j
		akan menambah 1 "*" disetiap barisnya dan jika j==5
		maka loopingnya akan dilanjutkan ditahap berikutnya.
*/