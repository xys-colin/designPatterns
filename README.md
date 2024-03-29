# 设计模式

## 一、面向对象设计原则

- 单一职责原则（Single Responsibility Principle, **SRP**）

  > 对类来说,即一个类应该只负责一项职责,如类A负责两个不同职责: 职责1, 职责2.
  >
  > 当职责1 需求变更而改变A时,可能造成职责2执行错误,所以需要将类A的粒度分解为A1,A2

- 开闭原则（Open-Closed Principle, **OCP**）

  > 1. 一个软件实体如类，模块和函数应该对扩展开放，对修改关闭。用抽象构建框架，用实现扩展细节。
  > 2. 当软件需要变化时，尽量通过扩展软件实体地行为来实现变化，而不是通过修改已有的代码来实现变化。

- 里氏代换原则（Liskov Substitution Principle, **LSP**）

  > 1. 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生改变，那么类型T2是类型T1的子类型。换句话说，所有引用基类的地方必须能透明地使用其子类地对象。
  > 2. 在使用继承时，遵循里氏代换原则，在子类中尽量不要重写父类地方法。
  > 3. 继承实际上让两个类耦合性增强了，在适合地情况下，可以通过聚合、组合、依赖来解决问题。

- 依赖倒置原则（Dependence Inversion Principle,**DIP**）

  > 1. 高层模块不应该依赖低层模块, 二者都应该依赖其抽象
  >
  > 2. 抽象不应该依赖细节, 细节应该依赖抽象
  >
  > 3. 依赖倒置的中心思想是面向接口编程

  依赖关系传递的三种方式: 接口传递、构造方法传递、setter方式传递

  继承时需要遵循里氏代换原则

- 接口隔离原则（Interface Segregation Principle, **ISP**）

  > 客户端不应该依赖它不需要的接口,即一个类对另外一个类的依赖应该建立在最小的接口上

- 合成复用原则（Composite Reuse Principle, **CRP**）

  > 尽量使用合成/聚合的方式，而不是使用继承。

- 最少知识原则（Law of Demeter, **LoD**）

  就任何对象而言，在该对象的方法内，我们只应该调用属于以下范围的方法：

  - 该对象本身
  - 被当做方法的参数而传递进来的对象
  - 此方法所创建或实例化的任何对象
  - 对象的任何组件（组件想象成是被实例变量所引用的任何对象，换句话说，把这想象成是“有一个”（HAS-A）关系）

  前三个方法告诉我们，如果某对象是调用其他的方法的返回结果，不要调用该对象的方法；
- 好莱坞原则
  > 别调用我们，我们会调用你。这样可以给我们一种防止“依赖腐败”的方法。在此原则下，我们允许低层组件将自己挂钩系统上，但是高层组件会决定什么时候和怎样使用这些低层组件。换句话说，高层组件对待低层组件的方式是“别调用我们，我们会调用你”。

## 二、设计模式类型

### 2.1 创建型模式

1. 单例模式：确保一个类只有一个实例，并提供一个全局访问点

2. 抽象工厂模式：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体了

   >抽象工厂的方法经常以工厂方法的方式实现，抽象工厂的任务是定义一个负责创建一组产品的接口。这个接口内的每个方法都负责创建一个具体产品同时我们利用实现抽象工厂的子类来提供这些具体的做法。所以工厂方法模式潜伏在抽象工厂里面。
   >
   >抽象工厂使用对象组合：对象的创建被实现在工厂接口所暴露出来的方法中

3. 工厂方法模式：工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。

   > 工厂方法使用继承：把对象的创建委托给子类，子类实现工厂方法来创建对象

4. 原型模式

5. 建造者模式


### 2.2 结构性模式

1. 适配器模式: 将一个类的接口,转换成客户所期望的另一个接口.适配器让原本接口不兼容的类可以合作无间.
   > 一般是一个适配器包装一个被适配者, 如果需要让一个适配器包装多个被适配者,这涉及到另外一个模式--外观模式
   > 
   > 适配器模式分为两种:对象适配器和类适配器, 由于类适配器需要多重继承才能实现,所以在Java中是不可能的. 对象适配器使用组合;类适配器使用继承来适配
2. 桥接模式
3. 装饰模式
4. 组合模式

    > 允许你将对象组合成树形结构来表现“整体/部分”层次结构。组合能让客户以一致的方式处理个别对象以及对象组合

5. 外观模式: 提供一个统一的接口,用来访问子系统中的一群接口. 外观定义了一个高层接口,让子系统更容易使用
6. 享元模式
7. 代理模式

适配器模式\装饰者模式\外观模式的区别:
> 适配器将一个对象包装起来以改变其接口; 装饰者将一个对象包装起来以增加新的行为和责任; 而外观将一群对象"包装"起来以简化其接口.

### 2.3 行为型模式

1. 模板方法模式：在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。

   > 模板就是一个方法，这个方法将算法定义一组步骤，其中的任何步骤都可以是抽象的，由子类负责是实现。这可以确保算法的结构保持不变，同时由子类提供部分实现。

2. 命令模式：将“请求“封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
   > 当需要将发出请求的对象和执行请求的对象解耦的时候，使用命令模式
   >
   > 命令模式将发出请求的对象和执行请求的对象解耦。在被解耦的两者之间是通过命令对象进行沟通的。命令对象封装了接收者和一个或一组命令
   
3. 访问者模式

4. 迭代器模式

5. 观察者模式

6. 中介者模式

7. 备忘录模式

8. 解释器模式（Interpreter模式）

9. 状态模式

10. 策略模式

11. 职责链模式

## 三、UML 类图

### 3.1 类与类图

1. UML规定属性的表示方式为：

   **可见性 名称: 类型 [= 默认值 ]**

   其中可见性表示该属性对类外的元素是否可见，包括：

	> 公有（public）：+
	>
	> 私有（private）：-
	>
	> 受保护（protected）：#
	>
	> 包内可见性（package）：这是java增加的一种用 \*
	
2. UML规定操作的表示方式为：

   **可见性 名称([参数列表]) [: 返回类型]**

   其中：

   可见性的定义与属性定义相同

### 3.2 类之间的关系

1. 关联关系：是类与类之间最常用的一种关系，它是一种结构化关系，用于表示一类对象与另一类对象之间有联系。在UML类图中，用实线连接有关联的对象所对应的类，在Java、C++等编程语言实现关联关系时，通常将**一个类的对象作为另一个类的属性**。
   1. 双向关联。默认情况下，关联是双向的。双向关联用**直线**表示。
   2. 单向关联。单向关联用带**箭头的实线**表示。
   3. 自关联。类的属性对象类型为该类本身。
   4. 多重性关联。表示一个类的对象与另一个类的对象连接的个数
   5. 聚合关系。表示一个整体与部分的关系。在聚合关系中，成员类是整体类的一部分，即成员对象是整体对象的一部分，但是成员对象可以脱离整体对象独立存在。在UML中，用**空心菱形的直线**表示。聚合关系通过对象注入的方式来实现。
   6. 组合关系。组合关系也表示类之间整体和部分的关系，但是组合关系中部分和整体具有统一的生存期。在组合关系中，成员类是整体类的一部分，而且整体类可以控制成员类的生命周期，即成员类的存在依赖于整体类。组合关系用**带实心菱形的直线**表示。组合关系通过在整体类的构造函数中实例化成员类来实现。
2. 依赖关系：是一种使用关系，特定事物的改变有可能会影响到使用该事物的其他事物，在需要表示一个事物使用另一个事物时使用依赖关系。大多数情况下，依赖关系体现在某个类分方法使用另一个类的对象作为参数。在UML中，依赖关系用**带箭头的虚线**表示，由依赖的一方指向被依赖的一方。
3. 泛化关系：也就是继承关系，用于描述父类与子类之间的关系，用**空心三角形的实线表示**。
4. 接口与实现关系：接口之间也可以有与类之间关系类似的继承关系和依赖关系，但是接口和类之间还存在一种实现关系。在UML中，类与接口之间的实现关系用带**空心三角形的虚线**来表示。

   









