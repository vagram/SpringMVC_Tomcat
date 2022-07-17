package spring.mvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spring.mvc.entity.ToDo;

import java.util.List;
@Repository
public class ToDoRepositoryImpl implements ToDoRepository{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<ToDo> getAllToDo() {
        Session session = sessionFactory.getCurrentSession();
        List<ToDo> toDos = session.createQuery("select e from ToDo e where e.isDeleted <> 1", ToDo.class).getResultList();
        return toDos;
    }

    @Override
    public void saveTodo(ToDo addedTodo) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(addedTodo);

    }

    @Override
    public ToDo findById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        ToDo toDo = session.get(ToDo.class, id);
        return toDo;
    }

    @Override
    public void delete(Integer id, ToDo toDo) {
        Session session = sessionFactory.getCurrentSession();
        toDo.setIsDeleted(1);
        session.save(toDo);
    }
}
