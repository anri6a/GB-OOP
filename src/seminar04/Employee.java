package seminar04;

public class Employee {
    private String fio;
    private int salary;
    private String jobTitle;

    public Employee() {
    }

    public Employee(String fio, int salary, String jobTitle) {
        this.fio = fio;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
