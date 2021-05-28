package OOPS.Inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        AssistantSystemsEngineer ASE = new AssistantSystemsEngineer();
        SystemsEngineer SE = new SystemsEngineer();
        SeniorSystemsEngineer SSE = new SeniorSystemsEngineer();

        System.out.println("Current Salaries\n----------------" + "\n\tAssistant Systems Engineer : " + ASE.salary + " Rs" + "\n\tSystems Engineer : " + SE.salary + " Rs" + "\n\tSenior Systems Engineer : " + SSE.salary + " Rs");

        ASE.salary += ASE.incerementSalary;
        SE.salary += SE.incerementSalary;
        SSE.salary += SSE.incerementSalary;

        System.out.println("New Salaries\n------------" + "\n\tAssistant Systems Engineer : " + ASE.salary + " Rs" + "\n\tSystems Engineer : " + SE.salary + " Rs" + "\n\tSenior Systems Engineer : " + SSE.salary + " Rs");
    }
}
class updatedSalary{
    float incerementSalary = 10000;
}
class AssistantSystemsEngineer extends updatedSalary{
    float salary = 23000;
}
class SystemsEngineer extends updatedSalary{
    float salary = 43000;
}
class SeniorSystemsEngineer extends updatedSalary{
    float salary = 55000;
}

