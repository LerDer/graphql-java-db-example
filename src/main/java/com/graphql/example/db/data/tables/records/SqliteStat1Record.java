/*
 * This file is generated by jOOQ.
*/
package com.graphql.example.db.data.tables.records;


import com.graphql.example.db.data.tables.SqliteStat1;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SqliteStat1Record extends TableRecordImpl<SqliteStat1Record> implements Record3<Object, Object, Object> {

    private static final long serialVersionUID = 1271241238;

    /**
     * Setter for <code>sqlite_stat1.tbl</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setTbl(Object value) {
        set(0, value);
    }

    /**
     * Getter for <code>sqlite_stat1.tbl</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getTbl() {
        return (Object) get(0);
    }

    /**
     * Setter for <code>sqlite_stat1.idx</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setIdx(Object value) {
        set(1, value);
    }

    /**
     * Getter for <code>sqlite_stat1.idx</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getIdx() {
        return (Object) get(1);
    }

    /**
     * Setter for <code>sqlite_stat1.stat</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setStat(Object value) {
        set(2, value);
    }

    /**
     * Getter for <code>sqlite_stat1.stat</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getStat() {
        return (Object) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Object, Object, Object> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Object, Object, Object> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field1() {
        return SqliteStat1.SQLITE_STAT1.TBL;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field2() {
        return SqliteStat1.SQLITE_STAT1.IDX;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field3() {
        return SqliteStat1.SQLITE_STAT1.STAT;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component1() {
        return getTbl();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component2() {
        return getIdx();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component3() {
        return getStat();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value1() {
        return getTbl();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value2() {
        return getIdx();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value3() {
        return getStat();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public SqliteStat1Record value1(Object value) {
        setTbl(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public SqliteStat1Record value2(Object value) {
        setIdx(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public SqliteStat1Record value3(Object value) {
        setStat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqliteStat1Record values(Object value1, Object value2, Object value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SqliteStat1Record
     */
    public SqliteStat1Record() {
        super(SqliteStat1.SQLITE_STAT1);
    }

    /**
     * Create a detached, initialised SqliteStat1Record
     */
    public SqliteStat1Record(Object tbl, Object idx, Object stat) {
        super(SqliteStat1.SQLITE_STAT1);

        set(0, tbl);
        set(1, idx);
        set(2, stat);
    }
}
