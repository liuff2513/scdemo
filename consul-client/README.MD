# spring cloud consul组件
> 它是一个提供服务发现和配置的工具。consul具有分布式、高可用、高扩展性。
## 一、consul简介
consul具有以下性质
- 服务发现：consul通过http方式注册服务，并且服务与服务之间相互感应。
- 服务健康监测。
- key/value 存储
- 多数据中心

consul可运行在mac window linux 等机器上
## 二、consul安装
linux
```bash
$ mkdir -p $GOPATH/src/github.com/hashicorp && cd $!
$ git clone https://github.com/hashicorp/consul.git
$ cd consul
$ make bootstrap
$ make bootstrap
```
window
1. [去官网下载](https://www.consul.io/downloads.html) 
2. 解压到指定目录，压缩包里只有一个“consul.exe”文件
3. 设置环境变量（在path下加上该文件所在目录路径）
4. cmd启动
```bash
consul agent -dev
```
5. 启动成功后，打开网址(http://localhost:8500)即可看到服务发现的界面