package it.project.classes;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeeNumber(){
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode(){
        return "DSVX" + employee.getName() + employee.getSurname() + "HGYE";
    }

    public void showBadgeDetails(){
        System.out.println("++-------------------------++" + "\n" +
                "Total number of badged employee: " + this.totalNumberOfEmployees + "\n" +
                employee.getEmployeeDetails() + "\n" +
                "Badge ID code : " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedBadge){
        keepTrackOfEmployeeNumber();
        this.employee = employeeThatNeedBadge;
        this.badgeIdCode = this.generateBadgeIdCode();
    }
}
