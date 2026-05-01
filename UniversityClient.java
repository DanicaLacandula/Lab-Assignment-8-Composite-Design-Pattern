package edu.neu;

public class UniversityClient {

    public static void main(String[] args) {

        Teacher drAdaReyes   = new Teacher("Dr. Ada Reyes",   "Computer Science", 85_000);
        Teacher profBenCruz  = new Teacher("Prof. Ben Cruz",  "Computer Science", 72_000);
        Teacher drLenaGo     = new Teacher("Dr. Lena Go",     "Information Technology", 80_000);
        Teacher deanMarcos   = new Teacher("Dean Marcos",     "Engineering", 120_000);
        Teacher profRosaTan  = new Teacher("Prof. Rosa Tan",  "Management", 75_000);

        Student mariaSantos    = new Student("Maria Santos",    "2024-CS-001",  35_000);
        Student juanDelaCruz   = new Student("Juan dela Cruz",  "2024-CS-002",  35_000);
        Student annaReyes      = new Student("Anna Reyes",      "2024-IT-001",  32_000);
        Student paoloSy        = new Student("Paolo Sy",        "2024-IT-002",  32_000);
        Student leaVillanueva  = new Student("Lea Villanueva",  "2024-MGT-001", 30_000);
        Student marcoUy        = new Student("Marco Uy",        "2024-BUS-001", 28_000);

        Department deptCS = new Department("Department of Computer Science");
        deptCS.add(drAdaReyes);
        deptCS.add(profBenCruz);
        deptCS.add(mariaSantos);
        deptCS.add(juanDelaCruz);

        Department deptIT = new Department("Department of Information Technology");
        deptIT.add(drLenaGo);
        deptIT.add(annaReyes);
        deptIT.add(paoloSy);

        Department deptMgmt = new Department("Department of Management");
        deptMgmt.add(profRosaTan);
        deptMgmt.add(leaVillanueva);

        College collegeEng = new College("College of Engineering");
        collegeEng.add(deptCS);
        collegeEng.add(deptIT);
        collegeEng.add(deanMarcos);   // teacher directly under the college

        College collegeBus = new College("College of Business");
        collegeBus.add(deptMgmt);
        collegeBus.add(marcoUy);      // student directly under the college

        College university = new College("New Era University");
        university.add(collegeEng);
        university.add(collegeBus);


        separator("FULL UNIVERSITY DETAILS");
        university.displayDetails("");

        separator("COLLEGE OF ENGINEERING — DETAILS");
        collegeEng.displayDetails("");

        separator("DEPARTMENT OF COMPUTER SCIENCE — DETAILS");
        deptCS.displayDetails("");

        separator("STUDENT COUNT SUMMARY");
        System.out.printf("  %-45s : %d%n",
                university.getName()  + " (total)",   university.getStudentCount());
        System.out.printf("  %-45s : %d%n",
                collegeEng.getName(), collegeEng.getStudentCount());
        System.out.printf("  %-45s : %d%n",
                collegeBus.getName(), collegeBus.getStudentCount());
        System.out.printf("  %-45s : %d%n",
                deptCS.getName(),     deptCS.getStudentCount());
        System.out.printf("  %-45s : %d%n",
                deptIT.getName(),     deptIT.getStudentCount());
        System.out.printf("  %-45s : %d%n",
                deptMgmt.getName(),   deptMgmt.getStudentCount());

        separator("BUDGET SUMMARY  (salaries − tuition fees)");
        System.out.printf("  %-45s : PHP %,.2f%n",
                university.getName()  + " (total)",   university.getBudget());
        System.out.printf("  %-45s : PHP %,.2f%n",
                collegeEng.getName(), collegeEng.getBudget());
        System.out.printf("  %-45s : PHP %,.2f%n",
                collegeBus.getName(), collegeBus.getBudget());
        System.out.printf("  %-45s : PHP %,.2f%n",
                deptCS.getName(),     deptCS.getBudget());
        System.out.printf("  %-45s : PHP %,.2f%n",
                deptIT.getName(),     deptIT.getBudget());
        System.out.printf("  %-45s : PHP %,.2f%n",
                deptMgmt.getName(),   deptMgmt.getBudget());

        separator("INDIVIDUAL LEAF DETAILS");
        drAdaReyes .displayDetails("  ");
        System.out.println();
        mariaSantos.displayDetails("  ");

        System.out.println("\n" + "═".repeat(60));
    }

    private static void separator(String title) {
        System.out.println("\n" + "═".repeat(60));
        System.out.println("  " + title);
        System.out.println("═".repeat(60));
    }
}