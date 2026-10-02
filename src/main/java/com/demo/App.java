package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Map<Student, Map<String, Collection<String>>> students = new HashMap<>();

		Map<String, Collection<String>> details1 = new LinkedHashMap<>();

		List<String> images1 = new ArrayList<>();
		images1.add("A");
		details1.put("images", images1);

		Set<String> skills1 = new LinkedHashSet<>();
		skills1.add("Java");
		skills1.add("Python");
		skills1.add("SQL");
		details1.put("skills", skills1);

		Set<String> certificates1 = new LinkedHashSet<>();
		certificates1.add("Hackthon Winner");
		certificates1.add("Java Full Stack Development");
		certificates1.add("Python Programming");

		details1.put("certificates", certificates1);

		Set<String> achievements1 = new LinkedHashSet<>();
		achievements1.add("University Topper");
		details1.put("achievements", achievements1);

		Set<String> reviews1 = new LinkedHashSet<>();
		reviews1.add("Excellent team player");
		reviews1.add("Good communication skills");
		details1.put("reviews", reviews1);

		Student s1 = new Student(10, "Raju", 90.95);

		students.put(s1, details1);

		// student 2--------------------------------------------------------------------

		Map<String, Collection<String>> details2 = new LinkedHashMap<>();

		List<String> images2 = new ArrayList<>();
		images2.add("B");
		details2.put("images", images2);

		Set<String> skills2 = new LinkedHashSet<>();
		skills2.add("JS");
		skills2.add("Android");
		skills2.add("ReactJS");
		details2.put("skills", skills2);

		Set<String> certificates2 = new LinkedHashSet<>();
		certificates2.add("Geeks for Geeks");
		certificates2.add("Coding champion Test");

		details2.put("certificates", certificates2);

		Set<String> achievements2 = new LinkedHashSet<>();
		achievements2.add("Solved 100+ Coding Problems");
		achievements2.add("Participated in Inter-College Coding Competition");
		certificates2.add("TCS NQT");
		details2.put("achievements", achievements2);

		Set<String> reviews2 = new LinkedHashSet<>();
		reviews2.add("Good problem-solving skills");
		reviews2.add("Strong knowledge of Java");
		details2.put("reviews", reviews2);

		Student s2 = new Student(12, "Ritesh", 95.50);

		students.put(s2, details2);

		Set<Student> studentKey = students.keySet();
		for (Student s : studentKey) {
			System.out.println("Id: " + s.id);
			System.out.println("Name: " + s.name);
			System.out.println("Marks: " + s.marks);

			Map<String, Collection<String>> sDetails = students.get(s);
			// System.out.println(sDetails);
			Set<String> sDetailsKeySet = sDetails.keySet();
			for (String sDKS : sDetailsKeySet) {
				System.out.println(sDKS + ":- ");
				Collection<String> sDetailsValues = sDetails.get(sDKS);
				for (String sDV : sDetailsValues) {
					System.out.println("\t" + sDV + " ");
				}
			}
			System.out.println("--------------------------------------------------------");
		}

	}
}
