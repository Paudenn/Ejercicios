public class Triangulo extends Figuras {
    private double b;
    private double h;

    Triangulo (double b, double h){
        this.b=b;
        this.h=h;
    }

    public double area (){
        return (b*h)/2;
    }
}