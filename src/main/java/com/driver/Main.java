public class Main
{
	class RWOnly
	{
	    private String name;
	    // getter...
	    public String getName() {
		return name;
	    }
	    // setter
	    public void setName(String name){
		this.name = name;
	    }
	}
	public static void main(String[] args) {
	    RWOnly r = new RWOnly();
	   // r.name = "Accio";
	   // o/p:- name has private access in RWOnly
	   // when try to access the above data member we get this error because
	   // here the data memeber is private.....

	   // System.out.println(r.name);
	   // will not be able to print as name field is private and so will not be acceesible....
		
	   // we can access the private data member from another class by using 
	   // getter and setter.....
	   r.setName("Accio");
	   System.out.println(r.getName());
	}
}
