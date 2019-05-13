/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author user
 */
public class UsersDaoJdbcImpl implements UsersDao {

   private final String SQL_SELECT_ALL = 
           "SELECT * FROM fix_user";
   private final String SQL_SELECT_BY_ID = 
           "SELECT * FROM fix_user WHERE id = ?";
   
   private Connection connection;
   
   public UsersDaoJdbcImpl(DataSourse dataSourse) {
       try {
           this.connection = dateSourse.getConnection();
       } catch (SQLException e) {
           throw new IllegalStateException(e);
       }
    }

    @Override
    public List<User> findAllByFirstName(String firstName) {
        return null;
    }

    @Override
    public Optional<User> find(Integer id) {
    try {
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_BY_ID);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        
        if (resultSet.next()) {
            String firstName = resultSet.getString("first_name");
            String lastName  = resultSet.getString("last_name");
            return Optional.of(new User(id, firstName, lastName));
        }
        return Optional.empty();
    }
    }

    
    
    
    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
