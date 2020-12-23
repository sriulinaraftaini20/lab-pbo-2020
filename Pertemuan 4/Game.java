class Game{
	public static void main(String[] args){
		Hero hero1 = new Hero("Patimura", 20);
		Hero hero2 = new Hero("Teuku umar", 30);

		//System.out.println(hero1);
		//System.out.println(hero2);
		hero1.serang(hero2);

		hero2.serang(hero1);
		hero2.serang(hero1);
		hero2.serang(hero1);

		hero1.healing();
		hero1.healing();

		hero2.serang(hero1);
		
		
	}
}