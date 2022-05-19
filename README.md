# CapeTown
Lifecycle of Activity and Fragment

When app start 

and Activity opens - ``` onCreate() , onStart(), onResume() ```

if you press power button -  ``` onPause(), onStop() ```

and re-press power button and unlock screen - ``` onRestart(), onStart(), onResume()  ```

Press back button on a opened activity - ``` onPause(), onStop(), onDestroy() ```

So, open activity and press back button - 
``` onCreate() , onStart(), onResume(), onPause(), onStop(), onDestroy() ```