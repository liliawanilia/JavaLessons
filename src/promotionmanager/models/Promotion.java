package promotionmanager.models;

import java.util.Date;

/**
 * Created by pawelk on 29/10/2018.
 */
public class Promotion {
    private String promotionName;
    private Date startDay;
    private User[] affectedUsers;

    public Promotion(String promotionName, Date startDay, User[] affectedUsers) {

        this.promotionName = promotionName;
        this.startDay = startDay;
        this.affectedUsers = affectedUsers;
    }

    public User[] getAffectedUsers() {
        return affectedUsers;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Date getStartDay() {
        return startDay;
    }
}
