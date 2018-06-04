package com.ms;


import java.util.List;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
      
    EmployeeDAO dao=(EmployeeDAO) ctx.getBean("edao");  
    int status=dao.savePerson(new Person(105,"Amitu",35000,454));  
    System.out.println(status);  
          
    status=dao.updatePerson(new Person(90,"anil",15000,89)); 
    System.out.println(status); 
      
          
    Person e=new Person(); 
    e.setId(101); 
     status=dao.deletePerson(e); 
    System.out.println(status);
    
    List<Person> list=dao.getAllPersonRowMapper();  
    
    for(Person e1:list)  
        System.out.println(e1); 
      
}  
  
}
