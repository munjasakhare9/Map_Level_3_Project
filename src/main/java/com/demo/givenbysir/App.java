package com.demo.givenbysir;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Map<Student, Map<String, Collection>> students = new HashMap<>();

		// data of S1
		Student s1 = new Student(101, "harish", "pune", 81.34);
		Map<String, Collection> detailsOfS1 = new LinkedHashMap<>();

		List<String> imagesOfS1 = new ArrayList();
		imagesOfS1.add("img001.jpeg");
		imagesOfS1.add("img002.jpeg");
		imagesOfS1.add("img003.jpeg");
		detailsOfS1.put("images", imagesOfS1);

		Set<String> skillsOfS1 = new LinkedHashSet<>();
		skillsOfS1.add("Composition");
		skillsOfS1.add("Lighting");
		skillsOfS1.add("Camera Handling");
		skillsOfS1.add("Photo Editing");
		detailsOfS1.put("skills", skillsOfS1);

		Set<String> achivementsOfS1 = new LinkedHashSet<>();
		achivementsOfS1.add("Won photography competitions");
		achivementsOfS1.add("Covered major events");
		achivementsOfS1.add("Published photographs in magazines");
		achivementsOfS1.add("Built a professional photography portfolio");
		detailsOfS1.put("achievements", achivementsOfS1);

		Set<String> certificatesOfS1 = new LinkedHashSet<>();
		certificatesOfS1.add("Professional Photography Certificate");
		certificatesOfS1.add("Digital Photography Certificate");
		certificatesOfS1.add("Advanced Photography Certificate");
		certificatesOfS1.add("Photo Editing Certificate");
		detailsOfS1.put("cerificates", certificatesOfS1);

		Set<String> reviewsOfS1 = new LinkedHashSet<>();
		reviewsOfS1.add("Excellent photography and very professional.");
		reviewsOfS1.add("Amazing photos with great attention to detail.");
		reviewsOfS1.add("Very creative and captured beautiful moments.");
		reviewsOfS1.add("Excellent service and delivered high-quality photos.");
		detailsOfS1.put("reviews", reviewsOfS1);

		students.put(s1, detailsOfS1);

		// data of S2
		Student s2 = new Student(102, "manish", "satara", 88.60);
		Map<String, Collection> detailsOfS2 = new LinkedHashMap<>();

		List<String> imagesOfS2 = new ArrayList();
		imagesOfS2.add("img004.jpeg");
		imagesOfS2.add("img005.jpeg");
		detailsOfS2.put("images", imagesOfS2);

		Set<String> skillsOfS2 = new LinkedHashSet<>();
		skillsOfS2.add("Java");
		skillsOfS2.add("Problem Solving");
		skillsOfS2.add("SQL");
		skillsOfS2.add("Spring Boot");
		skillsOfS2.add("Git and GitHub");
		detailsOfS2.put("skills", skillsOfS2);

		Set<String> achievementsOfS2 = new LinkedHashSet<>();
		achievementsOfS2.add("Developed and deployed multiple software projects.");
		achievementsOfS2.add("Solved 100+ programming and DSA problems.");
		achievementsOfS2.add("Participated in coding competitions and hackathons.");
		achievementsOfS2.add("Improved application performance through code optimization.");
		detailsOfS2.put("achievements", achievementsOfS2);

		Set<String> certificatesOfS2 = new LinkedHashSet<>();
		certificatesOfS2.add("Java Programming Certificate");
		certificatesOfS2.add("Full Stack Web Development Certificate");
		certificatesOfS2.add("Spring Boot Certificate");
		certificatesOfS2.add("SQL and Database Management Certificate");
		certificatesOfS2.add("Git and GitHub Certificate");
		detailsOfS2.put("cerificates", certificatesOfS2);

		Set<String> reviewsOfS2 = new LinkedHashSet<>();
		reviewsOfS2.add("Excellent developer with strong technical and problem-solving skills.");
		reviewsOfS2.add("Writes clean, efficient, and well-structured code.");
		reviewsOfS2.add("Very good knowledge of Java, databases, and backend development.");
		reviewsOfS2.add("Successfully delivers projects on time with high-quality results.");
		reviewsOfS2.add("A reliable developer who quickly understands and solves technical problems.");
		detailsOfS2.put("reviews", reviewsOfS2);

		students.put(s2, detailsOfS2);

		// data of s3
		Student s3 = new Student(105, "raju", "delhi", 90.50);
		Map<String, Collection> detailsOfS3=new LinkedHashMap<>();
		List<String> imagesOfS3 = new ArrayList();
		imagesOfS3.add("img006.jpeg");
		imagesOfS3.add("img007.jpeg");
		imagesOfS3.add("img008.jpeg");
		imagesOfS3.add("img009.jpeg");
		detailsOfS3.put("images", imagesOfS3);

		Set<String> skillsOfS3 = new LinkedHashSet<>();
		skillsOfS3.add("Patient Care");
		skillsOfS3.add("Diagnosis");
		skillsOfS3.add("Medical Knowledge");
		skillsOfS3.add("Communication");
		skillsOfS3.add("Clinical Decision-Making");
		detailsOfS3.put("skills", skillsOfS3);

		Set<String> achievementsOfS3 = new LinkedHashSet<>();
		achievementsOfS3.add("Successfully treated and cared for patients.");
		achievementsOfS3.add("Received recognition for outstanding patient care.");
		achievementsOfS3.add("Participated in medical research and healthcare programs.");
		achievementsOfS3.add("Successfully handled critical and emergency cases.");
		achievementsOfS3.add("Conducted health awareness and community outreach programs.");
		detailsOfS3.put("achievements", achievementsOfS3);

		Set<String> certificatesOfS3 = new LinkedHashSet<>();
		certificatesOfS3.add("MBBS Degree Certificate");
		certificatesOfS3.add("Medical Registration Certificate");
		certificatesOfS3.add("Basic Life Support (BLS) Certificate");
		certificatesOfS3.add("Advanced Cardiac Life Support (ACLS) Certificate");
		certificatesOfS3.add("First Aid and Emergency Care Certificate");
		detailsOfS3.put("cerificates", certificatesOfS3);

		Set<String> reviewsOfS3 = new LinkedHashSet<>();
		reviewsOfS3.add("Very knowledgeable and professional doctor.");
		reviewsOfS3.add("Provides excellent patient care and listens carefully.");
		reviewsOfS3.add("Explains medical conditions and treatments clearly.");
		reviewsOfS3.add("Friendly, caring, and respectful toward patients.");
		reviewsOfS3.add("Provides timely diagnosis and effective treatment.");
		detailsOfS3.put("reviews", reviewsOfS3);

		students.put(s3, detailsOfS3);
		
		Set<Student> studentsKeySet = students.keySet();
		System.out.println("***************************************************************");
		System.out.println("Information of Students");
		System.out.println("***************************************************************");
		for(Student s:studentsKeySet) {
			System.out.print("ID : "+s.getId()+"\t");
			System.out.print("NAME : "+s.getName()+"\t");
			System.out.print("CITY : "+s.getCity()+"\t");
			System.out.println("Percentage: "+s.getPercentage());
			System.out.println("-------------------------------------------------------------------");
			
			Map<String, Collection> details=students.get(s);
			System.out.println("List of Images :");
			for(Object o:details.get("images")) {
				System.out.println("\t"+o);
			}
			
			System.out.println(" ");
			
			System.out.println("List of Skills :");
			for(Object o:details.get("skills")) {
				System.out.println("\t"+o);
			}
			
			System.out.println(" ");
			
			System.out.println("List of Certificates :");
			for(Object o:details.get("cerificates")) {
				System.out.println("\t"+o);
			}
			
			System.out.println(" ");
			
			System.out.println("List of Achievements :");
			for(Object o:details.get("achievements")) {
				System.out.println("\t"+o);
			}
			
			System.out.println(" ");
			
			System.out.println("List of Reviews :");
			for(Object o:details.get("reviews")) {
				System.out.println("\t"+o);
			}
			System.out.println("\n============================================================================\n");
		}

	}
}
