public class SelectionSort extends AbstractSort {
	public void sort() {
		for(int i = 0; i <sortArray.length - 1; i++) {// ����i������
            int k = i;
            for(int j = k + 1; j < sortArray.length; j++){// ѡ��С�ļ�¼
                if(sortArray[j] < sortArray[k]){ 
                    k = j; //����Ŀǰ�ҵ�����Сֵ���ڵ�λ��
                }
            }
            //���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���
            if(i != k){  //����a[i]��a[k]
                int temp = sortArray[i];
                sortArray[i] = sortArray[k];
                sortArray[k] = temp;
            }    
        }
	}
}

