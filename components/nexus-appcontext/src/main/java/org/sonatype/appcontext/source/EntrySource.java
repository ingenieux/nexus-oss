/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2013 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.appcontext.source;

import java.util.Map;

import org.sonatype.appcontext.AppContextException;
import org.sonatype.appcontext.AppContextRequest;

/**
 * A EntrySource provides key=values from various sources, that will make into the AppContext.
 * 
 * @author cstamas
 */
public interface EntrySource
{
    /**
     * Returns the entry source marker.
     * 
     * @return
     */
    EntrySourceMarker getEntrySourceMarker();

    /**
     * Returns a map of key=values to have them put into the AppContext.
     * 
     * @param request
     * @return a map of key=vqlues to be put into AppContext.
     * @throws AppContextException
     */
    Map<String, Object> getEntries( AppContextRequest request )
        throws AppContextException;
}
