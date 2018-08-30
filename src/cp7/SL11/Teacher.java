package cp7.SL11;

public abstract class Teacher {  // 抽象类
	abstract public void teaching() ; //抽象方法
}

class MathTeacher extends Teacher{

	@Override
	public void teaching() {
		System.out.println("数学课");		
	}
	
}

class EnglishTeacher extends Teacher{

	@Override
	public void teaching() {
		System.out.println("English课");
		
	}
	
}