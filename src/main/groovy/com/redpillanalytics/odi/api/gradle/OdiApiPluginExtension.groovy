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
    * ODI API release asset download location.
    */
   String downloadPath = 'build/download/odi-api.zip'

   /**
    * ODI API release asset unzip location.
    */
   String libsDir = 'libs'

   /**
    * ODI API release asset match pattern.
    */
   String assetPattern = /(odi-api)(.+)(\.zip)/

   /**
    * ODI API release version.
    */
   String assetVersion = 'latest'
}
