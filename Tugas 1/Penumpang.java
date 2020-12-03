public class Penumpang {
    private String nama;
    int umur;
     boolean hamil;
    public Penumpang(String nama,int umur,boolean hamil){
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
    }
    public String getNama() {
        return this.nama;
    }
    public int getUmur() {
        return this.umur;
    }
    public boolean gethamil(){
        return this.hamil;
    }
}
