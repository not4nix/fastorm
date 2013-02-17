package com.fastorm.query;

/**
 * Database column model
 */
class DatabaseColumn {

    private String mColumnName;
    private String mColumnAlias;

    public DatabaseColumn(String name, String alias){
        this.mColumnName = name;
        this.mColumnAlias = alias;
    }

    public String getColumnAlias() {
        return mColumnAlias;
    }

    public void setColumnAlias(String mColumnAlias) {
        this.mColumnAlias = mColumnAlias;
    }

    public String getColumnName() {
        return mColumnName;
    }

    public void setColumnName(String mColumnName) {
        this.mColumnName = mColumnName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatabaseColumn that = (DatabaseColumn) o;

        if (mColumnAlias != null ? !mColumnAlias.equals(that.mColumnAlias) : that.mColumnAlias != null) return false;
        if (!mColumnName.equals(that.mColumnName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mColumnName.hashCode();
        result = 31 * result + (mColumnAlias != null ? mColumnAlias.hashCode() : 0);
        return result;
    }
}
