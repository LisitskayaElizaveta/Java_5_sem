public enum Enum2 {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    private final String name;
    private final int weekdayNumber;

    Enum2(String name, int weekdayNumber) {
        this.name = name;
        this.weekdayNumber = weekdayNumber;
    }

    // метод для проверки, является ли выходным
    public boolean holidays(int weekdayNumber) {
        return this.weekdayNumber >= 6;
    }
}