package mcm.edu.ph.gamao_wagecalculator.Model;

public class getter_and_setters {
    int clickX;
    int type;
    int formulas;
    int overtimewage = 0;
    int hoursworked;
    int overtimehours = 0;
    int totalwage;
    int wage;
    int regularWage = 800;
    String name;
    int Hours ;




    public getter_and_setters(){}

    public int gettype() { return type; }
    public void settype(int type) { this.type = type; }
    public int getwage() {
        return wage;
    }
    public void setwage(int wage) { this.wage = wage; }

    public int gettotalwage() {
        return totalwage;
    }
    public void settotalwage(int totalwage) { this.totalwage = totalwage; }
    public int getovertimehours() {
        return overtimehours;
    }
    public void setovertimehours(int overtimehours) { this.overtimehours = overtimehours; }
    public int getovertimewage() {
        return overtimewage;
    }
    public void setovertimewage(int overtimewage) { this.overtimewage = overtimewage; }
    public int gethoursworked() {
        return hoursworked;
    }
    public void sethoursworked(int hoursworked) { this.hoursworked = hoursworked; }
    public String getname() {
        return name;
    }
    public void setname(String name) { this.name = name; }
    public int regularWage() {
        return regularWage;
    }
    public void setregularWage(int regularWage) { this.regularWage = regularWage; }
    public int getHours() {
        return Hours;
    }
    public void setHours(int Hours) { this.Hours = Hours; }

}


