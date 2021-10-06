public abstract class Figuras implements Comparable<Figuras> {
    public Figuras(){
    }
    abstract public double area();


    public int compareTo(Figuras o) {
        if (o.area()>this.area()){
            return -1;
        }else if (o.area()==this.area()){
            return 0;
        }else {
            return 1;
        }
    }
}