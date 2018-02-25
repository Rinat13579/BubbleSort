import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] mixArray = {9,3,1,6,5,9,2,4,0,1,3,2,5,2,7,8,9,8,7,2};
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
