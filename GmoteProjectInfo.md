Note: The documentation is still in its early stages and will be evolving as the project matures.

You can find more links and information at our website: http://www.gmote.org

# Package Information #
The Gmote application is separated into 4 projects:

  * **GmoteClient:** An android application that is installed on a phone (see the Android sdk for more info)

  * **GmoteServer:** A server application that is installed on a user's computer. It receives commands from the GmoteClient and executes those functions by interacting with different parts of the computer, such as the file system or a media player.

  * **GmoteCommon:** Stores files that are common to both the gmote client and server. This includes a set of Serializable objects that get exchanged between two to facilitate communication. Important: Since this code is shared, it must only use language features that are compatible with both the Android SDK and a java SDK (ex: don't use a Logger object as it will break the Android client, and don't use any classes that are in the com.android package)

  * **GmoteUpdater:** Small application that will allow automatic updates to the Gmote Server.

# Setting up the code #
This entire project was build using eclipse, which means the instructions will be heavily biased towards the eclipse environment, although the project will work under any development environment.

To setup the project using eclipse, simply checkout the entire project (all 4 projects mentioned above). Then, from eclipse, select 'import', 'existing project into workspace', and import all 4 projects.

Note: You'll notice that some of the files are not included in the project. This is because by default, the server project is setup for Windows and Linux development. There are a few files that are specific to Mac which break the other clients and are therefore excluded from the classpath. If you want to develop for Mac, simply edit the .classpath file to re-add the excluded mac files.

# Coding Style #
Please try to follow the standard java coding conventions: http://java.sun.com/docs/codeconv/html/CodeConvTOC.doc.html

When setting up your editor, please use the following formatting rules:
  * **Don't use tabs**, always use 2 spaces.
  * Set the default **indentation size to 2 spaces**.

# How do I submit changes? #
Send an email to hello@gmote.org requesting developer access. Once this has been granted, please follow these guidlines:

1. Create a separate branch and commit your changes in that branch. You can commit as often as you want in that branch.
2. Once you are finished with your changes, request a code review by one of the administrators. When the code has been reviewed, it will be merged into the main branch by the administrator who reviewed it.

Details about starting a branch and code reviews can be found here: http://code.google.com/p/support/wiki/CodeReviews

Thank you for contributing to Gmote!