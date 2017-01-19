/*
 * Copyright (c) 2017 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration. All Rights Reserved.
 */

package gov.nasa.worldwind.ogc.wmts;

import java.util.LinkedHashSet;
import java.util.Set;

import gov.nasa.worldwind.util.xml.XmlModel;

public class WmtsLayer extends XmlModel {

    protected String identifier;

    protected String title;

    protected OwsWgs84BoundingBox boundingBox;

    protected Set<String> formats = new LinkedHashSet<>();

    protected Set<WmtsStyle> styles = new LinkedHashSet<>();

    protected Set<String> tileMatrixSetIds = new LinkedHashSet<>();

    protected Set<WmtsResourceUrl> resourceUrls = new LinkedHashSet<>();

    @Override
    protected void parseField(String keyName, Object value) {
        if (keyName.equals("Identifier")) {
            this.identifier = (String) value;
        } else if (keyName.equals("Title")) {
            this.title = (String) value;
        } else if (keyName.equals("WGS84BoundingBox")) {
            this.boundingBox = (OwsWgs84BoundingBox) value;
        } else if (keyName.equals("Format")) {
            this.formats.add((String) value);
        } else if (keyName.equals("Style")) {
            this.styles.add((WmtsStyle) value);
        } else if (keyName.equals("TileMatrixSetLink")) {
            this.tileMatrixSetIds.add(((WmtsTileMatrixSetLink) value).tileMatrixSetId);
        } else if (keyName.equals("ResourceURL")) {
            this.resourceUrls.add((WmtsResourceUrl) value);
        }
    }
}
