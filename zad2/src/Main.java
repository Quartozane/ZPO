
public class Main {
    public static void main(String[] args) {
        User user = new User("Andrzej",new PolishTranlsate());
        Advertiser advertiser = new Advertiser(new SMSSendingStrategy());
        advertiser.sendAd(user);
    }
}