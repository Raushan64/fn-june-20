
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable task1 = new MyTask();
		
//		Runnable task2 = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("this is task2");
//			}
//		};
		
		Runnable task2 = () -> System.out.println("this is task2");
		
		Thread t1 = new Thread(task2);
		t1.start();
		
		
		Taxable product1 = new Taxable() {
			
			@Override
			public double calcTax() {
				// TODO Auto-generated method stub
				System.out.println("calcualting tax");
				return 0;
			}
		};
		
		Taxable product2 = () -> {
			// TODO Auto-generated method stub
			System.out.println("calcualting tax");
			return 0;
		};
	}

}
