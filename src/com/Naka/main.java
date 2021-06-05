package com.Naka;

import java.io.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 학생수는 몇명입니까? : ");
		int number = sc.nextInt();
		Student[] students = new Student[number];
		FileWriter fout= new FileWriter("data/list.txt");
		PrintWriter out = new PrintWriter(fout);
		
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
			students[i].show();
		}
		for (int i = 0; i < number; i++) {
		out.println("이름: " + students[i].getName() + " 나이: " + students[i].getAge() + " 성별: " + students[i].getGender() 
				+ " 학번: " + students[i].getStudentID() + " 학년: " + students[i].getGrade() + " 학점: " + students[i].getGPA());
		}
		out.close();
		sc.close();
	}
}
