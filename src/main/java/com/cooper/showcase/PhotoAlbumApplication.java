package com.cooper.showcase;


import java.util.List;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cooper.showcase.model.Photo;
import com.cooper.showcase.resources.PhotoAlbumResource;
import com.cooper.showcase.resources.impl.PhotoAlbumResourceImpl;

@SpringBootApplication
public class PhotoAlbumApplication {

	public static void main(String[] args) {
		
		String albumSt = args[0];
		int albumId = Integer.parseInt(albumSt);
		PhotoAlbumResource par =new PhotoAlbumResourceImpl();
		List<Photo> photoList = par.getPhotosByAlbumId( albumId);
		System.out.println( ">photo-album " + albumId);
		photoList.forEach( photo->{
			System.out.println(photo.toConsoleResults());
		});
	}

}
