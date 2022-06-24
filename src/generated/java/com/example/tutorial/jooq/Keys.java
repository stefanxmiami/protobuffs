/*
 * This file is generated by jOOQ.
 */
package com.example.tutorial.jooq;


import com.example.tutorial.jooq.tables.Car;
import com.example.tutorial.jooq.tables.Users;
import com.example.tutorial.jooq.tables.records.CarRecord;
import com.example.tutorial.jooq.tables.records.UsersRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CarRecord> CAR_PKEY = Internal.createUniqueKey(Car.CAR, DSL.name("Car_pkey"), new TableField[] { Car.CAR.ID }, true);
    public static final UniqueKey<UsersRecord> USERS_PKEY = Internal.createUniqueKey(Users.USERS, DSL.name("Users_pkey"), new TableField[] { Users.USERS.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CarRecord, UsersRecord> CAR__CAR_USER_FKEY = Internal.createForeignKey(Car.CAR, DSL.name("car_user_fkey"), new TableField[] { Car.CAR.USER_ID }, Keys.USERS_PKEY, new TableField[] { Users.USERS.ID }, true);
}
