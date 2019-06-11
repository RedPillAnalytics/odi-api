import com.redpillanalytics.odi.api.GitHub
import groovy.util.logging.Slf4j
import spock.lang.Shared
import spock.lang.Specification

@Slf4j
class GitHubTest extends Specification{

   @Shared
   def gitHub = new GitHub(owner: 'RedPillAnalytics', repo: 'odi-api')

   def "Return latest asset of release"() {

      when:
      def result = gitHub.getAsset(/(odi-api)(.+)(\.zip)/)

      then:
      log.warn "asset: ${result.toString()}"
      result
   }

   def "Get download URL of latest asset of release'"() {

      when:
      def url = gitHub.getAssetUrl(/(odi-api)(.+)(\.zip)/)

      then:
      log.warn "url: ${url}"
      url
   }
}
