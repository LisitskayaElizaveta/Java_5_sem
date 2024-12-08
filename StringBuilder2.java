public class StringBuilder2 {
    public static void main(String[] args) {
        String str = "ABCD xyz!";
        StringBuffer stringBuffer = new StringBuffer(str);  //  String -> StringBuffer
        StringBuilder stringBuilder = new StringBuilder(str);  //  String -> StringBuilder


        String str1 = stringBuffer.toString();    //StringBuffer -> String
        StringBuilder stringBuilder1 = new StringBuilder(stringBuffer.toString()); //StringBuffer -> StringBuilder

        String str2 = stringBuilder.toString(); // StringBuilder в String
        StringBuffer stringBuffer1 = new StringBuffer(stringBuilder.toString()); //StringBuilder в StringBuffer
    }
}