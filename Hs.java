import java.util.*;
public class Hs{
    public static void main(String[] args){
        //Set
        Set <Integer>s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
         System.out.println("==============SET EXAMPLE===============");
        System.out.println(s);
        HashSet<Integer> h=new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        System.out.println("==============HASHSET EXAMPLE===============");
         System.out.println(h);
        System.out.println(h.contains(10));

        LinkedHashSet l=new LinkedHashSet<>();
        for(Integer a:h){
            l.add(a);
        }
        System.out.println("==============LINKEDHASHSET EXAMPLE===============");
         System.out.println(l);
         System.out.println("Size of rthe set:"+l.size());

        TreeSet<Integer> t=new TreeSet<>();
        for(Integer n:h){
            t.add(n);
        }
        System.out.println("==============TREESET EXAMPLE===============");
        System.out.println(t);
        NavigableSet <Integer> i=new TreeSet<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(5);
        i.add(4);
        System.out.println("==============NAVIGABLESET EXAMPLE===============");
        System.out.println(i);
        System.out.println("set is empty:"+i.isEmpty());
        System.out.println(i.remove(4));
        System.out.println(i.contains(9));
        System.out.println(i.isEmpty());

    }
}