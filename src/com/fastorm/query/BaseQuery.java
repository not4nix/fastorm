package com.fastorm.query;

public abstract class BaseQuery implements Queryable{

    public BaseQuery(){
    }

    /**
     * This method must be overridden in child class
     * @param query
     * @return query string
     */
    @Override
    public String buildQuery(StringBuilder query) {
        return query.toString();
    }
}
