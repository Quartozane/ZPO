class VoiceMessageSendingStrategy implements SendingStrategy {
    @Override
    public void sendAd(String ad, String language) {
        System.out.println("Wysyłanie reklamy za pomocą wiadomości głosowej w języku: " + language);
    }
}
