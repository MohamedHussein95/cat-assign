public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    } public double getHeight(){
        return this.height;
    }
    public void setWidth(double length){
        this.width = length;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double calculateArea(){

        return this.width * this.height;
    }
    public double calculateCircumference(){

        return 2 * (this.width + this.height);
    }
    public void displayRectangle(){
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
