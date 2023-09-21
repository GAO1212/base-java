package service;

import domain.*;

public class namelistservice {
private employee[] employees;
public employee[] getallEmployees(){
    return employees;
}
public employee getemployee(int id)throws teamexception{
    for (int i = 0; i < employees.length; i++) {
        if (id==employees[i].getId())
            return employees[i];
    }
    throw new teamexception("找不到指定员工");
}
public namelistservice(){
    employees=new employee[Data.EMPLOYEES.length];
    for (int i = 0; i <employees.length ; i++) {
        int type=Integer.parseInt(Data.EMPLOYEES[i][0]);
        int id=Integer.parseInt(Data.EMPLOYEES[i][1]);
        String name=Data.EMPLOYEES[i][2];
        int age=Integer.parseInt(Data.EMPLOYEES[i][3]);
        double salary=Double.parseDouble(Data.EMPLOYEES[i][4]);
        switch (type){
            case Data.EMPLOYEE:
                employees[i]=new employee(id,name,age,salary);
                break;
            case Data.PROGRAMMER:
                equipment equipment=createquipment(i);
                employees[i]=new programmer(id,name,age,salary,equipment);
                break;
            case Data.DESIGNER:
                int bonus=Integer.parseInt(Data.EMPLOYEES[i][5]);
                equipment equipment1=createquipment(i);
                employees[i]=new designer(id,name,age,salary,bonus,equipment1);
                break;
            case Data.ARCHITECT:
                int bonus1=Integer.parseInt(Data.EMPLOYEES[i][5]);
                equipment equipment2=createquipment(i);
                int stock=Integer.parseInt(Data.EMPLOYEES[i][6]);
                employees[i]=new architect(id,name,age,salary,bonus1,equipment2,stock);
                break;
        }

    }
}
public equipment createquipment(int index){
    int equipmenttype=Integer.parseInt(Data.EQIPMENTS[index][0]);
    switch (equipmenttype){
        case Data.PC:
            return new pc(Data.EQIPMENTS[index][1],Data.EQIPMENTS[index][2]);
        case Data.NOTEBOOK:
            return new notebook(Data.EQIPMENTS[index][1],Double.parseDouble(Data.EQIPMENTS[index][2]));
        case Data.PRINTER:
            return new printer(Data.EQIPMENTS[index][1],Data.EQIPMENTS[index][2]);
    }
return null;
}

}

