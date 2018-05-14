package ir.cleanx.cleancoin;

public class CoinModel {
    private int coinNum;
    private String coinWalletName;
    private String coinReceiver;
    private String coinSender;

    public CoinModel(int coinNum, String coinWalletName, String coinReceiver, String coinSender) {
        this.coinNum = coinNum;
        this.coinWalletName = coinWalletName;
        this.coinReceiver = coinReceiver;
        this.coinSender = coinSender;
    }

    public CoinModel(int coinNum, String coinWalletName) {
        this.coinNum = coinNum;
        this.coinWalletName = coinWalletName;
    }

    public CoinModel(String coinWalletName) {
        this.coinWalletName = coinWalletName;
    }

    public int getCoinNum() {
        return coinNum;
    }

    public void setCoinNum(int coinNum) {
        this.coinNum = coinNum;
    }

    public String getCoinWalletName() {
        return coinWalletName;
    }

    public void setCoinWalletName(String coinWalletName) {
        this.coinWalletName = coinWalletName;
    }

    public String getCoinReceiver() {
        return coinReceiver;
    }

    public void setCoinReceiver(String coinReceiver) {
        this.coinReceiver = coinReceiver;
    }

    public String getCoinSender() {
        return coinSender;
    }

    public void setCoinSender(String coinSender) {
        this.coinSender = coinSender;
    }
}
