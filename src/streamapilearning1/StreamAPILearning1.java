package streamapilearning1;
import java.util.*;
import java.util.stream.Stream;
public class StreamAPILearning1 {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<Integer>();
        al1.add(10);
        al1.add(1);
        al1.add(20);
        al1.add(2);
        al1.add(30);
        al1.add(3);
        Stream<Integer> data=al1.stream();
        data.forEach(n->System.out.println(n));
       
    }
}
    
