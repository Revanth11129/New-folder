import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {
        

int i , sum = 0;

Scanner in =  new Scanner(System.in);
System.out.println("give the value");
i = in.nextInt();
    

while (i>0) {
    sum = sum  + i% 10;
    i = i/10;

    
}



System.out.println(sum );





in.close();


    }
}
