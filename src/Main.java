/*Today's agenda:
    -read stuff from a text file
    -write stuff to a file

 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader(
                "C:\\Users\\w0748346\\Desktop\\Random.txt");     //expects arguements (string) file location + filename

        //READ STuFF FROM TEXT FILE
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

/*
        //create a while loop until you get -1 to read all the available characters
        int num = fr.read();
        while (num != -1) {
            char c = (char) num;
            System.out.println(c);
            num = fr.read();
        }
*/
/*
        //gets total number of new lines
        int num = fr.read();
        int totalNewLine= 1;
        while (num != -1) {
            if (num == 10)
                totalNewLine++;
                num = fr.read();
        }
        System.out.println(totalNewLine);
*/

        //WRITE STUFF TO A FILE!!

        FileWriter fw = new FileWriter("C:\\Users\\w0748346\\Desktop\\bread.txt");
        // if we overload Filewriter constructor with (location, *true*) everytime you run the program, it'll add and not replace. Default is false

        fw.write('B');
        fw.write('R');
        fw.write('E');
        fw.write('A');
        fw.write('D');
        fw.write(" is cool!");                  //can write several characters at the same time
        fw.close();                                 //this line does the actual writing of the file


    }

}
