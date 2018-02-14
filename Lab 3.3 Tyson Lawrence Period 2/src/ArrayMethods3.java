import java.util.Arrays;
public class ArrayMethods3 {
    public static void main(String[]args)
    {String[]list= {"cat","apple","bear","love","computer","interstate","Tyson"};
    System.out.println(Arrays.toString(mergeSort(list)));
    	
    }
	
    public static void quickSort(int[]list1,int front, int back)
    {if(back>front)
     {
    	
     }
    	
    }
	
	public static String[] mergeSort(String[]list1)
	{if(list1.length<=1)
	   {return list1;
		
	   }
	 //split array into two halves.
	int lefthalf=list1.length/2;
	int rightHalf=list1.length-lefthalf;
	int end=list1.length-1;
	String[]left=new String[lefthalf];
	String[]right=new String[rightHalf];
	
	for(int n=0;n<=end;n++)
	{if(n<lefthalf)
	  {left[n]=list1[n];
	  }
	else if(n>=lefthalf)
	  {right[n-lefthalf]=list1[n];
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

public static int partition(int[]list1,int front,int back)
{
 
 int x=0;
 int y=list1.length-1;
 while(x!=y)
     { int j=0;
	   int z=0;
       int n=1;
       if (list1[n]<list1[0])
       {j=list1[n];
        list1[n]=list1[x];
        list1[x]=j;
       x++;
       n++;}
       
       if (list1[n]>list1[0])
	  {j=list1[n];
	   list1[n]=list1[y];
	   list1[y]=j;
	   y--;
	   n++;}
       if(list1[n]==list1[0])
      {z++;
       list1[n]=list1[z];	   
       n++;
      }
	 
     }
 return x;
 }


}