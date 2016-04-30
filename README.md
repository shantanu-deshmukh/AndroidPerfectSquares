# AndroidPerfectSquares
If we statically define height and width of any layout or if we use weights, it will not support multiple screens. A square layout on mobile may look like a rectangle on a tablet.  This Android Library allows you to create Perfect Square Layouts irrespective of the screen size.

For complete discription with more example <a href="http://dshantanu.com/2016/03/16/android-library-make-perfect-square-layouts/" target="_blank">see here.</a>
<p> <b> How to Use? </b>
<br />
<p><u>Step 1:</u> Add following dependency to your app gradle.</p>
<code>compile 'com.dshantanu.androidsquareslib:androidsquareslib:1.0'</code><br />
<p>
<u>Step 2:</u> Use the <strong><code>AndroidSquares</code></strong> View in your layout file depending on your requirement.  See following example to get an idea of how to use them.</p>
```xml  
<LinearLayout
        android:id="@+id/ll_row1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:orientation="horizontal">
        <com.dshantanu.androidsquareslib.AndroidSquares
            android:layout_width="0dip"
            android:layout_height="0dip"
            android:layout_margin="8dp"
            android:layout_weight="1"
            android:background="#2196F3"
            android:elevation="8dp"
            android:padding="5dp" >
            <!-- Add contents here-->
        </com.dshantanu.androidsquareslib.AndroidSquares>
        <com.dshantanu.androidsquareslib.AndroidSquares
            android:layout_width="0dip"
            android:layout_height="0dip"
            android:layout_margin="8dp"
            android:layout_weight="1"
            android:background="#8BC34A"
            android:elevation="8dp"
            android:padding="5dp" >
            <!-- Add contents here-->
        </com.dshantanu.androidsquareslib.AndroidSquares>
    </LinearLayout>
```

For complete discription with more example <a href="http://dshantanu.com/2016/03/16/android-library-make-perfect-square-layouts/" target="_blank">see here.</a>
