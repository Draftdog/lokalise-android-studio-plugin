package com.github.draftdog.lokaliseandroidstudioplugin.services

import com.intellij.openapi.project.Project
import com.github.draftdog.lokaliseandroidstudioplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
