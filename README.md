# WrapContentListView
A ListView which its height can wrap content even it is in a ScrollView

Although it's not a good idea to nest a ListView in a ScrollView, in Android Studio, an inspection will be given:

> Nested scrolling widgets
> A scrolling widget such as a ScrollView should not contain any nested scrolling widgets since this has various usability issues

But if you real want to use, this can be a solution.

**Use normal ListView**

![unwanted](/screenshots/unwanted.gif)

**Use this WrapContentListView**

![wanted](/screenshots/wanted.gif)
