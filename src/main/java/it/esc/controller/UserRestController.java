package it.esc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.esc.data.dto.InputSearchRangeZoneAndTimeDTO;
import it.esc.data.repository.LocationRepository;
import it.esc.data.repository.UserRepository;
import it.esc.service.UserService;

@RestController
@RequestMapping(value="/rest/user")
public class UserRestController {

	
	
	@Autowired
	private LocationRepository locationRepo;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/getUserByRangeZoneAndTime",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> findUserByUgetUserByRangeZoneAndTimeserName(@RequestBody InputSearchRangeZoneAndTimeDTO input){
		try {
			return ResponseEntity.ok(locationRepo.findByLatitudeLessThanEqualAndLatitudeGreaterThanEqualAndLongitudeLessThanEqualAndLongitudeGreaterThanEqualAndInsDateLessThanEqualAndInsDateGreaterThanEqual(input.getMaxLat(), input.getMinLat(), input.getMaxLng(),input.getMinLng(),input.getStartDate(),input.getEndDate()));
		}
		catch(Exception e) {
			return new ResponseEntity<Exception>(e,HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	
	@RequestMapping(path="/toggleUser/{userName}",method=RequestMethod.POST)
	public ResponseEntity<?> toggleUser(@PathVariable("userName")String userName){
		try {
			return ResponseEntity.ok(userService.toggleUser(userName));
		}
		catch(Exception e) {
			return new ResponseEntity<Exception>(e,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
