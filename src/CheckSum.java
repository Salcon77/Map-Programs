import java.util.HashMap;
import java.util.Map;
import java.util.zip.Checksum;

public class CheckSum {
    public static  void main(String[] args) {

            int Array[]= {1,2,3,4,5,6,7,8,9,10};
            int Arrayx[]={-1,-2,-3,1,2,3};

        CheckSum(Array, 11);
        CheckSum(Array, 100);
        CheckSum(Arrayx, -1);

    }

    public static void CheckSum(int array[], int sum){

        /*Create a map with a integer integer key value pair where the key represents the int in the array and the value
       represents the difference needed  to equal the sum.*/
        Map<Integer,Integer> ValueAndDifference = new HashMap<>();
        boolean x = false;

        // This loop iterates once for each index in the given array. This loop populates the HashMap.
        for(int i=0;i<array.length; i++){
            /* We find the difference needed at each array index to add up to the sum.Then we assign all indexes of
              the array as keys and their difference from the sum as values in the HashMap.*/
            int difference = sum-array[i];
            ValueAndDifference.put(array[i], difference);

            //Now we check to see if map contains the difference as key.
            if(ValueAndDifference.containsKey(difference)){
                x = true;
                System.out.println("The two values in the array that add up to "+sum+" are "+ValueAndDifference.get(array[i])+" and "+ValueAndDifference.get(difference));

            }
        }
        if(x==false){
            System.out.println("No two values in the array add up to"+ sum);
        }


    }


}
