package com.cooper.showcase;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cooper.showcase.model.Photo;
import com.cooper.showcase.resources.PhotoAlbumResource;
@SpringBootApplication
public class PhotoAlbumApplication {

	public static void main(String[] args) {
	
		PhotoAlbumResource par =new PhotoAlbumResource();
		List<Photo> photoList = par.getPhotosByAlbumId(3);
		
		photoList.forEach( photo->{
			System.out.println(photo.toString());
		});
		System.err.print( "I returned " + photoList.size());
	}

}
