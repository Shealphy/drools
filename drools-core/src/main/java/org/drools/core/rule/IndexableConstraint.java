/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.drools.core.rule;

import org.drools.core.util.AbstractHashTable.FieldIndex;
import org.drools.core.util.index.IndexUtil;
import org.drools.core.RuleBaseConfiguration;
import org.drools.core.spi.Constraint;
import org.drools.core.spi.FieldValue;
import org.drools.core.spi.InternalReadAccessor;

public interface IndexableConstraint extends Constraint {

    boolean isUnification();

    boolean isIndexable(short nodeType, RuleBaseConfiguration config);

    IndexUtil.ConstraintType getConstraintType();

    FieldValue getField();

    FieldIndex getFieldIndex();

    InternalReadAccessor getFieldExtractor();

    default void unsetUnification() { }

    Declaration getIndexingDeclaration();
}
