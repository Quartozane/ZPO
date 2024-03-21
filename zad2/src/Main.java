import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //User user = new User("Andrzej",new PolishTranlsate());
        //Advertiser advertiser = new Advertiser(new SMSSendingStrategy());
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Norbert",new EnglishTranslate()));
        users.add(new User("Norbert",new PolishTranlsate()));
        ArrayList<Advertiserment> advertiserments = new ArrayList<>();
        advertiserments.add(new Advertiserment("Jak sobota to tylko do lidla do lidla"));
        advertiserments.add(new Advertiserment("Jesteśmy najtańszym dyskontem od 1990 roku! Biedronka Tani sklep"));
        Random random = new Random();

        Advertiser advertisementSender = new Advertiser(new SMSSendingStrategy());
        advertisementSender.sendAd(users.get(random.nextInt(users.size())), advertiserments.get(random.nextInt(advertiserments.size())));

        advertisementSender.setSendingStrategy(new VoiceMessageSendingStrategy());
        advertisementSender.sendAd(users.get(random.nextInt(users.size())),advertiserments.get(random.nextInt(advertiserments.size())));

        for (User user : users) {
            Advertiserment randomAdvert = advertiserments.get(random.nextInt(advertiserments.size()));
            advertisementSender.sendAd(user, randomAdvert);
        }

        advertisementSender.setSendingStrategy(new EmailSendingStrategy());

        for (User user : users) {
            Advertiserment randomAdvert = advertiserments.get(random.nextInt(advertiserments.size()));
            advertisementSender.sendAd(user, randomAdvert);
        }
    }
}