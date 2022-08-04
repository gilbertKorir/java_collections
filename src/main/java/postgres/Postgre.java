package postgres;

import java.sql.Connection;

public class Postgre {
    public static void main(String[] args) {
        Db db = new Db();
       Connection connection = db.connect("testdb","postgres","1234");
//       db.create(connection, "employee");
//        db.insertTable(connection, "employee", "Fred", "Canada");
//        db.updateDb(connection, "employee", "John", "Pauline");
//        db.searchByName(connection, "employee", "Fred");
//        db.searchById(connection, "employee", 2);
//        db.deleteRowByName(connection, "employee", "Fred");
//        db.readData(connection, "employee");
        db.deleteTable(connection,"employee");
    }
}
