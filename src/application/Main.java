package application;

import db.DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        System.out.println(conn);
        DB.closeConnection();
    }
}
