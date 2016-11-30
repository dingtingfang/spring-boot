	Spring Aware
	Spring 的依赖注入的最大亮点就是 所有的Bean对Spring 容器的存在是没有意识的。
	在实际项目中，不可避免的要用到spring容器本身的功能资源，这就是所谓的Spring Aware.
	这样将会使Bean和Spring框架耦合。
	
	以下是Spring 提供的Aware的接口:
	BeanNameAware:获得到容中Bean的名称;
	BeanFactoryAware:获得当前BeanFactory，这样可以调用容器的服务;
	ApplicationContextAware*:当前的Application context，这样调用容器服务;
	MessageSourceAware:获得message source,这样可以获得文本信息;
	ApplicationEventPublisherAware:应用时间发布器;
	ResourceLoaderAware:获得资源加载器，可以获得外部资源文件;