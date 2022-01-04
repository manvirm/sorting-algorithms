import java.util.*;

/* Given a list of integers from user in the form 50 10 20
 * Apply selection sort algorithm and return sorted list
 */

public class quicksort{

    //print array
    void printArray(int[] data){

        System.out.println("Sorted list: ");
        
        for(int element: data)
          System.out.print(element + " ");

    }

    //given array, swap value at index i with value at index j
    void swap(int[] data, int i, int j){

        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;

    }



    public static void main(String[] args){

        quicksort ob = new quicksort();

        //Prompt input from user
        System.out.print("Enter input for sorting (ie. 50 10 20): ");
        Scanner input=new Scanner(System.in);
        String line;
        String[] lineVector;

        //Read in the form of 1 2 3
        line = input.nextLine(); 

        //Separate all values by space
        lineVector = line.split(" ");

        //Initalize array for data to be sorted
        int length = lineVector.length;
        int[] data = new int[length];

        //Convert string to int and store in array "data"
        for(int i =0; i<length; i++){
            data[i] = Integer.parseInt(lineVector[i]);
        }
        
        input.close();
        

    }
}