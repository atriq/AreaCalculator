public class Main {
    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();
        System.out.println(a.area(5.0));
        System.out.println(a.area(-1));
        System.out.println(a.area(5.0,4.0));
        System.out.println(a.area(-1.0,4.0));
    }
}