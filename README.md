# WrapContentListView
A ListView which its height can wrap content even it is in a ScrollView

Although it's not a good idea to nest a ListView in a ScrollView, in Android Studio, a warning will be given after inspections:

> Nested scrolling widgets
>
> A scrolling widget such as a ScrollView should not contain any nested scrolling widgets since this has various usability issues

But if you really want to, this [WrapContentListView](/app/src/main/java/org/mazhuang/wrapcontentlistview/WrapContentListView.java) can be a solution.

### ScreenShots

**Use normal ListView**

![unwanted](/screenshots/unwanted.gif)

**Use this WrapContentListView**

![wanted](/screenshots/wanted.gif)

### Usage

```xml
<org.mazhuang.wrapcontentlistview.WrapContentListView
    android:id="@+id/list_wrap_content"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
</org.mazhuang.wrapcontentlistview.WrapContentListView>
```
