package com.fastorm.query;

public interface Queryable {

    /**
     * Builds sql query
     * @param query
     * @return query
     */
    public String buildQuery(StringBuilder query);
}
