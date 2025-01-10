
public class AreaCal {
    public static void main(String args[]){
        area(-1,4);
    }

    public static double area(double radius){
        if (radius < 0) 
            return -1;
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is " + area);
        return area;
    }

    public static double area(double x, double y){
        if (x<0 || y<0)
            return -1;
        double area = x * y;
        System.out.println("Area of rectangle with length " + x + " and breadth " + y + " is " + area);
        return area;
    }
}
