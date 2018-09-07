class Teacher{  
	int num;  
	String name; 
	public void setNum(int num){
		this.num=num;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getNum(){
		return this.num;
	}
	public String getName(){
		return this.name;
	}
} 
  
Student(int num,String name){  
	this.num=num;  
	this.name=name;
}

public static void main(String args[]){  
try{  
Teacher E=new Teacher(1018900021,"Hola");  
  
System.out.println("Teacher "+E.name+ " with number "+ E.num+", please give us good grades."); 
  
}catch(Exception e){}  
  
}  