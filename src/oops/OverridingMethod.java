package oops;

public class OverridingMethod {
	public static void main(String[] args) {

		ParentClass p = new ParentClass();
		p.methodToOverride();

		System.out.println("**********DerivedClass derivedObj = new DerivedClass()****************");
		DerivedClass derivedObj = new DerivedClass();
		derivedObj.methodToOverride();

		System.out.println("***********ParentClass derivedClass = new DerivedClass()********");
		ParentClass derivedClass = new DerivedClass();
		derivedClass.methodToOverride();

		// DerivedClass obParent=new ParentClass();

	}

}
