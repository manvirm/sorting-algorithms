import java.util.*;

/* Given a list of integers from user in the form 50,10,20
 * Apply bubble sort algorithm and return sorted list
 */

public class bubblesort{
    public static void main(String[] args){

        //Prompt input from user
        System.out.print("Enter input for sorting (ie. 50,10,20): ");
        Scanner input=new Scanner(System.in);
        String line;
        String[] lineVector;

        //Read in the form of 1,2,3
        line = input.nextLine(); 

        //Separate all values by comma
        lineVector = line.split(",");

        //Initalize array for data to be sorted
        int length = lineVector.length;
        int[] data = new int[length];

        //Convert string to int and store in array "data"
        for(int i =0; i<length; i++){
            data[i] = Integer.parseInt(lineVector[i]);
        }
        input.close();

        System.out.println(Arrays.toString(data));
       
    }
}