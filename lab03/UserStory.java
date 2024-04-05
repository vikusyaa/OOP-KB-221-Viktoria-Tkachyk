import java.util.ArrayList;
import java.util.List;

public class UserStory extends Ticket {
    private final List<UserStory> dependencies;

    public UserStory(int id, String name, int estimate, List<UserStory> dependencies) {
        super(id, name, estimate);
        this.dependencies = dependencies;
    }

    public boolean complete() {
        for (UserStory dependency : dependencies) {
            if (!dependency.isCompleted()) {
                return false;
            }
        }
        super.complete();
        return true;
    }

    public List<UserStory> getDependencies() {
        return new ArrayList<>(dependencies);
    }

    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}
