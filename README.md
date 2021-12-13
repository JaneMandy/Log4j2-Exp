#Log4j2 Rce利用工具。
##使用
  修改Exp.py里面的参数，如Path，设置为JDK8的java的绝对路径。（如果默认java是jdk8不用设置）
  修改Host,如果是DOCKER,设置为能够回连到Exp为止。建议使用VPS。
  请确保所有端口被攻击机可以连接。

##更新
取消掉了原有的Payload.
大家命令执行时避免命令冲突就行了,主要是直接命令行方式传入参数。如果想设置cs等等上线，建议使用长度较短的payload。


我也给大家提供了攻击环境。
* Log4j2RCE为本地测试环境
* demo.jar为vulfocus靶场的环境，注意都需要使用jdk8运行。  
*Docker镜像：vulfocus/log4j2-rce-2021-12-09:latest 容器会监听：8080端口 可以添加-p8080:8080参数进行访问
确保利用成功请运行expo和靶场环境均为JDK8。
如果JDK版本高于1.8.191等，请被攻击方URLCodebase参数为ture。否则攻击失败。


演示专用，大佬勿喷。   请勿用于非法用途。
