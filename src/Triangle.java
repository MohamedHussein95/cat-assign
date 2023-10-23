public class Triangle {
    private double base;
    private double height;
    private double hypotunuse;

    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return this.base;
    } public double getHeight(){
        return this.height;
    }public double getHypotunuse(){
        return this.hypotunuse;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setHeight(double height){
        this.height = height;
    }  public void setHypotunuse(double hypotunuse){
        this.hypotunuse = hypotunuse;
    }
    public double calculateArea(){

        return (this.base * this.height)/2;
    }
    public double calculateCircumference(){
        double hypotunuse = Math.sqrt(Math.pow(this.base,2)+Math.pow(this.height,2));
        setHypotunuse((hypotunuse));
        return  (this.base + this.height +this.hypotunuse );
    }
    public void displayRectangle(){
        System.out.println("Here's your triangle:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= base; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
