# LifecycleawareComponents
This is a experiment project which aims to provide fundamental idea about LifecycleObserver, ViewModel, LiveData.
/* UNDERSTANDING VIEWMODEL & LIVEDATA
* VIEWMODEL :
* wht it does is :  * it provides the data to UI. * load the data fm network or db
* SO viewmodel act as communication layer between Network/DB and UI
* data is preserved on confg changes why? activity / frag fetching data fm viewmodel so if activity
* is recreated it taking/ fetching data from same viewmodel.
*
* LIVEDATA :
* We used to update THI UI through interface
* reduce boiler plate code
*
* SO why use livedata with viewmodel?
* Viewmodel survives during configuration changes &
* livedata helps to update UI(without interface) as it can be observed
