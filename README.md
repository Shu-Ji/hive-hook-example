# Hive Hook 示例程序

在每次运行 SQL 语句时输出 Hello World。

## 方法一（推荐）、使用编译好的 jar 包

直接使用 target/Hive-hook-example-1.0.jar


## 方法二、自己编译

如果 jar 包不能使用，请自行编:

    $ git clone https://github.com/Shu-Ji/hive-hook-example.git
    $ cd hive-hook-example
    $ mvn install
    $ mvn package

将生成 target/Hive-hook-example-1.0.jar

## 使用示例

将 jar 包上传到服务器机器，比如 /tmp/ 目录下。

然后：

    $ hive
    hive> add jar /tmp/Hive-hook-example-1.0.jar;
    hive> set hive.exec.pre.hooks=HiveExampleHook;

    hive> select dt from mydb.mytb where dt = 20180113 limit 1;
    Hello from the hook !!

    hive> desc mydb.mytb;
    Hello from the hook !!
