# Java常用API类

2019年7月31日
10:29

	1. Object
	所有类的根类，java中所有类直接或间接继承Object类
	若一个类未继承父类，那么这个类默认继承Object类。
	常用方法：
		equals（）	比较两个对象是否相等，比较的是地址
			基本数据类型的Wrapper类、String类重新类
			Equals方法，按值比较
		hashCode（）	默认返回对象的地址（10进制）
		toString（）	默认返回的是：类的完整名称@对象地址
			System.out.println（）；输出对象时，默认调用toString（）方法
		clone（）	克隆对象，对当前对象进行拷贝，创建一个内容（状态）相同的新的对象克隆的分类：深度克隆、浅度克隆浅度克隆：
			        克隆当前对象一层，对象的引用类型的状态（属性）不会克隆，而是直接赋值地址本体对象与克隆对象引用的对象是相同的。只克隆对象引用，属性只是引用被克隆对象的属性
			深度克隆：
			        克隆当前对象所有层，对象的引用类型的状态（属性）也会克隆。
			        本体对象与克隆对象引用的对象是不同的
	
	思考：==与equals的区别？
		==	可以比较基本数据类型和引用数据类型
			比较引用数据类型，按对象的地址比较
		equals	只能比较引用数据类型默认情况下，按对象的地址进行比较，若重写equals（方法），按方法中逻辑实现来比较，比如：String类型的对象，按字符序列进行比较
	
	拓展：Java运行时，JVM的内存结构？

	

	

	栈	存的是基本数据类型的值，引用类型变量的引用对象的地址
	堆	创建的对象
	方法区	又称之为静态方法区，加载完毕后的类信息对象（class）、常量、静态常量，字符串常量等，常量放在常量池中
	程序计数器	记录程序执行的位置（多线程）。
	
	2. Wrapper类
	八大封装类，八种基本数据类型的封装类
	byte	Byte
	short	Short
	int	Integer
	long	Long
	float	Float
	double	Double
	char	Character
	boolean	Boolean
	
	自动装箱与自动拆箱（jdk1.5+）
	int i = 100
	integer integer = i；//自动装箱
	int j = integer；//自动拆箱
	
	基本数据类型与字符串之间转换
	String str = “120”；
	int i = integer.parselnt(str);
	int j = 180;
	String str2 = String.valueof(j);

