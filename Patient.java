import java.util.*;


public class Patient implements Doctor{
	
	private ArrayList<Observer> observers;
	
	Iterator<Observer> itr ;
	
	private String time;
	
	private String date;

	
	
	String timings[][]={{"14-05-2016","5:00-6:00","0"},{"15-05-2016","6:00-7:00","0"},{"16-05-2016","7:00-8:00","0"},{"17-05-2016","10:00-11:00","0"},{"18-05-2016","1:00-2:00","0"}};
    
	
	
	public Patient()
	{
		
		observers = new ArrayList<Observer>();
	}
	
	//Available slots printed
	@Override
	public void available_slots() {
		System.out.println("Available Slots:");
		
		for(int i=0;i<5;i++)
		{
			if(timings[i][2]!="1")
			{
			System.out.println("Slot_Number: "+ (i+1));
			
			for(int j=0;j<2;j++)
			{
				System.out.println(timings[i][j]);
			}
			}
		}
		
	}

	
	
	public void add_patients(Observer newObserver) {
		
		observers.add(newObserver);
		itr = observers.iterator();
		
	}


	public void next_patient() {
		
		
		if(itr.hasNext())
		{
		 System.out.println(itr);
		}
		
	}//p.set_slot("10-02-2015", "10:00-11:00");
	
	public void set_slot(){
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the Date to visit");
		date=sn.next();
		System.out.println("Enter the Time to visit");
		time=sn.next();
		System.out.println("\n");
		int flag=0;
		for(int i=0;i<5;i++)
		{
		
		if(timings[i][0].equals(date) && timings[i][1].equals(time) && timings[i][2].equals("0"))
		{
		timings[i][2]="1";
		System.out.println("Appointed For Slot Number: "+(i+1)+"\n");
		flag=1;
		break;
		}
		}
		if(flag==0){
			System.out.println("Appointment Not Possible");
		}
		notify_doctor();
		
		for(Observer observer : observers){
			
			observer.update(date,time);
		}
		
		
	}
		
		public void notify_doctor()
		{
			System.out.println("Remaining Slots available: \n");
			for(int i=0;i<5;i++)
			{
				if(timings[i][2]!="1")
				{
					System.out.println("Slot Number: "+ (i+1));
				for(int j=0;j<2;j++)
				{
					System.out.println(timings[i][j]);
				    }
				System.out.println("\n");
				}
			}
		}
}