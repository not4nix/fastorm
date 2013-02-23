/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
