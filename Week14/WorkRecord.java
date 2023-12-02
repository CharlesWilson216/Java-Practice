public class WorkRecord {
    
    public String name; // public instance variables for WorkRecord
    public int hours;
 
   // Construct a WorkRecord for the specified name, with initial hours 0.
   public WorkRecord(String name)  // the constructor – code it!
   {
	   this.name = name;
	   this.hours = 0;
   }

   // Return the number of hours in this WorkRecord.
   public int getHours()
   {
 	return this.hours;

   }

   // Update the number of hours when moreHours additional hours are worked.
   public void addHours(int moreHours)  // an instance method – code it!
   {
 	this.hours = this.hours + moreHours;

   }

   // Return a String in the form like the example:     Andy: 15 hours
   @Override
   public String toString()  // the overridden toString method – code it!
   {
 	return name + ": " + hours + " hours";

   }
   
}
