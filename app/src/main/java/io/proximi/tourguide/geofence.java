package io.proximi.tourguide;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;

import static io.proximi.tourguide.R.id.map;

/**
 * Created by huzairuje on 06/10/16.
 */

public class geofence {
    map = googleMap;
    LatLng bandung = new LatLng(-6.937767, 107.603463);
    map.addMarker(new MarkerOptions().position(bandung).icon(BitmapDescriptorFactory.fromResource(R.drawable.test)).title("Museum Sribaduga"));
}
