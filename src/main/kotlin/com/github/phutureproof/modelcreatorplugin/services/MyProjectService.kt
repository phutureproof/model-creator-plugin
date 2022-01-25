package com.github.phutureproof.modelcreatorplugin.services

import com.intellij.openapi.project.Project
import com.github.phutureproof.modelcreatorplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
