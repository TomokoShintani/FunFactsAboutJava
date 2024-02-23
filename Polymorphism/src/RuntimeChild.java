// Run time polymorphism
public class RuntimeChild extends RuntimeParent{
    public String name;
    @Override
    public void m() {
        System.out.println("m in Child");
    }
}
