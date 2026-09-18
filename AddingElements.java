package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class AddingElements{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sri = new ArrayList<>();
        System.out.println("Enter the number of elements you wanted to add in the list:");
        int n = sc.nextInt();
        System.out.println("Enter the elements you wanted to add in the list:");
        for(int i=0;i<n;i++){
            sri.add(sc.nextInt());
        }
        System.out.println("The elements in the list are:");
        for(int i=0;i<sri.size();i++){
            System.out.println(sri.get(i));
        }
    }
}