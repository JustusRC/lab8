public class cs123 {

	public static void main(String[] args) {
		//Variable Declaration 
		int[][] element = {
				{ 80, 90, 85, 55 },
				{ 75, 85, 80, 60 },
				{ 90, 95, 90, 60 },
		                 };
		
		int row = 0, column = 0 ;
		
	
	     
	     //For loop to see which number is the largest in row 2
		 for (int i=1; i<2; i++) 
		 {
	            for (int j=0; j<4; j++) 
	            {
	                if (element[i][j] > row)
	                {
	                    row = element[i][j];
	                }
	            }
	        }
		//For loop to see which number is the largest in column 3
        for (int i=0; i<3; i++) 
            {
                   for (int j=2; j<3; j++) 
                   {
                if (element[i][j] > column)
                {
                	column = element[i][j];
                }
            }
        }
	  
        System.out.println("The larest element at second row is: " + row);
        System.out.println("The larest element at third column is: " + column);
		
		
		
	}

}
