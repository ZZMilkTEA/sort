//有bug

public class ShellSort extends AbstractSort {
	public void sort(){
        if(sortArray == null || sortArray.length <= 1){
            return;
        }
        //增量
        int incrementNum = sortArray.length/2;
        while(incrementNum >= 1){
            for(int i = 0;i < sortArray.length; i++){
                //进行插入排序
                for(int j = i; j < sortArray.length - incrementNum; j = j + incrementNum){
                    if(sortArray[j]>sortArray[j + incrementNum]){
                        int temple = sortArray[j];
                        sortArray[j] = sortArray[j + incrementNum];
                        sortArray[j + incrementNum] = temple;
                    }
                }
            }
            //设置新的增量
            incrementNum = incrementNum / 2;
        }
    }
}
