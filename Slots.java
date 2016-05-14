// Represents each Observer that is monitoring changes in the subject
import java.util.*;
public class Slots implements Observer {
	
	private String time_slot;
	
	private String date_slot;
	int i=0;
	
		
	private String name;
	
	private Patient pat;
	
	public Slots(Patient pat)
	{
		
	
		this.pat = pat;
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Patient_Name");
		name = sn.next();
		
		System.out.println("\n");
		i++;
		
		pat.add_patients(this);
		
	}

	public void update(String date,String time) {
		
		this.date_slot = date;
		this.time_slot = time;
		slotAlloted();
		
	}
	
	public void slotAlloted(){
		System.out.println("Doctor's Notified:\n");
		System.out.println("Patient_name: " + name + "\nDate: " + date_slot + "\nTime: " + 
				time_slot +  "\n");
		
	}
	
	public Patient get_details()
	{
		return (this.pat);
		
	}
	
}