import java.util.List;

public class User {
    private String name;
    private String surname;
    private String sex;
    private List<Interest> interests;

    public User(String name, String surname, String sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    // GETTER
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public List<Interest> getInterests() {
        return interests;
    }

    // SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void addInterests(String text) {
        Interest e = new Interest(text);
        interests.add(e);
    }

}
