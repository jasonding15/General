package compareToPractice;

public class Student implements Comparable<Student>
{
    private String firstName, lastName;
    private double gpa;
    
    public Student(String firstName, String lastName, double gpa)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    public String toString()
    {
        return lastName + ", " + firstName + ": " + gpa;
    }
    
    /*
     * Students are ordered by GPA (highest comes first)
     * followed by last name followed by first name (alphabetically)
     */
    public int compareTo(Student other)
    {
//    		if (this.gpa > other.gpa)
//        		return -1;
//        	else if (this.gpa < other.gpa)
//        		return 1;
//        	else
//        	{
//        		if (this.lastName.compareTo(other.lastName) < 0)
//        			return -1;
//        		else if (this.lastName.compareTo(other.lastName) > 0)
//        			return 1;
//        		else
//        		{
//        			if (this.firstName.compareTo(other.firstName) < 0)
//        				return -1;
//        			else if (this.firstName.compareTo(other.firstName) > 0)
//        				return 1;
//        			else
//        				return 0;
//        		}
//        	}
    		if ( this.gpa != other.gpa)
    			return (new Double(other.gpa).compareTo(new Double(this.gpa)));
    		if(this.lastName.equals(other.lastName))
    			return this.lastName.compareTo(other.lastName);
    		return this.firstName.compareTo(other.firstName);
    }
}
