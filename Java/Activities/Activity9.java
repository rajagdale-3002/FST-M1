	
import java.util.ArrayList;
public class Activity9 {
	public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Apple");
        myList.add("Samsung");
        myList.add("Redmi");
        //Adding object at specific index
        myList.add(3, "Realme");
        myList.add(1, "Oneplus");
        
        System.out.println("Print Mobile phone manufacture:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd manufacturer in the list is: " + myList.get(2));
        System.out.println("Is TechnoSpark is in list: " + myList.contains("TechnoSpark"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Redmi");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }

}
