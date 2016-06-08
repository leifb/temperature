# Sample Code / Tutorial: Temperature Converter
##### For my e-portfolio (Software engineering course at the DHBW Karlsruhe)

This project contains an unfinished Android application to convert temperatures measured in celsius to farenheit and vice-versa. It is thought to be used as a (VERRY) short tutorial for Android development.
You will make slight changes to a layout file and add some code which is responding to a button press.

The corresponding slides can be found [here](http://redirect.viglink.com/?key=bbb516d91daee20498798694a42dd559%20&u=https%3A//docs.google.com/presentation/d/1cLNHOWLDiY80rx5IJ7IbNHvlUwg6DGV3GmWNkK1OYoc/edit%3Fusp%3Dsharing).

## Requirements

You will need Android Studio for this tutorial. An Android device is nice to have, but you can use the emulator, too (which is available in Android Studio).

## The tutorial

* Get the code from github
  * Open Adnroid Studio and Click ``File > New > Project from Version Control > GitHub``
  * The Git Repository URL is ``https://github.com/leifb/temperature.git``
  * Follow the instructions, you can't to much wrong here
* Add the missing “To Celsius”-button
  * Go to the layout file: Double-press shift and enter ``content_main.xml``
  * If the ``Design`` view is shown, switch to the ``Text`` view to edit the xml
  * Search for the ``Button`` attribute at the bottom of the file
  * Copy and paste the attribute and adjust the id of the new button (for examle to ``@+id/button_to_c``)
  * Change the text of your new button:
    * In the ``android:text`` attribute, change ``@string/to_fahrenheit`` to ``To celsius``
  * Change the ``android:layout_below`` value to ``@+id/button_to_f``
* Add the functionality to convert
  * You can write methods for this either in the ``MainActivity`` class, or create a new class
    * Java code is generally placed in ``app/java/...``
    * to convert farenheit to celsius use this formula: ``c = (f - 32) * 5/9``
    * to convert celsius to farenheit use this formula: ``f = c * 9/5 + 32``
  * Get the button and textfield references and add the event listeners
    * You will have to do this in the ``MainActivity`` class and there in the ``onCreate`` method
    * To get a button reference, you can use ``Button b = (Button) findViewById(R.id.buttonID);``
    * To get a text view reference, you can use ``TextView t = (TextView) findViewById(R.id.textViewID);``
    * To add an event listener, you can use ``b.setOnClickListener(new View.OnClickListener() {...});``, or create a new class which implements the ``OnClickListener`` interface
    * In the ``OnClick`` method of your event listener, get the text of the text filed, do the calculation and update the other text field
* Use refactoring
  * Switch back to the layout file
  * In your new button attribute, place your coursor on the ``android:text`` line
  * press ``ALT+ENTER`` and select ``Extract string resource`` by pressing enter
  * confirm by pressing enter
* If you want further practice, you could add the functionality to calculate to kelvin!
    
## The solution

If you have problems or just want to check, if you have done everything correct, you can check my given solution. For each step I have created a branch. Just check the commits or compare the branches to see what I have done to solve the problems.
