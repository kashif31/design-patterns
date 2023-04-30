package com.kashtech.designpatterns.strategy;

import com.kashtech.designpatterns.singleton.DatabaseConnection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonPatternTests {

    DatabaseConnection connection = DatabaseConnection.getInstance("connection-string");

    //created the first instance of the Database connection and it is returned with correct connection string details
    @Test
    public void shouldReturnNewDatabaseConnection(){
        assertEquals("connection-string", connection.getConnectionString());
    }

    //connection string details are changed to ask for new connection but old object is returned with same connection string details, new object is not created.
    @Test
    public void shouldReturnSameDatabaseConnection(){
        DatabaseConnection connection = DatabaseConnection.getInstance("new-connection-string");
        assertEquals("connection-string", connection.getConnectionString());
    }
}
