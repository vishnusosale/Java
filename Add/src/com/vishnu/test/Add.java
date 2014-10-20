package com.vishnu.test;

public class Add {
	
	int a, b;
	Add(int i, int j)
	{
		a=i;
		b=j;
	}
	int add(Add a1){
		int sum = a1.a+ a1.b;
		return sum;
		
	}

}
