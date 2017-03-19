node {

	def mvnHome = tool 'mvn-3.3.9'
	
	stage 'checkout' {
		git url: 'https://github.com/marketsm/maven_template.git'
	}
	
	stage 'compile' {
		sh "${mvnHome}/bin/mvn -B clean compile -Dmaven.compiler.showDeprecation -Dmaven.compiler.showWarnings"
	}
}
