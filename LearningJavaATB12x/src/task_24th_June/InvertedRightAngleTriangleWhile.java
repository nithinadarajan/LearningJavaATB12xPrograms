package task_24th_June;

public class InvertedRightAngleTriangleWhile {

	public static void main(String[] args) {
		int rows = 5;
        int i = rows;

        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

	}

}
