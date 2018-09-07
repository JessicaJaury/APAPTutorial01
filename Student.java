class Student{  
	int npm;  
	String name; 
	public void setNPM(int npm){
		this.npm=npm;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getNPM(){
		return this.npm;
	}
	public String getName(){
		return this.name;
	}
} 
  
Student(int npm,String name){  
	this.npm=npm;  
	this.name=name;
}

public static void main(String args[]){  
try{  
Student E=new Student(1018900001,"Amit2");  
  
System.out.println(E.npm+" "+E.name); 
  
}catch(Exception e){}  
  
}  