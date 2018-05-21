import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class GCContent {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the input for GC computation: ");
        String fileName = scanner.nextLine();

        try {

            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String inputString; //rosalind_gc.txt
            boolean isData = false;

            while((inputString = reader.readLine()) != null){

                //check for >Rosalind_XXXX line preceding an input line
                if(inputString.matches("^>Rosalind_[0-9]{4}$")){

                    System.out.println(inputString + " matched the regex.");

                    String ID = inputString.substring((inputString.length() - 4));

                    System.out.println("Got FASTA ID " + ID +"." );

                    String fastaData = reader.readLine();

                    System.out.println("Got FASTA string: " + fastaData);
                }



            }




        }

        catch (Exception ex){

            System.out.println("We hit a bit of a snag: " + ex.toString());
            System.out.println("ERROR ERROR ABORT ABORT");

        }



    }

}
