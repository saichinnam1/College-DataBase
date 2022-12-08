/*
 *DAO=Data Access object class
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        System.out.println("Connected");
    }
    //insert the record to database case 1

    public int saveRecord(Student stud) {
//        int sid = stud.getSid();//calling methods of StudentClass to read data holded by objces of StudentClass
        String sname = stud.getFirstname();
        String Lastname = stud.getLastname();
        String dob = stud.getDob();//24
      //  System.out.println("Sid:" + sid);//110
        String query = "insert into student(sname,dob) values('" + sname + "','" + dob + "')";
        return jdbcTemplate.update(query);
    }

    //To delete the record from database case 2
    public int deleteRecord(Student stud) {
        int sid = stud.getSid();
        String query = "delete from student where sid='" + sid + "'";
        return jdbcTemplate.update(query);
    }

    //To update the record case 3
    public int updateRecord(Student stud) {
        int sid = stud.getSid();
        String firstname = stud.getFirstname();
        String Lastname = stud.getLastname();
        String dob = stud.getDob();
        String query = "update student set firstname='" + firstname + "',Lastname ='" +Lastname+"',dob='" + dob + "' where sid='"+sid+"'";
        return jdbcTemplate.update(query);
    }

    //To find specific record case 4
    public Student getStudentById(int sid) {
        String sql = "select * from student where sid=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{sid}, new BeanPropertyRowMapper<>(Student.class));
        //     jdbcTemplate.queryF
    }

    //To view all the records from database case 5
    public List<Student> getAllStudentDetails() {
        return jdbcTemplate.query("select * from student",
                new ResultSetExtractor<List<Student>>() {
            public List<Student> extractData(ResultSet rs)
                    throws SQLException, DataAccessException {

                List<Student> list = new ArrayList<>();
                while (rs.next()) {
                    Student s = new Student();
                    s.setSid(rs.getInt(1));//111 112
                    s.setFirstname(rs.getString(2));//ashika
                    s.setLastname(rs.getString(3));
                    s.setDob(rs.getString(4));//2000-12-12
                    list.add(s);  //list={{101,raj,23},{
                }
                return list;
            }
        });
    }

}