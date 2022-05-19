# CapeTown
Lifecycle of Activity and Fragment

When app has a single activity only  

and Activity opens - ``` onCreate() , onStart(), onResume() ```

if you press power button -  ``` onPause(), onStop() ```

and re-press power button and unlock screen - ``` onRestart(), onStart(), onResume()  ```

Press back button on a opened activity - ``` onPause(), onStop(), onDestroy() ```

So, open app and press back button - 
``` onCreate() , onStart(), onResume(), onPause(), onStop(), onDestroy() ```

And open a another activity from notification ``` onPause(), onStop() ``` and press back button to return to app ``` onRestart(), onStart(), onResume() ```
