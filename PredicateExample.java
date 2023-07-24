package com.biconsumer;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer>  p1=(i)->{return i%2==0;};
	static Predicate<Integer> p2=(i)->i%2==0;
	static Predicate<Integer> p3=(i)->i%5==0;

	public static void PredicateAnd() {
		System.out.println(p1.and(p3).test(10));
	}
	public static void PredicateOr(){
		System.out.println(p1.or(p3).test(9));
	}
	public static void PredicateNegate() {
		p1.or(p2).negate().test(8);
	}
	public static void main (String[] args) {
		Predicate<Integer> p=(i)->i%2==0;
		System.out.println(p.test(2));
		PredicateAnd();
		PredicateOr();
		PredicateNegate();
	}
}
