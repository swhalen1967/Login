package edu.acc.j2ee.login;

public class CandyVan {
    private static final String[] TREASURES = {"Gold Bullion", "lollypop",
        "\"Remember to drink your Ovaltine\" message", "Faberge Egg",
        "Junior Mints", "Two Gold Doubloons", "Rainbow Unicorn Horn",
        "Grandpa's dentures"};
    
    public String getTreasure() {
        return TREASURES[(int)(Math.random() * TREASURES.length)];
    }
}
