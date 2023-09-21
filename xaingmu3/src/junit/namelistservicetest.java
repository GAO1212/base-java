package junit;

import domain.employee;
import org.junit.Test;
import service.namelistservice;
import service.teamexception;

public class namelistservicetest {

  @Test
  public void test(){
      namelistservice namelistservice=new namelistservice();
      employee[] employees=namelistservice.getallEmployees();
      for (int i = 0; i < employees.length; i++) {
          System.out.println(employees[i]);
      }
   }
   @Test
   public void test1(){
      namelistservice namelistservice=new namelistservice();
       try {
           employee demo=namelistservice.getemployee(13);
           System.out.println(demo);
       } catch (teamexception e) {
           System.out.println(e.getMessage());
       }

   }
}
