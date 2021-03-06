/*
	Copyright (C) 2012 Thales Transportation Systems UK
	Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), 
	to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
	and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
	The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS 
	IN THE SOFTWARE.
 */

package com.thales.ntis.subscriber.utils;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This handler logs the marshaling and un-marshaling issues to console.
 * 
 */

public class ValidationEventHandlerImpl implements ValidationEventHandler {

    private static final Logger LOG = LoggerFactory
            .getLogger(ValidationEventHandlerImpl.class);

    @Override
    public boolean handleEvent(ValidationEvent event) {

        switch (event.getSeverity()) {
            case ValidationEvent.FATAL_ERROR:
                LOG.error(event.toString());
                break;
            case ValidationEvent.ERROR:
                LOG.error(event.toString());
                break;
            case ValidationEvent.WARNING:
                LOG.warn(event.toString());
                break;
            default:
                LOG.info(event.toString());
                break;
        }

        return true;
    }
}
