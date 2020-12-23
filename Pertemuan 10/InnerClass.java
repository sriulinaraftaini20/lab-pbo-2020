class InnerClass {
	public static void main(String[] args) {
		Outer outerClass = new Outer();
		outerClass.sum();

		Outer.Inner innerClass = new Outer.Inner();

		System.out.println("Hasil kurang : " + (outerClass.x - innerClass.y));
	}
}