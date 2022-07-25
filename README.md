![](https://img.dobbinsoft.com/static/banner.jpg)
---

 [![Release Version](https://img.shields.io/badge/release-3.0.0-brightgreen.svg)](https://gitee.com/iotechn/unimall) [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://gitee.com/iotechn/unimall/pulls)


[(English Documents Available)](readme_en.md)

> **社区版**

Unimall 针对中小商户、企业和个人学习者开发。使用Java编码，采用SpringBoot、Mybatis-Plus等易用框架，适合个人学习研究。同时支持单机部署、集群部署，中小商户企业可根据业务动态扩容。unimall使用uniapp前端框架，可同时编译到 微信小程序、H5、Android App、iOS App等几个平台，可为中小商户企业节约大量维护成本。也可支撑中小商户企业前期平台横扩需求。

Unimall社区版源码包含:

- Java 后端服务
    - unimall-runner: 启动器（打包打这个就行）
    - unimall-admin-api: 提供管理员管理系统的WebApi
    - unimall-app-api: 提供APP、小程序、H5用户请求的WebApi
    - unimall-biz: 提供通用业务代码
    - unimall-data: 提供数据模型以及数据访问层封装
    
- Vue 前端页面
    - unimall-admin: 基于element-ui的后台管理页面
    - unimall-app: 基于uniapp的小程序、H5、APP前端代码

- sql: 数据库初始化SQL脚本

## About this repository 关于

- release: 已经发布的分支
- develop: 正在开发的分支
   - develope-v3: 此分支已经完全测试过，但还没上过生产，可直接使用

## Contact 联系

QQ讨论群：656676341(1群已满) 940197916(2群已满) **936569693(3群)** (进群前，请在网页右上角点**star**)

微信群： (微信群二维码超100人，请加此微信备注意图，接受邀请)

![front](https://unimall-asset.oss-cn-beijing.aliyuncs.com/readme/qr.jpeg?x-oss-process=style/400px)

## Experience 体验

- Client
  
  - 扫描下面二维码体验不同终端 **（体验APP使用浏览器扫码）**
  

![qr](https://img.dobbinsoft.com/static/qr.jpg)

- Pages

![front](https://unimall-asset.oss-cn-beijing.aliyuncs.com/readme/front.jpg)

- Admin
  - 后台演示地址: [https://unimall.v3.dobbinsoft.com](https://unimall.v3.dobbinsoft.com)
  - 登录名:guest 密码:123456 验证码:666666 (guest仅有只读权限，无读配置权限)
- Pages

![front](https://unimall-asset.oss-cn-beijing.aliyuncs.com/readme/b1.png)
![front](https://unimall-asset.oss-cn-beijing.aliyuncs.com/readme/b2.png)
![front](https://unimall-asset.oss-cn-beijing.aliyuncs.com/readme/b3.png)
![front](https://unimall-asset.oss-cn-beijing.aliyuncs.com/readme/b4.png)
![front](https://unimall-asset.oss-cn-beijing.aliyuncs.com/readme/b5.png)


## New Features (v3) 新特性v3
| 描述 |
|:--------|
| - 框架： 支持对象、字段注解生成文档 |
| - 框架： 添加数据库扩展 |
| - 框架： 支持滑动窗口Api限流 |
| - 框架： 对接腾讯云对象存储 |
| - 框架： 支持开放平台 |
| - 功能： 添加用户在线支付开通、续费VIP |
| - 功能： 对接App支付宝在线支付 |
| - 功能： 对接支持道宾云ERP进销存系统 ⭐ |



## The Framework 架构

![framework](https://unimall-asset.oss-cn-beijing.aliyuncs.com/readme/framework.png)


## Getting started 快速开始

服务器可根据自身业务来选购，单机环境推荐2C4G

##### 方式一： docker 运行

视频教程： https://www.bilibili.com/video/BV1db4y1e7Vi/

文档教程：[点击查看](./docs/docker.01.env.md)


##### 方式二（推荐）： 编译运行 

视频教程：https://www.bilibili.com/video/BV1EL4y1J7w5/

文档教程🍭🍭🍭：[文档1](./docs/build.01.env.md) [文档2](./docs/build.02.backend.md) [文档3](./docs/build.03.front.md)



## Document 文档

##### 框架v3文档

| 依赖                                   | 解释                   |
| -------------------------------------- | ---------------------- |
| [core](../../../dobbinfw-core)         | 核心包                 |
| [support](../../../dobbinfw-support)   | 支持包，非常重要的文档 |
| [launcher](../../../dobbinfw-launcher) | 启动器，非常重要的文档 |
| [dobbinfw](../../../dobbinfw) | 脚手架文档 |
| [fw-pay](../../../matrix-pay) | 支付文档 |

## Copyright 版权

本项目后端由重庆驽驹科技有限公司开发，禁止未经授权用于商业用途。个人学习可免费使用。

如需**商业授权**，请使用以下两种方式授权。

1. 在DEMO小程序中购买商用授权商品。

2. 淘宝授权：[点击跳转](https://item.taobao.com/item.htm?spm=a2126o.11854294.0.0.5f164831jltJlx&id=615046003598 ) 

已授权公司查询(由于是后面统计的，有些未统计到，请用订单号来添加)
https://www.dobbinsoft.com/authorization.html

![证书](https://img.dobbinsoft.com/static/UnimallCert.jpg)

前端代码使用的 mix.R 的开源模板，在此模板的基础上对接了Unimall后端Api，作者说不做商用限制，保留原地址，所以授权仅针对后端代码商用授权。

mix模板地址：https://ext.dcloud.net.cn/plugin?id=200

## Service 服务

##### 一、项目定制开发服务

若需要软件需求外包，小程序、App、网站、微信定制开发，请联系微信：dobbinsoft（请备注意图）

##### 二、电商小程序 SaaS 服务 (无代码快速上线微信小程序)

对于缺少技术的创业团队来说，使用SaaS服务即可解决掉技术问题。简单的说，就是由我们为客户统一运维，每年付一定的钱给我们就行了。

Unimall SaaS版每年980元。这个价格就和服务器的价格差不多，并且<u>**我们还可以免费代申请微信小程序，这可以节约每年300元的认证费**</u>。也就是说你使用SaaS服务之后，还可以省下三四百元每年。

使用Unimall SaaS版的优势1：

<img src="https://unimall-asset.oss-cn-beijing.aliyuncs.com/readme/different.jpg" alt="different" style="zoom: 40%;" />

使用Unimall SaaS版的优势2：更多模板

<img src="https://unimall-asset.oss-cn-beijing.aliyuncs.com/readme/templates.png" alt="模板"  />



支持试用：https://console.dobbinsoft.com/

注册账号，即可免费试用，试用规则： 未上线，不记时间，上线后，可免费试用7天。

## Contributing 贡献

如果你有好的意见或建议，欢迎给我们提 Issues 或 Pull Requests，为Unimall开源商城贡献力量。关于分支/issue及PR。
