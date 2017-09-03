package org.eop.spring.restful.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Part;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/file")
@RestController
public class FileController {

	@PostMapping(path = "/post")
	public Map<String, Object> uploadFile(@RequestPart("name") String name, @RequestPart("file") Part file) {
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("oname", file.getSubmittedFileName());
		map.put("size", file.getSize());
		map.put("contentType", file.getContentType());
		return map;
	}
}
