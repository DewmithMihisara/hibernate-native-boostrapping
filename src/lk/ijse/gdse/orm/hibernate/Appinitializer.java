package lk.ijse.gdse.orm.hibernate;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer1;
import lk.ijse.gdse.orm.hibernate.ripository.CustomrtRipository;

public class Appinitializer {
    public static void main(String[] args) {
        Customer1 customer1 = getCustomer();
        SessionFactoryConfig.getInstance().getSession();

        // for save customer
//        CustomrtRipository cusRepo=new CustomrtRipository();
//        int cusId=cusRepo.saveCustomer(customer1);
//        System.out.println("save cus id=" + cusId);


        // for get customer
//        CustomrtRipository cusRepo=new CustomrtRipository();
//        Customer existCus=cusRepo.getCustomer(434);
//        System.out.println(existCus);

        // save and get
//        CustomrtRipository cusRepo=new CustomrtRipository();
//        int saveCusId=cusRepo.saveCustomer(customer);
//        System.out.println("save cus id=" + saveCusId);
//
//        cusRepo=new CustomrtRipository();
//        Customer existCus=cusRepo.getCustomer(434);
//        System.out.println(existCus);

        // update
//        CustomrtRipository customrtRipository=new CustomrtRipository();
//        customer.setAddress("bbb");
//        customer.setName("chamal");
//        boolean isUpdate=customrtRipository.updateCustomer(customer);
//        if (isUpdate){
//            System.out.println("yes");
//        }

        // delete
//        CustomrtRipository customrtRipository=new CustomrtRipository();
//        boolean isDelete=customrtRipository.deleteCustomer(customer);
//        if (isDelete){
//            System.out.println("yes");
//        }

        //1.save
//        Session session=SessionFactoryConfig.getInstance().getSession();
//        Transaction transaction=session.beginTransaction();
//        session.save(customer);
//        transaction.commit();
//        session.close();



        //2.get & update
    /*    Session session1=SessionFactoryConfig.getInstance().getSession();
        Transaction transaction1=session1.beginTransaction();
        Customer customer1 = session1.get(Customer.class, 1);
        customer1.setAddress("mathara");
        customer1.setName("nimal");
//        session1.save(customer1);
        session1.update(customer1);
        transaction1.commit();
        session1.close();
     */
        //4.Delete
//        Session deleteSession=SessionFactoryConfig.getInstance().getSession();
//        Transaction deleteTransaction =deleteSession.beginTransaction();
//        Customer deleteCustomer=deleteSession.get(Customer.class, 1);
//        deleteSession.delete(deleteCustomer);
//        deleteTransaction.commit();
//        deleteSession.close();
    }

    private static Customer1 getCustomer() {
        Customer1 customer1 =new Customer1();
        customer1.setName("aa");
        customer1.setId(1);
        customer1.setAddress("galle");
        customer1.setAge(20);
        return customer1;
    }
}
