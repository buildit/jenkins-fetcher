import com.buildit.jenkins.configfetcher.ConfigFetcher
import com.buildit.artifactfetcher.ArtifactFetcher

def jenkinsConfig = new ConfigFetcher().fetch()

def version = jenkinsConfig.jenkins.version
def artifactArray = new ArtifactFetcher().fetch(version.artifactPattern, [version.artifact])

println(artifactArray[0])