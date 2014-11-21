import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*Sample code to read in test cases: */
public class Main {
    public static String reverseStringTable(String [] stringTable){
        String reversed = new String();

        for (int i = stringTable.length-1; i >= 0; i--){
            reversed += (stringTable[i] + " ");
        }

        return reversed.trim();
    }

    public static void main (String[] args) {
    try{
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split(" ");
            if (lineArray.length > 0) {
                System.out.println(reverseStringTable(lineArray));
            }
        }
    }
    catch (Exception e){

    }
  }
}