public class customerlist {
    private customer[] customers;
    private int total=0;
    public customerlist(int totalcustomer){
        customers=new customer[totalcustomer];
    }
    public boolean addcustomer(customer customer){
        if(total<customers.length){
            customers[total]=customer;
            total++;
            return true;
        }
        return false;
    }
    public boolean replacecustomer(int index,customer cust){
        if(index>=0&&index<total){
           customers[index]=cust;
            return true;
        }
        return false;

}
    public boolean deletecustomer(int index){
        if(index<0||index>total){
            return false;
        }
        for (int i = index; i < total-1; i++) {
            customers[i]=customers[i+1];
            customers[total-1]=null;
            total--;
            //customers[--total]=null;
        }
        return true;

    }
    public customer[] getallcustomers(){
        customer[] custs=new customer[total];
        for (int i = 0; i <custs.length; i++) {
            custs[i] = customers[i];
        }
            return custs;
        }
        public customer getcustomer(int index){
if (index<0||index>=total){return null;}
else
        return customers[index];
        }
        public int getTotal(){
        return total;
    }
}
