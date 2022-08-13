# Appium Starter-kit for Android and iOS

## About

- This framework provides a basic implementation for Appium based Android/ iOS tests
- This could be used as the initial starter-kit to evolve into a full-fledged framework


## Set-up steps on Mac

- Install Homebrew

```zsh
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)”
```

Check brew version: 
```zsh
brew --version
```

- Install Android Studio

[https://developer.android.com/codelabs/basic-android-kotlin-compose-install-android-studio#4](https://developer.android.com/codelabs/basic-android-kotlin-compose-install-android-studio#4)

- Install node and npm

```zsh
brew install node
```

  
Check node version:

```zsh   
node -v
```

Check npm version:

```zsh
npm -v
```

- Install Appium 2.x

```zsh
npm install -g appium@next
```

Note: This does not install any driver or plugin by default


- Install WebDriver

```zsh
npm install wd
```

- Install XCUITest driver for iOS

```zsh
appium driver install xcuitest
```

- Install UIAutomator2 driver for Android

```zsh
appium driver install uiautomator2
```

- View the list of drivers installed

```zsh
appium driver list --installed
```

Note: To view all the drivers (installed and not-installed)

```zsh
appium driver list
```

- To start the Appium server

```zsh
appium
```

- Install and set up the JAVA Path in your bash_profile or zshrc based on your default shell

- To verify the dependencies that are missing as well as how to install them, install Appium doctor CLI tool using the below command

```zsh
npm install -g appium-doctor
```

- Run Appium doctor to verify for both Android and iOS

```zsh
appium-doctor
```

![img_3.png](img_3.png)

For only Android

```zsh
appium-doctor --android
```

For only iOS

```zsh
appium-doctor --ios
```

- Set the Android path (Example: `open -t ~/.bash_profile`, set the path as below, save, close the window and then `source ~/.bash_profile`)

export ANDROID_HOME=/Users/YourUserName/Library/Android/sdk

export PATH=$ANDROID_HOME/emulator:$PATH

export PATH=$ANDROID_HOME/tools:$PATH

export PATH=$ANDROID_HOME/tools/bin:$PATH

export PATH=$ANDROID_HOME/platform-tools:$PATH

- Install adb

```zsh
brew install wget
```

```zsh
wget https://dl.google.com/android/repository/platform-tools-latest-darwin.zip
```

Unzip the platform tools folder and set the path to adb in your bash profile or zshrc (based on your machine's shell), as below:

export /Users/YourUserName/AndroidSetup/platform-tools/adb

- Verify whether adb (android debug bridge) is installed and display the list of devices

```zsh
./adb devices
```

- Install Carthage

```zsh
brew install carthage
```

- Install webpack

```zsh
npm i -g webpack
```

- Download and install Appium Inspector GUI

[https://github.com/appium/appium-inspector/releases](https://github.com/appium/appium-inspector/releases)

- Install libimobiledevice (A library to communicate with services on iOS devices using native protocols.)

```zsh
brew install libimobiledevice
```

- Install XCode for iOS simulators from App Store

- Install iOS-deploy (Install and debug iOS apps from the command line)

```zsh
brew install ios-deploy
```

- Install ideviceinstaller

```zsh
brew install ideviceinstaller
```

- Install iOS webkit 

```zsh
brew install ios-webkit-debug-proxy
```

- To start android emulator, first install

```zsh
npm install -g start-android-emulator
```

and then run,

```zsh
start-android-emulator
```

![img_2.png](img_2.png)

or

=> Navigate to `${ANDROID_HOME}/emulator`

=> Run the command to list the available emulators created on machine
`./emulator -list-avds`

=> To start a virtual devices
`./emulator -avd AVD_NAME`


## Run Android tests

```zsh
gradle wrapper clean build runTests -Dtag="ANDROID" -Ddevice="ANDROID"
```

## Run iOS tests
```zsh
gradle wrapper clean build runTests -Dtag="IOS" -Dtarget="IOS"
```

