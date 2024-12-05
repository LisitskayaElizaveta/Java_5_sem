public class Switch1 {
    enum Litera {A, B, C, D, E, F};
    public static void main(String[] args) {
        // Пример для int то же самое для обертки Integer
        int a=-5;
        int x = a%2;
        switch (x) {
            case 1:
                System.out.println("Odd number");
                break;
            case 0:
                System.out.println("Even number");
                break;
            default:
                System.out.println("Negative odd number");
        }
        // Пример для byte
        byte b = 11;
        switch (b) {
            case 11:
                System.out.println("b = 11");
                break;
            case 10:
                System.out.println("b = 10");
                break;
            default:
                System.out.println("Not 11 or 10");
        }

        // Пример для char
        char c = 'C';
        switch (c) {
            case 'A':
                System.out.println("Mark A");
                break;
            case 'F':
                System.out.println("Mark F");
                break;
            default:
                System.out.println("The exam is passed");
        }

        // Пример для enum

        Litera mark = Litera.A;
        switch (mark) {
            case A:
                System.out.println("Mark A");
                break;
            case F:
                System.out.println("Mark F");
                break;
            default:
                System.out.println("The exam is passed");
        }

        // Пример для String то же самое для обертки String
        String country = "Russia";
        switch (country) {
            case "Russia":
                System.out.println("Russia");
                break;
            case "Germany":
                System.out.println("Germany");
                break;
            default:
                System.out.println("Country 404");
        }

    }
}