package shiyan8;

import java.util.Scanner;   
import java.io.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//调用存储过程实现查询
public class readerdetails {
	private DButil dbUtil=new DButil();
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("请输入读者编号："); 
        String rno= sc.nextLine();      //1.取得用户输入的字符串 
        readerdetails b=new readerdetails();
        b.ser_reader(rno);
   }
	public void ser_reader(String rn)
	{	
	  Connection con=null;
	  CallableStatement cstmt = null;
      ResultSet rs = null;

      int canborrow=0;
	  try {
		con=dbUtil.getCon();
		String sql="call  booksborrow(?);";
		// 获取执行sql语句对象
		cstmt=con.prepareCall(sql);
        // 准备参数
		cstmt.setString(1, rn);  
        rs=cstmt.executeQuery();	//执行查询给rs

    	while (rs.next()) {
            System.out.println("bookname："+rs.getString(1)+"     auther："+rs.getString(2)+"     price："+rs.getString(3)+"     bookno："+rs.getString(4));

		}
        
         }
		 catch(Exception e)
		    {
			e.printStackTrace();
		     }
		   finally
		   {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}