import java.util.*;

class Student
{
    private int roll;
    private String name;
    private int marks;
    
    public Student()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Roll , Name , and Marks : ");
        roll=s.nextInt();
        s.nextLine();
        name=s.nextLine();
        marks=s.nextInt();
    }
    public void show()
    {
        System.out.println(" "+roll+" "+name+" "+marks);
    }
    public static Student topper(Student []arr)
    {
        Student top;
        int max;
        max=arr[0].marks;
        top=arr[0];
      for(int i=1; i<arr.length; i++)
      {
          if(max<arr[i].marks)
          {
              max=arr[i].marks;
              top=arr[i];
          }
      }
      return top;
    }
}



public class Topper
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("How many Student Enter U want : ");
        int n=s.nextInt();
        Student []arr=new Student[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=new Student();
        }
       for(Student x : arr)
       {
           x.show();
       }
       System.out.println("Topper Student Information ...\n");
      Student s1=Student.topper(arr);
      s1.show();
    }
}    

