public class Hero{
	private int hp;
	private int ap;
	private String nama;

	public Hero(String nama, int ap){
		this.hp = 100;
		this.nama = nama;
		this.ap = ap;
	}

	public int getHp(){
		return this.hp;
	}

	public void setHp(int hp){
		this.hp = hp;
	}

	public int getAp(){
		return this.ap;
	}

	public String getNama(){
		return this.nama;
	}

	public void serang(Hero target){
		//Hp yang diserah berkurang sebanyak Ap yang menyerang
		target.setHp (target.getHp() - this.ap);
		System.out.println(this.nama + " Menyerang" + target.getNama());
		System.out.println("Hp " + target.getNama() + " Berkurang" + this.ap);

		if(target.getHp() <= 0){
			System.out.println("Hero " + this.getNama() + " Menang!");
		}
	}

	public void healing(){
		this.setHp (this.getHp() + 10);

		System.out.println("Hero " + this.getNama() + " Berkurang " + this.ap);
		System.out.println(this);

		if(this.getHp() > 100)
			this.setHp(100);
	}

	public String toString(){
		return "Nama Hero :" + this.nama + "\nHp : " + this.hp + "\n Ap : " + this.ap + "\n";
	}

}