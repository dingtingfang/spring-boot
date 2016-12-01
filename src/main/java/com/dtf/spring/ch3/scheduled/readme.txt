计划任务在Spring中的实现变得异常的简单。

首先在配置类注解：@EnableScheduling 来开启对计划任务的支持，然后在执行任务的方法上注解@Scheduled,声明这是一个计划任务。

Spring通过@Scheduled支持多种类型的计划任务，包含cron,fixDelay,fixRate等等。