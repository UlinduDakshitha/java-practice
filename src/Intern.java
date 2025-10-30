public class Intern extends Developer{
    private String university;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public  double calculate() {
        return getBaseSalary()*0.1;
    }
}
