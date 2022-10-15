package TugasSesi2;

public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    
// Nama    : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069

    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public String getJenisHP(){
        return jenis_hp;
    }
    
    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    
    public static void main(String[] args){
        HandPhone hp = new HandPhone();
        hp.setDataHP("Ios", 2004);
        System.out.println("Jenis hp: " +hp.jenis_hp);
        System.out.println("Tahun Pembuatan:" +hp.getTahunPembuatan());
    }
}
