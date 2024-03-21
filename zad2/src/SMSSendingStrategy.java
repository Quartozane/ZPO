class SMSSendingStrategy implements SendingStrategy {
    @Override
    public void sendAd(User user,Advertiserment advertiserment) {
        System.out.println("Wysyłanie reklamy za pomocą SMS do: " + user.getName() + " Zawartość:" + advertiserment.getContent());
    }
}
