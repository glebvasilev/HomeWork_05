package com.company;

class Shop {
    /*
     *  Class describes generic shop
     */

    protected boolean works = true;

    public void sell(boolean param) {
    }
}

class onlineShop extends Shop {

    void deliver(boolean goods) {
        if (this.works & goods) {
            System.out.println("CLASS onlineShop: Sold And Delivered");
        }
        else {
            System.out.println("CLASS onlineShop: Not delivered");
        }
    }
    public void sell(boolean param) {
        this.deliver(param);
    }
}

class offlineShop extends Shop {

    void take_out(boolean goods) {
        if (this.works & goods) {
            System.out.println("CLASS offlineShop: Sold And Taken out");
        }
        else {
            System.out.println("CLASS offlineShop: Not Taken out");
        }
    }
    public void sell(boolean param) {
        this.take_out(param);
    }
}

public class Main {
    public static void main(String args[]) {
        onlineShop on = new onlineShop();
        offlineShop off = new offlineShop();
        on.sell(true);
        off.sell(true);
    }
}