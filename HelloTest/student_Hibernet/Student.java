package student_Hibernet;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
@javax.persistence.Table(name="student")
public class Student {
	@Id
private int sid;
private String sname;
public Student() {
	
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Student(int sid, String sname) {
	super();
	this.sid = sid;
	this.sname = sname;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
}

	
}