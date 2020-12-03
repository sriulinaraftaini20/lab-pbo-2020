import java.util.Scanner;

public class Bus {

Scanner input = new Scanner(System.in);
String[] penumpangBiasa = new String[4];
String[] penumpangPrioritas = new String[2];
Penumpang penumpang = new Penumpang(null,0,false);
String nama;
int umur;
boolean hamil;

public String getPenumpangBiasa() {
    String nama ="";
    for (int i = 0; i < this.penumpangBiasa.length; i++) {
        if(this.penumpangBiasa[i] != null){
            nama += this.penumpangBiasa[i];
            nama += ",";
        }
    }
    if (nama=="") {
        return nama = "<kosong>";
    }
    return nama.substring(0,nama.length()-1);
}
public String getPenumpangPrioritas() {
    String nama ="";
    for (int i = 0; i < this.penumpangPrioritas.length; i++) {
        if(this.penumpangPrioritas[i] != null){
            nama += this.penumpangPrioritas[i];
            nama += ",";
        }
    }
    if (nama=="") {
        return nama = "<kosong>";
    }
    return nama.substring(0,nama.length()-1);
}
public int getJumlahPenumpangBiasa(){
    int count = 0;
    for (int i = 0; i < this.penumpangBiasa.length; i++) {
        if (this.penumpangBiasa[i] != null) {
            count++;
        }
    }
    return count;
}
public int getJumlahPenumpangPrioritas(){
    int count = 0;
    for (int i = 0; i < this.penumpangPrioritas.length; i++) {
        if (this.penumpangPrioritas[i] != null) {
            count++;
        }
    }
    return count;
}
public boolean naikanPenumpang(Penumpang penumpang){
    if(getJumlahPenumpangBiasa()!=4 || getJumlahPenumpangPrioritas()!=2){
        
        if (penumpang.getUmur()>60||penumpang.getUmur()<10 || penumpang.gethamil()==true) {
            for (int i = 0; i < this.penumpangPrioritas.length; i++) {
                if (this.penumpangPrioritas[i] == null) {
                    this.penumpangPrioritas[i] = penumpang.getNama();
                    return true;
                }    
            }
            for (int i = 0; i < this.penumpangBiasa.length; i++) {
                if (this.penumpangBiasa[i] == null) {
                    this.penumpangBiasa[i] = penumpang.getNama();
                    return true;
                }
            } 
        }else{
            for (int i = 0; i < this.penumpangBiasa.length; i++) {
                if (this.penumpangBiasa[i] == null) {
                    this.penumpangBiasa[i] = penumpang.getNama();
                    return true;
                }
            }
        }
    }else{
        System.out.println("Maaf kursi penumpang sudah penuh!");
        System.out.println("-------------------------------------------\n");
        return false;
    }
    
    return false;
}
public boolean turunkanPenumpang(String namapenumpang){

    for (int i = 0; i < this.penumpangBiasa.length; i++) {
        if (namapenumpang.equalsIgnoreCase(this.penumpangBiasa[i])) {
            this.penumpangBiasa[i] = null;
            return true;
        }
    }
    for (int i = 0; i < this.penumpangPrioritas.length; i++) {
        if (namapenumpang.equalsIgnoreCase(this.penumpangPrioritas[i])) {
            this.penumpangPrioritas[i] = null;
            return true;
        }
    }
    return false;
}
public String toString(){
   String biasa = "\nPenumpang biasa            : "+getPenumpangBiasa();
   String prioritas ="Penumpang Prioritas        : "+getPenumpangPrioritas();
   String jumlah = "Jumlah Semua Penumpang Bus : "+(getJumlahPenumpangBiasa()+getJumlahPenumpangPrioritas());
    return biasa+"\n"+prioritas+"\n"+jumlah + "\n-------------------------------------------\n";
}
    
}