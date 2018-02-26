import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] mixArray = {-22,-56,-4,6,-5,-2,0,-2,5,4,9,-3,-56};
        int[] mixArray2 = {9,8,7,6,5,4,3,2,1,0,1,2,3,4,5,6,7,8,9};
        int[] mixArray3 = {14312,4151,31434,451,3523,5123,5551,22,45,612,3,0,4352,3224,6,77};
        System.out.println(Arrays.toString(BubbleSort(mixArray)));
        System.out.println(Arrays.toString(SelectionSort(mixArray2)));
        System.out.println(Arrays.toString(InsertionSort(mixArray3)));
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

    public static int[] SelectionSort(int[] Array){
        int x,y;
        for (int i=0; i<Array.length;i++){
            x=Array[i];
            y=i;
            for(int j=i; j<Array.length;j++){
                if (Array[j]<x){
                    x=Array[j];
                    y=j;
                }
            }
            Array[y]=Array[i];
            Array[i]=x;
        }
        return Array;
    }

    public static int[] InsertionSort(int[] Array){
        for(int i=1; i<Array.length; i++){
            int y=i;
            while (y>0 && Array[y]<Array[y-1]){
                int tmp = Array[y];
                Array[y]=Array[y-1];
                Array[y-1]=tmp;
                --y;
            }
        }
        return Array;
    }
}
