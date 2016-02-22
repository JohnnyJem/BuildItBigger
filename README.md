# Build It Bigger 
Project 4 Android Nanodegree
Used Gradle to build a joke-telling app, factoring functionality into libraries and flavors to keep the build simple. Configured a Google Cloud Endpoints development server to supply the jokes

## Build/Install
Make sure to run the backend module to start the development server before running app.
Replace provided localhost IP address in EndpointAsyncTask.class MyApi builder's setRootUrl() depending on emulator being used.
Use 10.0.3.2 as localhost's IP address with Android Genymotion Emulator.
Use 10.0.2.2 as localhost's IP address with Android Studio Emulator.

## Implementations
* Provided Java library module to contain jokes.
* Provided Android Library module to view jokes.
* Provided Google Cloud Endpoints module to supply jokes via the Java library.

## Tests
Project contains connected tests to verify that the async task is indeed loading joke by checking if EndpointsAsynchTask retrieves non-null string.
 * Use Gradle to run androidTest task after making sure developement server is running. 
