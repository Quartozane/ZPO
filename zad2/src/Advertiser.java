class Advertiser {
    private final SendingStrategy sendingStrategy;

    public Advertiser(SendingStrategy sendingStrategy) {
        this.sendingStrategy = sendingStrategy;
    }

    public void sendAd(String ad, String language) {
        sendingStrategy.sendAd(ad, language);
    }
}
