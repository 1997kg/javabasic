package javabasic.class1;

public class ClassStart5 {  // for문을 이용 및 배열 최적화
	
	public static void main(String[] args) { 
		Student student1 = new Student();  //x001
		student1.name ="학생1";
		student1.age = 15;
		student1.grade = 90;
		

		Student student2 = new Student(); //x002
		student2.name ="학생2";
		student2.age = 16;
		student2.grade = 80;
		
		
		Student[] students = {student1, student2};
//		students[0] = student1;
//		students[1] = student2;
		

		for(int i = 0; i < students.length; i++) {
			System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
		}
		for(int i = 0; i < students.length; i++) {
			Student s = students[i];
			System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
		}
		for(Student s: students) { //향상된 for문 단축키 iter(intellj) 이클립스용은 뭘까?ㅋ
			System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
		}

	}
}

//System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
//System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);

