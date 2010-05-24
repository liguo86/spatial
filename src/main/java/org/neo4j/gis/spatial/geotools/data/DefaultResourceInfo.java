/*
 * Copyright (c) 2010
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.gis.spatial.geotools.data;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.geotools.data.ResourceInfo;
import org.geotools.feature.FeatureTypes;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.opengis.referencing.crs.CoordinateReferenceSystem;


/**
 * @author Davide Savazzi
 */
public class DefaultResourceInfo implements ResourceInfo {

	// Constructor
	
	public DefaultResourceInfo(String name, CoordinateReferenceSystem crs, ReferencedEnvelope bbox) {
		this.name = name;
		this.crs = crs;
		this.bbox = bbox;
	}
	
	
	// Public methods
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getTitle() {
		return name;
	}			
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public Set<String> getKeywords() {
        return keywords;
	}
	
	@Override
	public URI getSchema() {
        return FeatureTypes.DEFAULT_NAMESPACE;
	}

	@Override
	public CoordinateReferenceSystem getCRS() {
		return crs;
	}    		
	
	@Override
	public ReferencedEnvelope getBounds() {
		return bbox;
	}

	
	// Attributes
	
	private String name;
	private String description = "";
	private Set<String> keywords = new HashSet<String>();
	private CoordinateReferenceSystem crs;
	private ReferencedEnvelope bbox;
}