# 说明
## 背景知识
经查百度，知mybatis【v3.0】中没有专门针对多对多的级联操作
## 实现思路
本次实现思路是利用一对多叠加的实现

图示:
![](E:\JavaEE\多表查询之多对多\explain_picture\多对多图示.png)

## 相关架构
###数据库
####整体架构
![数据库架构](E:\JavaEE\多表查询之多对多\explain_picture\数据库架构.png "数据库架构")<br/>
ER图：
![ER](E:\JavaEE\多表查询之多对多\explain_picture\ER图.png "ER")<br/>
####数据表数据
表stu_table:
![stu_table](E:\JavaEE\多表查询之多对多\explain_picture\stu_table.png "stu_table")

表tea_table:
![tea_table](E:\JavaEE\多表查询之多对多\explain_picture\tea_table.png "tea_table")

### 程序架构
#### 整体架构
##### 类
+ Dao
+ Utils工具类
+ 实现类【Student、Teacher】
+ Test测试类

##### 资源文件
+ xml
  + 核心配置文件
  + sql实现类映射文件【对应实现类】
+ properties资源文件【配置四大参数】

##程序运行评估
![程序运行效果](E:\JavaEE\多表查询之多对多\explain_picture\程序运行截图.png)

![](E:\JavaEE\多表查询之多对多\explain_picture\stu_table运行结果.png)
![](E:\JavaEE\多表查询之多对多\explain_picture\tea_table运行结果.png)

_注意:若外键没有相关映射【例如student中teaid均未与teacher中id=1绑定】时,会输出null,此为正常现象非bug_