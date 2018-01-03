package com.momo

import org.gradle.api.Plugin
import org.gradle.api.Project

public class InfoPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.add('info', InfoExtension)
        project.task('testPlugin') {
            doLast{
                println 'hello world ! 自定义plugin'
                println "姓名：$project.info.name ,年龄：$project.info.age"
            }
        }
    }
}