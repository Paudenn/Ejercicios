public class Circulo extends Figuras {
    private double r;

    Circulo (double r){
        this.r = r;
    }

    public double area (){
        return (3.1415)*r*r;
    }
}