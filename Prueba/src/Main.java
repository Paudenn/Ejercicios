import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static double suma (Figuras [] v){
        double res=0;
        for(Figuras f:v){
            res+=f.area();
        }
        return res;
    }

    public static void main (String[] args){
        Rectangulo rectangulo = new Rectangulo(2,5);
        Circulo circulo = new Circulo(3);
        Triangulo triangulo = new Triangulo (6,2.5);
        Cuadrado cuadrado = new Cuadrado(4);
        int n = 1;
        Figuras[] figures = {rectangulo, circulo, triangulo, cuadrado};
        System.out.println("Resultados de las siguientes areas: Rectangulo, Circulo, Triangulo, Cuadrado");
        for (Figuras figura : figures){
            System.out.println("Area " + n + ": "+figura.area());
            n++;
        }
        System.out.println("Suma Total:"+suma(figures));
        System.out.println("Ahora se mostraran las areas de menor a mayor:");
        ArrayList<Figuras> figura1 = new ArrayList<>();
        figura1.add(rectangulo);
        figura1.add(circulo);
        figura1.add(triangulo);
        figura1.add(cuadrado);
        Collections.sort(figura1);
        for(Figuras f : figura1){
            System.out.println(f.area());
        }
    }
}
