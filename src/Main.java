import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] mixArray = {4,5,6,3,2,9,5,4,2,0,5};
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
