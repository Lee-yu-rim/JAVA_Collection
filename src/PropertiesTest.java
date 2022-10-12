import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// Properties-> String Ÿ��

		// Properties : k -> String Ÿ�� , v -> String Ÿ��
//		Properties prop = new Properties();
//
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");
//
//		// getProperty() : value �� ��ȯ
//		String value = prop.getProperty("myid");
//		System.out.println(value);
//
//		// propertyNames() : Properties�� �ִ� ��� ���� üũ
//		Enumeration e = prop.propertyNames();
//
//		while (e.hasMoreElements()) { // Properties�� �ִ� ���� �ִ��� üũ
//			String element = (String) e.nextElement(); // e���� ���� ������ //String Ÿ������ �����Ǿ� �ֱ� ������ ���׸��� ������� ����?
//			String value = prop.getProperty(element);
//			System.out.println(value);
//		}
		
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("input.txt"));
		}catch(IOException e) {
			System.out.println("������ ������ �����ϴ�.");
			System.exit(0);    //���α׷� ��������
		}
		
		String name = prop.getProperty("name");   //Hong Kil Dong
		String[] data = prop.getProperty("data").split(",");  
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
//		�̸�
//		max
//		min
//		sum
//		���
		
		for(int i=0;i<data.length;i++) {
			int value = Integer.parseInt(data[i]);  //���ڿ� -> ���� : Integer.parseInt(���ڿ�) / ���� -> ���ڿ� : String.valueOf(����)
			if(i == 0) {
				max = min = value; //min�� max�� 0�� ���� �ʵ��� ��
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
