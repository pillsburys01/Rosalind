
public class fString {

    //A class containing a FASTA string and attendent metadata
    //contains the number of g's and c's as well
    int fastaID;
    int numG = 0;
    int numC = 0;

    String FASTAString = "";
    
    fString(int ID, String inputString){
        
        fastaID = ID;
        FASTAString = inputString;
        numG = gCount(FASTAString);
        numC = cCount(FASTAString);

    };

    private int gCount(String FASTAString){

        int count = 0;
        for (char nucleotide: FASTAString.toUpperCase().toCharArray()){

            if(nucleotide == 'G' ) count++;
            
        }

        return count;
    }

    private int cCount(String FASTAString){

        int count = 0;
        for (char nucleotide: FASTAString.toUpperCase().toCharArray()){

            if(nucleotide == 'C' ) count++;

        }

        return count;
    }


}
