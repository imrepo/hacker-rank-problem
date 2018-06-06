package com.solve.problem;

public class Calculator {

	public int power(int num1, int num2) throws Exception {
		int result =1;
		/*if(num1 <0 && num2 <0) {
			System.out.println(num1 + " " + "and" + num2 + "should be non-negative");
		} else {
			while(num2>0) {
				res = num1 *num1;
			}
		}
		return res;*/

		/*if(num1>=0&&num2==0)
		{
			result=1;
		}
		else if(num1==0&&num2>=1)
		{ 
			result=0;
		}
		else {
			for(int i=1; i<=num2; i++) {
				result = result*num1;

			}
		}
		return result;
	}*/
		if(num1<0 && num2<0){
            throw new Exception("n and p should be non-negative");
       } else if(num1<0 && num2>0) {
          throw new Exception("n and p should be non-negative");
       } else if(num1>0 && num2<0) {
          throw new Exception("n and p should be non-negative");
       } else {
			 for(int i=1; i<=num2; i++) {
				 result = result*num1;
				 
			 }
		 }
		return result;
	}
}

