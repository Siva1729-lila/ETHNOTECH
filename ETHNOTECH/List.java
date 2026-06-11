import java.util.Scanner;

class ListNode {
    String stop;
    ListNode next;

    ListNode(String stop) {
        this.stop = stop;
        this.next = null;
    }
}

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stops: ");
        int n = sc.nextInt();
        sc.nextLine();
        ListNode head = new ListNode("Starting");
        ListNode curr = head;
        System.out.println("Enter the stop names:");
        for (int i = 0; i < n; i++) {
            String val = sc.nextLine();
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        System.out.println("\nBus Route:");
        curr = head;
        while (curr != null) {
            System.out.print(curr.stop);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
        System.out.print("\nEnter the stop name to stop the bus: ");
        String targetStop = sc.nextLine();
        curr = head;
        boolean found = false;
        while (curr != null) {
            if (curr.stop.equals(targetStop)) {
                System.out.println("Bus stopped at stop: " + curr.stop);
                found = true;
                break;
            }
            curr = curr.next;
        }
        if (!found) {
            System.out.println("Stop not found in the route.");
        }
    }
}