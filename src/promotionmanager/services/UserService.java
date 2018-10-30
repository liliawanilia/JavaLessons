package promotionmanager.services;

import promotionmanager.models.User;
import promotionmanager.models.utils.ArrayHelper;
import promotionmanager.models.utils.Logger;

/**
 * Created by pawelk on 29/10/2018.
 */
public class UserService {
    private ArrayHelper<User> arrayHelper;
    private Logger logger;

    public UserService(ArrayHelper<User> arrayHelper, Logger logger) {

        this.arrayHelper = arrayHelper;
        this.logger = logger;
    }

    public void sendMessage(User user) {
        if(user.isByEmail()) {
            logger.log("Message was sent by email to: " + user.getEmail());
        }
        else if(user.isByText()) {
            logger.log("Text message was sent to: " + user.getPhoneNumber());
        }
        else if(user.isByPhone()) {
            logger.log("Called to client number: " + user.getPhoneNumber());
        }
        else if(user.isByPost()) {
            logger.log("Postcard was sent to: " + user.getAddress());
        }
    }

    public User[] getUsersWhoAllowedToSendThemEmail(User[] users) {
        User[] result = new User[0];

        for (User user : users) {
            if (user.isByEmail()) {
                result = arrayHelper.addNewItem(result, user);
            }
        }

        return result;
    }

    public User[] getUsersWithMoreBonusPointsThan(User[] users, int minBonusPoints) {
        User[] result = new User[0];

        for (User user : users) {
            if (user.getBonusPoints() > 100) {
                result = arrayHelper.addNewItem(result, user);
            }
        }

        return result;
    }
}
