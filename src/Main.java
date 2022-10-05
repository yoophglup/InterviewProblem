import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Main {
    public static String mathFunction(int a, int b, int c){
        String answer="";
        if (a+b==c) {
            answer=answer+"+";
        }
        if (a-b==c) {
            answer=answer+"-";
        }
        if (a*b==c) {
            answer=answer+"*";
        }
        if (a/b==c) {
            answer=answer+"/";
        }
        if (answer.equals("")){
            answer="None";
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("1,2,3 " + mathFunction(1, 2, 3));
        System.out.println("2,2,4 " + mathFunction(2, 2, 4));
        System.out.println("3,-3,9 " + mathFunction(3, -3, -9));
        System.out.println("1,2,-1 " + mathFunction(1, 2, -1));
        System.out.println("3,3,1 " + mathFunction(3, 3, 1));
        System.out.println("7,1,11 " + mathFunction(7, 1, 11));

    }
}

class MainTest {
    @Test
    void TestInputsProvided(){
        assertEquals("+",Main.mathFunction(1,2,3));
        assertEquals("+*",Main.mathFunction(2,2,4));
        assertEquals("*",Main.mathFunction(3,-3,-9));
        assertEquals("-",Main.mathFunction(1,2,-1));
        assertEquals("/",Main.mathFunction(3,3,1));
        assertEquals("None",Main.mathFunction(7,1,11));

    }

}