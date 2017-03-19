node {
	stage 'checkout'
	
	git url: 'https://github.com/marketsm/maven_template.git'

	def mvnHome = tool 'mvn-3.3.9'

	stage 'Build'
	
	sh '/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/mvn-3.3.9/bin/mvn clean package'


}
