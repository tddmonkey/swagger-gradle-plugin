package com.benjaminsproule.swagger.gradleplugin

import com.benjaminsproule.swagger.gradleplugin.extension.SwaggerSpecExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class GradleSwaggerPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create('swaggerSpec', SwaggerSpecExtension, project)

        project.task(GenerateSwaggerDocsTask.TASK_NAME,
            type: GenerateSwaggerDocsTask,
            dependsOn: 'classes')
    }
}
