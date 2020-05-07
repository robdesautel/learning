public class Main {
    public static void main(String[] args) {
        Point pointOne = new Point(5,8);
        Point pointTwo = new Point(-10, 50);

        System.out.println(pointOne.distance());
        System.out.println(pointOne.distance(20, 6));
        System.out.println(pointTwo.distance(pointOne));

    }
}
