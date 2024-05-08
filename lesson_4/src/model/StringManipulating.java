package model;

public class StringManipulating {

    public String manipulate(String strt){
        IsVowel isVowel = (str) -> {
            if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i") || str.toLowerCase().contains("o") || str.toLowerCase().contains("u") || str.toLowerCase().contains("y")) {
                return true;
            }else{
                return false;
            }
        };

        String result = "";
        for (int i = 0; i < strt.length(); i++) {
            char c = strt.charAt(i);
            if (isVowel.isVowel(String.valueOf(c))) {
                result += c;
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;

    }


    interface IsVowel {
        boolean isVowel(String str);
    }
}
