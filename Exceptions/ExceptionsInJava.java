import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Scanner;
public class ExceptionsInJava {

    static void setAge(int age) {
        if (age < 0) 
            throw new IllegalArgumentException("case 7 IOException\nError message: Age cannot be negative");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        while(true){
            System.out.println("\n\nEnter the option for diffrent exceptions\n1.NullPointerException\n2. ArrayIndexOutOfBoundsException\n3. NumberFormatException\n4. ArithmeticException\n5. ClassCastException\n6. FileNotFoundException\n7. IllegalArgumentException\n8. IOException\n9. InterruptedException\n10. ConcurrentModificationException\n\n");
            ch = sc.nextInt();
            try{
                switch(ch){
                case 1:
                    String text = null;
                    int length = text.length();
                    break;

                case 2:
                    int[] numbers = {1, 2, 3};
                    int value = numbers[5];
                    break;
                
                case 3:
                    String invalidNumber = "abc";
                    int num = Integer.parseInt(invalidNumber);
                    break;

                case 4:
                    int result = 10 / 0;
                    break;
                
                case 5:
                    Object obj = new Integer(42);
                    String str = (String) obj;
                    break;

                case 6:
                    File file = new File("nonexistent.txt");
                    FileInputStream inputStream = new FileInputStream(file);
                    break;

                case 7:
                    setAge(-1);
                    break;
                
                case 8: 
                    BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
                    String line = reader.readLine();
                
                case 9:
                    Thread thread = new Thread(() -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e8) {
                        System.out.println("Case 9 InterruptedException\nException message: "+e8);
                        e8.printStackTrace();
                    }
                    });
                    thread.start();
                    thread.interrupt(); 

                case 10:
                    List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
                    for (String name : names) {
                        if (name.equals("Bob")) {
                            names.remove(name); 
                        }
                    }
                    break;

                default:
                System.out.println("L@wde dekh ke number dial kar!!");
                
                }

            }
            catch(NullPointerException e1){
                System.out.println("Case 1 NullPointerException\nException message: "+e1);
            } 
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("Case 2 ArrayIndexOutOfBoundsException\nException message: "+e2);
            } 
            catch(NumberFormatException e3){
                System.out.println("Case 3 NumberFormatException\nException message: "+e3);
            } 
            catch(ArithmeticException e4){
                System.out.println("Case 4 ArithmeticException\nException message: "+e4);
            } 
            catch(ClassCastException e5){
                System.out.println("Case 5 ClassCastException\nException message: "+e5);
            } 
            catch(FileNotFoundException e6){
                System.out.println("Case 6 FileNotFoundException\nException message: "+e6);
            } 
            catch(IOException e8){
                System.out.println("Case 8 IOException\nException message: "+e8);
            } 
            catch(ConcurrentModificationException e10){
                System.out.println("Case 10 ConcurrentModificationException\nException message: "+e10);
            } 
            
        }
    }
}
