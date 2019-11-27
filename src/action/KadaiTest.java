package action;

import javax.persistence.EntityManager;

import entity.Person;
import util.DBUtil;

public class KadaiTest {

    public static void main(String[] args) {

        EntityManager em = DBUtil.createEntityManager();

        Person person = em.find(Person.class, 1);
        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getAge());

        em.close();
    }
}
