public class Developer extends Manager{
private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public  double calculate() {
         return getBaseSalary()*0.2;
    }
}
