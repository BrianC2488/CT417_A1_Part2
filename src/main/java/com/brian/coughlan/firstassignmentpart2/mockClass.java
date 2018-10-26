
package com.brian.coughlan.firstassignmentpart2;
import com.brian.coughlan.ct417_a1_part1.*;

import java.util.ArrayList;
import org.joda.time.LocalDate;
/**
 *
 * @author Brian
 */

public class mockClass {
        public static void main(String args[])
        {
            student s1 = new student("John Tynan",31,"1/02/1987","ECE");
            student s2 = new student("Sean Kilker",22,"3/02/1996","CSIT");
            student s3 = new student("Sadie Cunniffe",17,"12/04/2001","ECE");
            student s4 = new student("Edward Coughlan",33,"4/07/1985","CSIT");
            student s5 = new student("Jack Connolly",18,"11/08/2000","EEE");
            student s6 = new student("Ryan Fitzpatrick",24,"25/09/1994","EEE");
            student s7 = new student("Martin Dunne",21,"25/10/1997","Dunnes");

               
            
            //ECE + CS STUDENTS
            ArrayList<student> g1 = new ArrayList<student>();
            g1.add(s1);
            g1.add(s3);
            g1.add(s2);
            g1.add(s4);
            g1.add(s7);
            
            
            //EEE + ECE
            ArrayList<student> g2 = new ArrayList<student>();
            g2.add(s1);
            g2.add(s3);
            g2.add(s5);
            g2.add(s6);
          
            
       
            
            
        module CT417 = new module("Software Engineering","CT417",g1);
        module CT401 = new module("Machine Learning","CT401",g1);
        module EE445 = new module("DSP","EE445",g2);
        module EE451 = new module("System on Chip 1","EE451",g2);     
        
        
        ArrayList<module> Computer_Science = new ArrayList<module>();
        Computer_Science.add(CT417);
        Computer_Science.add(CT401);
        LocalDate start = new LocalDate(2016,9,5);
        LocalDate end = new LocalDate(2017,5,31);
        course_program CSIT = new course_program("CSIT",Computer_Science,start,end);
            
        
        ArrayList<module> Engineering_Modules = new ArrayList<module>();
        Engineering_Modules.add(EE445);
        Engineering_Modules.add(EE451);
        Engineering_Modules.add(CT417);
        Engineering_Modules.add(CT401);
        course_program EE = new course_program("EE",Engineering_Modules,start,end);
        
        ArrayList<course_program> courses = new ArrayList<course_program>();
        courses.add(CSIT);
        courses.add(EE);


        
        ArrayList<module> CT417_student_list = EE.getModuleList();
        int j = 0; 
        for(module m: CT417_student_list)
        {
            System.out.println(m.getName());
            System.out.println("--------------------------");

            ArrayList<student> studentList = m.getStudentList();
          
            for(student s: studentList) 
            {
            
                
            System.out.println("Student "+(j+1));
            System.out.println("Name: " + s.getName()); 
            System.out.println("Username: " + s.getUsername()); 
            System.out.println("Course: " + s.getCourse());  
            System.out.println("                ");
            j++;
            
            if(j >= studentList.size())
            {
                j = 0;
            }
            }

        }
        
         





        /*ArrayList<student> EE451_List = EE451.getStudentList();
        
        for(student m: EE451_List)
        {
        System.out.println(m.getUsername());
        }*/
        
       
        
        
        
        
        
                 
             
          


            
            

            

            
            
            


        }

    
}

