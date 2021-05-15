package Enterprise;

public class Employee {
    private String empName;
    private int empId;
    private String position;
    private double appraisalScore;
    private int experience;
    private int grade;

    public Employee(String empName, int empId, double appraisalScore, int experience, int grade){
        this.empName = empName;
        this.empId = empId;
        this.appraisalScore = appraisalScore;
        this.experience = experience;
        this.grade = grade;
        this.position = setPosition(grade);
    }

    public String getEmpName() {
        return this.empName;
    }

    public int getEmpId() {
        return this.empId;
    }

    public String getPosition() {
        return this.position;
    }

    public double getAppraisalScore() {
        return this.appraisalScore;
    }

    public void setAppraisalScore(double appraisalScore) {
        this.appraisalScore = appraisalScore;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
        this.position = setPosition(grade);
    }

    public static String setPosition(int grade){
        String pos;
        switch(grade){
            case 5:
                pos = "Junior Software Analyst";
                break;
            case 4:
                pos = "Senior Software Analyst";
                break;
            case 3:
                pos = "Assistant Systems Engineer";
                break;
            case 2:
                pos = "Systems Engineer";
                break;
            case 1:
                pos = "Senior Systems Engineer";
                break;
            default:
                pos = "Invalid grade!";
        }
        return pos;
    }
    
}
