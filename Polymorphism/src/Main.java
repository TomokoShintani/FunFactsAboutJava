// Compile time polymorphism
public class CompileTimeExample {
    public static void main(String[] args) {
        CompileTimeB temp = new CompileTimeB();
        //CompileTimeA temp = new CompileTimeB();   ---> Causes compile error.
        // m(int x) should also be defined in the apparent type of temp not only the actual type.
        temp.m();
        temp.m(2);

        Object obj = new RuntimeChild();

        ((RuntimeParent) obj).age = 56;
        ((RuntimeParent) obj).name = "Bob";
        ((RuntimeParent) obj).m();
        // Upcasting Child object to Parent object.
        // obj ---> apparent type:Parent  actual type:Child
        // obj got access to Parent instance variable 'age' and lost access to Child instance variable 'name'.
        // But this code executes m() in Child because the actual type of obj is Child.
    }
}
