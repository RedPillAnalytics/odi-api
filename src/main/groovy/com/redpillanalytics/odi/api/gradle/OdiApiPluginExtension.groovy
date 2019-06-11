package com.redpillanalytics.odi.api.gradle

class OdiApiPluginExtension {

   /**
    * Gradle Group.
    */
   String taskGroup = 'ODI API'

   /**
    * ODI API Repo owner.
    */
   String repoOwner = 'RedPillAnalytics'

   /**
    * ODI API Repo.
    */
   String repo = 'odi-api'

   /**
    * ODI API ZIP location.
    */
   String filePath = 'odi-sdk'

   /**
    * ODI API pattern.
    */
   String assetPattern = /(odi-api)(.+)(\.zip)/

   /**
    * ODI API version.
    */
   String assetVersion = 'latest'
}
