package satu;
class Manusia{
    private String nama;
    public Integer umur;

    public Manusia(String InputNama, Integer inputUmur){
        this.nama = InputNama;
        this.umur = inputUmur;
    }
    public void setNama(String inputNama){
        this.nama = inputNama;
    }
    public String getNama(){
        return this.nama;
    }
}
public class Manusia2 {
    public static void main(String[] args) {
        Manusia adit = new Manusia("adit",22);
        adit.setNama("adit");
        System.out.println(adit.getNama());
    }
}

