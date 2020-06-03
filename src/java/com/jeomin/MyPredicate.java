package com.jeomin;

@FunctionalInterface
public interface MyPredicate<T> {

	public boolean test(T t);
	
}
