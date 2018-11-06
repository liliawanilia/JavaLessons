package models;

/**
 * Created by pawelk on 30/10/2018.
 */
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private boolean byEmail;
    private boolean byPost;
    private boolean byText;
    private boolean byPhone;
    private int loyaltyPoints;

    public User(String emailAddress, String firstName, String surname, boolean byEmail, boolean byPhone, boolean byPost, boolean byText) {
        this.email = emailAddress;
        this.firstName = firstName;
        this.lastName = surname;
        this.setByEmail(byEmail);
        this.setByPhone(byPhone);
        this.setByPost(byPost);
        this.setByText(byText);
    }

    public User(String emailAddress, String firstName, String surname, boolean byEmail, boolean byPhone, boolean byPost, boolean byText, String phone, String address) {
        this.email = emailAddress;
        this.firstName = firstName;
        this.lastName = surname;
        this.setByEmail(byEmail);
        this.setByPhone(byPhone);
        this.setByPost(byPost);
        this.setByText(byText);
        this.phoneNumber = phone;
        this.setAddress(address);
        this.setLoyaltyPoints(this.calculateLoyaltyPoints());
    }

    private int calculateLoyaltyPoints(boolean... params) {
        int result = 0;
        for (boolean param:params) {
            if(param)  {
                result += 40;
            }
        }
        return result;
    }

    private int calculateLoyaltyPoints() {
        int result = 0;
        if (this.isByText()) {
            result = result + 40;
        }
        if (this.isByPost()) {
            result += 40;
        }
        if (this.isByPhone()) {
            result += 40;
        }
        if (this.isByEmail()) {
            result += 40;
        }
        return result;
    }

    public void sendEmail() {
        System.out.println(this.getFirstName() + " " + this.getLastName() + " sent email");
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

    public boolean isByPost() {
        return byPost;
    }

    public boolean isByText() {
        return byText;
    }

    public boolean isByPhone() {
        return byPhone;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setByEmail(boolean byEmail) {
        this.byEmail = byEmail;
    }

    public void setByPost(boolean byPost) {
        this.byPost = byPost;
    }

    public void setByText(boolean byText) {
        this.byText = byText;
    }

    public void setByPhone(boolean byPhone) {
        this.byPhone = byPhone;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
}
