package com.cooper.showcase.resources;

import java.util.List;

import com.cooper.showcase.model.Photo;

public interface PhotoAlbumResource {

	List<Photo> getPhotosByAlbumId(int albumId);

}