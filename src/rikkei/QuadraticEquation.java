package rikkei;

public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(){

    }
    public QuadraticEquation (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a){
        this.a = a;
    }
    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b = b;
    }
    public double getC(){
        return c;
    }
    public void setC(double c){
        this.c = c;
    }
    public double getDiscriminant(){

        return ((this.b*this.b)-4*(this.a*this.c));
    }
    public double getRoot(){
        return (-this.b/(2*this.a));
    }
    public double getRoot1(){
        return (-this.b-Math.pow(getDiscriminant(),0.5))/2*this.a;
    }
    public double getRoot2(){
        return (-this.b+Math.pow(getDiscriminant(),0.5))/2*this.a;
    }
}
