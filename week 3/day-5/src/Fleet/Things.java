package Things;

public class Things implements Comparable<Things> {
    private String name;
    private boolean completed;

    public Things(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Things other) {
        if (this.completed && !other.completed) {
            return -1;
        } else if (this.completed == other.completed) {
            return this.name.compareTo(other.name);
        } else {
            return 1;
        }
    }
}