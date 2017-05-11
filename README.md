# spring-boot-dubbox
spring-boot 集成dubbox

## ZooKeeper 
Maker sure your zookeeper configuration is right.

`resources\application.properties`

```
spring.dubbo.registryConfig.address=zookeeper://172.16.1.27:2181
```

## Test Url

After you start the `Consumer`,you browse the URL 


|Function| UrL|  
|-------|-------|  
| Get Users | [http://127.0.0.1:8080/users](http://127.0.0.1:8080/users)|     
| Get Specific User | [http://127.0.0.1:8080/users/2](http://127.0.0.1:8080/users/2)|

