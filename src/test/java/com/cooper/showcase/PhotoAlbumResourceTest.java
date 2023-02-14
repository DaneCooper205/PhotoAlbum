package com.cooper.showcase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.cooper.showcase.model.Photo;
import com.cooper.showcase.resources.PhotoAlbumResource;
import com.cooper.showcase.resources.impl.PhotoAlbumResourceImpl;

class PhotoAlbumResourceTest {

	@Test
	void test() {
		PhotoAlbumResource par = new PhotoAlbumResourceImpl();
		List<Photo> photoList = par.getPhotosByAlbumId(2);
		assertEquals( 50, photoList.size());
		
	}
	

	@Test
	void testBadInput() {
		PhotoAlbumResource par = new PhotoAlbumResourceImpl();
		List<Photo> photoList = par.getPhotosByAlbumId(-1);
		assertEquals(0, photoList.size());
		
	}

}
