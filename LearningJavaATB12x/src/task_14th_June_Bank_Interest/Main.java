package task_14th_June_Bank_Interest;

public class Main {

	public static void main(String[] args) {
		// Create objects
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        // Print interest rates
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");

	}

}
