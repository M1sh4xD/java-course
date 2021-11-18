package model;

import java.sql.*;
import java.util.*;

public class Database {
    private List<Employee> employees;
    private Connection con;

    public Database() {
        employees = new LinkedList<Employee>();
    }

    private void addEmployee(Employee person) {
        employees.add(person);
    }

    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(employees);
    }

    public void connect() throws SQLException {
        if (con != null) {
            return;
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        con = DriverManager.getConnection("jdbc:mysql://47.91.94.147:3306/stuff","java","java");
    }

    public void disconnect() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void count() throws SQLException {
        String SQL = "SELECT count(*) FROM employee";
        PreparedStatement sqlStmt = con.prepareStatement(SQL);
        ResultSet checkResult = sqlStmt.executeQuery();

        checkResult.next();
        int count = checkResult.getInt(1);

        System.out.println("Count for person is " + count + ".");

        sqlStmt.close();
    }

    public void addEmployeeToDatabase(Employee employee) {
        String name = employee.getName();
        int age = employee.getAge();
        String phone = employee.getPhone();
        String gender = employee.getGender().toString();
        String position = employee.getPosition();
        String department = employee.getDepartment();

        String Sql = "INSERT INTO employee(name,department,age,phone,position,gender) values ('" + name + "','" + department + "','" + age + "','" + phone + "','" + position + "','" + gender + "')";
        System.out.println("SQL = " + Sql);

        try {
            PreparedStatement preparedStatement = con.prepareStatement(Sql);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        getFromDatabase();

    }

    public void getFromDatabase() {
        employees.clear();

        String SQL = "SELECT * FROM employee";

        try {
            PreparedStatement stmt = con.prepareStatement(SQL);
            ResultSet set = stmt.executeQuery();
            while (set.next()) {
                Employee temp = new Employee(set.getString("name"), set.getString("department"), set.getInt("age"), set.getString("phone"), set.getString("position"), set.getString("gender"));
                addEmployee(temp);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
