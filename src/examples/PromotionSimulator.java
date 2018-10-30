package examples;

import promotionmanager.models.Promotion;
import promotionmanager.models.User;
import promotionmanager.models.utils.ArrayHelper;
import promotionmanager.models.utils.Logger;
import promotionmanager.services.PromotionService;
import promotionmanager.services.UserService;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by pawelk on 29/10/2018.
 * Engilsh description
 * todo
 * Polish description
 * Firma X posiada dział marketingowy, który chce zaimplementować system zarządzania promocjami, które będą wysyłane do użytkowników
 * systemu za pomocą następujących kanałów (mail, sms, rozmowa telefoniczna, poczta). Zgodnie z wprowadzoną ustawą o RODO/GDPR, klienci mają
 * prawo do wyrażenia woli jakimi kanałami chcą otrzymywać treści dotyczące promocji. Klienci dokonując zakupów zdobywają punkty lojalnościowe.
 * Przy założeniu konta, użytkownik dostaje dodatkowe 40 punktów za każdy zaznaczony preferowany kanał komunikacji.
 * W sytuacji, gdy nie ma sprecyzowanego wyboru kanału komunikacji dla promocji, należy uwzględnić następujące priorytety dla preferencji:
 * 1 - mail, 2 - sms, 3- phone, 4 - poczta.

 Firma zaplanowała przetestować system dla następujacych promocji:

 Promocja 1:
 Data: 2018-11-05
 Reguła: Wyślij wiadomość, dla wszystkich klientów, którzy wyrazili chęć otrzymywania wiadomości za pomocą kanału mail.

 Promocja 2:
 Data: 2018-11-15
 Reguła: Wyślij wiadomość, dla wszystkich klientów.

 Promocja 3:
 Data: 2018-11-19
 Reguła: Wyślij wiadomość, dla wszystkich klientów, którzy mają więcej niż 100 punktów lojalnościowych.

 Zadaniem będzie implementacja symulatora powyższego opisu systemu.
 */
public class PromotionSimulator {
    private UserService userService;
    private PromotionService promotionService;
    private ArrayHelper<User> userArrayHelper;
    private Logger logger;

    public void simulate(){
        // Init services
        logger = new Logger();
        userArrayHelper = new ArrayHelper<User>();
        userService = new UserService(userArrayHelper, logger);
        promotionService = new PromotionService(userService);

        // Generate users
        User[] database = this.generateUsers();

        // Print users
        for (User user:database) {
            System.out.println(user.toString());
        }

        // Generate promotions
        Promotion[] promotions = this.generatePromotions(database);

        // Run script
        Date startSimulationDate = new Date(118,10,1);
        Date endSimulationDate = new Date(118,10,30);

        Calendar start = Calendar.getInstance();
        start.setTime(startSimulationDate);

        for (Calendar from = start; from.getTime().before(endSimulationDate); from.add(Calendar.DAY_OF_MONTH, 1)) {
            for (Promotion promotion : promotions) {
                generateMorningReports(from);
                if (from.getTime().compareTo(promotion.getStartDay()) == 0) {
                    promotionService.runPromotion(promotion);
                }
                generateEveningReports(from);
            }
        }
    }

    private Promotion[] generatePromotions(User[] users) {
        Promotion promotion1 = new Promotion("First promotion", new Date(118, 10, 5), userService.getUsersWhoAllowedToSendThemEmail(users));
        Promotion promotion2 = new Promotion("Second promotion", new Date(118, 10, 15), users);
        Promotion promotion3 = new Promotion("Third promotion", new Date(118, 10, 19), userService.getUsersWithMoreBonusPointsThan(users, 100));

        Promotion[] promotions = new Promotion[3];
        promotions[0] = promotion1;
        promotions[1] = promotion2;
        promotions[2] = promotion3;

        return promotions;
    }

    private User[] generateUsers() {
        User user1 = new User("Rob", "Thomas", "rob.thomas@gmail.com", "48500500501", "Test City 1", true, false, true,false);
        User user2 = new User("Andrew", "Jacoobs", "andrew.jacobs@gmail.com", "48500500502", "Test City 2", true, true, true,false);
        User user3 = new User("John", "Anders", "john.doe@gmail.com", "48500500503", "Test City 3", true, true, false,false);
        User user4 = new User("Eva", "Doe", "eva.doe@gmail.com", "48500500504", "Test City 4", true, true, true,true);
        User user5 = new User("Anna", "Onile", "anna.onile@gmail.com", "48500500505", "Test City 5", false, false, false,true);

        User[] users = new User[5];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        users[4] = user5;

        return users;
    }

    private void generateEveningReports(Calendar calendar) {
        System.out.println("===========================================================");
        System.out.println("EVENING: " + calendar.getTime().toString());
        System.out.println("===========================================================");
    }

    private void generateMorningReports(Calendar calendar) {
        System.out.println("===========================================================");
        System.out.println("MORNING: " + calendar.getTime().toString());
        System.out.println("===========================================================");
    }
}
