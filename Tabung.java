package multi.constructor;

public class Tabung {
    private double radius;
    private double height;
    
    public Tabung (double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    
    public Tabung (){
        this (0.0,0.0);
    }
    
    public Tabung (float radius){
        this (radius, 0);
    }
    
    public double volume (){
        double volume  = Math.PI * Math.pow (radius,2) * height;
        return volume;
    }
    
    public double getradius (){
        return radius;
    }
    
    public void setradius (double radius){
        this.radius = radius;
    }
    
    public double getheight (){
        return height;
    }
    
    public void setheight (double height){
        this.height = height;
    }
    
    
}
