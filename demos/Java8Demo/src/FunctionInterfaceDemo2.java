import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8,9));
//		
//		Function<List<Integer>, List<Integer>> fuctOdd = (l) -> {
//			List<Integer> temp = new ArrayList<>();
//			for(int value : l) {
//				if(value%2==1) {
//					temp.add(value);
//				}
//			}
//			return temp;
//		};
//		
//		List<Integer> oddList =  fuctOdd.apply(list);
//		System.out.println(oddList);
		
//		Function<String, Integer> function = (str) -> str.length();
//		int result = function.apply("welcome");
//		System.out.println(result);
		
		int[] nums = {1,2,3,4,5};
		
		Supplier<Double> supp = () -> Math.random()*10;
		
		System.out.println(supp.get());
		 
		//method2(nums, (num) -> System.out.println(num));
		
//		IntPredicate p1 = (number) -> number > 10;
//		IntPredicate p2 = (number) -> number % 2 == 0;
//		
//		IntPredicate p3 = p1.and(p2);
//		 		
//		method1(nums, p3);
//		
	}
	
	public static void method2(int[] x, Consumer<Integer> c) {
		for(int v : x) {
			c.accept(v);
		}
	}
	
	public static void method1(int[] x, Predicate<Integer> p) {
		for(int value : x) {
			if(p.test(value)) {
				System.out.print(value + " ");
			}
		}
	}

}
