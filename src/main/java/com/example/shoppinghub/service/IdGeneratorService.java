package com.example.shoppinghub.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

public class IdGeneratorService {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public String generateId(String prefix, String tableName, String idColumn) {
        // Lấy số lớn nhất hiện có trong bảng
        String sql = "SELECT COALESCE(MAX(CAST(SUBSTRING(" + idColumn + " FROM '[0-9]+') AS INTEGER)), 0) FROM " + tableName;
        Query query = entityManager.createNativeQuery(sql);
        Integer maxId = (Integer) query.getSingleResult();

        // Sinh ID mới
        int newId = maxId != null ? maxId + 1 : 1;
        return prefix + newId;
    }
}
