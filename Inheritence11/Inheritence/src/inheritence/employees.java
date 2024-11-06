package inheritence;
public class employees {
private
        int employee_id;
        String employee_name;
        String employee_dept;
        String employee_scale;
public
        employees () { }
        employees (int id, String name, String dept, String scale) {
            employee_id = id;
            employee_name = name;
            employee_dept = dept;
            employee_scale = scale;
        }
        void set_employees (int id, String name, String dept, String scale) {
            employee_id = id;
            employee_name = name;
            employee_dept = dept;
            employee_scale = scale;
        }

        void show () {
            System.out.println ("Employee ID "+employee_id+ "\nName "+employee_name+ "\nDept. "+ employee_dept+ "\nScale "+employee_scale);
        }
        
}
