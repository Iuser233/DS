package shiyan8;

import java.util.Arrays;
import java.util.Scanner;

import kechengshji.dbutil;

import java.io.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//���ô洢����ʵ�ֲ�ѯ
public class a1 {
	private dbutil dbUtil=new dbutil();
	public static void main(String[] args) {
        System.out.println("�������ò�ѧ��ѧ�ţ��������۸񣬲��ö��Ÿ�����"); 
        Scanner sc = new Scanner(System.in); 
        String input= sc.nextLine();      //1.ȡ���û�������ַ��� 
        String arr[] =input .split(",");
        System.out.println(Arrays.toString(arr));
        a1 b=new a1();
        b.ser_reader(arr);
   }
	public void ser_reader(String[] arr)
	{	
	  Connection con=null;
	  CallableStatement cstmt = null;
      ResultSet rs = null;
      try {
		con=dbUtil.getCon();
		String sql="call  student_cook(?,?,?);";
		// ��ȡִ��sql������
		cstmt=con.prepareCall(sql);
		// ׼������
		cstmt.setString(1, arr[0]);  
		cstmt.setString(2, arr[1]);  
		cstmt.setString(3, arr[2]);  
        rs=cstmt.executeQuery();	//ִ�в�ѯ��rs
        
    	while (rs.next()) {
            System.out.println("ѧ�ţ�"+rs.getString(1)+"     ������"+rs.getString(2)+"     ������"+rs.getString(3)+"     ���ںţ�"+rs.getString(4)+"     ������"+rs.getString(5)+"     �۸�"+rs.getString(6)+"     �ò�ʱ�䣺"+rs.getString(7));

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