package Entities;

public class Games {
    private int price;
    private String gameName;
    private int discount;

    public Games(int price, String gameName,int discount) {
        this.price = price;
        this.gameName = gameName;
        this.discount=discount;
    }
    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
