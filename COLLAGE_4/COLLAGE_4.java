package collage_4;

 class Function
{
    
 public static void printNaturalNumbers(int a,int b)
    {
    if(a>b)
        return;
        printNaturalNumbers(++a, b);
    System.out.print((a-1)+" ");  
}
 }

public class COLLAGE_4 {
    public static void main(String[] args) {
    Function.printNaturalNumbers(1,10);
    }
}

    
/* comlete */