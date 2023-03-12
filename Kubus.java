package multi.constructor;


public class Kubus {
    private int side;
    
    public Kubus (int sisi){
        this.side = sisi;
    }
    
    public Kubus (){
       this (0);
    }
    
    public int volume (){
        int volume = side * side * side;
        return volume;
    }
    
    public int getside(){
        return side;
    }
    
    public void setside (int sisi){
        this.side = sisi;
    }
    
}
