package org.stjs.bridge.googlemaps.places;

import org.stjs.bridge.googlemaps.LatLngBounds;
import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class AutocompleteOptions {

	public Array<String> types;
	public LatLngBounds bounds;
	
	/**
	 * The component restrictions. Component restrictions are used to restrict predictions to only those within the parent component. E.g., the country.
	 */
	public ComponentRestrictions componentRestrictions;
}
