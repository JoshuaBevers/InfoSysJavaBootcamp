package arrays;

// Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
// Create a for loop that populates an integer array with values, outputting them at each iteration.
// Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.

public class arraylooping {
    public static int[] iterationArray = new int[10]; // array length limited to 10
    public static int count = 0;
    public static void main(String args[]) {
     populateArray();
     multiplyByTen();
    }

    private static int[] multiplyByTen(){
        for(int b : iterationArray){
         iterationArray[count]= iterationArray[count] * 10;
         System.out.println(iterationArray[count]);
         count ++;
        }
        count = 0;
        return iterationArray;
    }

    private static int[] populateArray(){
        System.out.println("populating Array");
         for(int a : iterationArray){
            count ++;
            iterationArray[count-1] = count;
            System.out.println("value of array is: " + iterationArray[count-1]);
        }
        count = 0;
        return iterationArray;
    }
}
