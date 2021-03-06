/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.transport.amqp;

import org.mule.api.MuleException;
import org.mule.api.endpoint.InboundEndpoint;
import org.mule.api.transport.MessageRequester;
import org.mule.transport.AbstractMessageRequesterFactory;

/**
 * Creates instances of <code>AmqpMessageRequester</code>.
 */
public class AmqpMessageRequesterFactory extends AbstractMessageRequesterFactory
{

    @Override
    public MessageRequester create(final InboundEndpoint endpoint) throws MuleException
    {
        return new AmqpMessageRequester(endpoint);
    }

}
