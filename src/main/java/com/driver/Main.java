public class Main
{
	public static void main(String[] args) {
	    RWOnly r = new RWOnly();
	   // r.name = "Accio";
	   // o/p:- name has private access in RWOnly
	   // when try to access the above data member we get this error because
	   // here the data memeber is private.....
	   
	   // we can access the private data member from another class by using 
	   // getter and setter.....
	   r.setName("Accio");
	   System.out.println(r.getName());
	}
}
