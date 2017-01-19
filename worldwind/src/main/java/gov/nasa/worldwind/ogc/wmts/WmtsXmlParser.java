/*
 * Copyright (c) 2017 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration. All Rights Reserved.
 */

package gov.nasa.worldwind.ogc.wmts;

import gov.nasa.worldwind.util.xml.XmlModelParser;

public class WmtsXmlParser extends XmlModelParser {

    protected String owsNamespace = "http://www.opengis.net/ows/1.1";

    protected String wmtsNamespace = "http://www.opengis.net/wmts/1.0";

    protected String xlinkNamespace = "http://www.w3.org/1999/xlink";

    public WmtsXmlParser() {
        this.registerParsers();
    }

    protected void registerParsers() {

        this.registerTxtModel(owsNamespace, "Title");
        this.registerTxtModel(owsNamespace, "Abstract");
        this.registerTxtModel(owsNamespace, "Keyword");
        this.registerTxtModel(owsNamespace, "ServiceType");
        this.registerTxtModel(owsNamespace, "ServiceTypeVersion");
        this.registerTxtModel(owsNamespace, "Fees");
        this.registerTxtModel(owsNamespace, "AccessConstraints");
        this.registerTxtModel(owsNamespace, "ProviderName");
        this.registerTxtModel(owsNamespace, "Voice");
        this.registerTxtModel(owsNamespace, "Facsimile");
        this.registerTxtModel(owsNamespace, "DeliveryPoint");
        this.registerTxtModel(owsNamespace, "City");
        this.registerTxtModel(owsNamespace, "AdministrativeArea");
        this.registerTxtModel(owsNamespace, "PostalCode");
        this.registerTxtModel(owsNamespace, "Country");
        this.registerTxtModel(owsNamespace, "ElectronicMailAddress");
        this.registerTxtModel(owsNamespace, "IndividualName");
        this.registerTxtModel(owsNamespace, "PositionName");
        this.registerTxtModel(owsNamespace, "ProviderName");


        this.registerXmlModel(owsNamespace, "ServiceIdentification", OwsServiceIdentification.class);
        this.registerXmlModel(owsNamespace, "Keywords", OwsKeywords.class);
        this.registerXmlModel(wmtsNamespace, "Capabilities", WmtsCapabilities.class);
        this.registerXmlModel(owsNamespace, "Phone", OwsPhone.class);
        this.registerXmlModel(owsNamespace, "Address", OwsAddress.class);
        this.registerXmlModel(owsNamespace, "ContactInfo", OwsContactInfo.class);
        this.registerXmlModel(owsNamespace, "ServiceContact", OwsServiceContact.class);
        this.registerXmlModel(owsNamespace, "ProviderSite", OwsProviderSite.class);
        this.registerXmlModel(owsNamespace, "ServiceProvider", OwsServiceProvider.class);
    }
}
