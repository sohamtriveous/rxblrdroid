#RxBlrdroid

This is the codelab for the session on RxJava at Blrdroid (17th October, 2015)

##Overall objective
Use the concepts of RxJava to  orchestrate different operations in android. More specifically, we intend to make network calls to get lists of tracks created by 2 separate music bands and then using RxJava to combine and sort them. The results will be displayed in a RecyclerView.

##Concepts covered
- Creating Observables using Observable.create
- Using Retrofit to create Observables, here we create an Observable manually using a synchronous call in Retrofit
- Chaining operators to do transformations, combining and sorting collections
- Specifically covered operators like map and zip
- Using retrolambda
- Threading in RxJava
- Displaying results in a simple RecyclerView

##Steps to conduct the codelab

###Preparation
This is the final output of the codelab, to get started, you would need to clone the repository and delete/clear some files/methods, more specifically
- Delete the Music.java class
- Clear the fabOnClick method inside MainActivity

Here are the actual steps in the codelab itself:
###Step 1: Understand how Observable.create and other operations like map work
- Create an Observable of type NetworkResponse from the synchronous call in Retrofit (the first call in MusicApi.java)
- Use the map operator to map from an Observable<NetworkResponse> to Observable<List<Result>>
- Use the Thread Schedulers to do the network task and mapping in the background thread and the subscription in the main thread
- Once the fab is clicked on the screen, you would need display the results in provided RecyclerView

###Step 2: Showcase the use of the zip and map operators to orchestrate operations in android
- Create two separate Observable<NetworkResponse> representing separate network calls for two separate search parameters
- Use the map operator to map from an Observable<NetworkResponse> to Observable<List<Result>> for each of the results
- Then use the zip operator to combine for the Observable<NetworkResponse> objects, in the zip function combine both the lists
- Use the map operator to sort the combined list of results
- Like before, use the Thread Schedulers to do the network task and mapping in the background thread and the subscription in the main thread
- Once the fab is clicked on the screen, you would need display the results in provided RecyclerView

##Dependencies
- AppCompat, RecyclerView and Design support library
- Retrofit and GSON: for the network operations
- RxAndroid: for all Rx stuff
- Retrolambda and Java 8 (Optional): for the lambda operator
- Butterknife: for view injection

##More information
The presentation for the talk can be found at https://speakerdeck.com/soham/getting-started-with-rxjava