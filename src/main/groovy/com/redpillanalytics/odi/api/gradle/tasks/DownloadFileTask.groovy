package com.redpillanalytics.odi.api.gradle.tasks

import groovy.util.logging.Slf4j
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option

@Slf4j
class DownloadFileTask extends DefaultTask {

   DownloadFileTask(){
      description = "Download API zip file from URL."
   }

   /**
    * The path to download the ODI API zip file to.
    */
   @Input
   @Option(option = "file-path",
           description = "The path to download the ODI API zip file to."
   )
   String filePath

   /**
    * The URL to download the ODI API zip file from.
    */
   @Input
   @Option(option = "url",
           description = "The URL to download the ODI API zip file from."
   )
   String url

   @OutputFile
   File getFile() {
      return project.file(filePath)
   }

   @TaskAction
   void download() {
      ant.get(src: url, dest: getFile())
   }
}
