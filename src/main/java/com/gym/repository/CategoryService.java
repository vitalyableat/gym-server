package com.gym.repository;

import com.gym.DBConnection;
import com.gym.entity.Category;

import java.sql.Connection;
import java.util.List;

public interface CategoryService {
    Connection connection = DBConnection.getConnection();

    boolean createCategory(Category category);
    boolean updateCategory(Category category);
    boolean deleteCategory(int id);
    List<Category> getCategoriesByType(String type);
}
