import java.util.*;

/* Given a list of integers from user in the form 50 10 20
 * Apply quicksort algorithm and return sorted list
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


    /* partition to find pivot
     * inital pivot starts at index 0
     * i starts at index 1 and j starts at index length - 1
     * increase i until we find value greater than pivot
     * then decrease j until we find value less than pivot, then swap those values
     * repeat until i > j, then we swap value at j with pivot, and j becomes new pivot position
    */
    int partition(int[] data, int s, int n){

        int i = 1;
        int j = n-1;
        int pivot = data[s];

        //increment i until we find value greater than pivot
        while(i < j){

            if(data[i] > pivot){

                //decrease j until we find value less than pivot
                while(data[j] > pivot){
                    j--;
                }

                //swap if j did not decrease to less than i
                if(i < j){
                    swap(data, i, j);
                    j--;
                }
            }

            i++;
        }

        //swap value at index j with pivot, now value
        //at index j is new pivot
        swap(data, 0, j);
        pivot = j;
        return pivot;

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

        //Find position of pivot by doing partition on the array
        int pivot = ob.partition(data, 0, length);
        System.out.println(pivot);
        
        ob.printArray(data);

    }
}