package com.zq.dataservice.controller;

import com.zq.dataservice.bean.IndexData;
import com.zq.dataservice.config.IpConfiguration;
import com.zq.dataservice.service.IndexDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexDataController {
	@Autowired
    private IndexDataService indexDataService;
	@Autowired
    private IpConfiguration ipConfiguration;
	
//	http://127.0.0.1:8021/data/000300

	@GetMapping("/data/{code}")
	public List<IndexData> get(@PathVariable("code") String code) throws Exception {
		System.out.println("current instance is :" + ipConfiguration.getPort());
		return indexDataService.get(code);
	}
}

