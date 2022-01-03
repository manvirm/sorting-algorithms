import java.util.*;

/* Given a list of integers from user in the form 50 10 20
 * Apply bubble sort algorithm and return sorted list
 */

public class bubblesort{

    //print array
    public static void printArray(int[] data){
        System.out.println("Sorted list: ");
        
       for(int element: data)
          System.out.print(element + " ");
    }

    //sort array with bubblesort algorithm
    public static void sort(int[] data, int n){

        int temp;
        int flag;

        //we will need n-1 iterations worst case in each 'part'
        //by 'part' meaning each time we sort the array with a new starting value
        for(int i=0; i<(n-1); i++){

            //to check if no more swaps
            flag =0;

            //subtract i from condition because that part of array will be sorted
            //from previous iteration so don't have to check again
            for(int j=0; j<(n-1-i); j++){

                //swap if previous element is greater
                if(data[j] > data[j+1]){

                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    flag = 1;
    
                }

            }
            
            //if there is no swapping, sorting is complete
            if(flag == 0){
                break;
            }
        }

    }

    public static void main(String[] args){

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

        sort(data, length);
        printArray(data);

    }
}