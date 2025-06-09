package Programs;

public class SumOfItemsInArray {

	public static void main(String[] args) {

        int [] numbers = {45,55,65,75,85,90};
        int sum = 0;
        for (int i = 0; i<numbers.length;i++) {
            sum = sum+numbers[i];
        }
        System.out.println(sum);
	}

}
