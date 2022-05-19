# CapeTown
Lifecycle of Activity and Fragment

### When app has a single activity only  

and Activity opens - ``` onCreate() , onStart(), onResume() ```

if you press power button -  ``` onPause(), onStop() ```

and re-press power button and unlock screen - ``` onRestart(), onStart(), onResume()  ```

Press back button on a opened activity - ``` onPause(), onStop(), onDestroy() ```

So, open app and press back button - 
``` onCreate() , onStart(), onResume(), onPause(), onStop(), onDestroy() ```

And open a another activity from notification or pick call ``` onPause(), onStop() ``` and press back button to return to app (if it does or sometime not) ``` onRestart(), onStart(), onResume() ```



### When app has a two activity and activity A and B 

activity A start activity B  
activity A ```onPause()``` after that activity B ``` onCreate() , onStart(), onResume() ``` after that activity A ```onStop()```


## Bonus tip 
xmlns: app: and xmlns: Android, Both namespaces mentioned are used in Android app development in layout xml files.

xmlns: Android namespace is used in order to access and use the attributes which are provided by Android platform.

xmlns:app( or xmlns:'customname') namespace is used to access the custom attributes which are defined in the application scope. 

xnlns is kind of similar to import statement