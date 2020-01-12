/*
Name :- RITU BALA RAI
EMPID:- 844539
DATE:- 07/01/2020
Q1. CREATE 5 OBJECTS AND PRINT THEIR DETAILS 
*/


import java.util.Scanner;
class A{
int empId;
String empName;

         
public  void GetDetails(){
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter Employee Id and Name ");
 empId= Integer.parseInt(sc.nextLine());
 empName= sc.nextLine();
}

public void PutData()
{int i;
System.out.println("  Id : " +empId + " name :" + empName);  
}
 public static void main(String args[]){
         A[] a= new A[5];
         int i;
         for(i=0;i<5;i++)
         {
         
         a[i] = new A();
   
         }
          for(i=0;i<5;i++)
         {
         
         a[i].GetDetails();
   
         }
         for(i=0;i<5;i++)
         {
         System.out.println(" Employee Id : " +(i+1));
         a[i].PutData();
   
         }
         
         }
}


/* OUTPUT:- 


C:\Users\HP\Desktop>java A

Enter Employee Id and Name
101
Ritu
Enter Employee Id and Name
102
Sneha
Enter Employee Id and Name
103
Aarti
Enter Employee Id and Name
104
Aman
Enter Employee Id and Name
105
Abhishek
 Employee Id : 1
  Id : 101 name :Ritu
 Employee Id : 2
  Id : 102 name :Sneha
 Employee Id : 3
  Id : 103 name :Aarti
 Employee Id : 4
  Id : 104 name :Aman
 Employee Id : 5
  Id : 105 name :Joey
*/


























































































