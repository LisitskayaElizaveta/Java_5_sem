public class Type8 {
    public static void main(String[] args) {
        var byte1 = (byte) 12.09f;     // будет определен типом byte
        var float1 = (float) 12.09f;   // будет определен типом float
        var short1 = (short) 12.09f;   //
        var int1 = 12.09f;             // будет определен типом float
        var long1 = (double) 12.09f;   //
        var long2 = short1 + long1;    // будет определен типом long
    }
}
