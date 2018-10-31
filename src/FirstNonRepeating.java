import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static  void main(String[] args) {
       /* The FirstNonRepeatingChar method doesn't take blank spaces into considerations so
          you can pass  phrase like "hello hello" as the string parameter and it will print
          that all chars in it repeat instead of saying the first non repeating char is a blank space ' '
          The program is case sensitive ,and Im currently wondering if there is a way to not make it case sensitive.
        */


        FirstNonRepeatingChar("hello");
        FirstNonRepeatingChar("hellohello");
        FirstNonRepeatingChar("  example with spaces  ");
        FirstNonRepeatingChar(" all repeating example with spaces rngxmwhc");
        //Case sensitive example
        FirstNonRepeatingChar("AaBbCcDdE");
    }


    public static void FirstNonRepeatingChar(String FNRstring) {


        /* We create a hash map where the keys are going to be the individual characters and
           the value is going to be how many times those characters occur in the string */
        Map<Character, Integer> charMap = new HashMap<>(); //stringLength pass

        // This for loop will iterate once for each character in the string.
        for (int i = 0; i < FNRstring.length(); i++) {

            /* This if statement checks to see if the current indexed character ->.charAt(I)
                is already in the hashMap ->.containskey() */
            if (charMap.containsKey(FNRstring.charAt(i)) ) {

                /*If the indexed char is in the hashMap already then we will reassign its keys value to be incremented by 1.
                 This is possible because hashMaps do not allow for duplicates.
                 The value here is acting as a counter which we will later be able to check to see how many times
                 each character occurs in the given string*/
                charMap.put(FNRstring.charAt(i), charMap.get(FNRstring.charAt(i))+1);

            }

            else {
                // If the map does not contain the indexed character then we add it to the hashMap with a value of 1
                charMap.put(FNRstring.charAt(i), 1);
            }

        }

        /* At this point we have created a hashMap with all the characters in the given string and their values
           representing how many times they occur in the given string. All we need to do now is  find the first instance
           of a character having the value of 1 in the map */
        int x = -1 ;
        for (int j = 0; j < FNRstring.length(); j++) {
            // !=' ' makes it so we ignore blank spaces
            if (charMap.get(FNRstring.charAt(j)) == 1 && FNRstring.charAt(j) != ' ') {

                x = j;
                break;
            }

        }

        if( x != -1){
            System.out.println ( "the first non repeating charachter in \"" + FNRstring + "\" is " + FNRstring.charAt(x));
        }

        else{
            System.out.println("all chars in \""+FNRstring+"\" repeat");
        }
    }
}

