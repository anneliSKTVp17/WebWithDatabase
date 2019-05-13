/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.models.User;
import java.util.List;

/**
 *
 * @author user
 */
public interface UsersDao extends CrudDao<User> {
    List<User> findAllByFirstName(String firstName);
}
