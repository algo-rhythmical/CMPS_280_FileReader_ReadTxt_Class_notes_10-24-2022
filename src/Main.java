/*Today's agenda:
    -read stuff from a text file
    -write stuff to a file

*
*
*
*
*
*
*
*
*
 */

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader(
                "C:\\Users\\w0748346\\Desktop\\Random.txt");     //expects arguements (string) file location + filename

/*
        char c = (char)fr.read();
        System.out.println(c);          //read char itself

        c = (char)fr.read();
        System.out.println(c);         //internal system keeps track of the char's that get read

        c = (char)fr.read();
        System.out.println(c);

        int i = fr.read();
        System.out.println(i);     // when there is no more characters, will read -1
*/

        //create a while loop until you get -1 to read all the available characters
        int num = fr.read();
        while (num != -1) {
            char c = (char) num;
            System.out.println(c);
            num = fr.read();
        }

    }

}
