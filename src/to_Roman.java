//перевод в римские
public interface to_Roman {

    static String toRoman(int romanValue){
        String stroked=null;
        if (romanValue==1) stroked ="I";
        if (romanValue==2) stroked ="II";
        if (romanValue==3) stroked ="III";
        if (romanValue==4) stroked ="IV";
        if (romanValue==5) stroked ="V";
        if (romanValue==6) stroked ="VI";
        if (romanValue==7) stroked ="VII";
        if (romanValue==8) stroked ="VIII";
        if (romanValue==9) stroked ="IX";
        if (romanValue==10) stroked ="X";
        return stroked;
    }
}