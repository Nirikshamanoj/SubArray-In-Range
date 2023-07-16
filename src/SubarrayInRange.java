import java.util.ArrayList;
import java.util.Scanner;
public class SubarrayInRange {
    static Integer[] findSubArray(int[] array, int start, int end, int size)
    {
        ArrayList<Integer> subArrayList=new ArrayList<>();
        for (int i=start;i<=end;i++)
        {
            subArrayList.add(array[i]);
        }
        Integer[] subArray =new Integer[subArrayList.size()];
        subArray=subArrayList.toArray(subArray);
        return subArray;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int B=scanner.nextInt();
        int C=scanner.nextInt();
        Integer[] result=findSubArray(A,B,C,n);
        for (int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
