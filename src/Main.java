import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] mixArray = {-22,-56,-4,6,-5,-2,0,-2,5,4,9,-3,-56};
        System.out.println(Arrays.toString(mixArray));
        System.out.println(Arrays.toString(BubbleSort(mixArray)));
    }
    public static int[] BubbleSort(int[] Array){
        int x;
        for (int i=0; i<Array.length-1;i++){
            for(int j=0; j<Array.length-1-i;j++){
                if (Array[j]>Array[j+1]){
                    x=Array[j];
                    Array[j]=Array[j+1];
                    Array[j+1]=x;
                }
            }
        }
        return Array;
    }
}
