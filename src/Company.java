public class Company {
    static String companyName="Bublic";
    final int employeeID;
    String employeeName;

    Company(String employeeName, int employeeID){
        this.employeeName=employeeName;
        this.employeeID=employeeID;
    }
    public static void printCompanyName(){
        System.out.println(companyName);
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }


//    static String companyName — общее название для всех сотрудников
//    final int employeeID — уникальный идентификатор (нельзя менять)
//    String employeeName — имя сотрудника Реализуйте конструктор, принимающий employeeID и employeeName,
//    статический метод printCompanyName(), геттеры и сеттеры для employeeName.
//    В main: создайте несколько сотрудников, измените companyName и проверьте, что она изменилась для всех.
//    Попробуйте изменить employeeID — должно быть невозможно.
}
