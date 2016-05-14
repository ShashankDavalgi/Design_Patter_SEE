public class Appointment
{
public static void main (String[]args) throws Exception
{
	Patient p = new Patient();
	
	Slots patient1 = new Slots(p);
	p.available_slots(); //calls available_slots in Patient
	p.set_slot();//Patient Selecting the date and time slot
	
	Slots patient2 = new Slots(p);
	p.available_slots();
	p.set_slot();
	
	
}
}