package cn.tedu; //包名路径必须在所有类父级目录中,必须有包路径


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

//启动类
@SpringBootApplication //标识这个启动类是springboot程序
public class RunApp implements EmbeddedServletContainerCustomizer{
	//执行入口
	public static void main(String[] args) {
		//需要spring环境servlet运行环境
		SpringApplication.run(RunApp.class, args);
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer arg0) {
		arg0.setPort(8088);
	}

}
