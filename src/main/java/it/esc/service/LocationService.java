package it.esc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.esc.data.Location;
import it.esc.data.User;
import it.esc.data.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	/**
	 * 
	 * @param maxLat
	 * @param maxLng
	 * @param minLat
	 * @param minLng
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 */
	public List<User> findUserRangeZoneAndTime(Double maxLat,Double maxLng,Double minLat,Double minLng,String startDate,String endDate)throws Exception{
		return locationRepository.findByLatitudeLessThanEqualAndLatitudeGreaterThanEqualAndLongitudeLessThanEqualAndLongitudeGreaterThanEqualAndInsDateLessThanEqualAndInsDateGreaterThanEqual(maxLat, minLat, maxLng, minLng, startDate, endDate)
				.stream().map(Location::getUser)
				.collect(Collectors.toList());
	}
	
}
