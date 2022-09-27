package arraybasic;
public class ArrayBasic {
    public static void main(String[] args) {
    int []arr={2,4,6,8,10};
    int []brr={1,3,5};
    for(int i=0; i<arr.length; i++){
        for(int k=0; k<brr.length; k++){
        arr[i]=brr[k];
        }
    }
       for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
    }
}
