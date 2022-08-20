package Beans;


import Beans.VehicleBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DANISH
 */
public class DatabaseManager {

    private static Connection con;
    // private static String fac_id;

    static {
        try {
            init();
        } catch (Exception e) {
        }
    }

    private static void init() throws Exception {
//		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//		con=DriverManager.getConnection("jdbc:odbc:university");
//                System.out.println("Connection succesfull");
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String path = "F:\\Showroom\\showroom.accdb";
        String url = "jdbc:ucanaccess://" + path;
        con = DriverManager.getConnection(url);
        System.out.println("Connection Successful " + con);
    }

  /*  public static int rigisterStudent() {
        int status = 0;
        try {
            String query = "insert into student "
                    + "(name,fname,surname,gender,dob,birth_certificate_image,birth_place,"
                    + "permanent_address,mobile_no,email,postal_address,domicile,profile,"
                    + "cnic,cnic_front_pic,cnic_back_pic,matric_marks,matric_grade,matric_seat_no,"
                    + "matric_year_passed,matric_board,matric_marksheet_pic,matric_pass_certificate,"
                    + "inter_marks,inter_grade,inter_seat_no,inter_year_passed,inter_board,"
                    + "inter_marksheet_pic,inter_pass_certificate,graduate_marks,graduate_division,"
                    + "graduate_seat_no,graduate_year_passed,graduate_university,graduate_marksheet_pic,"
                    + "graduate_pass_certificate)"
                    + " values ('" + student.getName() + "','" + student.getFname() + "','" + student.getSurname() + "'"
                    + ", '" + student.getGender() + "' , '" + student.getDob() + "' , '" + student.birthCertificateImage + "'"
                    + ", '" + student.getBirthPlace() + "' , '" + student.getPermanentAddress() + "'"
                    + ", '" + student.getMobileNo() + "' , '" + student.getEmail() + "'"
                    + ", '" + student.getPostalAddress() + "' , '" + student.getDomicile() + "'"
                    + ", '" + student.getProfile() + "' , '" + student.getCnic() + "' , '" + student.getCnicFrontPic() + "'"
                    + ", '" + student.getCnicBackPic() + "' , '" + student.getMatricMarks() + "'"
                    + ", '" + student.getMatricGrade() + "' , '" + student.getMatricSeatNo() + "'"
                    + ", '" + student.getMatricYearPassed() + "' , '" + student.getMatricBoard() + "'"
                    + ", '" + student.getMatricMarksheetPic() + "' , '" + student.getMatricPassCertificate() + "'"
                    + ", '" + student.getInterMarks() + "' , '" + student.getInterGrade() + "'"
                    + ", '" + student.getInterSeatNo() + "' , '" + student.getInterYearPassed() + "'"
                    + ", '" + student.getInterBoard() + "' , '" + student.getInterMarksheetPic() + "'"
                    + ", '" + student.getInterPassCertificate() + "' , '" + student.getGraduateMarks() + "'"
                    + ", '" + student.getGraduateDivision() + "' , '" + student.getGraduateSeatNo() + "'"
                    + ", '" + student.getGraduateYearPassed() + "' , '" + student.getGraduateUniversity() + "'"
                    + ", '" + student.getGraduateMarksheetPic() + "' , '" + student.getGraduatePassCertificate() + "'"
                    + ")";

            Statement st = con.createStatement();
            status = st.executeUpdate(query);
            st.close();
            System.out.println(query);

        } catch (Exception ee) {
            ee.printStackTrace();
        }
        return status;

    }
*/
    public static ArrayList<VehicleBean> getVehicle()throws Exception{
                String query="select * from vehicle";
		System.out.println(query);
		Statement st=null;
		ResultSet result=null;
                ArrayList<VehicleBean> array = new ArrayList<VehicleBean>();
                VehicleBean bean=null;
		try{
			st=con.createStatement();
			result=st.executeQuery(query);
			//Vector v=new Vector();
                        
			while(result.next()){
                            
				bean=new VehicleBean();
                                bean.setVehicle(result.getString("vehicle") );
				bean.setModel(result.getString("model") );
				bean.setColor(result.getString("color") );
				bean.setDemand(result.getString("demand") );
				bean.setDrive( result.getString("drive") );
				bean.setEngine( result.getString("engine") );
                                bean.setFuel(result.getString("fuel"));
				bean.setTransmission(result.getString("transmission") );	
                                bean.setRegisteredCity(result.getString("registered_city") );	
                                bean.setRegisteredYear(result.getString("registered_year") );	
                                bean.setFeaturesAndDescription(result.getString("featuresAndDescription") );
                                bean.setPrice(result.getString("price") );
                                bean.setStatus( result.getString("status") );
                                array.add(bean);
			}
			return array;
		}finally{
			if(result!=null)result.close();
			if(st!=null)st.close();
		}        
}
    public static ArrayList<VehicleBean> searchVehicles(String vehicle)throws Exception
    {
    String query="select * from vehicle where vehicle='"+vehicle+"'";
		System.out.println(query);
		Statement st=null;
		ResultSet result=null;
                ArrayList<VehicleBean> array = new ArrayList<VehicleBean>();
                VehicleBean bean=null;
		try{
			st=con.createStatement();
			result=st.executeQuery(query);
			//Vector v=new Vector();
                        
			while(result.next()){
                            
				bean=new VehicleBean();
                                bean.setVehicle(result.getString("vehicle") );
				bean.setModel(result.getString("model") );
				bean.setColor(result.getString("color") );
				bean.setDemand(result.getString("demand") );
				bean.setDrive( result.getString("drive") );
				bean.setEngine( result.getString("engine") );
                                bean.setFuel(result.getString("fuel"));
				bean.setTransmission(result.getString("transmission") );	
                                bean.setRegisteredCity(result.getString("registered_city") );	
                                bean.setRegisteredYear(result.getString("registered_year") );	
                                bean.setFeaturesAndDescription(result.getString("featuresAndDescription") );
                                bean.setPrice(result.getString("price") );
                                bean.setStatus( result.getString("status") );
                                array.add(bean);
			}
			return array;
		}finally{
			if(result!=null)result.close();
			if(st!=null)st.close();
		}                
    }
}