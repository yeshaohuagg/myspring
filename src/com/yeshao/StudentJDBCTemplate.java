package com.yeshao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
//    private PlatformTransactionManager transactionManager;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(String name, Integer age, Integer marks, Integer year) {
//        TransactionDefinition definition = new DefaultTransactionDefinition();
//        TransactionStatus status = transactionManager.getTransaction(definition);

        try {
            String SQL1 = "insert into Student (name,age) values (?,?)";
            jdbcTemplate.update(SQL1,name,age);

            String SQL2 = "select max(id) from Student";
            Integer sid = jdbcTemplate.queryForObject(SQL2,Integer.class);

            String SQL3 = "insert into Marks(sid,marks,year) values(?,?,?)";
            jdbcTemplate.update(SQL3,sid,marks,year);
            System.out.println("Create Name = "+name+",Age = "+age);
//            transactionManager.commit(status);
//            throw new RuntimeException("simulate Error condition");
        } catch (DataAccessException e){
            System.out.println("Error in create record,rooling back");
//            transactionManager.rollback(status);
            throw e;
        }

//        return;

    }

    public Student getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        Student student = jdbcTemplate.queryForObject(SQL,new Object[]{id},new StudentMapper());
        return student;
    }

    public List<Student> listStudents() {
        String SQL = "select * from Student,Marks where Student.id = Marks.sid";
        List<Student> students = jdbcTemplate.query(SQL,new StudentMapper());
        return students;
    }

    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        jdbcTemplate.update(SQL,id);
        System.out.println("Delete Record with ID = " + id);
        return;
    }

    public void update(Integer id, Integer age) {
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplate.update(SQL,age,id);
        System.out.println("Update Record with ID = " + id);
        return;
    }

//    public void setTransactionManager(PlatformTransactionManager transactionManager) {
//        this.transactionManager = transactionManager;
//    }
}
