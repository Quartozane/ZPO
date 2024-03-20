class SMSSendingStrategy implements SendingStrategy {
    @Override
    public void sendAd(User user) {
        System.out.println("Wysyłanie reklamy za pomocą SMS do: " + user.getName());
    }
}
