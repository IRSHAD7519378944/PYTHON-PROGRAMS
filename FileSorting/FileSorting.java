package filesorting;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
class Student
{
    public int roll;
    public String name;
    public int age;
    public int marks;

    public Student() throws IOException   // constructor 
    {
    Scanner s=new Scanner(System.in);
    try{
    BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\FileShort.txt"));
        System.out.println("Enter roll : ");
        roll=s.nextInt();
        s.nextLine();
        System.out.println("Enter Name : ");
        name=s.nextLine();
        System.out.println("Enter Age : ");
        age=s.nextInt();
        System.out.println("Enter Marks : ");
        marks=s.nextInt();
        bw.write((int)roll);
        bw.newLine();
        bw.write(name);
        bw.newLine();
        bw.write((int)age);
        bw.newLine();
        bw.write((int)marks);
        bw.newLine();
        bw.flush();
        bw.close();
    }
   catch(IOException e){
    
}
 /* public void show()   // for display output
    {
        System.out.println("\n");
        System.out.println("\t\t"+name+"\t\t"+roll+"\t\t"+age+"\t\t"+marks);
    }
        */   
}
        }

class Menu
{
    public static int menu()   // for display and select menu options
    {
        int c;
        Scanner s=new Scanner(System.in);
        System.out.println("\n\t<<==  MENU  ==>>\n");
        System.out.println("\n\t1. Short by Name :");
        System.out.println("\n\t2. Short by Roll :");
        System.out.println("\n\t3. Short by Age :");
        System.out.println("\n\t4. Short by Marks :");
        System.out.print("\n\n\t  Enter Your Choice  :  ");
        c=s.nextInt();
        return c;
    }  
}

 class Short    // All shorting logic
 {
     ///////////////  short by by roll   /////////////
          static int r=2;
          static int a=2;
          static int m=2;
          static int n=2;
     public static void short_by_roll(Student arr[])
    {
      int i,j;
      Student temp;
      for(i=0; i<arr.length; i++)
      {   
        for(j=i+1;j<arr.length; j++)
        {
            if(arr[j].roll<arr[i].roll)
            {
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
      }
      //////////  After sorting array by roll  //////////////
   System.out.println("\n\t\tNAME\t\tROLL\t\tAGE\t\tMARKS\n");
   if(r%2==0)
       {
     for(Student s2 : arr )
      {
         s2.show();
          System.out.println(" ");
      }
      r++;
   }
   else{
       for(int k=arr.length-1; k>=0; k--)
        {
            arr[k].show();
        }
      r++;
   }

}
  ///////////////// short by age  /////////////////////
     public static void short_by_age(Student arr[])
    {
      int i,j;
      Student temp;
      for(i=0; i<arr.length; i++)
      {   
        for(j=i+1;j<arr.length; j++)
        {
            if(arr[j].age<arr[i].age)
            {
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
      }
      ////////////  After sorting array by age   //////////
   System.out.println("\n\t\tNAME\t\tROLL\t\tAGE\t\tMARKS\n");
      if(a%2==0){
   for(Student s2 : arr )
      {
          s2.show();
      }
   a++;
      }
      else{
for(int k=arr.length-1; k>=0; k--){
    arr[k].show();
    a++;
}
      }

}
     /////////////  short by marks //////////////
    public static void short_by_marks(Student arr[])
    {
       int i,j;
      Student temp;
      for(i=0; i<arr.length; i++)
      {   
        for(j=i+1;j<arr.length; j++)
        {
            if(arr[j].marks<arr[i].marks)
            {
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
      }
      ///////////// After sorting Array by marks  ///////////
   System.out.println("\n\t\tNAME\t\tROLL\t\tAGE\t\tMARKS\n");
   if(m%2==0){
   for(Student s2 : arr )
      {
          s2.show();
      }
   m++;
   }
   else{
    for(int k=arr.length-1; k>=0; k--){
        arr[k].show();
    }
       m++;
   }

}
    ///////////////////   sort by name  //////////////
     public static void short_by_name(Student arr[])
    {
       int i,j;
      Student temp;
      for(i=0; i<arr.length; i++)
      {   
        for(j=i+1;j<arr.length; j++)
        {
            if(arr[i].name.compareTo(arr[j].name)>0)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
      }
      /////////  After sorting array by name /////////////////
   System.out.println("\n\t\tNAME\t\tROLL\t\tAGE\t\tMARKS\n");
   if(n%2==0){
   for(Student s2 : arr )
      {
          s2.show();
      }
   n++;
   }
   else{
    for(int k=arr.length-1; k>=0; k--){
        arr[k].show();
    }
       n++;
   }

}
 }
public class FileSorting {
public static void main(String[] args) throws IOException {
      Scanner s=new Scanner(System.in);
        System.out.println("How many student Information Enter U want ? : ");
        Student arr[]=new Student[s.nextInt()];
        for(int i=0; i<arr.length; i++)
        {
        System.out.println("\nplease Enter Student"+(i+1)+" Information\n\n");
            arr[i]=new Student();
        }
        
        System.out.println("\n\t\tNAME\t\tROLL\t\tAGE\t\tMARKS\n");
       /* for(Student s1 : arr)
        {
            s1.show();
        }*/
        ///////////////  in the process of infinite time ////////////////////
        while(true){
        switch(Menu.menu())
        {
            case 1:
             Short.short_by_name(arr);
                break;
            case 2:
              Short.short_by_roll(arr);
                break;
            case 3:
               Short.short_by_age(arr);
                break;
            case 4:     

           Short.short_by_marks(arr);
                break;
            default:
               System.out.println("\n\t Invalid choice");
        }
        }     
    }
}
    
