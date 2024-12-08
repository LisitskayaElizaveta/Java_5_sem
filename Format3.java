import java.util.Date;
public class Format3 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("Seconds: %tS%n", date);  // выводит секунды
        System.out.printf("Minutes: %tM%n", date);  // минуты
        System.out.printf("Hours: %tH%n", date);  // часы
        System.out.printf("Month: %tB%n", date);  //название месяца
        System.out.printf("Year: %tY%n", date);   // год

    }
}