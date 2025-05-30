class Cat 
{
	// 생성자는 클래스명과 반드시 일치해야 하고, 반환형을 두어서는 안 됨
	// 생성자는 new로 호출 가능. 생성자의 목적은 해당 객체가 클래스로부터 생성될 때, 다른 특성을 가진 객체를 생성할 수 있게 하는 것
	//public Cat(){
	//	System.out.println("Cat() 호출");
	//}
	
	// 생성자를 정의하지 않으면, 컴파일러에 의해 아래와 같이 아무런 코드가 들어있지 않은 디폴트 생성자가 정의됨 (단 super 제외)
	// 자바에서는 인스턴스 생성 시 new 연산자 뒤에 강제하고 있기 때문에, 디폴트 생성자가 없다면 없는 생성자 호출에 의해 인스턴스 생상 과정에서 많은 컴파일러가 발생할 수 있음
	// public cat(){
	//
	// }
	
	/* 이런 식으로 아무런 생성자가 없어도 컴파일 에러 X */

	// 생성자도 메서드이므로, 메서드 오버로딩의 원칙이 적용됨
	public Cat(){
		
	}
	public Cat(int age){
		
	}
}
