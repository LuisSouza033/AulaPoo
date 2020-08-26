public class DemoInterfaces implements FirstInterface, SecondInterface{
    @Override
    public void MyMethod() {
        System.out.println("Some text 1st Interface!");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("More some text 2nd Interface!");
    }
}
