import java.util.HashMap;

public class hashmap {

    public static void main(String[] args) {

        HashMap<String, String> livingbeing = new HashMap<>();

        livingbeing.put("Tree", "NeemTree");
        livingbeing.put("Animal", "Lion");

        System.out.println("HashMap: " + livingbeing);

        System.out.println("Animal = " + livingbeing.get("Animal"));

       
        System.out.println("Contains Key 'Animal'? "
                + livingbeing.containsKey("Animal"));

        
        System.out.println("Contains Value 'Lion'? "
                + livingbeing.containsValue("Lion"));

      
        livingbeing.remove("Tree");

        System.out.println("After Remove: " + livingbeing);
    }
}