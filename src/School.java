import java.util.ArrayList;

public class School {
    private ArrayList<Person> members;

    public void addMember(Person p) {
        members.add(p);
    }

    public String toString() {
        String msg = "";
        for (Person member : members) {
            msg += member.toString() + "\n";
        }
        return msg;
    }
}
