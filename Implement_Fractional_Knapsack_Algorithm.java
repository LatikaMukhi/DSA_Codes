import java.util.*;         
public class Knapsack {
static class Item {
 int weight, value;
 double valuePerUnitWeight;
 Item(int weight, int value) {
      this.weight = weight;
      this.value = value;
  valuePerUnitWeight = (double) (value) / (weight);
    }}
 static double getMax(int weight[], int value[], int capacity) {
  int n = weight.length;
 List<Item> list = new ArrayList<>();
for (int i = 0; i < n; i++) {
      list.add(new Item(weight[i], value[i]));
    }
 Collections.sort(
      list,
 new Comparator<Item>() {
 public int compare(Item i1, Item i2) {
 if (i1.valuePerUnitWeight > i2.valuePerUnitWeight) return -1;
          return 1;
        }
      }
    );

    double ans = 0;

    for (int i = 0; i < n; i++) {
      int wt = list.get(i).weight;
      int val = list.get(i).value;
      double valuePerUnitWeight = list.get(i).valuePerUnitWeight;
if (capacity >= wt) {
 ans += val;
capacity -= wt; }
else {
        ans += valuePerUnitWeight * capacity;
 capacity = 0;
        break;} }
 return ans;}
  public static void main(String args[]) {
 int weight[] = { 10, 30, 20, 50 };
    int value[] = { 40, 30, 80, 70 };
    int capacity = 60;

    System.out.println(
      "Maximum value that" +
      " can be obtained is " +
      getMax(weight, value, capacity)
    );
  }
}
