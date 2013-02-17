package com.fastorm.query;

public interface Queryable {

    /**
     * Builds sql query
     * @param query
     * @return
     */
    public StringBuilder buildQuery(String query);
}
