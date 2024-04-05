import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating user stories
        UserStory userStory1 = new UserStory(1, "User Registration", 5, new ArrayList<>());
        UserStory userStory2 = new UserStory(2, "Login Functionality", 3, new ArrayList<>());

        // Creating bugs related to user stories
        Bug bug1 = Bug.createBug(1, "Registration form bug", 2, userStory1);
        Bug bug2 = Bug.createBug(2, "Login bug", 1, userStory2);

        // Creating a sprint
        Sprint sprint = new Sprint(10, 5); // Capacity: 10, Ticket limit: 5

        // Adding user stories and bugs to the sprint
        sprint.addUserStory(userStory1);
        sprint.addUserStory(userStory2);
        sprint.addBug(bug1);
        sprint.addBug(bug2);

        // Getting the tickets in the sprint
        List<Ticket> sprintTickets = sprint.getTickets();
        for (Ticket ticket : sprintTickets) {
            System.out.println(ticket);
        }

        // Getting the total estimate of the sprint
        int totalEstimate = sprint.getTotalEstimate();
        System.out.println("Total estimate of the sprint: " + totalEstimate);
    }
}
