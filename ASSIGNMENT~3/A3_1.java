import java.util.*;

class A3_1 {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("How many Number Enter U want : ");
    int []arr=new int[s.nextInt()];
    System.out.println("Enter "+arr.length+" Number");
    for(int i=0; i<arr.length; i++)
    {
        arr[i]=s.nextInt();
    }
    int max=-1,c=1,a=1;
    for(int i=0; i<arr.length; i++)
    {
        for(int j=i+1; j<arr.length; j++)
        {
            if(arr[i]==arr[j])
                c++;
        }
        if(a<c)
        {
            a=c;
            max=arr[i];
        }  
    }
    if(max==-1)
        System.out.println("No repeted number!!!");
    else
        System.out.println("Most repeted number is : "+max);
    }
    
}
