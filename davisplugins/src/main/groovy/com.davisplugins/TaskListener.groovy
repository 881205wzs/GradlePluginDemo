package com.davisplugins

import org.gradle.BuildListener
import org.gradle.BuildResult
import org.gradle.api.Task
import org.gradle.api.execution.TaskExecutionListener
import org.gradle.api.initialization.Settings
import org.gradle.api.invocation.Gradle
import org.gradle.api.tasks.TaskState

public class TaskListener implements TaskExecutionListener, BuildListener {

    private static final String TAG = "[DAVIS] ";
    /**
     * 此类可以监控每一个task的执行开始和结束，以及工程build的情况
     */
    public TaskListener(){

    }

    @Override
    void beforeExecute(Task task) {
        println(TAG + "task before : " + task.getName())
    }

    /**
     * 比如，我们要在packageRelease这个task任务执行完后，做一些操作，
     * 我们就可以在此方法中判断
     * @param task
     * @param taskState
     */
    @Override
    void afterExecute(Task task, TaskState taskState) {
        println(TAG + "task after : " + task.getName())
        if(task.getName().equals("packageRelease")){
            //做自己的任务
        }
    }

    @Override
    void buildFinished(BuildResult result) {
        //项目build完成之后，会调用此方法
        println(TAG + "build finished.")
    }

    @Override
    void buildStarted(Gradle gradle) {
        println(TAG + "build started.")
    }

    @Override
    void projectsEvaluated(Gradle gradle) {
        println(TAG + "project evaluated.")
    }

    @Override
    void projectsLoaded(Gradle gradle) {
        println(TAG + "project loaded.")
    }

    @Override
    void settingsEvaluated(Settings settings) {
        println(TAG + "setting evaluated.")
    }
}