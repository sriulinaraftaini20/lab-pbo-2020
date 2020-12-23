public class IfElseIfExample{
	public static void main(String[] args){
		int marks = 65;

		if(marks < 50){
			System.out.println("Fail");
		}
		else if (marks >= 50 && marks < 60){
			System.out.println("D grade");
		}
		else if (marks >= 60 && marks < 70){
			System.out.println("C grade");
		}
		else if (marks >= 70 && marks <80){
			System.out.println("B garde");
		}
		else if (marks >= 80 && marks<90){
			System.out.println("A grade");
		}
		else if (marks >= 90 && marks < 100){
			System.out.println("A+ grade");
		}
		else{
			System.out.println("Invalid!");
		}
	}
}

/*
	Penjelasan :
		Kode diatas merupakan seleksi dari If-Else-If, dimana kita 
		memiliki variabel int marks yang mempunyai nilai 65.
		Kondisi If akan dilakukan jika nilai boolean true dikembalikan.
		Jika nilai boolean false maka akan masuk kekondisi else-if.Untuk kode diatas 
		Pada Kondisi 1 jika nilai marksnya < 50 maka akan mengeluarkan "Fail".
		Pada Kondisi 2 jika marks >=50 dan <60 maka akan mengeluarkan "D grade"
		Pada Kondisi 3 jika marks >=60 dan <70 maka akan mengeluarkan "C grade"
		Pada Kondisi 4 jika marks >=70 dan <80 maka akan mengeluarkan "B grade"
		Pada Kondisi 5 jika marks >=80 dan <90 maka akan mengeluarkan "A grade"
		Pada Kondisi 6 jika marks >=90 dan <100 maka akan mengeluarkan "A+ grade"
		Pada Kondisi 7 jika marks >=50 dan <60 maka akan mengeluarkan "Invalid"


*/