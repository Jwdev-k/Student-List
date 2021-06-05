package com.Naka;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 학생수는 몇명입니까? : ");
		int number = sc.nextInt();
		Student[] students = new Student[number];
		
		for (int i = 0; i < number; i++) {
			String name;
			int age;
			String gender;
			String studentID;
			int grade;
			double gPA;
			System.out.println("이름을 입력하세요. : ");
			name = sc.next();
			System.out.println("나이를 입력하세요. : ");
			age = sc.nextInt();
			System.out.println("성별을 입력하세요. : ");
			gender = sc.next();
			System.out.println("학번을 입력하세요. : ");
			studentID = sc.next();
			System.out.println("학년을 입력하세요. : ");
			grade = sc.nextInt();
			System.out.println("학점을 입력하세요. :");
			gPA = sc.nextDouble();
			students[i] = new Student(name, age, gender, studentID, grade, gPA);
		}
		for (int i = 0; i < number; i++) {
			students[i].show();
		}
	}

}
