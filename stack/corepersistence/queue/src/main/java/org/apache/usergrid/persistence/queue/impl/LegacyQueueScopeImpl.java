/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  The ASF licenses this file to You
 * under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.  For additional information regarding
 * copyright in this work, please see the NOTICE file in the top level
 * directory of this distribution.
 */
package org.apache.usergrid.persistence.queue.impl;

import org.apache.usergrid.persistence.queue.LegacyQueueScope;

public class LegacyQueueScopeImpl implements LegacyQueueScope {

    private final String name;
    private final RegionImplementation regionImpl;
    private final boolean isDeadLetterQueue;

    public LegacyQueueScopeImpl(final String name, final RegionImplementation regionImpl) {
        this.name = name;
        this.regionImpl = regionImpl;
        this.isDeadLetterQueue = false;
    }

    public LegacyQueueScopeImpl(final String name, final RegionImplementation regionImpl, final boolean isDeadLetterQueue) {
        this.name = name;
        this.regionImpl = regionImpl;
        this.isDeadLetterQueue = isDeadLetterQueue;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public RegionImplementation getRegionImplementation() {return regionImpl;}

    @Override
    public boolean isDeadLetterQueue() {return isDeadLetterQueue;}

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( !( o instanceof LegacyQueueScopeImpl) ) {
            return false;
        }

        final LegacyQueueScopeImpl queueScope = (LegacyQueueScopeImpl) o;

        if ( !name.equals( queueScope.name ) ) {
            return false;
        }

        if ( regionImpl != queueScope.getRegionImplementation() ) {
            return false;
        }

        if ( isDeadLetterQueue != queueScope.isDeadLetterQueue ) {
            return false;
        }

        return true;
    }


    @Override
    public int hashCode() {
        String deadLetter = "REGULAR";
        if (isDeadLetterQueue) {
            deadLetter = "DEADLETTER";
        }
        String hashString = name + "|" + regionImpl.name() + "|" + deadLetter;
        return hashString.hashCode();
    }
}
