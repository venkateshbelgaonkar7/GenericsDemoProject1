package queue;
/*Program to implement a queue with a linked list*/
import java.util.LinkedList;

public class Store {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<Customer>();
        queue.add(new Customer("Ram"));
        queue.add(new Customer("Shyam"));
        queue.add(new Customer("Krishna"));
        queue.add(new Customer("Hanuman"));

        System.out.println(queue);
        serveCustomer(queue);

        System.out.println(queue);
        serveCustomer(queue);

    }
    static void serveCustomer(LinkedList<Customer> queue) {
        Customer c = queue.poll();
        c.serve();
    }

}
