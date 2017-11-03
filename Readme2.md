# Android Diagonal Cut / Slant View
android sample java code to show how to do create diagonal or slanted View using Path.LineTo and canvas.drawPath

Screenshot:
![Screenshot](https://github.com/jameswhite7/android_diagonal_slantview/blob/master/readme_screenshots/screenshot3b.png)

This kind of view shouldn't need any special programming code..it should just part of the Google Android Material Design specs (but it's not):

[https://material.io/guidelines/#](https://material.io/guidelines/# "Material Guidelines")

..and it's not part of the "guidelines" (especially "view clipping"):

[https://developer.android.com/training/material/index.html](https://developer.android.com/training/material/index.html "Material Developer Docs")

Note:

My interest (and medium term goal) is wanting to design a nav (navigation) drawer (or slider panel) that is slanted on the sides (like a trapezoidal shape).

For working with trapezoidal shapes, see also my other trapezoidal android project:
[https://github.com/jameswhite7/android_trapezoidal_imagewarp](https://github.com/jameswhite7/android_trapezoidal_imagewarp "my other android trapezoidal related code")

## Features
Uses Path.LineTo and canvas.drawPath to "shape" a non-rectangular View 

## Limitations /drawbacks/ Issues:

This code project is structured to be imported into Eclipse, but could also be import into Android Studio --however no gradle files customized specifically for that IDE are provided.

## Developed from the following sources:

Screenshot from the original article:
https://cdn-images-1.medium.com/max/1600/0*GMfKr8UwsSuNPZ_u.png


The original article (in Indonesian):
https://medium.com/@mnafian/membuat-custom-diagonalshapeview-android-6ddc92b1980

The original article (with Google translate in English):

https://translate.googleusercontent.com/translate_c?depth=1&hl=en&prev=search&rurl=translate.google.com&sl=id&sp=nmt4&u=https://medium.com/%40mnafian/membuat-custom-diagonalshapeview-android-6ddc92b1980&usg=ALkJrhhF2JV0sG-eqHRnQJpb-rmrEW6S4g

The main drawback for this article is that it didn't have any actual working code zip to download and therefoe is somewhat lacking...

Specifically this line:

		bgPaint.setColor (getResources (). getColor (R.color.colorPrimary));

..doesn't give any idea what "colorPrimary" is?

I ended up substituting this line instead:

    	bgPaint.setColor(Color.parseColor("#82AD75"));

You'll notice I also changed these lines:

		path.lineTo (w, h / 2);
		path.lineTo (0, h); `

..to this code (because it worked/looked better with my revised "activity_main.xml":

		path.lineTo (w, h / 4); 
    	path.lineTo (0, h / 2);


**Another approach to doing diagonal "cut" views using rotation:**

https://medium.com/@adinugroho/create-diagonal-cut-view-in-android-5a376eca6a1c

Code from the other approach:
https://github.com/hidrodixtion/Android-Diagonal-Cut-View/tree/19af400adeef917014fc1a30399b62200e0068a2

The Eclipse code for the circular (round) shaped imageview was from here:
https://github.com/manishsri01/AndroidCustomImageView

However if you're using Android Studio this gradle assisted library might be more useful:
https://github.com/hdodenhof/CircleImageView


## License

[![WTFPL badge](http://www.wtfpl.net/wp-content/uploads/2012/12/wtfpl-badge-4.png "License:WTFPL")](http://www.wtfpl.net/)

[https://github.com/jameswhite7/android_diagonal_slantview/blob/master/LICENSE.MD](https://github.com/jameswhite7/android_diagonal_slantview/blob/master/LICENSE.MD "License.md")
