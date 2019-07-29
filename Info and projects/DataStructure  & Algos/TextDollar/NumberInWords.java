package TextDollar;

//program to convert the given input number into words.

public class NumberInWords {

    private WordRepresentaion wordRepresentaion;
    private StringBuilder finalString = new StringBuilder();

    NumberInWords() {

        this.wordRepresentaion = new WordRepresentaion();
    }

    public String convertNumberToWords(Integer num) {

        char[] numArray = num.toString().toCharArray();
        buildFinalString(numArray);
        return finalString.toString();

    }

    private void buildFinalString(char[] numArray) {

        int length = 0;
        int numLength = numArray.length;
        while (length < numArray.length - 2) {

            finalString.append(wordRepresentaion.unitMap.get(Character.getNumericValue(numArray[length])));
            
            if (numArray[length] != '0') {
                finalString.append(wordRepresentaion.numberValue.get(numLength));
            }

            length++;
            numLength--;
        }


        int lastTwoDigit = Character.getNumericValue((numArray[length] + numArray[length + 1]));

        if (wordRepresentaion.multiplesOfTen.containsKey(lastTwoDigit)) {
            finalString.append(wordRepresentaion.multiplesOfTen.get(lastTwoDigit));
        } else {

            finalString.append(wordRepresentaion.tensMap.get(Character.getNumericValue(numArray[length])));
            finalString.append(wordRepresentaion.unitMap.get(Character.getNumericValue(numArray[length + 1])));

        }
    }


}
