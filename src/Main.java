

public class Main {
    public static void main(String[] args) {
        try (Cat cat = new Cat()) {
//            cat.setCollar(new Collar());
            if (true) {
                Collar collar = new Collar();
                System.out.println("мы тут");
            }
            System.out.println("Все прошло без исключений");
        } catch (Exception e) {
            System.out.println("Мы поймали исключение");
        }
    }
}
