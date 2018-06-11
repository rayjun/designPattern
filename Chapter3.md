### 适配器模式

适配器模式的意图在于，使用不同接口的类所提供的服务为客户端提供它所期望的接口。

> 接口适配是通过创建一个新的类来同时实现预定的接口和目标代码类。

> 如果没有定义接口，就不能使用接口适配，那么就需要使用对象适配，对象适配就是通过继承所需要的类然后使用目标代码类的对象来完成适配



在某些情况下，可以不用适配器模式，而是直接去调用目标代码，但是如果无法修改和重写目标代码时，不使用适配器模式可能会有问题，耦合度过高。





### 挑战

#### 3.4
因为 OozinozSkyrocket 与 SkyRocket 的耦合程度太高。
- Skyrocket 类可能会变化
- Skyrocket 的变量可能会变化