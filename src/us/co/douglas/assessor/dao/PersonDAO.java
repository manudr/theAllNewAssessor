package us.co.douglas.assessor.dao;

import us.co.douglas.assessor.model.Person;

import java.util.List;

public interface PersonDAO {

    public Person getPerson(int id);

    public List<Person> getAllPersons();

}