import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Student> listStudents = new ArrayList<>();
//		listStudents.add(new Student("Prashant", 30));
//		listStudents.add(new Student("Vishal", 70));
//		listStudents.add(new Student("Dinesh", 50));
//		listStudents.add(new Student("Suresh", 90));
//		listStudents.add(new Student("Ramesh", 80));
//		listStudents.add(new Student("Mahesh", 56));
//		listStudents.add(new Student("Jayesh", 65));
//		listStudents.add(new Student("Ramesh", 45));
//		
//		List<Student> list = 	listStudents.parallelStream()
//									.filter(stud-> stud.getScore()>=60)
//									.sorted()
//									.limit(3)
//									.collect(Collectors.toList());
//		
//		double average = listStudents.stream()
//								.mapToInt((stud)->stud.getScore())
//								.average()
//								.getAsDouble();
//		
//		
//		
//		System.out.println("average score = " + average);
//
//		System.out.println(list);
		
		String[] names = {"a","b","c","a","b","c","d","e","f","g","h","i","j","k","l"};
		
		Stream<String> distnames = Arrays.stream(names)
										.distinct();
		show(distnames);
		
//		Stream<String> stream = Arrays.stream(names).parallel();
//		show(stream);
		
		
	}
	
	public static void show(Stream<String> stream) {
		stream.forEach((name)->{
			System.out.println(LocalTime.now() +  "  " + name + " -thread: " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

}
