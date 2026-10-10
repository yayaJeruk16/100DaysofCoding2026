import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char c = in.next().charAt(0);
        
        if(c == '+'){
            System.out.println(a+b);
        }
        else if(c == '-'){
            System.out.println(a-b);
        }
            else if(c == '/'){
        if(b == 0){
            System.out.println("gabisa oi");
        }else{
            System.out.println(a/b);
        }
            }  
                else if(c == '%'){
                    System.out.println(a%b);
                }
                    else if(c == '*'){
                        System.out.println(a*b);
                    }else{
                        System.out.println("tdk valid");
                    }
                        
}
    
}
