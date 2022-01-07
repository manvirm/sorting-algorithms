import java.util.*;

/* Given a list of integers from user in the form 50 10 20
 * Apply insertion sort algorithm and return sorted list
 */

public class insertionsort{

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

    /* function sort
    * starting at index 1, check if value at index is less than the value at index-1
    * if it is, then swap those values and continue decrementing current index and 
    * swapping values until current index is at 0 or value at previous index is less than current index
    * repeat until we reach the end of the array
    */
    void sort(int[] data, int n){

        int j; 

        for(int i = 1; i < n; i++){

            j = i;

            while( j > 0 && data[j] < data[j-1]){

                swap(data, j, j-1);
                j--;

            }

        }

    }

    

    public static void main(String[] args){

        insertionsort ob = new insertionsort();

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

        ob.sort(data, length);
        ob.printArray(data);

    }
}