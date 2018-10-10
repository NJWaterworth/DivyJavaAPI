REQUIREMENTS FOR INSTALLING AMAZON AWS SDK FOR JAVA
	- JDK
		The AWS SDK for Java requires J2SE Development Kit 6.0 or later. You can download the latest Java software from 
		https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html
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
		
	- AWS Region info
		Just like before under your user its good practice to define a region of which you are operating under to ensure that 
		data flows quicker. us-east-2 is what I'm using and you make a file called config. This link here walks you through it
		https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/setup-credentials.html
	
	- current AWS SDK
		from https://aws.amazon.com/sdk-for-java/
		You can either download a built version from the website or go to github and get the source code.
		I had trouble building the source code with maven so I went ahead and downloaded the pre built one.
		There's also a developer preview for 2.0 but I couldnt get that one to build with maven either.
		
	- Ant
		For running amazons sample code that they provide, instead of using maven they used ant to provide simplicity.
		Download the current version here: https://ant.apache.org/bindownload.cgi
		Tutorial for windows: https://www.mkyong.com/ant/how-to-install-apache-ant-on-windows/
		
	note: Make sure you're in a admin command prompt if on windows

CREATING MAVEN BUILD FILE	