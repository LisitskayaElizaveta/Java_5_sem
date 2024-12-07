public enum Enum1 {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    private final String name;
    private final int weekdayNumber;

    Enum1(String name, int dayNumber) {
        this.name = name;
        this.weekdayNumber = dayNumber;
    }
}