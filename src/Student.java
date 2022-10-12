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
	
	//���� �̿��ؼ� �����ϴ� �޼ҵ�
	@Override
	public int compareTo(Object o) {  //���� ȣ���ϴ� �޼ҵ尡 �ƴ� TreeSetŬ�������� ���������� ����ϴ� �޼ҵ�
		
		if(o instanceof Student) {
			Student tmp = (Student)o;
			//return this.ban - tmp.ban;   //��������  //���� 0�̸� ���� ��, ����� �տ� ���� ū ��, ������ �ڿ� ���� ū �� -> TreeSet���� ���������� ���װ����� ������ 
			return  tmp.ban - this.ban;    //��������
		}
		
		return -1;
	}
	
	

}
