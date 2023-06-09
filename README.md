# EssentialCore

## 简介

由 *Nlub* 开发的一个实验性的我的世界Bukkit服务端基础插件

## 功能特点

1. 传送，并且经过配置可以设置传送的价格

2. 登录，可以设置安装了 Geyser 的服务器让基岩玩家跳过登录

## 安装指南

1. 下载 EssentialCore.jar
2. 复制到 plugins 文件夹
3. 重启服务端
4. 在 config.yml 文件中设置你需要的功能
5. 使用 /reload 命令重载 config.yml 中的内容
6. 目前暂时还没有依赖，日后会依赖于 Geyser、Value 等经典插件

## 使用指南

### 命令

- /tpa [玩家名] - 向对方发送邀请，如果对方同意便在五秒后传送到对方。需要 essentialcore.tpa 权限才能使用

- /tphere [玩家名] - 向对方发送邀请，如果对方同意便在五秒后传送到你。需要 essentialcore.tphere 权限才能使用

- /tpaccept - 同意对方发来的 tpa 或 tphere 邀请。需要 essentialcore.tpaccept 权限才能使用

- /tpdeny - 拒绝对方发来的 tpa 或 tphere 邀请。需要 essentialcore.tpdeny 权限才能使用

- /register [密码] [重复密码] - 重复一次密码，注册玩家。需要 essentialcore.register 权限才能使用

- /login [密码] - 登录。需要 essentialcore.login 权限才能使用

### 配置

config.yml

```yaml
# 是否启用登录功能
Login: true
# 是否启用礼包功能
Kits: false
# 是否启用菜单功能
Menu: false
# 是否启用传送功能
Tp: true
```

### 其他

支持 Bukkit/Spigot/PaperMC 的 1.19.* 版本，其他的版本还没有尝试

目前只支持中文，日后会去试着支持英语、俄语、法语

## 反馈指南

加Q群或者使用issue反馈错误

Q群：909384798

## 版权和许可证

版权归属于插件作者 *Nlub* 所有，该插件使用了 MIT 许可证，允许其他人自由地使用、复制、修改和分发该插件的代码。如果其他人使用该插件的代码或进行了修改后的发布，则需要保留版权声明和许可证信息，并以相同的许可证类型进行发布
