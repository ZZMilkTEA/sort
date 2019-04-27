
public class BinarySort extends AbstractSort {

	 public void sort(){  

	        for(int i=1; i<sortArray.length; i++){  
	            int tmp = sortArray[i];     
	            int low = 0;  
	            int high = i-1;  

	            // �����۰룬Ѱ�Һ��ʵĲ���λ��  
	            while(low <= high){  
	                int mid = (low + high) / 2;  

	                if(tmp>sortArray[mid]){  
	                    low = mid + 1;  
	                }else{  
	                    high = mid - 1;  
	                }  
	            }  

	            // ���ν�Ԫ�غ���  
	            for(int j=i; j>low ; j--){  
	            	sortArray[j] = sortArray[j-1];  
	            }  

	            sortArray[low] = tmp;    
	        }
	}
}
