import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (true) {
            for (int i = 0; i < queue.size(); i++) {
                if (queue.peek().getTickets() != 0) {
                    queue.peek().alreadyRide();
                    queue.add(queue.peek());
                    System.out.println(queue.peek().getName() + " " + queue.peek().getSurname() + " prokatilsya");
                    queue.remove();
                } else if (queue.peek().getTickets() == 0) {
                    queue.poll();
                }
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> visitors = new LinkedList<>(List.of(
                new Person("Petya", "Ivanov", 6),
                new Person("Olya", "Nakhimova", 1),
                new Person("Lena", "Zvereva", 3),
                new Person("Valera", "Naumov", 7),
                new Person("Marusya", "Mitroshina", 2)
        ));
        return visitors;
    }
}
