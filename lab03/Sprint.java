import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private int capacity;
    private int ticketLimit;
    private List<Ticket> tickets;

    public Sprint(int capacity, int ticketLimit) {
        this.capacity = capacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new ArrayList<>();
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory == null || userStory.isCompleted() || exceedsCapacity(userStory.getEstimate()) || isTicketLimitReached()) {
            return false;
        }
        tickets.add(userStory);
        return true;
    }

    public boolean addBug(Bug bug) {
        if (bug == null || bug.isCompleted() || exceedsCapacity(bug.getEstimate()) || isTicketLimitReached()) {
            return false;
        }
        tickets.add(bug);
        return true;
    }

    public List<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }

    public int getTotalEstimate() {
        int totalEstimate = 0;
        for (Ticket ticket : tickets) {
            totalEstimate += ticket.getEstimate();
        }
        return totalEstimate;
    }

    private boolean exceedsCapacity(int estimate) {
        return getTotalEstimate() + estimate > capacity;
    }

    private boolean isTicketLimitReached() {
        return tickets.size() >= ticketLimit;
    }
}
