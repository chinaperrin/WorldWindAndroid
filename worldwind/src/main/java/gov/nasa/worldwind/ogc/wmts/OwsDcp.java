/*
 * Copyright (c) 2017 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration. All Rights Reserved.
 */

package gov.nasa.worldwind.ogc.wmts;

import gov.nasa.worldwind.util.xml.XmlModel;

public class OwsDcp extends XmlModel {

    protected OwsHttpMethod getMethod;

    protected OwsHttpMethod postMethod;

    public String getGetHref() {
        if (this.getMethod == null) {
            return null;
        }
        return this.getMethod.getHref();
    }

    public Boolean isGetMethodSupportKV() {
        if (this.getMethod == null) {
            return null;
        }
        return this.getMethod.allowedValues.contains("KVP");
    }

    public String getPostHref() {
        if (this.postMethod == null) {
            return null;
        }
        return this.postMethod.getHref();
    }

    public Boolean isPostMethodSupportKV() {
        if (this.postMethod == null) {
            return null;
        }
        return this.postMethod.allowedValues.contains("KVP");
    }

    @Override
    protected void parseField(String keyName, Object value) {
        if (keyName.equals("HTTP")) {
            OwsHttp http = (OwsHttp) value;
            this.getMethod = http.getGetMethod();
            this.postMethod = http.getPostMethod();
        }
    }
}
