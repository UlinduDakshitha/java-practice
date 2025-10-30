public class Manager extends CompanyEmployee {
private int teamSize;


    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public  double calculate() {
         return getBaseSalary()*0.3;
    }
}

