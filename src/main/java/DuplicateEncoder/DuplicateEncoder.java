package DuplicateEncoder;

/*
The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that
character appears only once in the original string, or ")" if that character appears more than once in the original
string. Ignore capitalization when determining if a character is a duplicate.

        Examples
        "din"      =>  "((("
        "recede"   =>  "()()()"
        "Success"  =>  ")())())"
        "(( @"     =>  "))(("
*/

public class DuplicateEncoder {

    static String encode(String word) {
        String newWord = word.toLowerCase();

        char[] wordInCharArray = newWord.toCharArray();
        int[] intWord = new int[newWord.length()];

        for (int i = 0; i < newWord.length(); i++) {
            int duplicateChar = 0;
            String char1 = String.valueOf(wordInCharArray[i]);
            for (int j = 0; j < newWord.length(); j++) {
                String char2 = String.valueOf(wordInCharArray[j]);
                if (char1.equals(char2)) {
                    duplicateChar++;
                }
            }
            intWord[i] = duplicateChar;
        }

        word = "";
        for (int iterator : intWord) {
            if (iterator == 1) {
                word += "(";
            } else {
                word += ")";
            }
        }

        return word;
    }

}

// Another way:

/*
public class DuplicateEncoder {
  static String encode(String word){
        return word.toLowerCase()
                   .chars()
                   .mapToObj(i -> String.valueOf((char)i))
                   .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                   .collect(Collectors.joining());
  }
}
 */
