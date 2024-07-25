package javabasic.class1;

public class ClassStart2 { 
	
	public static void main(String[] args) { 
		
		String[] studentNames= {"학생1","학생2","학생3","학생4"};
		int [] stdudentAge = {15, 16, 17, 20 };	
		int [] studentGrade = {90, 80, 70, 60};
		
		for (int i = 0 ; i < studentNames.length; i++) {
			System.out.println("이름:" + studentNames[i] + "나이:" + stdudentAge[i] + "성적:" + studentGrade[i]);
		}	
	}
}


//배열 사용의 한계 
// 배열로 인한 코드 최소화는 성공 but 한 학생의 데이터가 studentName[] 3개의 배열이 나누어졌기 때문에 변경 할 떄 각각의 데이터 요소를 정화하게
// 삭제또는 추가해줘야 한다.
