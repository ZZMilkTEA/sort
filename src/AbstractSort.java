
import java.io.*;

public abstract class AbstractSort {
	private static int[] originalArray;
	protected int[] sortArray;
	private final static int RANGE = 50000;
	File file=new File("result.txt");
//	FileOutputStream fos=new FileOutputStream(file);
	
	public static int inputNumber() {   //��������,ͬʱ�ж��Ƿ�Ϊ����
		InputStream is=System.in;
		int value=0;
		int ch=0;
		try {
			while((ch =is.read()) !='\n') {
				if(ch>=48 && ch <= 57) {
					value =10 * value +ch -48;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static void createArray(int count) {     //���inputNumber����������ָ�����ȵ�����,����Ԫ���������
		originalArray =new int[count];
		for (int i=0;i < originalArray.length;i++) {
			originalArray[i]=(int)(Math.random()*RANGE);
		}
	}
	
	public void initial() {					//����ԭʼ��������ݵ�����������
		sortArray =new int[originalArray.length];
		for (int i=0;i < originalArray.length;i++) {
			sortArray[i]=originalArray[i];
		}
	}
	
	public static void showOriginalArray() {		//���ԭʼ����
		for(int i = 0; i < originalArray.length; i++) {
			System.out.print(originalArray[i]);
			if((i + 1) % 20 == 0) {
				System.out.print("\n");
			}else {
				System.out.print("\t");
			}
		}
	}
	
	public void showArray() {			//����������飬һ��������ִ�й�sort������ʹ��
		for(int i = 0; i < sortArray.length; i++) {
			System.out.print(sortArray[i]);
			if((i + 1) % 20 == 0) {
				System.out.print("\n");
			}else {
				System.out.print("\t");
			}
		}
	}
	
	public abstract void sort();		//�����������򷽷�,���嵽���㷨ʵ��
}
