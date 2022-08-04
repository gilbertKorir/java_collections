package postgres;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Db {
    public Connection connect(String dbname, String user, String pass){
        Connection connection = null;
//        Statement stmt = null;

        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname, user, pass);
            if(connection!= null){
                System.out.println("Opened database successfully");
            }else{
                System.out.println("Connection Failed");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
    //creating table
    public void create(Connection connection, String tbname){
        Statement statement;
        try{
            String query = "create table "+tbname +"(empid SERIAL, name VARCHAR(200), address varchar(200), primary key(empid));";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table created successfully");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    //insert into table
    public void insertTable(Connection connection, String tbname, String name, String address){
        Statement statement;
        try{
            String query = String.format("insert into %s(name, address) values('%s', '%s');", tbname, name, address);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data inserted successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    //read date from table
    public void readData(Connection connection, String tbname){
        Statement statement;
        ResultSet rs = null;
        try{
            String query = String.format("select * from %s", tbname);
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            System.out.println(" Tha available data is as below:");
            while(rs.next()){
                System.out.println(rs.getString("empid") + " "+ rs.getString("name") + " " + rs.getString("address"));
//                System.out.println(rs.getString("name"));
//                System.out.println(rs.getString("address"));
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
    //updating the database
    public void updateDb(Connection connection, String tbname, String oldName, String newName){
        Statement statement;
        try{
            String query = String.format("update %s set name = '%s' where name = '%s'", tbname, newName, oldName);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated successfully");
        } catch (Exception e){
            System.out.println(e);
        }

    }
    //Search by name
    public void searchByName(Connection connection, String tbname, String name){
        Statement statement;
        ResultSet rs = null;
        try {
            String query = String.format("select * from %s where name = '%s'", tbname, name);
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString("empid") + " "+ rs.getString("name") + " " + rs.getString("address"));
            }
            System.out.println("Above name was found");
        } catch (Exception e){
            System.out.println(e);
        }
    }
    //Search by name
    public void searchById(Connection connection, String tbname, int id){
        Statement statement;
        ResultSet rs = null;
        try {
            String query = String.format("select * from %s where empid = %s", tbname, id);
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString("empid") + " "+ rs.getString("name") + " " + rs.getString("address"));
            }
            System.out.println("Above ID was found");
        } catch (Exception e){
            System.out.println(e);
        }
    }
    //dELETE ROW
    public void deleteRowByName(Connection connection, String tbname, String name){
        Statement statement;
        try{
            String query = String.format("delete from %s where name = '%s'", tbname, name);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row deleted successfully");
        } catch (Exception e){
            System.out.println(e);
        }
    }
    //delete table
    public void deleteTable(Connection connection, String tbname){
        Statement statement;
        try{
            String query = String.format("drop table %s",tbname);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table deleted you can create a new one using the function create()");

        }catch (Exception e){
            System.out.println(e);
        }
    }

}
