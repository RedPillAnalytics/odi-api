package com.redpillanalytics.odi.api.gradle

import com.redpillanalytics.odi.api.gradle.tasks.DownloadFileTask
import com.redpillanalytics.odi.api.GitHub
import groovy.util.logging.Slf4j
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Copy

@Slf4j
class OdiApiPlugin implements Plugin<Project> {

   void apply(Project project) {
      // apply extension
      project.configure(project) {
         extensions.create('odiApi', OdiApiPluginExtension)
      }

      log.warn "Group: ${project.odiApi.taskGroup}"

      // configure api download tasks
      GitHub gitHub = new GitHub(owner: project.odiApi.repoOwner, repo: project.odiApi.repo)

      project.task('downloadApi', type: DownloadFileTask) {
         group project.odiApi.taskGroup
         url gitHub.getAssetUrl( project.odiApi.assetPattern,  project.odiApi.assetVersion)
         filePath "${project.odiApi.filePath}.zip"
      }

      project.task('extractApi', type: Copy) {
         description = "Extract the ODI API zip file."
         group project.odiApi.taskGroup
         from project.zipTree("${project.odiApi.filePath}.zip")
         into { project.odiApi.filePath }
         dependsOn project.tasks.downloadApi
      }

   }
}
