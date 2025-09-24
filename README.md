# WiamPlayerphobic Mod

[English](README.md) | [中文](README_ZH.md)


## Features

A Minecraft Fabric mod that automatically detects nearby players and performs configurable actions to protect your privacy and gameplay experience.

**Key Features:**
- **Player Detection**: Automatically detects players within a configurable radius
- **Smart Filtering**: Exclude specific players from detection using a whitelist
- **Multiple Actions**: Choose between automatic logout or notification sounds
- **Configurable Distance**: Set custom detection distance (in blocks)
- **Toggle Functionality**: Easily enable/disable the mod via commands or GUI



## Installation

1. Install Fabric Loader for Minecraft 1.21.7
2. Download and install the required dependencies:
   - Fabric API
   - Fabric Language Kotlin
   - Cloth Config API
   - Mod Menu (optional, for GUI configuration)
3. Place the mod JAR file in your `mods` folder

## Configuration

### In-Game Commands

Use the `/playerphobic` command with the following subcommands:
- `/playerphobic toggle` - Toggle the mod on/off
- `/playerphobic enable` - Enable the mod
- `/playerphobic disable` - Disable the mod
- `/playerphobic status` - Show current mod status and settings
- `/playerphobic set <true/false>` - Set mod enabled state

### Mod Menu

If Mod Menu is installed, access the configuration through:
- Mod Menu → WiamPlayerphobic → Config

### Configuration Options

- **Mod Enabled**: Turn the mod functionality on or off
- **Action to Perform**: Choose between:
  - `LOGGING_OUT`: Automatically disconnect when players are detected
  - `NOTIFICATION`: Play a warning sound when players are detected
- **Detection Distance**: Set the radius (in blocks) for player detection (default: 400 blocks)
- **Excluded Players**: Add player names to ignore (whitelist)

## Example Scenarios
- Protect you from afk killing by quitting when strangers approach to you.
- Notify you to kill those who you meet when you are afking for waitting others.

## Dependencies

- Fabric Loader ≥ 0.15.10
- Fabric API
- Fabric Language Kotlin
- Cloth Config API
- Minecraft 1.21.7

## License

This project is licensed under the MIT License.

## Credits

Created by Wiamotit1e - the most angelic and glorious author!