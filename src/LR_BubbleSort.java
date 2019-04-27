public class LR_BubbleSort extends AbstractSort{
	
		public static void sameTime(int numbers[]) { //һ����������ͬʱ�жϣ���������ͬʱ��С�ķ���
			int left=0;
			   int right=numbers.length-1;
			   int minNumber=0;
			   int maxNumber=0;
			   int min=0;
			   int max=0;
			   int a=0;
			   
			   for(;left+1<=right;) {
				   min=left;
				   max=right;
				   minNumber=numbers[left];
				   maxNumber=numbers[right];   //Ϊ��ֹ����ʱ���ҳ���ͻ����׼�������ĸ�����
				   for (int i=left;i<=right;i++) {
					   if(numbers[i]<=minNumber) {min=i;minNumber=numbers[i];}
					   else if(numbers[i]>=maxNumber) {max=i;maxNumber=numbers[i];}
				   }
				   a=numbers[left];numbers[left]=numbers[min];numbers[min]=a;
				   a=numbers[right];numbers[right]=numbers[max];numbers[max]=a;
				   left++;
				   right--;
		}
	}
	
		public static void alternation(int numbers[]) {  //��������С����ͷ�������Ŵ�ķ���
			int left=0;
			   int right=numbers.length-1;
			   int minNumber=0;
			   int maxNumber=0;
			   
			   for(;left+1<=right;) {   
				   for(int i=left;i<=right;i++)
					   if (numbers[i]<=numbers[left]) {minNumber=numbers[left];numbers[left]=numbers[i];numbers[i]=minNumber;}
			   left++;  //������С
				   for(int i=right;i>=left;i--)
					   if (numbers[i]>=numbers[right]) {maxNumber=numbers[right];numbers[right]=numbers[i];numbers[i]=maxNumber;}
			   right--;  //�����Ŵ�
			   }
}
		
		@Override
		public void sort()	{     //�����������������С����ͷ�������Ŵ�ķ���_(:��)��)_����Ϊ�����������СЩ
			int left=0;
			   int right=sortArray.length-1;
			   int minNumber=0;
			   int maxNumber=0;
			   
			   for(;left+1<=right;) {   
				   for(int i=left;i<=right;i++)
					   if (sortArray[i]<=sortArray[left]) {minNumber=sortArray[left];sortArray[left]=sortArray[i];sortArray[i]=minNumber;}
			   left++;  //������С
				   for(int i=right;i>=left;i--)
					   if (sortArray[i]>=sortArray[right]) {maxNumber=sortArray[right];sortArray[right]=sortArray[i];sortArray[i]=maxNumber;}
			   right--;  //�����Ŵ�
			   }
		}
	   public static void main(String[] args) {  //���Բ���
		   int numbers[]=new int[100];
		   
		   
		   for(int i = 0;i<=numbers.length-1;i++) {
			   numbers[i]=(int) (Math.random()*100);
		   }
		   for(int i = 0;i<=numbers.length-1;i++) {
				  System.out.print(numbers[i]+" ");
			   }	
		   System.out.println();
		   System.out.println();

		   alternation(numbers);
		   
		   
		   for(int i = 0;i<=numbers.length-1;i++) {
			  System.out.print(numbers[i]+" ");
		   }	
		   
	}
}

