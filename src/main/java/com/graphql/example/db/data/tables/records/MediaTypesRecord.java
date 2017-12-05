/*
 * This file is generated by jOOQ.
*/
package com.graphql.example.db.data.tables.records;


import com.graphql.example.db.data.tables.MediaTypes;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MediaTypesRecord extends UpdatableRecordImpl<MediaTypesRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1701691400;

    /**
     * Setter for <code>media_types.MediaTypeId</code>.
     */
    public void setMediatypeid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>media_types.MediaTypeId</code>.
     */
    public Integer getMediatypeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>media_types.Name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>media_types.Name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MediaTypes.MEDIA_TYPES.MEDIATYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MediaTypes.MEDIA_TYPES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getMediatypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMediatypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaTypesRecord value1(Integer value) {
        setMediatypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaTypesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaTypesRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MediaTypesRecord
     */
    public MediaTypesRecord() {
        super(MediaTypes.MEDIA_TYPES);
    }

    /**
     * Create a detached, initialised MediaTypesRecord
     */
    public MediaTypesRecord(Integer mediatypeid, String name) {
        super(MediaTypes.MEDIA_TYPES);

        set(0, mediatypeid);
        set(1, name);
    }
}