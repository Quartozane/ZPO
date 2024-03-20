class Advertiser {
    SendingStrategy sendingStrategy;

    public Advertiser(SendingStrategy sendingStrategy) {
        this.sendingStrategy = sendingStrategy;
    }

    public void sendAd(User user) {
        sendingStrategy.sendAd(user);
    }

    public void setSendingStrategy(SendingStrategy sendingStrategy){
        this.sendingStrategy=sendingStrategy;
    }
}
