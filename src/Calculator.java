import java.util.Scanner;

public class Calculator extends Numbers implements Calculation, Operations, to_Roman {

    public static void main(String[] args) {

        System.out.println("Введите 1 число:");
        int numLineOne = Numbers.getNum();


        char operationLine = Operations.getOperation();

        System.out.println("Введите 2 число:");
        int numLineTwo = Numbers.getNum();

        String result = Calculation.calc(numLineOne, numLineTwo, operationLine);
        if (flag) {System.out.println("Результат операции: " + result);//если флаг есть, то выводим арабскими символами, если нет-то римскими
        }else{
            int num=Integer.parseInt(result);//парсим result в тип Integer
            String res=to_Roman.toRoman(num);//перевод в римские
        System.out.println("Результат операции: " + res);
        }

    }

}