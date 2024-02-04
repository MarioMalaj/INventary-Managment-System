package Dao;

import Entity.Product;
import Util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductDao {

    public Product createProduct(Product product)  {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        sessionFactory.getCurrentSession().save(product);
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
        }
        try (Session session = sessionFactory.openSession()) {
            return (Product) session.createQuery("FROM Product", Product.class).list();
        }







    }
}
