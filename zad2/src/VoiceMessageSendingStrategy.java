class VoiceMessageSendingStrategy implements SendingStrategy {
    @Override
    public void sendAd(User user,Advertiserment advertiserment) {
        System.out.println("Wysyłanie reklamy za pomocą wiadomości głosowej do " + user.getName() + " Zawartość:" + advertiserment.getContent());
    }
}
