//проверяем это число или символ?
public interface isNumeric {
    static boolean Protected(String str){
        try {
            int i=Integer.parseInt(str);
        }catch (NumberFormatException|NullPointerException nfe){
            return false;
        }
        return true;
    }
}