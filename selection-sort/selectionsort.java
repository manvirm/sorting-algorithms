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

        for(int i=0; i < n; i++){

            //update index of min value in array to be equal to current item
            min = i;

            //find the index of min value in array compared to the current item
            //j=i+1 because we start at next index of current item (previous elements are sorted)
            for(int j=i+1; j<n; j++){

                if(data[j] < data[min]){
                    min = j;
                }
            }

            //swap min value with current item
            swap(data, i, min);
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