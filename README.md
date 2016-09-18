# SMBlogExample

该Demo基于网上的一例子而开发, 那个例子写的是JFinal极速开发，下载看了之后发现不是，但看实子类型不错！！
所有改为使用 Spring4.1.5 + Mybatis + MySQL + Maven + jetty/tomcat形式开发的Demo实例，将其分页功能实现，但还需要优化。

Run mode:
1. eclipse下使用tomcat

	右键项目 --> Run As --> Run on Server -->select tomcatx.x
	
2. eclipse下使用jetty

	右键项目 --> Run As --> Run Configuration... -->Maven Build --> New一个运行实例。
		goals: clean jetty:run
		profiles: 如果有属性配置文件指定上，没有可空
		
3. Command line use mvn

	$ mvn clean install
	$ mvn clean jetty:run
	$ mvn clean package 
		或  $mvn clean package -P <profile>
		或  $mvn clean package -P <profile> -Dmaven.test.skip=true