package bookmanage_java_20200522;
import java.util.Scanner;   
import java.io.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//调用存储过程实现查询
public class bookcanborrow_by_sp {
	private DbUtil dbUtil=new DbUtil();
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("请输入读者编号："); 
        String rno= sc.nextLine();      //1.取得用户输入的字符串 
        bookcanborrow_by_sp b=new bookcanborrow_by_sp();
        b.ser_reader(rno);
   }
	public void ser_reader(String rn)
	{	
	  Connection con=null;
	  CallableStatement cstmt = null;
      int canborrow=0;
	  try {
		con=dbUtil.getCon();
		String sql="call  if_borrow(?,?);";
		// 获取执行sql语句对象
		cstmt=con.prepareCall(sql);
        // 准备参数
		cstmt.setString(1, rn);   //准备输入参数（第1个参数是输入参数）将rn付给第一个参数
		cstmt.registerOutParameter(2,java.sql.Types.TINYINT); //说明输出参数（第2个参数是输出参数）
        // 执行存储过程调用
		cstmt.execute();  //不要用executeQuery()
		//将输出参数值给canborrow
		canborrow=cstmt.getInt(2);
      
        //处理结果    	
    	if (canborrow==1) {
    	System.out.println("该读者可以继续借书"); 	
			}
		else{
			System.out.println("该读者号不存在，或借书数已达上限不可以继续借书"); 
		    };
        
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
CallableStatement: 
　　继承自PreparedStatement,支持带参数的SQL操作; 
　　支持调用存储过程,提供了对输出和输入/输出参数(INOUT)的支持; 
INOUT参数使用：  
CallableStatement cstmt = conn.prepareCall("{call revise_total(?)}");  
cstmt.setByte(1, 25);  
cstmt.registerOutParameter(1, java.sql.Types.TINYINT);  
cstmt.executeUpdate();  
byte x = cstmt.getByte(1);  
 */
/*
        String sql = "{call pro_getCountById(?, ?, ?)}";
		CallableStatement cstmt = conn.prepareCall(sql);
		cstmt.setInt(1, cemployee.getId());
		cstmt.registerOutParameter(2, Types.DOUBLE);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.execute();
		double counts = cstmt.getDouble("counts");
		String userNames = cstmt.getString("userNames");
/*
-- 在books中建立存储过程
DELIMITER ##
CREATE PROCEDURE if_borrow
(IN rno VARCHAR(20),OUT can_borrow TINYINT)
BEGIN
IF (SELECT borrowed_limit-borrowed_num FROM reader WHERE readerno=rno)>0
THEN SET can_borrow=1;
ELSE SET can_borrow=0;
END IF;
END ##
DELIMITER ;
 */
