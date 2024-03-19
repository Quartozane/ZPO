class EmailSendingStrategy implements SendingStrategy {
    @Override
    public void sendAd(String ad, String language) {
        System.out.println("Wysyłanie reklamy za pomocą e-maila w języku: " + language);
    }
}
