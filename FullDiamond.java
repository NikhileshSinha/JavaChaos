import java.util.Scanner;

public class FullDiamond {
    public static void main(String[] args) {
        
        System.out.println("Enter the number of rows:(must be odd)");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        loop:
       while(n%2 == 0)
       {
            System.out.println("Given number is even, TRY AGAIN!!");
            n = ob.nextInt();
                continue loop;
       }    
        
       int x=((n-1)/2)-1, y=(n+1)/2, z=x+1;
      
        System.out.println("looop starts:");
       for(int i=0; i<n; i++)
       {    for(int j=0; j<n; j++)
            {   
                if(x<j && j<y)
                System.out.print(" * ");
                
                else
                System.out.print("   ");
            }
       
       System.out.println();
       if(i<z)
       {
       x--;
       y++;
       }
       else
       {
       x++;
       y--;
       }
       }
    }
}
