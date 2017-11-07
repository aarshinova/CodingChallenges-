public class Person {
    String[] membersId = {"4","5","6","9"};

           /* this.memberId = membersId[Math.random((double)(1.00)*3+1];
        this.personCode = membersId[Math.random((double)(1.00)*3+1];
        this.firstName = membersId[Math.random((double)(1.00)*3+1];
        this.lastName = membersId[Math.random((double)(1.00)*3+1];*/

    public Person() {

    }

    public String getMemberId() {

        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String memberId;
    String personCode;
    String firstName;
    String lastName;
    int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static String getRandomName(){
        this.lastName = membersId[Math.random((double)(1.00)*3+1];
    }
}
