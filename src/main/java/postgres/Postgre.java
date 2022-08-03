package postgres;

import java.sql.Connection;

public class Postgre {
    public static void main(String[] args) {
        Db db = new Db();
       Connection connection = db.connect("testdb","postgres","1234");
//       db.create(connection, "employee");
//        db.insertTable(connection, "employee", "John", "Kenya");
        db.readData(connection, "employee");
    }
}
