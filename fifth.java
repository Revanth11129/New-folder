import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
        


int i , reverse = 0;

Scanner in = new Scanner(System.in);
System.out.println("give the number");
i =in.nextInt();

while (i>0) {
    
reverse = reverse * 10 + i % 10;
i = i/10;






}



System.out.println(reverse);

in.close();















    }
}
