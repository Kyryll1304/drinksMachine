package com.me.kirilltrosnickii;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DrinksMachine {

    private static int coffeeCount = 0;
    private static int teaCount = 0;
    private static int lemonadeCount = 0;
    private static int mojitoCount = 0;
    private static int mineralWaterCount = 0;
    private static int cocaColaCount = 0;
    private static double totalCost = 0;

    private static void addOrderToList(Map<Drinks, Integer> orderList, Drinks drink) {
        if (orderList.containsKey(drink)) {
            orderList.put(drink, orderList.get(drink) + 1);
        } else {
            orderList.put(drink, 1);
        }
    }

    public static void makeCoffee(Map<Drinks, Integer> orderList) {
        coffeeCount++;
        totalCost += Drinks.COFFEE.getPrice();
        addOrderToList(orderList, Drinks.COFFEE);
    }

    public static void makeTea(Map<Drinks, Integer> orderList) {
        teaCount++;
        totalCost += Drinks.TEA.getPrice();
        addOrderToList(orderList, Drinks.TEA);
    }

    public static void makeLemonade(Map<Drinks, Integer> orderList) {
        lemonadeCount++;
        totalCost += Drinks.LEMONADE.getPrice();
        addOrderToList(orderList, Drinks.LEMONADE);
    }

    public static void makeMojito(Map<Drinks, Integer> orderList) {
        mojitoCount++;
        totalCost += Drinks.MOJITO.getPrice();
        addOrderToList(orderList, Drinks.MOJITO);
    }

    public static void makeMineralWater(Map<Drinks, Integer> orderList) {
        mineralWaterCount++;
        totalCost += Drinks.MINERAL_WATER.getPrice();
        addOrderToList(orderList, Drinks.MINERAL_WATER);
    }

    public static void makeCocaCola(Map<Drinks, Integer> orderList) {
        cocaColaCount++;
        totalCost += Drinks.COCA_COLA.getPrice();
        addOrderToList(orderList, Drinks.COCA_COLA);
    }

    public static int getCoffeeCount() {
        return coffeeCount;
    }

    public static int getTeaCount() {
        return teaCount;
    }

    public static int getLemonadeCount() {
        return lemonadeCount;
    }

    public static int getMojitoCount() {
        return mojitoCount;
    }

    public static int getMineralWaterCount() {
        return mineralWaterCount;
    }

    public static int getCocaColaCount() {
        return cocaColaCount;
    }

    public static double getTotalCost() {
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Drinks, Integer> orderList = new HashMap<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Coffee");
            System.out.println("2. Tea");
            System.out.println("3. Lemonade");
            System.out.println("4. Mojito");
            System.out.println("5. Mineral Water");
            System.out.println("6. Coca Cola");
            System.out.println("7. Finish Order");

            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Your Order:");
                for (Drinks drink : orderList.keySet()) {
                    System.out.println(drink.getName() + ": " + orderList.get(drink));
                }
                System.out.println("Total Cost: " + getTotalCost());
                break;
            }

            switch (choice) {
                case 1:
                    makeCoffee(orderList);
                    System.out.println("Coffee added to your order.");
                    break;
                case 2:
                    makeTea(orderList);
                    System.out.println("Tea added to your order.");
                    break;
                case 3:
                    makeLemonade(orderList);
                    System.out.println("Lemonade added to your order.");
                    break;
                case 4:
                    makeMojito(orderList);
                    System.out.println("Mojito added to your order.");
                    break;
                case 5:
                    makeMineralWater(orderList);
                    System.out.println("Mineral Water added to your order.");
                    break;
                case 6:
                    makeCocaCola(orderList);
                    System.out.println("Coca Cola added to your order.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            System.out.println("Your Order:");
            for (Drinks drink : orderList.keySet()) {
                System.out.println(drink.getName() + ": " + orderList.get(drink));
            }
            System.out.println("Total Cost: " + getTotalCost());
        }
    }
}

