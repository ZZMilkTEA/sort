//��bug

public class ShellSort extends AbstractSort {
	public void sort(){
        if(sortArray == null || sortArray.length <= 1){
            return;
        }
        //����
        int incrementNum = sortArray.length/2;
        while(incrementNum >= 1){
            for(int i = 0;i < sortArray.length; i++){
                //���в�������
                for(int j = i; j < sortArray.length - incrementNum; j = j + incrementNum){
                    if(sortArray[j]>sortArray[j + incrementNum]){
                        int temple = sortArray[j];
                        sortArray[j] = sortArray[j + incrementNum];
                        sortArray[j + incrementNum] = temple;
                    }
                }
            }
            //�����µ�����
            incrementNum = incrementNum / 2;
        }
    }
}
