package filereader;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nkosana Mdlalose
 */
public class FileReader {

    public FileReader(String thobani) {
    }

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the path of the file: ");
      String pathStr = input.nextLine();
      
      System.out.println("Enter the name of the file: ");
      String file = input.nextLine();
      
      System.out.println(file);      
      File dir = new File(pathStr);
      String[] list = dir.list();
      System.out.println(Arrays.toString(list));
      
      boolean flag = false;      
      for (int i = 0; i < list.length; i++) {
         if(file.equals(list[i])){
            flag = true;
         }
      }        
      if(flag){
         System.out.println("File Found");
      }else{
         System.out.println("File Not Found");
      }
      
      PrintWriter pw = new PrintWriter("Newfile.txt");
          
      BufferedReader br;
        br = new BufferedReader(new FileReader("Mdlalose"));
        
        String line = br.readLine(); 
                
        while (line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          
        br = new BufferedReader(new FileReader("Nkosana")); 
          
        line = br.readLine();
        
        while(line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          
        pw.flush(); 
                  
        br.close(); 
        pw.close(); 
          
        System.out.println("Done");
   }
    
}
