## 工厂模式
###设计意图：对象的创建和使用相分离
###应用场景：
当创建的逻辑比较复杂，是一个“大工程”的时候，我们可以使用工厂模式

那到底使用简单工厂还是工厂方法呢？还是抽象方法？

1. 当我们需要在运行时动态的根据type来创建对象时，
那么这时候我们可以把一大陀的if-else放在工厂类中，推荐使用简单工厂。

但是，当创建的对象比较复杂，可以把创建每个对象的逻辑剥离出来
也就是使用工厂方法

2. 另外，尽管我们不需要根据type来判断创建不同大的对象，但是单个对象的创建逻辑本身就很复杂，
这时候我们也可以使用工厂方法
