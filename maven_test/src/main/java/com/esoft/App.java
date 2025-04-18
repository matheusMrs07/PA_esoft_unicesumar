package com.esoft;

import java.sql.Connection;

import com.esoft.factory.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Connection conn = ConnectionFactory.getConnectionMySQL();

        conn.close();
        
        System.out.println("Conectado com sucesso!");

    }
}
