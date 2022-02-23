package core.java.allconcept.arrays;

public class SingleDimensional {

	public static void main(String[] args) {
		
		/*int a[]=new int[5];//delclare array with 5 size
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println(a[4]);*/
		
		int a[]= {100,200,300,400,500};//declare array without specifying size
		
		System.out.println("length of aaray is:"+a.length);//print length
		
		/*for(int i=0;i<=a.length;i++ )
		{
			System.out.println(a[i]);//100,200,300,400,500
		}*/
		
		//read value using enhance for loop
		
		for(int i:a) {
			System.out.println(i);//100,200,300,400,500
		}
		
		
		

	}

}
