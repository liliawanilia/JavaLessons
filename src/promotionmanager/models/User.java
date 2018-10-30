package promotionmanager.models;

/**
 * Created by pawelk on 29/10/2018.
 */
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private boolean byEmail;
    private boolean byPhone;
    private boolean byText;
    private boolean byPost;
    private int bonusPoints;

    public User(String firstName, String lastName, String email, String phoneNumber, String address, boolean byEmail, boolean byPhone, boolean byText, boolean byPost) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.byEmail = byEmail;
        this.byPhone = byPhone;
        this.byText = byText;
        this.byPost = byPost;
        this.bonusPoints = this.generateBonusPoints(byEmail, byPhone, byPost, byText);
    }

    private int generateBonusPoints(boolean... preferences) {
        int result = 0;
        for (boolean preference : preferences) {
            if (preference) {
                result += 40;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "--------------------------------------------\n" +
                "First name: " + this.firstName + "\n" +
                "Last name: " + this.lastName + "\n" +
                "Email name: " + this.email + "\n" +
                "Phone number: " + this.phoneNumber + "\n" +
                "Address: " + this.address + "\n" +
                "ByPhone: " + this.byPhone + "\n" +
                "ByEmail: " + this.byEmail + "\n" +
                "ByText: " + this.byText + "\n" +
                "ByPost: " + this.byPost + "\n" +
                "Bonus points: " + this.bonusPoints + "\n" +
                "--------------------------------------------";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public boolean isByEmail() {
        return byEmail;
    }

    public boolean isByPhone() {
        return byPhone;
    }

    public boolean isByText() {
        return byText;
    }

    public boolean isByPost() {
        return byPost;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }
}
