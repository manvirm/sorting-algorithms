import java.util.*;

/* Given a list of integers from user in the form 50 10 20
 * Apply selection sort algorithm and return sorted list
 */

public class selectionsort{

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

    //given array, apply selection sort
    void sort(int[] data, int n){

        //store index of min value of array
        int min;

        //loop goes to n-1 because the last element will be sorted once we reach end of array,
        //so no need to check again
        for(int i=0; i < n-1; i++){

            //update index of min value in array to be equal to index of current item
            min = i;

            //find the min value in array compared to the current item, and set min to index of min value
            //j=i+1 because we start at next index of current item (elements before current item are sorted)
            for(int j=i+1; j<n; j++){

                if(data[j] < data[min]){
                    min = j;
                }
            }

            //if min value found then swap with current item
            if(min != i){
                swap(data, i, min);
            }
        }

    }


    public static void main(String[] args){

        selectionsort ob = new selectionsort();

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