package test_28th_June_String;

public class PerformanceOfStrings {

	public static void main(String[] args) {
		int times = 10000; // number of repetitions

        // String concatenation
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < times; i++) {
            str = str + "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("Time with String (+): " + (end - start) + " ms");

        // StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: " + (end - start) + " ms");

        // StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < times; i++) {
            sbf.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("Time with StringBuffer: " + (end - start) + " ms");
    }
	}


