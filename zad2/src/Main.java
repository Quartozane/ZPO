import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int strategyChoice = random.nextInt(3);

        SendingStrategy sendingStrategy;

        switch (strategyChoice) {
            case 0:
                sendingStrategy = new EmailSendingStrategy();
                break;
            case 1:
                sendingStrategy = new SMSSendingStrategy();
                break;
            case 2:
                sendingStrategy = new VoiceMessageSendingStrategy();
                break;
            default:
                sendingStrategy = new EmailSendingStrategy();
        }

        String ad = "Oferta specjalna! Sprawdź nasze najnowsze produkty.";
        String preferredLanguage = "angielski";
        Advertiser advertiser = new Advertiser(sendingStrategy);
        advertiser.sendAd(ad, preferredLanguage);
    }
}