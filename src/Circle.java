public class Circle {
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public boolean isEqual(Circle b){
        if(b.radius==this.radius){
            return true;
        }
        return false;
    }
    public double getLength(){
        return 2*3.14*this.radius;
    }
    public double getSpace(){
        return 3.14*this.radius*this.radius;
    }
}
