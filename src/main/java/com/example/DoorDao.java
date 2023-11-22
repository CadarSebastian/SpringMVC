package com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoorDao {
   
//    public static  Door getById(int id) throws SQLException,IOException  {
//        Connection conn=DBHelper.getConnection();
//        String query="select * from doors where id=?";
//        PreparedStatement ps=conn.prepareStatement(query);
//        ps.setInt(1, id);
//
//        ResultSet rs=ps.executeQuery();
//
//        while(rs.next()) {
//            Door watch=new Door(rs.getInt("id"),
//                    rs.getString("material"),
//                    rs.getDouble("height"),
//                    rs.getDouble("width")
//                    rs.getDate("date"));
//
//            return watch;
//        }
	
	
	public static  Door getAll() throws SQLException,IOException  {
      Connection conn=DBHelper.getConnection();
      String query="select * from doors";
      PreparedStatement ps=conn.prepareStatement(query);
      ResultSet rs=ps.executeQuery();

      while(rs.next()) {
          Door watch=new Door(rs.getInt("id"),
                  rs.getString("material"),
                  rs.getDouble("height"),
                  rs.getDouble("width"),
                  rs.getDate("date"));

          return watch;
      }
        return null;



    }
	//Create Door
//	String Material="Spruce";
//	Double Height="200";
//	Double Width="78"
//	Date date = new Date (System.currentTimeMillis());
//	String insertEventQuery= "insert into door (Material,Height,Width,Date)"+
//			"values('"+Material +"','"+Height+"','"+"','"+Width+"','"+date+"')";
//	
//	 
//	//executeQuerry, citire
//	//executeUpdate for manipulare
//	Statement s= conn.createStatement();
//	s.executeUpdate(insertEventQuery);
//	System.out.println("inserted event");
//	conn.close();
	//DELETE
//	String deleteQuery="Delete from doors where id = 1";
//	Statement s1= conn.createStatement();
//	s1.executeUpdate(deleteQuery);
//	
//	
	
	
	
	//READ
//	String readAllQuery="select * from doors";
//	Statement s3=conn.createStatement();
//	ResultSet rs= s3.executeQuery(readAllQuery);
//	
//	while(rs.next()) {
//		System.out.println(rs.getString("event_name"));
//		System.out.println(rs.getString("Presenter"));
//	}
//	conn.close();
//	//UPDATE
//	String updateQuerry="update doors set Material = 'Cherry'where id = 1";
//	Statement s4= conn.createStatement();
//	s4.executeUpdate(updateQuerry);
	
	
	
	
	
	
	
	

}