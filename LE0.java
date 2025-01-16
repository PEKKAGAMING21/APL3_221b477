class Changes
{
    int x;
    String n;
    void set_age(int age){
        this.x= age;
    }
    
    public int get_age(){
        return x;
    }
    
    void set_name(String name){
        this.n = name;
    }
        
        public String get_name(){
            return n;
        }
    }

public class JUET{
    	public static void main(String[] args) {
		Changes obj1 = new Changes();
		obj1.set_age(15);
		System.out.println(obj1.get_age());
		obj1.set_name("kappa");
		System.out.println(obj1.get_name());
	}
}
