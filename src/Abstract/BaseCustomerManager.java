package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public void add(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kaydınız  başarılı bir şekilde tamamlanmıştır.");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" bilgileriniz başarılı bir şekilde güncellenmiştir.");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kaydınız  başarılı bir şekilde silinmiştir.");
    }
}
