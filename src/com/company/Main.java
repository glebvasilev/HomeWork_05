package com.company;

class Shop {
    /*
     *  Class represents reason of shop works
     */

    boolean goods = true;
    boolean works = true;

    public boolean sell() {
        return works;
    }
}

    class onlineShop extends Shop {

        boolean deliver() {
            works = true;
            if (works == true & goods == true) {
                System.out.println("Delivered");
            }
            else {
                System.out.println("Not delivered");
            }
            return true;
        }
        public boolean sell() {
            this.deliver();
            return works;
        }
    }

    class offlineShop extends Shop {

        boolean take_out() {
            works = false;
            if (works == false & goods == true) {
                System.out.println("Taken");
            }
            else {
                System.out.println("Not taken");
            }
            return false;
        }
        public boolean sell() {
            this.take_out();
            return works;
        }
    }

    public class Main {
        public static void main(String args[]) {
            onlineShop on = new onlineShop();
            offlineShop off = new offlineShop();
            on.deliver();
            off.take_out();
        }
    }