package multi.constructor;

public class LimasSegiEmpat {
    private int sisi_alas;
    private int tinggi_limas;
    
    public LimasSegiEmpat (int sisi_alas, int tinggi_limas){
        this.sisi_alas = sisi_alas;
        this.tinggi_limas = tinggi_limas;
    }
   
    public LimasSegiEmpat (){
        this (0,0);
    }
    
    public int volume (){
        int volume = (sisi_alas * sisi_alas * tinggi_limas)/3 ;
        return volume;  
    }
    
    public int getsisi_alas (){
        return sisi_alas;
    }
    
    public void setsisi_alas (int sisi_alas){
        this.sisi_alas = sisi_alas;
    }
    
    public int gettinggi_limas (){
        return tinggi_limas;
    }
    
    public void settinggi_limas (int tinggi_limas){
        this.tinggi_limas = tinggi_limas;
    }
}
