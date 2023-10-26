import java.util.Scanner;

class RectangleArea {

    private double L;
    private double W;
    private double A;

    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        L = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        W = scanner.nextDouble();
        scanner.close();
    }


    public void fieldDisplay() {
        System.out.println("Rectangle information:");
        System.out.println("Length: " + L);
        System.out.println("Width: " + W);
        System.out.println("Area: " + A);
    }

    public void computeField() {
        A = L * W;
    }
}
