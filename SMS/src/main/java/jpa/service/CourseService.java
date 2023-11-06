package jpa.service;

import java.util.List;


import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class CourseService implements CourseDAO {

    private SessionFactory sessionFactory;
    private CourseDAO courseDAO;

    public CourseService() {
        // Default constructor with no dependencies. Not recommended for production.
        // Consider using dependency injection for a production-ready application.
    }

    public CourseService(SessionFactory sessionFactory, CourseDAO courseDAO) {
        this.sessionFactory = sessionFactory;
        this.courseDAO = courseDAO;
    }

    public List<Course> getAllCourses() {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            try {
                Query<Course> query = session.createQuery("FROM Course", Course.class);
                List<Course> courses = query.list();
                transaction.commit();
                return courses;
            } catch (Exception e) {
                transaction.rollback();
                // Log or handle the exception as needed.
                throw e; // Re-throw the exception if needed for upper-level handling.
            }
        }
    }

    public Course getCourseById(Integer cId) {
        try (Session session = sessionFactory.openSession()) {
            String hql = "FROM Course C WHERE C.cId = :courseId";
            Query<Course> query = session.createQuery(hql, Course.class);
            query.setParameter("courseId", cId);
            return query.uniqueResult();
        } catch (Exception e) {
            // Log or handle the exception as needed.
            throw e;
        }
    }

    public void close() {
        if (sessionFactory != null && !sessionFactory.isClosed()) {
            sessionFactory.close();
        }
    }
}

