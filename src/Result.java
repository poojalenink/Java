import java.util.Arrays;

public class Result{

    public static void main(String[] args){

        int[] arr={32,58,48,65,47,87};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int highest=arr[arr.length-1];
        int lowest=arr[0];
        int total=0;
        for(int i=0;i<6;i++){
            total=total+arr[i];}
        System.out.println(highest);

        System.out.println(lowest);

        System.out.println(total);





    }}