Spring的事件为Bean和Bean之间的消息通信提供了支持。当一个Bean处理完一个任务之后，希望另外一个Bean知道并能
做出相应的处理，这时我们就需要让另外一个Bean监听当前Bean所所发送的事件。
spring的事件遵循如下流程：
1.自定义事件，继承ApplicationEvent
2.定义事件监听器，实现ApplicationListener接口
3.使用容器发布事件