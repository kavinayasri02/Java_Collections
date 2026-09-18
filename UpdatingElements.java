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


//Using  scanner class and integer data type

package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class UpdatingElements {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
   ArrayList<Integer> val = new ArrayList<>();
   // System.out.println("Enter the number of elements you wanted to add in the list:");
    int n = sc.nextInt();
    //System.out.println("Enter the elements you wanted to add in the list:");
    for(int i=0;i<n;i++){
        val.add(sc.nextInt());
    }
    System.out.println("The elements in the list initially are :");
    for(int i=0;i<val.size();i++){
        System.out.println(val.get(i)+" ");
    }
    System.out.println("Enter the index of the element you wanted to update in the list:");
    int index = sc.nextInt();
    for(int i=0;i<val.size();i++){
        if(i==index){
            System.out.println("Enter the new value to be updated :");
            int newVal = sc.nextInt();
            val.set(index, newVal);
            System.out.println("The elements in the list after updation are :");
            for(int j=0;j<val.size();j++){
                System.out.println(val.get(j)+" ");
            }
        }
    }
}
}
