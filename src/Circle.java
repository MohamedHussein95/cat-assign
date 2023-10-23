public class Circle {
     private final double PI = 3.14;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        //area = piR^2
        return 2*(this.PI * Math.pow(this.radius,2));
    }
    public double calculateCircumference(){
        //area = piR^2
        return 2*(this.PI *  this.radius );
    }

}
