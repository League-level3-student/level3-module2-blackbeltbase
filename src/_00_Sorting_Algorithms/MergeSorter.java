package _00_Sorting_Algorithms;

public class MergeSorter extends Sorter {
	public MergeSorter() {
		type = "Merge";
	}
	
	//0. Since this sorting algorithm uses recursion, 
	//   we'll make a helper method called mergeSort.
	//   Complete the steps in the mergeSort method.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		//20. call the mergeSort method with 0 and the length of the array minus one
		mergeSort(array,0,array.length-1,display);
	}
	
	private void mergeSort(int[] array, int low, int high, SortingVisualizer display) {
		//1. Create a temporary integer array that is the same length as the passed in array.
		int[] temporary = new int[array.length];
		//2. make an if statement that checks if low is less than high
		//   and put the rest of the method inside of it
if(low<high) {
	

			//3. Create an integer called middle and set it 
			//   equal to the half way point between low and high
            int middle = (int) (low+high)/2;
            display.updateDisplay();
            //4. call the mergeSort method with low and middle
           mergeSort(array,low,middle,display);
           display.updateDisplay();
            //5. call the mergeSort method with middle + 1 and high
            mergeSort(array,middle+1,high,display);
            display.updateDisplay();
            //6. copy the elements from the array into the temporary array,
            //   but only the elements from low to high inclusive
            for (int i = low; i <= high; i++) {
				temporary[i] = array[i];
				display.updateDisplay();
			}
            int i = low;
            int j = middle+1;
            int k = low;
            //7. create three integers called i, j, and k and
            //   set them equal to low, middle + 1, and low respectively
            
            //8. while i is less than or equal to middle
            //   and j is less than or equal to high
	    // (ends after step 16)
            while(i<=middle && j<=high) {
            	if(temporary[i]<=temporary[j]) {
            		array[k] = temporary[i];
            		i+=1;
            	}
            	else {
            		array[k] = temporary[j];
            		j+=1;
            	}
            	k+=1;
            	display.updateDisplay();
            }
            	//9. if temp array at i is less than or equal 
            	//   to temp array at j	
                
                    //10. set array at k equal to temp array at i
                    
                    //11. increase i by 1
                  
                //13. else (ends after step 15)
            
                    //14. set array at k equal to temp array at j
                   
                    //15. increase j by 1
                 
                //16. increase k by 1
                
            
            //17. make a while loop that runs while i is less than or equal to middle
            while(i<=middle) {
            	array[k] = temporary[i];
            	k+=1;
            	i+=1;
            	display.updateDisplay();
            }
            	//18. set array at k equal to temp array at i
                
                //19. increase k and i by 1
               
}     
        
	}

}
