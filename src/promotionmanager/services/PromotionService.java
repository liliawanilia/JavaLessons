package promotionmanager.services;

import promotionmanager.models.Promotion;
import promotionmanager.models.User;

/**
 * Created by pawelk on 29/10/2018.
 */
public class PromotionService {
    private UserService userService;

    public PromotionService(UserService userService) {

        this.userService = userService;
    }

    public void runPromotion(Promotion promotion) {
        User[] affectedUsers = promotion.getAffectedUsers();
        for (User user : affectedUsers) {
            this.userService.sendMessage(user);
        }
    }

    /* todo
    @Override
    public String toString() {
        return super.toString();
    }
    */
}
