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

}
