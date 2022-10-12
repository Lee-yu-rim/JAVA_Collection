import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		//Map -> Object Ÿ��
		
		//put() => ������ �Է� �޼ҵ�
		HashMap<String,String> map = new HashMap<String,String>();  //���׸� -> key,value �Ѵ� �����ؾ���
		map.put("myid","1234");
		map.put("asdf","1111");
		map.put("asdf","1234");
		
		
		//keySet() : Ű�� ��ü�� ��ȯ�Ѵ�.
		Set<String> keys = map.keySet(); //keySet�޼ҵ忡 ���콺 Ŀ���� �뺸�� Ÿ���� Set���� ���ǵǾ� �����Ƿ� ������ �����Ҷ� ������ Ÿ���� Set���� ��������Ѵ�.
		Iterator<String> it = keys.iterator();  //iterator�� ���� ������
		//iterator�� ����ϴ� ������ collection�� ����ִ� ������ �о���� ���� / ���� ����ϱ� ���� ���
		
		while(it.hasNext()) {  //it�� ���� ������(hasNext) �ݺ����� �����Ѵ�. it�� �迭�̶�� �����ϸ� ��
			String key = it.next();  //it�� �ִ� ���ڿ��� ��ȯ�Ͽ� key��� ������ ����
			System.out.println(key);
		}//hasNext()�� next()�� iterator�� �ִ� ���(��)�� �������� ������ �Ѵ�. hasNext()�� booleanŸ��, next()�� iterator�� ���ǵ� Ÿ������ ��ȯ��
		
		System.out.println("============");
		
		//���� for���� �̿��� �� ���
		for(String key : map.keySet()) {  //map�� �ִ� key�� ���� �ϳ��� �����ͼ� StringŸ���� key��� ������ ����ִ´�. 
			System.out.println(key);
		}
		
		System.out.println("============");
		
		//value() : value ��ü�� ��ȯ�Ѵ�.
		Collection<String> values = map.values(); //keySet�� �����ϰ� values�� Ŀ���� �뺸�� Ÿ���� Collection���� ���ǵǾ������Ƿ� values��� ������ Ÿ���� �����ϰ� ��������
		Iterator<String> itV = values.iterator();
		
		while(itV.hasNext()) {
			String value = itV.next();
			System.out.println(value);
		}
		
		System.out.println("============");
		
		//entrySet() : key�� value�� ���� �Ѳ����� ��ȯ�Ѵ�.
		Set<Map.Entry<String, String>> entry = map.entrySet();  
		Iterator<Map.Entry<String, String>> itE = entry.iterator();
		
		while(itE.hasNext()) {
			Map.Entry<String, String> ent = itE.next();
			String key = ent.getKey();    //getKey() = key�� �ִ� ���� ���ʷ� �о��
			String value = ent.getValue();  //getValue() = value�� �ִ� ���� ���ʷ� �о��
			
			System.out.println("[key]:" + key + ", [value]:" + value);
		}
		
		System.out.println("============");
		
		//���� for���� �̿��� �� ���
		for(Map.Entry<String, String> ent : map.entrySet()) {
			String key = ent.getKey();    
			String value = ent.getValue(); 
			System.out.println("[key]:" + key + ", [value]:" + value);
		}
	
		
		//System.out.println(map);   // => {myid=1234, asdf=1234} : key���� �ߺ��� �� value�� ������ ���� ��
		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("���̵� �Է� : ");
//			String id = sc.next();
//			
//			System.out.println("��й�ȣ �Է� : ");
//			String password = sc.next();
//			
		 	//������ �о���� �޼ҵ�
//			//get(key) -> value �� ��ȯ
//			//get("myid") -> "1234"
//			//containsKey(key) -> key ���� ���� ���� Ȯ��(true or false ��ȯ)
//			
//			if(!map.containsKey(id)) {  //map�ȿ� ���� �Է��� id���� ���ٸ�
//				System.out.println("���̵� �������� �ʽ��ϴ�. �ٽ� �Է� : ");
//				continue;
//			}else {
//				if(!map.get(id).equals(password)) {    //get(id)�� ���� ���� �Է��� id������ value���� ��ȯ�ϰ� �� value���� ���� �Է��� password�� ���� �������� Ȯ��  
//					System.out.println("��й�ȣ�� �������� �ʽ��ϴ�. �ٽ� �Է� : ");	
//				}else {
//					System.out.println("�α��� ����");
//					break;
//				}
//			}
//		}//while end
		
		
		//������ �� ����
//		map.remove("myid");
//		System.out.println(map);
		
		
		
		
		
		
		


	}//main end

}
