package com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoorDao {
    //getById c,returneaza un watch 
    public static  Door getById(int id) throws SQLException,IOException  {
        Connection conn=DBHelper.getConnection();
        String query="select * from doors where id=?";
        PreparedStatement ps=conn.prepareStatement(query);
        ps.setInt(1, id);

        ResultSet rs=ps.executeQuery();

        while(rs.next()) {
            Door watch=new Door(rs.getInt("id"),
                    rs.getString("material"),
                    rs.getDouble("height"),
                    rs.getDouble("width")
                    rs.getDate(query));

            return watch;
        }
        return null;



    }

}