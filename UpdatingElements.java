package ArrayList;
import java.util.ArrayList;
public class UpdatingElements {
    public static void main(String[]args){
        ArrayList<String> val = new ArrayList<>();
        val.add("A");
        val.add("B");
        val.add("C");
        val.add("D");
        System.out.println("The elements in the list initially are :" + val);
        val.set(2,"E");
        System.out.println("The elements in the list after updating are :" + val);
        }
    }
