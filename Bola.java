package multi.constructor;

public class Bola {
    private double radius;
    
    public Bola (double radius){
        this.radius = radius;
    }
    
    public Bola (){
        this (0.0);
    }
    
    public double volume (){
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    } 
    
    public double getradius (){
        return radius;
    }
    
    public void setradius (double radius){
        this.radius = radius;
    }
}
