public class Main {
    public static void main(String[] args) {
        // 1 Компани.
        Company company1 = new Company("Petya");
        Company.printCompanyName();
        System.out.println(company1.employeeID + " " + company1.employeeName);
        company1.printCompanyName();
        Company company2 = new Company("Petya");
        company2.printCompanyName();
        System.out.println(company2.employeeID + " " + company2.employeeName);
        Company.companyName = "Baranka";
        company1.printCompanyName();
        company2.printCompanyName();
        System.out.println(company1.employeeID);
        System.out.println(company2.employeeID);
        System.out.println(Company.employeeID);
        // 2 MathConstants
        MathConstants.calculateCircleArea(5.0);
        MathConstants.calculateCircumference(3.5);
        MathConstants.calculateExponentialGrowth(2.0, 3.0, 4.0);
        //3 Library
        new LibraryTest();
        //4 University
        University stud1 = new University(111, "Petya");
        University stud2 = new University(222, "Vasia");
        University stud3 = new University(333,"Dima");
        stud1.printStudentInfo();
        stud2.printStudentInfo();
        stud3.printStudentInfo();
        University.changeUniversityName("NGIMO");
        stud1.printStudentInfo();
        stud2.printStudentInfo();
        stud3.printStudentInfo();
        //5 Person
        Person person1 = new Person("Ivan","Ivanov","123-45-6789");
        Person person2 = new Person("Petr", "Petrov","987-65-4321");

        person1.printPersonInfo();
        person2.printPersonInfo();

        person1.setFirstName("Semen");

        person1.printPersonInfo();
        person2.printPersonInfo();






    }
}
