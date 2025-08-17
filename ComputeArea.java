public class ComputeArea {
    public static void main(String[] args) {
        double base = 4.0;
        double height = 6.0;
        double pi = 3.14;
        double radius = 8.0;
        double areaTriangle = (base * height) / 2;
        double areaCircle = pi * radius * radius;
        double areaSquare = base * base;

        System.out.println("Area of Triangle: " + areaTriangle + " Area of Circle: " + areaCircle + " Area of Square: " + areaSquare);
    }
}
