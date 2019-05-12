package exercise2;

public class Exercise2 {

    public static void main(String[] args) {
        // create companies
        Company camcube = new Company("Camcube");
        Company gmcolin = new Company("GM Colin");

        // create employees
        Employee rami = new Employee("Rami");
        Employee lori = new Employee("Lori", camcube);
        Employee fadi = new Employee("Fadi", gmcolin);

        System.out.println("Employees created:");
        System.out.println(rami);
        System.out.println(lori);
        System.out.println(fadi);

        System.out.println("Companies created:");
        System.out.println(camcube);
        System.out.println(gmcolin);

        System.out.println();

        System.out.println("Adding employees to camcube...");
        camcube.add(lori);
        camcube.add(rami);
        camcube.add(rami); // duplication
        System.out.println("Done!");

        System.out.println("Adding employees to GM colin...");
        gmcolin.add(fadi);
        System.out.println("Done!");

        System.out.println();

        System.out.println("After adding employees");
        System.out.println(camcube);
        System.out.println();
        System.out.println(gmcolin);

        System.out.println();


        System.out.println("Removing Lori from Camcube...");
        try {
            camcube.remove(lori);
        } catch (CompanyManagementException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(camcube + "\n");

        System.out.println("Removing Rami from GM Colin...");
        try {
            gmcolin.remove(rami);
        } catch (CompanyManagementException e) {
            System.err.println(e.getMessage());
        }
    }
}
