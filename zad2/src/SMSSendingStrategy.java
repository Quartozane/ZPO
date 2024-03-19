class SMSSendingStrategy implements SendingStrategy {
    @Override
    public void sendAd(String ad, String language) {
        System.out.println("Wysyłanie reklamy za pomocą SMS w języku: " + language);
    }
}
