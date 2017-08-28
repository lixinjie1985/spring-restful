package org.eop.spring.restful.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixinjie
 * @since 2017-08-28
 */
@RequestMapping("/map")
@RestController
public class MapController {

	@GetMapping("/get")
	public Map<String, Object> getMap() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("int", 1010);
		map.put("string", "hello");
		map.put("bool", true);
		map.put("null", null);
		map.put("date", new Date());
		return map;
	}
}
