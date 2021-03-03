package com.foodcompany.jsondemo;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;

public class JSONDemo {
    public static void main(String[] args)
    {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name","Robert");
        jsonObject.put("ID",1);
        jsonObject.put("Fees",new Double(1000.21));
        jsonObject.put("Active",new Boolean(true));
        jsonObject.put("Other Details",JSONObject.NULL);

        JSONArray list = new JSONArray();
        list.put("foo");
        list.put(new Integer(100));
        jsonObject.put("list",list);
        System.out.println(jsonObject);

        Employee e = new Employee();
        long employeeId;
        String name;
        double salary;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee ID:");
        employeeId = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the employee Name:");
        name = sc.nextLine();
        System.out.println("Enter the salary");
        salary = sc.nextDouble();
        e.setEmployeeID(employeeId);
        e.setName(name);
        e.setSalary(salary);
        //jsonObject.put("EmployeeID",e.getEmployeeID());
        //jsonObject.put("EmployeeName",e.getName());
        //jsonObject.put("Salary",e.getSalary());
        JSONObject emp = new JSONObject();
        emp.put("empId", e.getEmployeeID());
        emp.put("empName",e.getName());
        emp.put("empSalary",e.getSalary());
        jsonObject.put("Employee",emp);//It
        System.out.println(jsonObject);
    }
}
