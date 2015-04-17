/*
 * Copyright 2015, Teradata, Inc. All rights reserved.
 */

package com.teradata.test.fulfillment.table;

import com.teradata.test.fulfillment.NamedObjectsState;

import java.util.Map;

public class MutableTablesState
       extends NamedObjectsState<TableInstance>
{

    public MutableTablesState(Map<String, TableInstance> mutableTableInstances)
    {
        super(mutableTableInstances, "mutable table");
    }
}