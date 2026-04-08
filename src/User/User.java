package User;

/**
 * @author Inna Ignatovich
 * @Date 05.04.2026
 */
import java.util.Objects;

public class User {
    private int id;
    private String fio;

    public User(int id, String fio) {
        this.id = id;
        this.fio = fio;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(fio, user.fio);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio);
    }

    @Override
    public String toString() {
        return "User[ID=" + id + ", Name='" + fio + "']";
    }


}