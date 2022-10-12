import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class Student implements Comparable {
	
	String name;
	int ban;
	int no;
	int kor,eng,math;

	int getTotal() {
		return kor + eng + math;
	}
	
	float getAvg() {
		return getTotal() / 3.0f;
	}
	
	//반을 이용해서 정렬하는 메소드
	@Override
	public int compareTo(Object o) {  //직접 호출하는 메소드가 아닌 TreeSet클래스에서 내부적으로 사용하는 메소드
		
		if(o instanceof Student) {
			Student tmp = (Student)o;
			//return this.ban - tmp.ban;   //오름차순  //값이 0이면 같은 값, 양수면 앞에 값이 큰 값, 음수면 뒤에 값이 큰 값 -> TreeSet에서 내부적으로 차액값으로 정렬함 
			return  tmp.ban - this.ban;    //내림차순
		}
		
		return -1;
	}
	
	

}
