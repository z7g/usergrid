/*
 * Copyright 2014 The Apache Software Foundation.
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

package org.apache.usergrid.rest.applications.collection;


import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.usergrid.rest.AbstractRestIT;
import org.apache.usergrid.rest.TestContextSetup;

import static org.junit.Assert.fail;


public class DuplicateNameIT extends AbstractRestIT {

    private static final Logger logger = LoggerFactory.getLogger( DuplicateNameIT.class );

    @Rule
    public TestContextSetup context = new TestContextSetup( this );

    @Test
    public void duplicateNamePrevention() {

        fail("This test is incorrectly written and should not use direct serialization to test duplicate names");

//        CustomCollection things = context.application().customCollection( "things" );
//
//        Map<String, String> entity = MapUtils.hashMap( "name", "enzo" );
//
//        try {
//            things.create( entity );
//        } catch (IOException ex) {
//            logger.error("Cannot create entity", ex);
//        }
//
//        refreshIndex( context.getAppUuid() );
//
//        Injector injector = Guice.createInjector( new TestGuiceModule( null ) );
//        SerializationFig sfig = injector.getInstance( SerializationFig.class );
//
//        // wait for any temporary unique value records to timeout
//        try { Thread.sleep( sfig.getTimeout() * 1100 ); } catch (InterruptedException ignored) {}
//
//        try {
//            things.create( entity );
//            fail("Should not have created duplicate entity");
//
//        } catch (Exception ex) {
//            // good
//        }
    }
}
