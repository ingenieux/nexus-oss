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
package org.sonatype.nexus.proxy.repository;

import java.util.Arrays;
import java.util.List;

import org.codehaus.plexus.util.xml.Xpp3Dom;

public abstract class AbstractWebSiteRepositoryConfiguration
    extends AbstractRepositoryConfiguration
{
    private static final String WELCOME_FILES = "welcomeFiles";

    public AbstractWebSiteRepositoryConfiguration( Xpp3Dom configuration )
    {
        super( configuration );
    }

    public List<String> getWelcomeFiles()
    {
        List<String> result = getCollection( getRootNode(), WELCOME_FILES );

        if ( result.isEmpty() )
        {
            // default it
            setCollection( getRootNode(), WELCOME_FILES, Arrays.asList( new String[] { "index.html", "index.htm" } ) );

            return getWelcomeFiles();
        }
        else
        {
            return result;
        }
    }

    public void setWelcomeFiles( List<String> vals )
    {
        setCollection( getRootNode(), WELCOME_FILES, vals );
    }
}
