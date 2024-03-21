class Advertiser {
    SendingStrategy sendingStrategy;

    public Advertiser(SendingStrategy sendingStrategy) {
        this.sendingStrategy = sendingStrategy;
    }

    public void sendAd(User user,Advertiserment advertiserment) {
        sendingStrategy.sendAd(user,advertiserment);
        user.getTranslate().translate();
    }
    public void Advertiser() {

    }

    public void setSendingStrategy(SendingStrategy sendingStrategy){
        this.sendingStrategy=sendingStrategy;
    }
}
