interface A{
     void show(String s);
 }
public class LambdaClass {
    public static void main(String[] args) {
        A a= s-> System.out.println("my name is : "+s);
        a.show("Koushik DJ");
    }
}
