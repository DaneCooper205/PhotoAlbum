package com.cooper.showcase.resources.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cooper.showcase.model.Photo;
import com.cooper.showcase.resources.PhotoAlbumResource;



public class PhotoAlbumResourceImpl implements PhotoAlbumResource  {
	final private String BASE_URL = "https://jsonplaceholder.typicode.com/photos?albumId=";
	

	@Override
	public List<Photo> getPhotosByAlbumId( int albumId) {
		RestTemplate restTemplate = new RestTemplate();
		
		
		ResponseEntity<Photo[]> responseEntity = restTemplate.getForEntity(BASE_URL+albumId, Photo[].class);
		Photo[] photoArray = responseEntity.getBody();
		
		return Arrays.stream( photoArray)
				 .collect(Collectors.toList());
		
		
	}
	

}
