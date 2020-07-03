package com.github.shockrifle.drawablebackgroundchanger.services

import com.intellij.openapi.project.Project
import com.github.shockrifle.drawablebackgroundchanger.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
