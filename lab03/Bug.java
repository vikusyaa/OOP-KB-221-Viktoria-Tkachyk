import java.util.List;

public class Bug extends Ticket {
    private UserStory userStory;

    private Bug(int id, String name, int estimate, UserStory userStory) {
        super(id, name, estimate);
        this.userStory = userStory;
    }

    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {
        if (userStory == null || !userStory.isCompleted()) {
            return null;
        }
        return new Bug(id, name, estimate, userStory);
    }

    public String toString() {
        return "[Bug " + getId() + "] " + userStory.getName() + ": " + getName();
    }
}
