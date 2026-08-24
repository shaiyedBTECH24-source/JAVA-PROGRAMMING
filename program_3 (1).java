import java.util.Scanner;
public class program_3{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try{
            int N=s.nextInt();
            int i=s.nextInt();
            int[] a=new int[N];
            int element=a[i];
            System.out.println("Element Displayed Successfully");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception");
        }
        s.close();
    }
}