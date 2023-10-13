package week1.day1;

import java.util.*;

public class SecondSmallestNum {
public static int getSecondSmallestNum(int[]a, int total) {

	Arrays.sort(a);
	return a[1];

}
public static void main(String[] args) {
	int a[]= {23,45,67,32,89,22};
	System.out.println("Second smallest number is" + getSecondSmallestNum(a,6));
}
}