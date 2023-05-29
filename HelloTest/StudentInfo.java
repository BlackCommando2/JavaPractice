
public class StudentInfo {
		private String name;
		private int age;
		private String branch;
		private int sem;
		
		StudentInfo(String Name,int Age,String Branch,int Sem)
		{
			name = Name;
			age = Age;
			branch = Branch;
			sem = Sem;
		}
		
		public String getName() 
		{
			return name;
		}

		public void setName(String newName) 
		{
			this.name = newName;
		}
		  
		public String getAge()
		{
			return name;
		}
		
		public void setAge(int newAge) 
		{
			this.age = newAge;
		}
}