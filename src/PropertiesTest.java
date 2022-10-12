import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// Properties-> String 타입

		// Properties : k -> String 타입 , v -> String 타입
//		Properties prop = new Properties();
//
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");
//
//		// getProperty() : value 값 반환
//		String value = prop.getProperty("myid");
//		System.out.println(value);
//
//		// propertyNames() : Properties에 있는 모든 값을 체크
//		Enumeration e = prop.propertyNames();
//
//		while (e.hasMoreElements()) { // Properties에 있는 값이 있는지 체크
//			String element = (String) e.nextElement(); // e에서 값을 가져옴 //String 타입으로 강제되어 있기 때문에 제네릭을 사용하지 않음?
//			String value = prop.getProperty(element);
//			System.out.println(value);
//		}
		
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("input.txt"));
		}catch(IOException e) {
			System.out.println("저장한 파일이 없습니다.");
			System.exit(0);    //프로그램 강제종료
		}
		
		String name = prop.getProperty("name");   //Hong Kil Dong
		String[] data = prop.getProperty("data").split(",");  
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
//		이름
//		max
//		min
//		sum
//		평균
		
		for(int i=0;i<data.length;i++) {
			int value = Integer.parseInt(data[i]);  //문자열 -> 숫자 : Integer.parseInt(문자열) / 숫자 -> 문자열 : String.valueOf(숫자)
			if(i == 0) {
				max = min = value; //min과 max가 0이 되지 않도록 함
			}
			
			if(max < value) {
				max = value;
			}else if(min > value) {
				min = value;
			}
			
			sum += value;		
		}
		
//		min = max;
//		
//		for(int i=0;i<data.length;i++) {
//			int value = Integer.parseInt(data[i]); 
//			
//			if(min > value) {
//				min = value;
//			}		
//		}
		
		double avg = (double)sum / data.length;
		
		System.out.println(name);
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
