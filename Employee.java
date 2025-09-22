class Employee {
    int id;
    String name;
    int dept;
    double salary;

    Employee(int id, String name, int dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + dept);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide exactly 4 arguments.");
            return;
        }
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        int dept = Integer.parseInt(args[2]);
        double salary = Double.parseDouble(args[3]);
        Employee e = new Employee(id, name, dept, salary);
        e.display();
    }
}
