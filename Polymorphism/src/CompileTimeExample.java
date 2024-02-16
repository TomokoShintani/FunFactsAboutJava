// Compile time polymorphism
public class CompileTimeExample {
    public static void main(String[] args) {
        CompileTimeB temp = new CompileTimeB();
        //CompileTimeA temp = new CompileTimeB();   ---> Causes compile error.
        // m(int x) should also be defined in the apparent type of temp not only the actual type.
        temp.m();
        temp.m(2);
    }
}
