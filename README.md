# GradlePluginDemo

### 实现功能：<br><br>
1、在打包之前或打包之后执行自定义操作；<br>
2、在打包过程中某个Tash任务之前或之后执行自定义操作；<br>
3、打包的过程中修改字节码；<br><br>

### 执行效果：<br>

```Java
Executing tasks: [clean, :app:generateDebugSources, :app:generateDebugAndroidTestSources, :app:mockableAndroidJar, :app:prepareDebugUnitTestDependencies]

Configuration on demand is an incubating feature.
========================
hello gradle plugin!
========================
Incremental java compilation is an incubating feature.
[DAVIS] project evaluated.
:clean
[DAVIS] task before : clean
[DAVIS] task after : clean
:app:clean
[DAVIS] task before : clean
[DAVIS] task after : clean
:davisplugins:clean
[DAVIS] task before : clean
:davisplugins:clean UP-TO-DATE
[DAVIS] task after : clean
:app:preBuild
[DAVIS] task before : preBuild
:app:preBuild UP-TO-DATE
[DAVIS] task after : preBuild
:app:preDebugBuild
[DAVIS] task before : preDebugBuild
:app:preDebugBuild UP-TO-DATE
[DAVIS] task after : preDebugBuild
:app:checkDebugManifest
[DAVIS] task before : checkDebugManifest
[DAVIS] task after : checkDebugManifest
:app:prepareDebugDependencies
[DAVIS] task before : prepareDebugDependencies
[DAVIS] task after : prepareDebugDependencies
:app:compileDebugAidl
[DAVIS] task before : compileDebugAidl
[DAVIS] task after : compileDebugAidl
:app:compileDebugRenderscript
[DAVIS] task before : compileDebugRenderscript
[DAVIS] task after : compileDebugRenderscript
:app:generateDebugBuildConfig
[DAVIS] task before : generateDebugBuildConfig
[DAVIS] task after : generateDebugBuildConfig
:app:mergeDebugShaders
[DAVIS] task before : mergeDebugShaders
[DAVIS] task after : mergeDebugShaders
:app:compileDebugShaders
[DAVIS] task before : compileDebugShaders
[DAVIS] task after : compileDebugShaders
:app:generateDebugAssets
[DAVIS] task before : generateDebugAssets
[DAVIS] task after : generateDebugAssets
:app:mergeDebugAssets
[DAVIS] task before : mergeDebugAssets
[DAVIS] task after : mergeDebugAssets
:app:generateDebugResValues
[DAVIS] task before : generateDebugResValues
:app:generateDebugResValues UP-TO-DATE
[DAVIS] task after : generateDebugResValues
:app:generateDebugResources
[DAVIS] task before : generateDebugResources
[DAVIS] task after : generateDebugResources
:app:mergeDebugResources
[DAVIS] task before : mergeDebugResources
[DAVIS] task after : mergeDebugResources
:app:processDebugManifest
[DAVIS] task before : processDebugManifest
[DAVIS] task after : processDebugManifest
:app:processDebugResources
[DAVIS] task before : processDebugResources
[DAVIS] task after : processDebugResources
:app:generateDebugSources
[DAVIS] task before : generateDebugSources
[DAVIS] task after : generateDebugSources
:app:preDebugAndroidTestBuild
[DAVIS] task before : preDebugAndroidTestBuild
:app:preDebugAndroidTestBuild UP-TO-DATE
[DAVIS] task after : preDebugAndroidTestBuild
:app:prepareDebugAndroidTestDependencies
[DAVIS] task before : prepareDebugAndroidTestDependencies
[DAVIS] task after : prepareDebugAndroidTestDependencies
:app:compileDebugAndroidTestAidl
[DAVIS] task before : compileDebugAndroidTestAidl
[DAVIS] task after : compileDebugAndroidTestAidl
:app:processDebugAndroidTestManifest
[DAVIS] task before : processDebugAndroidTestManifest
[DAVIS] task after : processDebugAndroidTestManifest
:app:compileDebugAndroidTestRenderscript
[DAVIS] task before : compileDebugAndroidTestRenderscript
[DAVIS] task after : compileDebugAndroidTestRenderscript
:app:generateDebugAndroidTestBuildConfig
[DAVIS] task before : generateDebugAndroidTestBuildConfig
[DAVIS] task after : generateDebugAndroidTestBuildConfig
:app:mergeDebugAndroidTestShaders
[DAVIS] task before : mergeDebugAndroidTestShaders
[DAVIS] task after : mergeDebugAndroidTestShaders
:app:compileDebugAndroidTestShaders
[DAVIS] task before : compileDebugAndroidTestShaders
[DAVIS] task after : compileDebugAndroidTestShaders
:app:generateDebugAndroidTestAssets
[DAVIS] task before : generateDebugAndroidTestAssets
[DAVIS] task after : generateDebugAndroidTestAssets
:app:mergeDebugAndroidTestAssets
[DAVIS] task before : mergeDebugAndroidTestAssets
[DAVIS] task after : mergeDebugAndroidTestAssets
:app:generateDebugAndroidTestResValues
[DAVIS] task before : generateDebugAndroidTestResValues
:app:generateDebugAndroidTestResValues UP-TO-DATE
[DAVIS] task after : generateDebugAndroidTestResValues
:app:generateDebugAndroidTestResources
[DAVIS] task before : generateDebugAndroidTestResources
[DAVIS] task after : generateDebugAndroidTestResources
:app:mergeDebugAndroidTestResources
[DAVIS] task before : mergeDebugAndroidTestResources
[DAVIS] task after : mergeDebugAndroidTestResources
:app:processDebugAndroidTestResources
[DAVIS] task before : processDebugAndroidTestResources
[DAVIS] task after : processDebugAndroidTestResources
:app:generateDebugAndroidTestSources
[DAVIS] task before : generateDebugAndroidTestSources
[DAVIS] task after : generateDebugAndroidTestSources
:app:mockableAndroidJar
[DAVIS] task before : mockableAndroidJar
[DAVIS] task after : mockableAndroidJar
:app:preDebugUnitTestBuild
[DAVIS] task before : preDebugUnitTestBuild
:app:preDebugUnitTestBuild UP-TO-DATE
[DAVIS] task after : preDebugUnitTestBuild
:app:prepareDebugUnitTestDependencies
[DAVIS] task before : prepareDebugUnitTestDependencies
[DAVIS] task after : prepareDebugUnitTestDependencies

BUILD SUCCESSFUL

Total time: 7.195 secs
[DAVIS] build finished.

```

对于Gradle插件的原来和实现的更多介绍，请关注我的个人博客文章：
[Android Studio 自定义Gradle Plugin](https://blog.csdn.net/wangzhongshun/article/details/88381058)
