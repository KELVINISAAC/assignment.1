
public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String adress, String program, int year, double fee) {
        super(name, adress);
    }

    public String getProgram()
    {
        return program;
    }
    public void setProgram(String program)
    {

    }

    public int getYear()
    {return year;}

    public void setYear()
    {

    }
    public double getFee()
    { return fee; }
    public void setFee()
    {

    }

    public String toString()
    {
        String y;
        String f;
        y = Integer.toString(getYear());
        f = Double.toString(getFee());
        return "student[person[name" + getName() + ",adress" + getAdress() + ", program " + getProgram() + ", year " + y + ", fee " + f +"]";

    }



}
