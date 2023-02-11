package com.cooper.showcase.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cooper.showcase.model.Photo;

public class PhotoAlbumResource {
	final private String BASE_URL = "https://jsonplaceholder.typicode.com/photos?albumId=3";

	public List<Photo> getPhotosByAlbumId( int albumId) {
		RestTemplate restTemplate = new RestTemplate();
		
		
		ResponseEntity<Photo[]> responseEntity = restTemplate.getForEntity(BASE_URL, Photo[].class);
		Photo[] photoArray = responseEntity.getBody();
		
		return Arrays.stream( photoArray)
				 .collect(Collectors.toList());
		
		
	}

}
