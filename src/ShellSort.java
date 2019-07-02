public class ShellSort extends AbstractSort {
	public void sort(){
        if(sortArray == null || sortArray.length <= 1){
            return;
        }
        //��ʼ������
        int gap = 1;
        while (gap * 3 + 1 < sortArray.length) {
            gap = gap * 3 + 1;
        }

        while (gap > 0) {
            for (int i = gap; i < sortArray.length; i++) {
                int tmp = sortArray[i];
                int j = i - gap;
                while (j >= 0 && sortArray[j] > tmp) {  //����ǰ��ǰ�Ƚϵ����Ȼ�׼������λ����λΪ��׼������
                    sortArray[j + gap] = sortArray[j];
                    j -= gap;
                }
                sortArray[j + gap] = tmp;           //����
            }
            gap = (int) Math.floor(gap / 3);
        }
    }
}
