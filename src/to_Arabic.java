//перевод в арабские
public interface to_Arabic {

    static int toArabic(String numString) {
        int arabicValue=0;
        if (numString.equals("I")) arabicValue =1;
        if (numString.equals("II")) arabicValue =2;
        if (numString.equals("III")) arabicValue =3;
        if (numString.equals("IV")) arabicValue =4;
        if (numString.equals("V")) arabicValue =5;
        if (numString.equals("VI")) arabicValue =6;
        if (numString.equals("VII")) arabicValue =7;
        if (numString.equals("VIII")) arabicValue =8;
        if (numString.equals("IX")) arabicValue =9;
        if (numString.equals("X")) {
            arabicValue =10;
        }
        return arabicValue;
    }
}