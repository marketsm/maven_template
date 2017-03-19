node {
	stage 'checkout'
	
	git url: 'https://github.com/marketsm/maven_template.git'

	def mvnHome = tool 'Maven 3.1.9'
	stage 'Build'
	
	sh "${mvnHome}/bin/mvn clean package"

}
