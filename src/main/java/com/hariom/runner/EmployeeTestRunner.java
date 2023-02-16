package com.hariom.runner;

import com.hariom.model.Employee;
import com.hariom.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class EmployeeTestRunner implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repo;
    //NOte: For above interface one impl class is generated using Sun Dynamic Proxy Concept
    //and Linked with its Reference variable.

    @Override
    public void run(String... args) throws Exception
    {
        //to find Impl className using Reference Variable
        System.out.println(repo.getClass().getName());

        //------insert data----------
      //  Employee emp=new Employee(102,"om",670000.0);
       // emp.setEmpId(101);
       // emp.setEmpName("Hari");
        //emp.setEmpSal(50000.00);

       /* repo.save(new Employee(,"raju",70000.00));
        repo.save(new Employee("rajkumar",500000.00));
        repo.save(new Employee("om",10000.40));
        repo.save(new Employee("ram",51000.40));
        repo.save(new Employee("Nagra",71000.09));
        */
      /*  //-------print all rows ------
       Iterable<Employee> data= repo.findAll();
       //JDK 1.5- forEach loop
       for(Employee e:data)
       {
           System.out.println(e);
       }*/

        //===================================use of svaeAll method==========================================================


      /* ArrayList<Employee> itr=new ArrayList<>();
       itr.add(new Employee("aakash",60000.09));
       itr.add(new Employee("rishabh",70000.09));
       itr.add(new Employee("abhishek",80000.00));

       repo.saveAll(itr);
       */

        repo.saveAll(Arrays.asList(
                new Employee("Ram",78000.09),
                new Employee("Shyam",87000.09),
                new Employee("Krishna",67000.89)
        ));

    }
}
