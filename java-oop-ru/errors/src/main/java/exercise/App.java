package exercise;

public class App {
    public static void printSquare(final Circle circle) {
        try {
            int result = Math.round(circle.getSquare());
            System.out.println(result);
        } catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Вычисление окончено");
    }
}
