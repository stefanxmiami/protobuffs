package com.example.tutorial;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;

import static com.example.tutorial.jooq.tables.Users.USERS;

public class ExampleMain {
    public static void main(String[] args) {
        String userName = "gamblify-dev";
        String password = "stefan4o99";
        String url = "jdbc:postgresql://localhost:5432/mytestdb";

        //Connection is the only JDBC resource that we need
        //PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)){
            DSLContext context = DSL.using(conn, SQLDialect.POSTGRES);
            Result<Record> userRecords = context.select().from(USERS).where(USERS.CITY.eq("Veles")).fetch();
            System.out.printf(userRecords.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
