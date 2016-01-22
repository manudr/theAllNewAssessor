package us.co.douglas.assessor.service;

import us.co.douglas.assessor.model.Person;

public interface PersonService {

    public Person getPerson(int id);

    public Person[] getAllPersons();

}