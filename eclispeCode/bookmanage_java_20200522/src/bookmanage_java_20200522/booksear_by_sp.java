package bookmanage_java_20200522;
import java.util.Scanner;   
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//调用存储过程实现查询
public class booksear_by_sp {
	private DbUtil dbUtil=new DbUtil();
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("请输入要查找的书名："); 
        String bname = sc.nextLine();      //取得用户输入的字符串 
   		booksearch b=new booksearch();
        b.ser_book(bname);
   }
	public void ser_book(String bn)
	{	
	  Connection con=null;
	  PreparedStatement pstmt = null;
      ResultSet rs = null;
	  try {
		con=dbUtil.getCon();
		String sql="call  serchbook(?);";
		// 获取执行sql语句对象
        pstmt=con.prepareStatement(sql);
        // 准备参数
        pstmt.setString(1, bn); 
        // 执行查询操作
        rs=pstmt.executeQuery();
      
        //处理结果集    	
    	if (rs.next()) {
    	System.out.println("查询结果："); 	
		System.out.println("bookno          bookname ");	
		rs.previous();  //前移一步
		}
		else{
			System.out.println("查不到数据"); 
		};
        
       
        while (rs.next()) {         	
            System.out.println(rs.getString(1).trim()+"       "+rs.getString(2).trim());
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

/*
-- 在books中建立存储过程
DELIMITER $$  
CREATE  PROCEDURE  serchbookbybookname
(IN bn VARCHAR(30) )        
BEGIN  
SELECT bookno,bookname FROM book 
WHERE bookname LIKE CONCAT('%',TRIM(bn),'%');		 
END $$ 
DELIMITER ; 

CALL serchbookbybookname('数据');
 */
