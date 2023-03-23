package test;

import java.util.stream.Stream;

import org.junit.Test;

public class StreamTest {
	@Test
	public void test1() {
		Stream<Integer> s = Stream.iterate(0, (x) -> x + 3);
		s.limit(10).forEach(System.out::println);

	}

	public static void main(String[] args) {
		new StreamTest().test1();

	}
}
