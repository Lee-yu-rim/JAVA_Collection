import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		//Map -> Object 타입
		
		//put() => 데이터 입력 메소드
		HashMap<String,String> map = new HashMap<String,String>();  //제네릭 -> key,value 둘다 정의해야함
		map.put("myid","1234");
		map.put("asdf","1111");
		map.put("asdf","1234");
		
		
		//keySet() : 키값 전체를 반환한다.
		Set<String> keys = map.keySet(); //keySet메소드에 마우스 커서를 대보면 타입이 Set으로 정의되어 있으므로 변수에 대입할때 변수의 타입을 Set으로 맞춰줘야한다.
		Iterator<String> it = keys.iterator();  //iterator도 위와 동일함
		//iterator를 사용하는 이유는 collection에 들어있는 값들을 읽어오기 위함 / 값을 사용하기 위한 방식
		
		while(it.hasNext()) {  //it에 값이 있으면(hasNext) 반복문을 실행한다. it가 배열이라고 생각하면 됨
			String key = it.next();  //it에 있는 문자열을 반환하여 key라는 변수에 대입
			System.out.println(key);
		}//hasNext()와 next()는 iterator에 있는 요소(값)을 가져오는 역할을 한다. hasNext()는 boolean타입, next()는 iterator에 정의된 타입으로 반환됨
		
		System.out.println("============");
		
		//향상된 for문을 이용한 값 출력
		for(String key : map.keySet()) {  //map에 있는 key의 값을 하나씩 가져와서 String타입의 key라는 변수에 집어넣는다. 
			System.out.println(key);
		}
		
		System.out.println("============");
		
		//value() : value 전체를 반환한다.
		Collection<String> values = map.values(); //keySet과 동일하게 values에 커서를 대보면 타입이 Collection으로 정의되어있으므로 values라는 변수의 타입을 동일하게 정의해줌
		Iterator<String> itV = values.iterator();
		
		while(itV.hasNext()) {
			String value = itV.next();
			System.out.println(value);
		}
		
		System.out.println("============");
		
		//entrySet() : key와 value의 값을 한꺼번에 반환한다.
		Set<Map.Entry<String, String>> entry = map.entrySet();  
		Iterator<Map.Entry<String, String>> itE = entry.iterator();
		
		while(itE.hasNext()) {
			Map.Entry<String, String> ent = itE.next();
			String key = ent.getKey();    //getKey() = key에 있는 값을 차례로 읽어옴
			String value = ent.getValue();  //getValue() = value에 있는 값을 차례로 읽어옴
			
			System.out.println("[key]:" + key + ", [value]:" + value);
		}
		
		System.out.println("============");
		
		//향상된 for문을 이용한 값 출력
		for(Map.Entry<String, String> ent : map.entrySet()) {
			String key = ent.getKey();    
			String value = ent.getValue(); 
			System.out.println("[key]:" + key + ", [value]:" + value);
		}
	
		
		//System.out.println(map);   // => {myid=1234, asdf=1234} : key값이 중복일 때 value에 마지막 값만 들어감
		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("아이디 입력 : ");
//			String id = sc.next();
//			
//			System.out.println("비밀번호 입력 : ");
//			String password = sc.next();
//			
		 	//데이터 읽어오는 메소드
//			//get(key) -> value 값 반환
//			//get("myid") -> "1234"
//			//containsKey(key) -> key 값의 존재 유무 확인(true or false 반환)
//			
//			if(!map.containsKey(id)) {  //map안에 내가 입력한 id값이 없다면
//				System.out.println("아이디가 존재하지 않습니다. 다시 입력 : ");
//				continue;
//			}else {
//				if(!map.get(id).equals(password)) {    //get(id)를 통해 내가 입력한 id값으로 value값을 반환하고 이 value값과 내가 입력한 password의 값이 동일한지 확인  
//					System.out.println("비밀번호가 존재하지 않습니다. 다시 입력 : ");	
//				}else {
//					System.out.println("로그인 성공");
//					break;
//				}
//			}
//		}//while end
		
		
		//데이터 값 삭제
//		map.remove("myid");
//		System.out.println(map);
		
		
		
		
		
		
		


	}//main end

}
