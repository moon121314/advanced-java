package com.application.examples.guava_example;

import com.google.common.collect.Multiset;
import com.google.common.collect.HashMultiset;

public class App {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("apple");
        multiset.add("banana");
        multiset.add("apple");
        
        System.out.println("Multiset contents: " + multiset);
        System.out.println("Apple count: " + multiset.count("apple"));
        System.out.println("Guava is working correctly!");
    }
}
