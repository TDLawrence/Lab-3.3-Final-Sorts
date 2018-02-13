
public class ArrayMethods3 {

	public static String[] mergeSort(String[]list1)
	{if(list1.length<=1)
	   {return list1;
		
	   }
	 //split array into two halves.
	int half=list1.length/2;
	int end=list1.length;
	String[]left=new String[half];
	String[]right=new String[half];
	for(int n=0;n<end;n++)
	{if(n<half)
	  {list1[n]=left[n];
	  }
	else if(n>=half)
	  {list1[n]=right[end-half];
	  }
	}
	
	return(merge(mergeSort(left),mergeSort(right)));
	}


public static String[] merge(String[]list1,String[]list2)
{String[]merged=new String[list1.length+list2.length];
  int l=0;
   int r=0;
  for(int n=0;n<merged.length;n++)
  {
   
      if((l<list1.length)&&(r<list2.length)&&(list1[l].compareTo(list2[r])<0))
    	{merged[n]=list1[l];
         l++;}
      
      else if((l<list1.length)&&(r<list2.length)&&(list1[l].compareTo(list2[r])>0))
      {merged[n]=list2[r];  
       r++;
      }
	  
      
      else if((l<list1.length)&&(r<list2.length)&&(list1[l].compareTo(list2[r])==0))
      {merged[n]=list2[r]; 
       merged[n+1]=list1[l];
       r++;
       l++;
       n++;
      }
	  
      
      else if((l>=list1.length)&&(r<list2.length))
	     {merged[n]=list2[r];
		   r++;
	     }
	   
      else if((r>=list2.length)&&(l<list1.length))
       {merged[n]=list1[l];
       l++;}
       
	  
  }
  return merged;
}
}