package shiyan8;

import java.util.Scanner;   
import java.io.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//���ô洢����ʵ�ֲ�ѯ
public class informatin_tz {
	private dbutil dbUtil=new dbutil();
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("���������Ա�ţ�"); 
        String rno= sc.nextLine();      //1.ȡ���û�������ַ��� 
        informatin_tz b=new informatin_tz();
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
		String sql="call  search_dingdan(?);";
		// ��ȡִ��sql������
		cstmt=con.prepareCall(sql);	
        // ׼������
		cstmt.setString(1, rn);  
        rs=cstmt.executeQuery();	//ִ�в�ѯ��rs

    	while (rs.next()) {
            System.out.println("����Ա�ţ�"+rs.getString(1)+"     ��ʦ�ţ�"+rs.getString(2)+"     ���˸�����"+rs.getString(3)+"     ������"+rs.getString(4));

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