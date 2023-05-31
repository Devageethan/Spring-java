package contructorinjection;

public class Employee {
private String ename;
private int eid;
private double salary;
private String job;


Employee(String n,int id,double s,String j){
	ename=n;
	eid=id;
	salary=s;
	job=j;
}


@Override
public String toString() {
	return "Employee [ename=" + ename + ", eid=" + eid + ", salary=" + salary + ", job=" + job + "]";
}


}
