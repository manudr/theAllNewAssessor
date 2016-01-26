package us.co.douglas.assessor.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="person")
public class Person {

    private int company_id;
    private int rank;
    private String company_name;
    private String industries;
    private double revenue;
    private int fiscal_year;
    private int employees;
    private double market_cap;
    private String headquarters;


    public Person() {

    }

    public Person(int company_id, int rank, String company_name, String industries, double revenue, int fiscal_year, int employees, double market_cap, String headquarters) {
        this.company_id = company_id;
        this.rank = rank;
        this.company_name = company_name;
        this.industries = industries;
        this.revenue = revenue;
        this.fiscal_year = fiscal_year;
        this.employees = employees;
        this.market_cap = market_cap;
        this.headquarters = headquarters;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getIndustries() {
        return industries;
    }

    public void setIndustries(String industries) {
        this.industries = industries;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public int getFiscal_year() {
        return fiscal_year;
    }

    public void setFiscal_year(int fiscal_year) {
        this.fiscal_year = fiscal_year;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public double getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(double market_cap) {
        this.market_cap = market_cap;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    @Override
    public String toString() {
        return "Person{" +
                "company_id=" + company_id +
                ", rank=" + rank +
                ", company_name='" + company_name + '\'' +
                ", industries='" + industries + '\'' +
                ", revenue=" + revenue +
                ", fiscal_year=" + fiscal_year +
                ", employees=" + employees +
                ", market_cap=" + market_cap +
                ", headquarters='" + headquarters + '\'' +
                '}';
    }
}