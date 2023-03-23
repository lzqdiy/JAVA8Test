package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;



public class LambdaTest  {
	List<User> users=Arrays.asList(
		new User("001",20),
		new User("002",20),
		new User("003",80),
		new User("004",30),
		new User("005",70),
		new User("005",100)
		
	);
	
	@Test
	public  void test1() {
		Collections.sort(users,(u1,u2)->{
			return Integer.compare(u1.getAge() ,u2.getAge());
		});
		
		users.forEach(System.out::println);
		
	}
	
	public void test2() {
		Consumer<String> con=(x)->System.out.println(x);
		con.accept("00000");
		Consumer<String> con2=System.out::println;
		con2.accept("1234");
		
		User u=new User("123",90);
		Supplier<Integer> sup=u::getAge;
		System.out.println(sup.get());
		
		Function<Integer,User> fun=User::new;
		System.out.println(fun.apply(345));
		
		BiFunction<String,Integer,User> fun2=User::new;
		System.out.println(fun2.apply("66666",345));
	}
	
	public static void main(String[] args) {
		new LambdaTest().test2();
	}

}
