package TextDollar;

import java.util.HashMap;
import java.util.Map;

public class WordRepresentaion {


    WordRepresentaion(){

        learnUnitNumberRepresentation();
        learnTensNumberRepresentation();
        learnNumberValue();
        learnMultiplesOfTen();
    }

     Map<Integer,String> unitMap = new HashMap<>();
     Map<Integer,String> tensMap = new HashMap<>();
     Map<Integer,String> numberValue = new HashMap<>();
     Map<Integer,String> multiplesOfTen = new HashMap<>();

     private void learnUnitNumberRepresentation(){

        unitMap.put(1,"One");
        unitMap.put(2,"Two");
        unitMap.put(3,"Three");
        unitMap.put(4,"Four");
        unitMap.put(5,"Five");
        unitMap.put(6,"Six");
        unitMap.put(7,"Seven");
        unitMap.put(8,"Eight");
        unitMap.put(9,"Nine");
        unitMap.put(0,"");
    }

    private void learnTensNumberRepresentation(){
        tensMap.put(1,"Ten");
        tensMap.put(2,"Twenty");
        tensMap.put(3,"Thirty");
        tensMap.put(4,"Forty");
        tensMap.put(5,"Fifty");
        tensMap.put(6,"Sixty");
        tensMap.put(7,"Seventy");
        tensMap.put(8,"Eighty");
        tensMap.put(9,"Ninety");
        tensMap.put(0,"");
    }
    private void learnNumberValue(){

        numberValue.put(4,"Thousand");
        numberValue.put(3,"Hundred");

    }

    private void learnMultiplesOfTen(){

        multiplesOfTen.put(11,"Eleven");
        multiplesOfTen.put(12,"Twelve");
        multiplesOfTen.put(13,"Thirteen");
        multiplesOfTen.put(14,"Fourteen");
        multiplesOfTen.put(15,"Fifteen");
        multiplesOfTen.put(16,"Sixteen");
        multiplesOfTen.put(17,"Seventeen");
        multiplesOfTen.put(18,"Eighteen");
        multiplesOfTen.put(19,"Nineteen");


    }

}
