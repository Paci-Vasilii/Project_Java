package com.app;

import com.app.pojo.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {
        Student Bob = new Student();
        Bob.setName("Bob");
        Bob.setAge(10);
        //Bob.setId();

        Configuration con = new Configuration().configure();
        con.addAnnotatedClass(Student.class);

        StandardServiceRegistryBuilder sBilder = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties());


        SessionFactory sf = con.buildSessionFactory(sBilder.build());

        //Create
        Session sessionCreate = sf.openSession();
        Transaction trCreate = sessionCreate.beginTransaction();
        sessionCreate.save(Bob);
        trCreate.commit();
        sessionCreate.close();

        //Read
        //Update
        //Delete

    }
}
