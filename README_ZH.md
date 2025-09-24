# WiamPlayerphobic 模组

[English](README.md) | [中文](README_ZH.md)



## 功能特性

一个 Minecraft Fabric 模组，可自动检测附近的玩家并执行可配置的操作，以保护您的隐私和游戏体验。

**主要功能：**
- **玩家检测**：自动检测配置半径内的玩家
- **智能过滤**：使用白名单排除特定玩家不被检测
- **多种操作**：可选择自动退出游戏或播放通知声音
- **可配置距离**：设置自定义检测距离（以方块为单位）
- **开关功能**：通过命令或GUI轻松启用/禁用模组


## 安装方法

1. 为 Minecraft 1.21.7 安装 Fabric Loader
2. 下载并安装所需的依赖项：
   - Fabric API
   - Fabric Language Kotlin
   - Cloth Config API
   - Mod Menu（可选，用于 GUI 配置）
3. 将模组 JAR 文件放入您的 `mods` 文件夹

## 配置方法

### 游戏内命令

使用 `/playerphobic` 命令及其子命令：
- `/playerphobic toggle` - 切换模组开关状态
- `/playerphobic enable` - 启用模组
- `/playerphobic disable` - 禁用模组
- `/playerphobic status` - 显示当前模组状态和设置
- `/playerphobic set <true/false>` - 设置模组启用状态

### Mod Menu

如果安装了 Mod Menu，可通过以下方式访问配置：
- Mod Menu → WiamPlayerphobic → Config

### 配置选项

- **模组启用**：开启或关闭模组功能
- **执行操作**：选择以下选项之一：
  - `LOGGING_OUT`：检测到玩家时自动断开连接
  - `NOTIFICATION`：检测到玩家时播放警告声音
- **检测距离**：设置玩家检测半径（以方块为单位，默认：400方块）
- **排除玩家**：添加要忽略的玩家名称（白名单）

## 使用场景示例
- 当未知玩家接近时自动退出游戏以防止您在挂机时被击毙。
- 在挂机等人时，遇到别的玩家提醒您进行杀戮。

## 依赖项

- Fabric Loader ≥ 0.15.10
- Fabric API
- Fabric Language Kotlin
- Cloth Config API
- Minecraft 1.21.7

## 许可证

本项目采用 MIT 许可证。

## 致谢

由 Wiamotit1e 创建 - 最天使般和辉煌的作者！