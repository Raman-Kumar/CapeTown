# CapeTown
Lifecycle of Activity and Fragment

When app start 

and Activity opens - ```java onCreate() , onStart(), onResume() ```
if you press power button -  ```java onPause(), onStop() ```
and re-press power button and unlock screen - ```java onRestart(), onStart(), onResume()  ```
Press back button on a opened activity - ```java onPause(), onStop(), onDestroy() ```
So, open activity and press back button - 
```java onCreate() , onStart(), onResume(), onPause(), onStop(), onDestroy() ```