package task_18th_June_While_loop;

public class PrintSumOfFirst10Nos {

	public static void main(String[] args) {
		int i = 1, sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);

	}

}
