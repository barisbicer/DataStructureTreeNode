
public class testReducebyOne {

	int[] list= {1,4,5,6,7,8,9};
	
	public void reduceByOne(int a){
		
		if(a>=0)
	 	 {
			reduceByOne(a-1);
			//System.out.println("inside"+a);
	 	 }
	   System.out.println("Completed:"+a);
	}
	
	
	public void recursiveLinearSearch(int findit,int order) throws  ArrayIndexOutOfBoundsException{
		
		if(list[order]!=findit && list.length >= order)
		{
			recursiveLinearSearch(findit,order+1);
		}else
	   	  System.out.println("find it:"+order);
	
		
		
	}

	
	public static void main(String[] args) {
		
		testReducebyOne a=new testReducebyOne();
		
	    a.reduceByOne(10);
	    try
	    {
	    a.recursiveLinearSearch(11,0);
	    }catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No found:"+e);
		}
}
}

