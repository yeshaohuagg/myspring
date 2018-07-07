package com.yeshao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    ApplicationContext mContext = new ClassPathXmlApplicationContext("Beans.xml");

    @RequestMapping(value = "/student",produces = "text/html;charset=UTF-8",method = RequestMethod.GET)
    public ModelAndView student(){
        return new ModelAndView("student","command",new Student());
    }

    @RequestMapping(value = "/addStudent",produces = "text/html;charset=UTF-8",method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap modelMap){
        if(student.getName().length() < 5 ){
            throw new SpringException("名字长度必须大于等于5");
        }
        if( student.getAge() < 10 ){
            throw new SpringException("满十岁才行哦");
        }
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) mContext.getBean("studentJDBCTemplate");
        studentJDBCTemplate.create(student.getName(),student.getAge(),99,2010);

        List<Student> students = studentJDBCTemplate.listStudents();
        Student studentResult = students.get(students.size() - 1);
        modelMap.addAttribute("name",studentResult.getName());
        modelMap.addAttribute("age",studentResult.getAge());
        modelMap.addAttribute("id",studentResult.getId());
        return "result";

    }

    @RequestMapping(value = "/redirect",produces = "text/html;charset=UTF-8", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:student";
    }
}
