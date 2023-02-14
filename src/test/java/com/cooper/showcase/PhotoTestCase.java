package com.cooper.showcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cooper.showcase.model.Photo;

class PhotoTestCase {

	@Test
	void testNoArgConstructor() {
		Photo photo = new Photo();
		photo.setAlbumId(1);

		photo.setId(2);
		photo.setTitle("Cat");
		photo.setUrl("urlString");
		photo.setThumbnailUrl("ThumbnailUrl");
		assertEquals(2,photo.getId());
		assertEquals(1,photo.getAlbumId());
		assertEquals("Cat",photo.getTitle());
		assertEquals("urlString",photo.getUrl());
		assertEquals("ThumbnailUrl",photo.getThumbnailUrl());
				

	}

	@Test
	void testConstructor() {
		Photo photo = new Photo(1,2,"Cat","urlString","ThumbnailUrl");
		
		assertEquals(2,photo.getId());
		assertEquals(1,photo.getAlbumId());
		assertEquals("Cat",photo.getTitle());
		assertEquals("urlString",photo.getUrl());
		assertEquals("ThumbnailUrl",photo.getThumbnailUrl());
		assertEquals("Photo [albumId=1, id=2, title=Cat, url=urlString, thumbnailUrl=ThumbnailUrl]", photo.toString());
				

	}

	@Test
	void testToStringr() {
		Photo photo = new Photo(1,2,"Cat","urlString","ThumbnailUrl");
		assertEquals("Photo [albumId=1, id=2, title=Cat, url=urlString, thumbnailUrl=ThumbnailUrl]", photo.toString());
				

	}
	@Test
	void testToConsoleResults() {
		Photo photo = new Photo(1,2,"Cat","urlString","ThumbnailUrl");
		
		assertEquals("[2] Cat", photo.toConsoleResults());		

	}
}
