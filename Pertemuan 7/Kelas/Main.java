class Main {
	public static void main(String[] args) {
		Kelas kelas = new Kelas(1, 10);

		kelas.addSiswa("Ucup", "          12");
		kelas.addSiswa("Otong Surotong", "32");

		System.out.println(kelas.getSiswa(0));
		System.out.println(kelas.getSiswa(1));
	}
}