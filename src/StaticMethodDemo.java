public class StaticMethodDemo {
    public static void main(String[] args) {
        StaticMethod.myStaticMethod();// forma de chamar um método static

        StaticMethod myObj = new StaticMethod();// forma de chamar um método normal
        myObj.myPublicMethod();

        System.out.println(Math.sqrt(81));
    }
}
