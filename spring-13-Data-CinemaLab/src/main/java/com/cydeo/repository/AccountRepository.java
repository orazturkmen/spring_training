package com.cydeo.repository;

import com.cydeo.entity.Account;
import com.cydeo.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {
    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state
    List<Account> findAllByCountryOrState(String country,String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<Account> findAllByAgeLessThanEqual(Integer age);

    //Write a derived query to list all accounts with a specific role
    List<Account> findByRole(UserRole role);

    //Write a derived query to list all accounts between a range of ages
    List<Account> findByAgeBetween(Integer age1, Integer age2);

    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<Account> findAllByAddressStartingWith(String keyword);

    //Write a derived query to sort the list of accounts with age
    List<Account> findAllByOrderByAge();
    List<Account> findAllByOrderByAgeDesc();

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts
    @Query("select a from Account a")
    List<Account> retrieveAllAccount();

    //Write a JPQL query to list all admin accounts
    @Query("select a from Account a where a.role = 'ADMIN'")
    List<Account> retrieveAllAdmin();

    //Write a JPQL query to sort all accounts with age
    @Query("select a from Account a order by a.age")
    List<Account> retrieveAllAccountByAge();
    //Desc
    @Query("select a from Account a order by a.age desc")
    List<Account> retrieveAllAccountByAgeDesc();


    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
    @Query(value = "select * from account_details where age < ?1",nativeQuery = true)
    List<Account> retrieveAgeLessThan(Integer age);

    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
    @Query(value = "select * from account_datails where name ilike concat('%',?1,'%' OR address  ILIKE concat('%',?1,'%') OR country  ILIKE concat('%',?1,'%') OR state  ILIKE concat('%',?1,'%') OR city  ILIKE concat('%',?1,'%')",nativeQuery = true)
    List<Account> retrieveContainsAccount(String pattern);

    //Write a native query to read all accounts with an age higher than a specific value
    @Query(value = "select * from account_details where age > :age",nativeQuery = true)
    List<Account> retrieveAgeGreaterThan(@Param("age") Integer age);

}
