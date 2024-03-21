class EmailSendingStrategy implements SendingStrategy {
    @Override
    public void sendAd(User user,Advertiserment advertiserment) {
        System.out.println("Wysyłanie reklamy za pomocą e-maila do: " + user.getName() + " Zawartość:" + advertiserment.getContent());
    }
}
