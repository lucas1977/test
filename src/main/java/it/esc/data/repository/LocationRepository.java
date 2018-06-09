package it.esc.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.esc.data.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

	public List<Location> findByLatitudeLessThanEqualAndLatitudeGreaterThanEqualAndLongitudeLessThanEqualAndLongitudeGreaterThanEqualAndInsDateLessThanEqualAndInsDateGreaterThanEqual(Double maxLat,Double minLat,Double maxLng,Double minLng,String maxDate,String minDate);
}
