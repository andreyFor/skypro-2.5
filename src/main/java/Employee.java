public class Employee {

    private String firstName, lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName() {
        this.firstName = firstName;
    }
    public void setLastName() {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Имя: " + firstName + "; Фамилия: " + lastName;
    }
}