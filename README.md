REQUIREMENTS FOR INSTALLING AMAZON AWS SDK FOR JAVA
	- JDK
		Make sure its included in your path variables if on Windows
		
	- Maven 
		from: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
		Also include this in your path enviroment variables. This is what is used to compile and run
		these java files for interfacing with dynamodb. They use a .XML file called "POM" to execute. 
		For more read Running a file using Maven.
		
	- AWS Account info 
		under C:\Users\your_username\.aws, there is a file called credentials. If not, create the directory and store it there.
		Here's a link that briefly covers it https://github.com/aws/aws-sdk-java/tree/master/src/samples/AmazonDynamoDB
		Mine was automatically generated because I installed the eclipse AWS but you need to create it if not. 
		The parameters are the regular and secure key codes which will be available in the slack channel.
		Credentials is a File, filetype. This is an actual filetype.
	
	- current AWS SDK
		from https://aws.amazon.com/sdk-for-java/
		You can either download a built version from the website or go to github and get the source code.
		I had trouble building the source code with maven so I went ahead and downloaded the pre built one.
		There's also a developer preview for 2.0 but I couldnt get that one to build with maven either.
		
	- Ant
		For running amazons sample code that they provide, instead of using maven they used ant to provide simplicity.
		Download the current version here: https://ant.apache.org/bindownload.cgi
		Tutorial for windows: https://www.mkyong.com/ant/how-to-install-apache-ant-on-windows/
		
RUNNING A JAVA FILE USING MAVEN
	