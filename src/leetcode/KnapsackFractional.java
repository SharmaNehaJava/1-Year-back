package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class KnapsackFractional {
    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] profit = {60, 100, 120};
        int capacity = 50;

        double maxValue = getMaxValue(weight, profit, capacity);
        System.out.println("Maximum value in the knapsack: " + maxValue);
    }


    static class Item {
        int weight;
        int profit;
        double ratio;

        public Item(int weight, int profit) {
            this.weight = weight;
            this.profit = profit;
            this.ratio = (double) profit / weight;
        }
    }


        public static double getMaxValue(int[] weight, int[] profit, int capacity) {
            int n = weight.length;
            List<Item> items = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                items.add(new Item(weight[i], profit[i]));
            }

            // Sort the items by their profit-to-weight ratio in descending order
            Collections.sort(items, (item1, item2) -> Double.compare(item2.ratio, item1.ratio));

            double maxValue = 0;
            int currentWeight = 0;

            for (Item item : items) {
                if (currentWeight + item.weight <= capacity) {
                    maxValue += item.profit;
                    currentWeight += item.weight;
                } else {
                    double remainingCapacity = capacity - currentWeight;
                    maxValue += (remainingCapacity / item.weight) * item.profit;
                    break;
                }
            }

            return maxValue;
        }




}
