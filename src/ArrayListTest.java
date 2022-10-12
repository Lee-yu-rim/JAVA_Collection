import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList -> Object Ÿ��
		
//		ArrayList list = new ArrayList(20);  //Object ����ȯ : Object�� ��ӵǾ� �����Ƿ� Ÿ���� Object�� �ȴ�.
		//�迭�� ũ�⸦ ��������� ����ϴ� Ŭ���� -> �迭�� ũ�⺸�� �����Ͱ� ������ �ڵ����� ũ�Ⱑ �þ��.
		//add get remove(����(����),�б�,����) �޼ҵ带 ���� ���� ����!
		
//		list.add("1");
//		list.add("1");  //�ߺ� ������ ����
//		list.add(new Integer(1));
//		list.add(1);
//		list.add(1);
//		list.add("2");
//		list.add(2);
		
//		list.add("1");   //String -> Object (�������� �ڵ�����ȯ �߻�) : ArrayList ��ü�� Ÿ���� Object �̹Ƿ�
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		String str = (String)list.get(0);   //Object -> String ���� ����ȯ
		//  list�� ���� �о�� �� Object Ÿ���̹Ƿ� StringŸ������ ĳ����������� 
		//=> get()�� Ŀ���� �뺸�� Ÿ���� Object�� �����Ǿ� ����, �׷��� ������ ĳ������ ���� String Ÿ������ ���� ����� �� �ְ� ����
////		System.out.println(str);
//		
//		int sum = 0;
//		
//		for(Object obj : list) { //list�� �ִ� ���� �Ѱ��� �����ͼ� Object Ÿ���� obj��� ������ ����ְڴ�.
//			String str = (String)obj;
//			System.out.println(str);
//			int num = Integer.parseInt(str);   //���� => ���ڿ�
//			sum += num;
//		}
//		
//		System.out.println("sum = " + sum);
//		
//		for(int i=0;i<list.size();i++) {   //size => list �ȿ� ����ִ� �������� ũ��(����)
//			System.out.println(list.get(i));
//		}
//		
//		list.remove(3);
//		
//		for(int i=0;i<list.size();i++) {   //size => �����Ͱ� ����ִ� ũ��
//			System.out.println(list.get(i));
//		}  // 1 2 3 5
		
		//Stack => LIFO(Last In First Out) : ���߿� �Է��� ���� ���������� ������ ��� 
//		Stack st = new Stack();
//		Stack Ŭ���������� push()�޼ҵ带 ���� ���� ����, pop()�̶�� �޼ҵ带 ���� ���� �о�´�
		
//		st.push("1");
//		st.push("2");
//		st.push("3");
//		
//		try {
//			System.out.println((String)st.pop());  //3  //pop => �����͸� �������� ���, ���� �о���鼭 Stack���� �����͸� ������
//			System.out.println((String)st.pop());  //2
//			System.out.println((String)st.pop());  //1  
//			System.out.println((String)st.pop());  //error -> EmptyStackException : Stack�� ������� �� �����͸� ����ϸ� ����� ����
//		}catch(EmptyStackException e) {
//			System.out.println("Stack�� ����ֽ��ϴ�.");
//		}
		
		
//		while(!st.empty()) {  // => Stack�� ������� ������ ����
//			System.out.println((String)st.pop());
//		}
		
//		ArrayList list = new ArrayList();
		
//		list.add("1");  
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
		//Iterator (�ݺ��� ����)
		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {  //������ ���� ���� Ȯ��, boolean Ÿ������ ���� ������ �����ϰ� ������ �������� ����
//			String str = (String)it.next();   //���� �������� ����
//			System.out.println(str);
//		}
		
		//���׸� : �÷��� ��ü���� �����͸� ���� �� Ÿ���� ����(����)��Ű�� ��
		//��� Ŭ������ object�� ��ӵǱ� ������ ���� ����ϱ� ���ؼ� �ڱ� Ÿ������ ��������ȯ(ĳ����)������Ѵ�.
		//�׷��� �Ǹ� ��Ҹ��� Ÿ���� � ������ Ȯ���ؾ��ϱ� ������ ���ŷӰ�
		//�װ��� ȿ�������� �ϱ����� ���׸��� ���� Ÿ���� �����س��� ���� ���ϵ� Ÿ������ ���������� ���ش�.
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("1");  
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		list.get(0);  //List���� 0��° �迭�� �ִ� ���� ������
//		
//		Iterator<String> it = list.iterator();
//		
//		while(it.hasNext()) {
//			String str = it.next();   
//			System.out.println(str);
//		}
		
		
		//SetŬ���� => �ߺ��� x, ������� x
//		HashSet set = new HashSet();
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");  //������ Ÿ���� �ߺ����� ��� x
//		set.add("4");
//		set.add(new Integer(1));  //Ÿ���� �ٸ��Ƿ� �ߺ������� �������� ����
//		
//		System.out.println(set);  // 1 1 2 4 ���� ������� ��µ��� ����
		
//		for(Object obj : set) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
//		HashSet<String> set = new HashSet<String>();
//		
//		set.add("1");
//		set.add("2");
//		set.add("3"); 
//		set.add("4");
//		set.add("5");
//		
//		Iterator<String> it = set.iterator();
//		
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		int[][] bingo = new int[5][5];
//		
//		for(int i=0;set.size()<25;i++) {  //i<25�� ���̸� �����صθ� �ߺ����� �����ʱ� ������ �迭�� ���� 25������ �� ���� ���� �ǹǷ� size�� �������ش�.
//			set.add((int)(Math.random() * 50) + 1);
//		}
//		
//		//System.out.println(set);
//		
//		ArrayList list = new ArrayList(set);  //ArrayList�� ���� �����ִ� ����� ����
//		Collections.shuffle(list);
//		
//		Iterator<Integer> it = list.iterator();
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				bingo[i][j] = it.next();
//			}
//		}
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				System.out.print(bingo[i][j] + " ");
//			}
//			System.out.println();
//		}
		 
		
		//TreeSet : ���� ���ĵǾ�����. / �ݵ�� ������ ���Ǵ� �ش� Ŭ���� �ȿ��� ���� ������ �������̵� �Ǿ��־�� �Ѵ�.
		//Implements Comparable (Integer, String...)
//		TreeSet set = new TreeSet();
//		set.add(new Integer(2));
//		set.add(5);
//		set.add(1);
//		set.add(4);
//		set.add(3);
//		
//		System.out.println(set);  // 1 3 4 5
//		
//		Iterator<Integer> it = set.iterator();
//			
//		while(it.hasNext()) {
//			Integer intg = (Integer)it.next();
//			System.out.println(intg);
//		}
		
		TreeSet<Student> set = new TreeSet<Student>();
		
		Student s1 = new Student("kim",1,1,10,10,10);
		Student s2 = new Student("pim",3,1,10,10,10);
		Student s3 = new Student("aim",6,1,10,10,10);
		Student s4 = new Student("sim",9,1,10,10,10);
		Student s5 = new Student("fim",4,1,10,10,10);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
