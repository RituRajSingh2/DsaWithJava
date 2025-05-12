// to pass the value of number when calling the method in main
//this is done by passing parameter in  function like string []args in main
// function
 package com.Functions;
public class Pass_Value {
    public static void main(String[] args) {
int ans=Abc(20,12);
//above line will give you error if not pass parameter
        System.out.println(ans);
    }
    static int Abc(int a,int b){
        int product=a*b;
        return product;
    }
}
/*
for(i=0;i<=n;i++){
//body or print this as long as above loop is running
}
 */