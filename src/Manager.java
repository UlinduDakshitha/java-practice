public class Manager extends CompanyEmployee {
private int teamSize;


    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void calculate() {
        System.out.println(getBaseSalary()*0.3);
    }
}

