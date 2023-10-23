import java.util.Scanner;
public class Game {
    private int userChoice ;
    public void displayMenu(){
        System.out.println("---------- Welcome user ----------");
        System.out.println("Choose a shape to display:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("---------- MY JAVA PROGRAMME ----------");
        Scanner scanner = new Scanner(System.in);
        userChoice = scanner.nextInt();
        setUserChoice(userChoice);
        validateChoice();

    }
    int getUserChoice(){
        return this.userChoice;
    }
    void setUserChoice(int choice){
        this.userChoice = choice;
    }
    void validateChoice(){
        switch (this.userChoice) {

            case 1: // Circle
                System.out.println("Enter the radius of the circle:");
                Scanner scanner = new Scanner(System.in);
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("The area is :" + circle.calculateArea() + " and the circumference is :"+circle.calculateCircumference());
                break;
            case 2: // Triangle
                System.out.println("Enter the base of the Triangle:");
                Scanner sct = new Scanner(System.in);
                double base = sct.nextDouble();
                System.out.println("Enter height of the Triangle:");
                double heightTr = sct.nextDouble();
                Triangle triangle = new Triangle(base,heightTr);
                System.out.println("The area is :" +  triangle.calculateArea() + " and the circumference is :"+ triangle.calculateCircumference());
                triangle.displayRectangle();
                break;
            case 3: // Rectangle
                System.out.println("Enter the width of the rectangle:");
                Scanner sc = new Scanner(System.in);
                double width = sc.nextDouble();
                System.out.println("Enter height of the rectangle:");
                double height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(width,height);
                System.out.println("The area is :" +  rectangle.calculateArea() + " and the circumference is :"+ rectangle.calculateCircumference());
                rectangle.displayRectangle();
                break;

            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                break;
        }


    }



}
