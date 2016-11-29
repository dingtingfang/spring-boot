Bean的scope:
Scope 描述的是Spring 容器如何新建Bean的实例。Spring 的Scope有以下几种（通过@Scope来实现）：

1.Singleton: 一个sping 容器只有一个Bean实例，此为Spring的默认配置，全容器共享一个实例。
2.Prototype: 每次调用就新建一个Bean实例。
3.Request: web项目中，每一个http request 新建一个Bean。
4.Session: web项目中，每一个http session 新建一个Bean.
5.GlobalSession:这个只在portal应用中有用，给每一个global http session 新建一个Bean实例。
6.StepScope