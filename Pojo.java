/*
Name :- RITU BALA RAI
EMPID:- 844539
DATE:- 07/01/2020
Q3.Pojo Class 
*/


class Pojo{
private int empId;
private String name;

Pojo(){}

public int getempId()
{
return empId;
}

public void setempId(int empId)
{
this.empId= empId;
}

public String getempName()
{
return name;
}

public void setempName(String name)
{
this.name = name;
}
Pojo(int empId, String name)
{
this.empId= 12;
this.name= "Riyea";
}
public static void main(String args[]){
Pojo P=new Pojo();
P.setempId(4);
P.setempName("ABC");
System.out.println("employee Id and Name :" + P.getempId() + " " + P.getempName());
}
}

/* Output:- 
C:\Users\HP\Desktop>java Pojo
employee Id and Name :4 ABC
*/
 