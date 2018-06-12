### 外观(Facade)模式

一个外观就是一个类，它包含的功能介于工具包与完整的应用程序之间，为工具包或者子系统提供了简单的用法。


> 外观模式的意图是为子系统提供一个接口，便于它的使用。






### 挑战


#### 4.1 示例类和外观类的区别
- 示例类不能被其他类调用
- 示例类有一段演示代码

#### 4.2 JOptionPane 是外观类、工具类还是示例类
是示例类，因为这个类没有办法被其他地方调用。