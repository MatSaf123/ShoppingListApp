<p float="left">
  <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/matsaf123/ShoppingListApp?style=plastic"/>
  <img alt="GitHub contributors" src="https://img.shields.io/github/contributors/matsaf123/ShoppingListApp?style=plastic"/>
</p>

# ShoppingListApp

## About app:

Simple Android - Kotlin - MVVM Architecture application designed as shopping items list. Made on training purpouses according to instructions from AndroidDevs' YT-course ([can be found here](https://www.youtube.com/watch?v=cfcyYO7osnk "MVVM ShoppingList App - WHAT IS MVVM? - Part 1")).

## Technologies: 
<p align = "center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/a/a0/APK_format_icon.png" width="50" height="50"/>
</p>

* Android (minimum sdk version: 23, target sdk version: 29)
* Kotlin (1.3.71 ver)
* Room (2.2.1 ver)
* Kodein (6.4.0 ver)

<p align="center">
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/0.png?raw=true" width="225" height="400" />
</p>

## Functionality:

#### Adding custom items to the list:

- Using [Floating Action Button](https://developer.android.com/guide/topics/ui/floating-action-button "https://developer.android.com/guide/topics/ui/floating-action-button") [<img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/1.png" width="60" height="60"/>]() user can open up the Add-Item Dialog:


<p align="center">  
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/2.png?raw=true" width="225" height="400" />
</p>

- Items' name and amount can be inserted into [<img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/3.png" width="125" height="25"/>]()[<img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/4.png" width="80" height="25"/>]()
- While inserting name is required to add the item, if user leaves the [<img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/4.png" width="80" height="25"/>]() empty, default value of "1" will be inserted.

<p align="center">  
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/5.png?raw=true" width="225" height="400" />
</p>

- Item can be added to list by clicking [<img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/7.png" width="45" height="25"/>](). Then an pop-up shows up, confirming saving the item in the list and database:
<p align="center">  
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/8.png?raw=true" width="225" height="200" />
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/11.png?raw=true" width="225" height="400" />
</p>

- The Add-Item Dialog will reset after an succesfully saved item and will be ready for adding another one. If user is done adding items, he can go back to the list by simply clicking [<img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/6.png" width="55" height="25"/>]().

#### Marking items as bought/in cart:

- Items can be marked with [<img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/9.png" width="40" height="40"/>]() checkboxes. After being marked [<img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/10.png" width="40" height="40"/>]() this state of item is saved into database and remains after application is closed.

<p align="center">  
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/11.png?raw=true" width="225" height="400" />
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/12.png?raw=true" width="225" height="400" />
</p>

#### Moving items

- User can move items with [<img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/13.png" width="80" height="40"/>]() buttons. They're saved in database at their new positions.

<p align="center">  
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/12.png?raw=true" width="225" height="400" />
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/15.png?raw=true" width="225" height="400" />
</p>

#### Deleting items

- Item can be deleted by pressing [<img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/14.png" width="40" height="40"/>]() on it.

<p align="center">  
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/15.png?raw=true" width="225" height="400" />
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/16.png?raw=true" width="225" height="400" />
</p>

#### Replacing items ("editing")

- Item can be renamed/edited/replaced by clicking on his name: Add-Item Dialog shows up and user can insert new item data.

<p align="center">  
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/16.png?raw=true" width="225" height="400" />
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/17.png?raw=true" width="225" height="400" />
  <img src="https://github.com/MatSaf123/ShoppingListApp/blob/master/screenshots/18.png?raw=true" width="225" height="400" />
</p>

## Other:

Author: Mateusz Safaryjski - MatSaf123 
2020

## Thank You for reading!
