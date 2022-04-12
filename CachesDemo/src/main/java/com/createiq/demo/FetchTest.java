package com.createiq.demo;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class FetchTest {
	
	static Logger logger = Logger.getLogger(Employee.class);
	public static void main(String[] args) {   
		
		 PropertyConfigurator.configure("src/main/java/lag4j.properties");
		
	    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	        
	    Session session1=factory.openSession();    
	    Employee emp1=(Employee)session1.load(Employee.class,1002);    
	    System.out.println(emp1.getEid()+" "+emp1.getEname()+" "+emp1.getEsal());  
	   // session1.save(emp1);
	   // session1.beginTransaction().commit();
	    logger.debug("sucessfully stored to file and available in console"+emp1);
	    session1.close();
	    
	        
	    Session session2=factory.openSession();    
	    Employee emp2=(Employee)session2.load(Employee.class,1002);    
	    System.out.println(emp2.getEid()+" "+emp2.getEname()+" "+emp2.getEsal());    
	    session2.close();    
	        
	}    

}
