/*public class AkunBank{
	//atribut
	private int saldo;

	//Method
	//Constractor
	public AkunBank(int saldo){  //didalam method ini kita bisa input sesuatu atau menulis parameternya

		this.saldo = saldo;

	}
	//Accesor  (memiliki selalu tipe datanya dengan nilai yang akan dikembalikan atributnya)
	public int getSaldo(){
		return this.saldo;
	}
	//Mutator (mengubah nilai atributnya)
	public void setSaldo(int saldo){
		this.saldo = saldo;
	}

	public void setor(int jumlahSetoran){
		int totalSaldo = getSaldo() + jumlahSetoran;
		setSaldo(totalSaldo);
		System.out.println("Berhasil melakukan transaksi " + jumlahSetoran);
	}

	public void tarik(int jumlahPenarikkan){
		if(getSaldo() < jumlahPenarikkan){
			System.out.println("Gagal penarikkan ! Sisa saldo : " + getSaldo);

		}else{
			setSaldo(getSaldo() - jumlahPenarikkan);
		}
	}
}*/






public class AkunBank {
	// Attribute
	private int saldo;

	// Method
	// Constructor
	public AkunBank(int saldo) {
		this.saldo = saldo;
	}

	// Accessor
	public int getSaldo(){
		return this.saldo;
	}

	// Muttator
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setor(int jumlahSetoran) {
		setSaldo(getSaldo() + jumlahSetoran);
		System.out.println("Berhasil Melakukan Setoran Sebanyak : "+jumlahSetoran);
	}

	public void tarik(int jumlahPenarikan) {
		if(getSaldo() < jumlahPenarikan) {
			System.out.println("Gagal melakuakn penarikan! Sisa saldo : "+getSaldo());
		}else{
			setSaldo(getSaldo() - jumlahPenarikan);
			System.out.println("Berhasl melakukan penarikan Sebanyak : "+jumlahPenarikan);
		}
	}

	public String toString() {
		return "Jumlah Saldo : "+getSaldo();
	}
}