/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2017, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */

package org.geotools.data.wmts.response;

import java.io.IOException;

import org.geotools.data.ows.HTTPResponse;
import org.geotools.data.ows.Response;
import org.geotools.ows.ServiceException;

/**
 * 
 * (Based on existing work by rgould for WMS service)
 * @author ian
 * @author Emanuele Tajariol (etj at geo-solutions dot it)
 */
public class GetLegendGraphicResponse extends Response {


    public GetLegendGraphicResponse( HTTPResponse httpResponse ) throws ServiceException, IOException {
        super(httpResponse);
        
        String contentType = getContentType();
        if (contentType != null && contentType.toLowerCase().indexOf("text/xml") != -1) {
            try{
        	throw parseException(getInputStream());
            }finally{
                dispose();
            }
        }
    }

}
