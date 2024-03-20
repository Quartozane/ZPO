class EmailSendingStrategy implements SendingStrategy {
    @Override
    public void sendAd(User user) {
        System.out.println("Wysyłanie reklamy za pomocą e-maila do: " + user.getName());
    }
}
