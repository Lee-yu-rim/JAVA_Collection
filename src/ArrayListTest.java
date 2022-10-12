import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList -> Object 타입
		
//		ArrayList list = new ArrayList(20);  //Object 형변환 : Object에 상속되어 있으므로 타입이 Object가 된다.
		//배열의 크기를 자유자재로 사용하는 클래스 -> 배열의 크기보다 데이터가 많으면 자동으로 크기가 늘어난다.
		//add get remove(쓰기(삽입),읽기,제거) 메소드를 가장 자주 쓴다!
		
//		list.add("1");
//		list.add("1");  //중복 데이터 가능
//		list.add(new Integer(1));
//		list.add(1);
//		list.add(1);
//		list.add("2");
//		list.add(2);
		
//		list.add("1");   //String -> Object (참조형의 자동형변환 발생) : ArrayList 자체의 타입이 Object 이므로
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		String str = (String)list.get(0);   //Object -> String 강제 형변환
		//  list는 값을 읽어올 때 Object 타입이므로 String타입으로 캐스팅해줘야함 
		//=> get()에 커서를 대보면 타입이 Object로 지정되어 있음, 그렇기 때문에 캐스팅을 통해 String 타입으로 값을 사용할 수 있게 해줌
////		System.out.println(str);
//		
//		int sum = 0;
//		
//		for(Object obj : list) { //list에 있는 값을 한개씩 꺼내와서 Object 타입의 obj라는 변수에 집어넣겠다.
//			String str = (String)obj;
//			System.out.println(str);
//			int num = Integer.parseInt(str);   //숫자 => 문자열
//			sum += num;
//		}
//		
//		System.out.println("sum = " + sum);
//		
//		for(int i=0;i<list.size();i++) {   //size => list 안에 들어있는 데이터의 크기(개수)
//			System.out.println(list.get(i));
//		}
//		
//		list.remove(3);
//		
//		for(int i=0;i<list.size();i++) {   //size => 데이터가 들어있는 크기
//			System.out.println(list.get(i));
//		}  // 1 2 3 5
		
		//Stack => LIFO(Last In First Out) : 나중에 입력한 것이 먼저나오는 구조에 사용 
//		Stack st = new Stack();
//		Stack 클래스에서는 push()메소드를 통해 값을 쓰고, pop()이라는 메소드를 통해 값을 읽어온다
		
//		st.push("1");
//		st.push("2");
//		st.push("3");
//		
//		try {
//			System.out.println((String)st.pop());  //3  //pop => 데이터를 꺼내오는 기능, 값을 읽어오면서 Stack에서 데이터를 삭제함
//			System.out.println((String)st.pop());  //2
//			System.out.println((String)st.pop());  //1  
//			System.out.println((String)st.pop());  //error -> EmptyStackException : Stack이 비어있을 때 데이터를 출력하면 생기는 오류
//		}catch(EmptyStackException e) {
//			System.out.println("Stack이 비어있습니다.");
//		}
		
		
//		while(!st.empty()) {  // => Stack이 비어있지 않으면 실행
//			System.out.println((String)st.pop());
//		}
		
//		ArrayList list = new ArrayList();
		
//		list.add("1");  
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
		//Iterator (반복자 패턴)
		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {  //데이터 존재 유무 확인, boolean 타입으로 값이 있으면 실행하고 없으면 실행하지 않음
//			String str = (String)it.next();   //값을 가져오는 역할
//			System.out.println(str);
//		}
		
		//제네릭 : 컬렉션 객체에서 데이터를 받을 때 타입을 통일(한정)시키는 것
		//모든 클래스는 object에 상속되기 때문에 값을 사용하기 위해선 자기 타입으로 강제형변환(캐스팅)해줘야한다.
		//그렇게 되면 요소마다 타입이 어떤 것이지 확인해야하기 때문에 번거롭고
		//그것을 효율적으로 하기위해 제네릭을 통해 타입을 강제해놓고 값을 통일된 타입으로 가져오도록 해준다.
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("1");  
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		list.get(0);  //List에서 0번째 배열에 있는 값을 가져옴
//		
//		Iterator<String> it = list.iterator();
//		
//		while(it.hasNext()) {
//			String str = it.next();   
//			System.out.println(str);
//		}
		
		
		//Set클래스 => 중복값 x, 순서대로 x
//		HashSet set = new HashSet();
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");  //동일한 타입의 중복값은 허용 x
//		set.add("4");
//		set.add(new Integer(1));  //타입이 다르므로 중복값으로 생각하지 않음
//		
//		System.out.println(set);  // 1 1 2 4 값이 순서대로 출력되지 않음
		
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
//		for(int i=0;set.size()<25;i++) {  //i<25로 길이를 설정해두면 중복값은 들어가지않기 때문에 배열에 값이 25개보다 더 적게 들어가게 되므로 size로 설정해준다.
//			set.add((int)(Math.random() * 50) + 1);
//		}
//		
//		//System.out.println(set);
//		
//		ArrayList list = new ArrayList(set);  //ArrayList에 값을 섞어주는 기능이 있음
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
		 
		
		//TreeSet : 값이 정렬되어진다. / 반드시 값으로 사용되는 해당 클래스 안에는 정렬 조건이 오버라이딩 되어있어야 한다.
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
