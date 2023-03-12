package multi.constructor;


public class Balok {
    private int lenght;
    private int height;
    private int width;
    
    public Balok (int panjang, int lebar, int tinggi){
        this.lenght = panjang;
        this.width = lebar;
        this.height = tinggi;
    }
    
    public Balok (){
        this (0,0,0);
    }
    
    public int volume(){
        int volume = lenght * width * height;
        return volume;
    }
    
    public int getlenght (){
        return lenght;
    }
    
    public void setlenght (int panjang){
        this.lenght = panjang;
    }
    
    public int getwidth (){
        return width;
    }
    
    public void setwidth (int lebar){
        this.width = lebar;
    }
    
    public int getheight (){
        return height;
    }
    
    public void setheight (int tinggi){
        this.height = tinggi;
    }
}
