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
        this.byEmail = byEmail;
        this.byPhone = byPhone;
        this.byPost = byPost;
        this.byText = byText;
    }

    public User(String emailAddrress, String firstName, String surname, boolean byEmail, boolean byPhone, boolean byPost, boolean byText, String phone, String address) {
        this.email = emailAddrress;
        this.firstName = firstName;
        this.lastName = surname;
        this.byEmail = byEmail;
        this.byPhone = byPhone;
        this.byPost = byPost;
        this.byText = byText;
        this.phoneNumber = phone;
        this.address = address;
        this.loyaltyPoints = this.calculateLoyaltyPoints();
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
        if (this.byText) {
            result = result + 40;
        }
        if (this.byPost) {
            result += 40;
        }
        if (this.byPhone) {
            result += 40;
        }
        if (this.byEmail) {
            result += 40;
        }
        return result;
    }

    public void sendEmail() {
        System.out.println(this.firstName + " " + this.lastName + " sent email");
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }
}
