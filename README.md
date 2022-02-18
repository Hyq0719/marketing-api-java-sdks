## Marketing API Java SDKs  [![LICENSE](https://camo.githubusercontent.com/6d2f1a361a07cd80444ad4a49998f95d10f81e634dcb0c80d4cb3038691d2544/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4c6963656e73652d416e74692532303939362d626c75652e737667)](https://github.com/996icu/996.ICU/blob/master/LICENSE) [![Badge](https://camo.githubusercontent.com/d043601dbaa32fcfcc1ad2b1901f09ad29f178428cf89dc9a6ea7991537770ea/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4c696e6b2d3939362e6963752d7265642e737667)](https://996.icu/#/zh_CN)

![Maven Central](https://img.shields.io/maven-central/v/io.github.hyq0719/marketing-api-sdk)  ![jdk1.8+](https://img.shields.io/badge/jdk-1.8%2B-green) [![License](https://camo.githubusercontent.com/2a2157c971b7ae1deb8eb095799440551c33dcf61ea3d965d86b496a5a65df55/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4c6963656e73652d417061636865253230322e302d626c75652e737667)](https://opensource.org/licenses/Apache-2.0) ![使用IntelliJ IDEA开发维护](https://camo.githubusercontent.com/5fa4dc7ff49e4a518c047200657e42382acaf0a612325e9fb560cd909d4b8902/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f496e74656c6c694a253230494445412d2545362538462539302545342542452539422545362539342541462545362538432538312d626c75652e737667)

Marketing API Java SDKs 对国内主流的Marketing API进行封装，提供了请求重试机制、统一token 缓存和刷新、请求aop增强等功能，帮助开发者快速搭建广告投放管理系统。目前开发中的有腾讯广告、巨量引擎、磁力引擎和vivo等作者业务中常用广告渠道。未来还会为更多Marketing API厂商进行封装，持续给开发者良好的使用体验，预计在2-3月发布第一个正式版本。


### Maven 引用方式（未发布正式版）

```xml
<dependency>
  <groupId>io.github.hyq0719</groupId>
  <artifactId>（不同模块参考下文）</artifactId>
  <version>1.0.0-beta.2</version>
</dependency>
```

- [腾讯广告](https://developers.e.qq.com/docs/start?version=1.3&_preview=1)：`marketing-api-tencent`
- [巨量引擎](https://open.oceanengine.com/doc/index.html?key=ad&type=api&id=1696710497745920)：`marketing-api-oceanengine`
- [磁力引擎](https://developers.e.kuaishou.com/docs/dsp/0.1)：`marketing-api-kuaishou`
- [vivo](https://open-ad.vivo.com.cn/doc/index?id=162)：`marketing-api-vivo`

### 22年计划

- 本人对各Marketing API厂商的人力分配（会根据开发效率、使用者需求和厂商爸爸支持程度进行调整）

`新增`：新增该渠道SDK `全量`：开发完成所有接口 `维护`：维护开发完成且使用中的接口

|                             厂商                             |    人力分配    | 全量完成时间 |
| :----------------------------------------------------------: | :------------: | :----------: |
| [腾讯广告](https://developers.e.qq.com/docs/start?version=1.3&_preview=1) |      维护      |     待定     |
| [巨量引擎](https://open.oceanengine.com/doc/index.html?key=ad&type=api&id=1696710497745920) |   全量+维护    |    2-3月     |
|  [磁力引擎](https://developers.e.kuaishou.com/docs/dsp/0.1)  |      维护      |     待定     |
| [百度营销](https://dev2.baidu.com/content?sceneType=0&pageId=100138&nodeId=15&subhead=) |      待定      |     待定     |
|   [VIVO商业](https://open-ad.vivo.com.cn/doc/index?id=162)   |   全量+维护    |    2月底     |
|       [小米营销](https://api.e.mi.com/doc.html#/home)        |      待定      |     待定     |
| [华为广告](https://developer.huawei.com/consumer/cn/doc/distribution/promotion/ads_api02-0000001058566534) | 新增+全量+维护 |    3-4月     |

- 补全使用文档
- 建立使用者社区和社区代码贡献机制

### 致谢

- 感谢 [TencentAd](https://github.com/TencentAd)/**[marketing-api-java-sdk ](https://github.com/TencentAd/marketing-api-java-sdk)**，该项目使用了部分腾讯广告Marketing APi Java SDK的源码，通过学习腾讯广告源码大大减小了开发成本
- 感谢 [Wechat-Group](https://github.com/Wechat-Group)/**[WxJava](https://github.com/Wechat-Group/WxJava)**，该项目参考了WxJava的开源建设规范

### 其他说明

1. 阅读源码的同学请注意，本SDK为简化代码编译时加入了`lombok`支持，如果不了解`lombok`的话，请先学习下相关知识，比如可以阅读[此文章](https://mp.weixin.qq.com/s/cUc-bUcprycADfNepnSwZQ)；
2. 如有新功能需求，发现BUG，或者由于Markering API官方调整导致的代码问题，可以直接在[【Issues】](https://github.com/Hyq0719/marketing-api-java-sdks/issues)页提出issue，便于讨论追踪问题；
3. 如果需要贡献代码，请务必在提交PR之前先仔细阅读[【代码贡献指南】](https://github.com/Hyq0719/marketing-api-java-sdks/blob/develop/CONTRIBUTING.md)，谢谢理解配合；

