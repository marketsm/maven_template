node {

	def mvnHome = tool 'mvn-3.3.9'
	stage 'checkout'
	
	git url: 'https://github.com/marketsm/maven_template.git'

	stage 'Build'
	
	sh '${mvnHome}/bin/mvn clean package'
}
