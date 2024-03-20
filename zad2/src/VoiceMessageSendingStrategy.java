class VoiceMessageSendingStrategy implements SendingStrategy {
    @Override
    public void sendAd(User user) {
        System.out.println("Wysyłanie reklamy za pomocą wiadomości głosowej do " + user.getName());
    }
}
