package com.yixl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope  //从配置中心刷新文件
public class HelloController {

	@Value("${server.port}")
	private int port;

	@Value("${from}") // 从对应的配置中心找到文件并把属性注入到value值中
	private String value;

	@RequestMapping("index")
	public String index() {
		return "Hello World!,from：" + value;
	}
}
