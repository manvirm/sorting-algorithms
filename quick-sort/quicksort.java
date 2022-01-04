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


    /* partition to find pivot and sort
     * given start index s and end index n
     * pivot will be value at index s
     * i starts at index s+1 and j starts at index n
     * increase i until we find value greater than pivot
     * then decrease j until we find value less than pivot, then swap those values
     * repeat until i > j, then we swap value at j with pivot, and j becomes new pivot position. Return j
    */
    int partition(int[] data, int s, int n){

        int i = s+1;
        int j = n;
        int pivot = data[s];

        //increment i until we find value greater than pivot
        while(i < j){

            if(data[i] > pivot){

                //decrease j until we find value less than pivot
                //j will worst case be same index as pivot. ensure j does not decrease less than pivot index (s)
                while(data[j] > pivot && s<=j){
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
        swap(data, s, j);
        return j;

    }

    /* sort array with quicksort
    * find pivot with partition 
    * continue sorting each side and finding new pivot
    * until each element is sorted
    */
    void sort(int[] data, int s, int n){

        int j;

        if(s < n){

            //find pivot
            j = partition(data, s, n);

            //sort left side of pivot
            sort(data, s, j-1);

            //sort right side of pivot
            sort(data, j+1, n);    

        }

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

        ob.sort(data, 0, length-1);
        ob.printArray(data);

    }
}