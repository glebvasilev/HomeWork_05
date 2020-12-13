package com.company;

class Shop {
    /*
     *  Class represents reason of shop works
     */

    boolean goods = true;
    private boolean works = true;

    public boolean sell(boolean amount) {
        return works;
    }

    class onlineShop extends Shop {

        boolean deliver(boolean amount) {
            if (works == true & goods == true) {
                System.out.println("Delivered");
            }
            else {
                System.out.println("Not delivered");
            }
            return true;
        }
    }

    class OfflineShop extends Shop {

        boolean take_out(boolean amount) {
            if (works == false & goods == true) {
                System.out.println("Taken");
            }
            else {
                System.out.println("Not taken");
            }
            return false;
        }
    }
}

    public class Main {
        public static void main(String args[]) {
            Shop on = new Shop();
            Shop off = new Shop();
            System.out.println("The goods were delivered: " + on.sell(true));
            System.out.println("The goods were taken: " + off.sell(false));
        }
    }