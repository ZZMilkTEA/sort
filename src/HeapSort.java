public class HeapSort extends AbstractSort {
	private int[] array;
	private int g_n;
	
	public HeapSort(){		//���캯�� 
		
		}
	
	public void shift_up(int i) {        //�ϸ�����
		while(i/2>=1) {
			if(array[i]<=array[i/2]) {
				int b=array[i];
				array[i]=array[i/2];
				array[i/2]=b;
				i=i/2;
			}
			else break;
		} 
	}

	public void shift_down(int i) {   //�³�����
		while(i*2<=g_n) {
			int T=i*2;
			if(T+1<=g_n&&array[T+1]<array[T]) T++;
			if(array[i]>array[T])
			{
				int b=array[i];
				array[i]=array[T];
				array[T]=b;
				i=T;
			}
			else break;
		} 
}
	
	public void push(int x) {
		int m=g_n++;
		array[m]=x;
		shift_up(m);
	}
	
	public void pop() {     //�������������������ҵ���ⶥ������Ӧ����ʧ�����������ǳ����ˣ�
		int b=array[1];
		array[1]=array[g_n];
		array[g_n]=b;
		g_n--;
		shift_down(1);	
	}
	
	public int top() {     //���ضѶ�����
		return array[1];
		}
	
	@Override
	public void sort() {  //�������������Ҫһ���µ������Ž����
		array=new int[sortArray.length+1];
		g_n=array.length-1;
		
		for (int i=g_n;i>=1;i--) {
			this.array[i]=sortArray[i-1];
			shift_down(i);
		}
		for(int k=0;k <= sortArray.length-1;k++){
					sortArray[ k ] = top();
					pop();
				}
	}	
	
	
	public static void main(String[] args) {   //���Բ���
		int numbers[]=new int[20];
		   
		   
		   for(int i = 1;i<=numbers.length-1;i++) {    //�����������
			   numbers[i]=(int) (Math.random()*10);
		   }
		   
		   System.out.print("�������ݣ�");
		   for(int i = 1;i<=numbers.length-1;i++) {
			   System.out.print(numbers[i]+" ");
		   }
		   System.out.println();
		   
		   HeapSort a=new HeapSort();
		   
		   for(int i = 1;i<=numbers.length-1;i++) {
			   System.out.print(a.array[i]+" ");
		   }
		   System.out.println();
		   
		   int c[]=new int[20];
		   
		   System.out.print("������:");
		   for(int i = 1;i<=numbers.length-1;i++) {
			   System.out.print(c[i]+" ");
		   }
	}
}
