/**
 * Created by alexm on 2/28/2017.
 */
public class SqodddbEven {

    public static void main(String[] args) {

        int[] array1 = {1,5,4,6,12,13,27};

        int[] array2 = SqodddbEven.SqDb(array1);

        for(int i = 0;i<array2.length;i++){

            System.out.println(array2[i]);

        }
    }

    public static int[] SqDb(int[] input ){

        int[] output = new int[input.length];
        for (int i = 0 ; i < input.length; i++){

            if (input[i]%2 == 0){
                output[i] = input[i] *2;
            }
            else {
                output[i]= input[i]*input[i];

            }
            }
            return output;
        }
    }




