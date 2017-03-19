node {

	def mvnHome = tool 'mvn-3.3.9'
	env.PATH = "${mvnHome}/bin:${env.PATH}"
	
	stage 'checkout' 
		git url: 'https://github.com/marketsm/maven_template.git'
		
	stage 'compile' 
		sh 'mvn -B clean compile -Dmaven.compiler.showDeprecation -Dmaven.compiler.showWarnings'

	stage 'test'
		sh "$mvn -B -Dmaven.test.failure.ignore verify"
  		step([$class: 'ArtifactArchiver', artifacts: '**/target/*.jar', fingerprint: true])
  		step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
}
