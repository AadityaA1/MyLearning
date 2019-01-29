package encapsule.learn;

public class TestEncapsulation {

	public static void main(String[] args){
		Encapsulation encap = new Encapsulation();
		encap.setAge(10);
		encap.setRollNumber(1701);
		encap.setDepartment("Textile");
		Encapsulation.setCollegeName("PSG");
		
		System.out.println(encap.getAge()+
		encap.getDepartment()+
		encap.getRollNumber()+Encapsulation.getCollegeName());
		
		
	}
}
