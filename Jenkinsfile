node {
	stage 'checkout'
	
	git url: 'https://github.com/marketsm/maven_template.git'

	def mvnHome = tool 'mvn-3.3.9'
	stage 'Build'
	
	echo $mvnHome
	sh '${mvnHome}/bin/mvn clean package'


}
