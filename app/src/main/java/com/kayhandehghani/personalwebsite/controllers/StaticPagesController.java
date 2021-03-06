package com.kayhandehghani.personalwebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class StaticPagesController {

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String getContact() {
		return "_contact.html";
	}
	
	@RequestMapping(value = "/image-editor", method = RequestMethod.GET)
	public String getImgEditor() {
		return "_img.html";
	}
	
	@RequestMapping(value = "/image-album", method = RequestMethod.GET)
	public String getImageAlbum() {
		return "_album.html";
	}
	
}
