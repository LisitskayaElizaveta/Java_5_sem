public class Operation2 {
    public static void main(String[] args) {
    Integer int1 = 1234;
    Object obj1 = "abcdfg";
    String str1 = "ABCD";

    // instanceof - является ли экземпляром данного типа или одного из его подклассов
    // int
    System.out.println("int экземпляр Number? " + (int1 instanceof Number));
    //System.out.println("int экземпляр String? " + (int1 instanceof String)); - ошибка
    System.out.println("int экземпляр Object? " + (int1 instanceof Object));

    //obj
    System.out.println("obj экземпляр Number? " + (obj1 instanceof Number));
    System.out.println("obj экземпляр String? " + (obj1 instanceof String));
    System.out.println("obj экземпляр Object? " + (obj1 instanceof Object));

    //str
    //System.out.println("str экземпляр Number? " + (str1 instanceof Number)); - ошибка
    System.out.println("str экземпляр String? " + (str1 instanceof String));
    System.out.println("str экземпляр Object? " + (str1 instanceof Object));

    // null-объект
    Object null1 = null;
    System.out.println("null экземпляр Number? " + (null1 instanceof Number));
    System.out.println("null экземпляр String? " + (null1 instanceof String));
    System.out.println("null экземпляр Object? " + (null1 instanceof Object));
    }

}
