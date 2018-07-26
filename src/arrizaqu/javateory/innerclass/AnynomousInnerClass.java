package arrizaqu.javateory.innerclass;

import arrizaqu.javateory.immutable.CustomeArray;

public class AnynomousInnerClass {
	CustomeArray ca = new CustomeArray() {
		@Override
		public void example() {
			// TODO Auto-generated method stub
			System.out.println("replace definition other anynomous class");
		}
	};
	
	
	Object obj = new Object() {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "custome object instance";
		}
	};
	
	MyComponent component = new MyComponent() {
		public void coverEnginOn() {
			System.out.println("cover engine 1");
		};
	};
	
	MyComponent component2 = new MyComponent() {
		public void coverEnginOn() {
			System.out.println("cover engine 2");
		};
	}; 
	
	class MyComponent{
		public void coverEnginOn() {
			System.out.println("cover engin ok");
		}
	}
	
	public static void main(String[] args) {
		AnynomousInnerClass aic = new AnynomousInnerClass();
		System.out.println(aic.obj);
		aic.component.coverEnginOn();
		aic.component2.coverEnginOn();
		aic.ca.example();
	}

}
