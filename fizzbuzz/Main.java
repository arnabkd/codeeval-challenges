import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    
    public static String divisibleOutput(int d1, int d2, int num){

        String out = "";
        
        out = (num % d1 == 0)? (out + "F") : out;
        out = (num % d2 == 0)? (out + "B") : out;
        
        out = (out.length() > 0)? out: (out + num);
        return out;
    }
    
    public static int[] processLine(String line) {
        int [] inputs = new int[3];
        String [] lineSplit = line.trim().split(" ");
        for (int i = 0; i < lineSplit.length; i++){
            inputs[i] = Integer.parseInt(lineSplit[i].trim());
        }
        return inputs;
    }
    
    public static void main (String[] args) {

    try {
    File file = new File(args[0]);

    BufferedReader in = new BufferedReader(new FileReader(file));

    String line;
    
    while ((line = in.readLine()) != null) {
      int [] inputs = processLine(line);
      
      String output = "";
      
      for (int i = 1; i <= inputs[2]; i++){
        output += divisibleOutput(inputs[0], inputs[1], i);
        output += " ";
      }
      System.out.println(output.trim());
    }
    }
    catch (Exception e){
      System.err.println(e);
    }
  }
  
  
}


