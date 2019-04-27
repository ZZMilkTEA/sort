
public class BinarySort extends AbstractSort {

	 public void sort(){  

	        for(int i=1; i<sortArray.length; i++){  
	            int tmp = sortArray[i];     
	            int low = 0;  
	            int high = i-1;  

	            // 不断折半，寻找合适的插入位置  
	            while(low <= high){  
	                int mid = (low + high) / 2;  

	                if(tmp>sortArray[mid]){  
	                    low = mid + 1;  
	                }else{  
	                    high = mid - 1;  
	                }  
	            }  

	            // 依次将元素后移  
	            for(int j=i; j>low ; j--){  
	            	sortArray[j] = sortArray[j-1];  
	            }  

	            sortArray[low] = tmp;    
	        }
	}
}
