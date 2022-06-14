/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_thoga_kade
 * Date        : 6/14/2022
 * Time        : 3:55 AM
 * @Since : 0.1.0
 */

package lk.ijse.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;



    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure();
        sessionFactory=configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration == null) ? factoryConfiguration=new FactoryConfiguration()
                : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
