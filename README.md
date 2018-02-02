# AlphabetIndexFastScrollRecyclerview
This is android alphabet Index fastscroll (very smooth) Recycler View

![alt text](https://github.com/kapilmhr/AlphabetIndexFastScrollRecyclerview/blob/master/snapshots/mygif.gif)


### Follow these steps to use this library:
#### In build.gradle (Project)

``` gradle
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
``` 

And then in the other gradle file(may be your app gradle or your own module library gradle, but never add in both of them to avoid conflict.)

``` gradle
dependencies {
	        compile 'com.github.kapilmhr:AlphabetIndexFastScrollRecyclerview:1.0.0'
          }
```


## How to use

#### Step 1: add this to your xml:
``` xml
<fastscroll.app.fastscrollalphabetindex.AlphabetIndexFastScrollRecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
```

    
Step 2: implement SectionIndexer to RecyclerViewAdapter.
``` java

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyHolder> implements SectionIndexer{
    List<Data> dataList;
    private ArrayList<Integer> mSectionPositions;

    public DataAdapter(List<Data> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        Data data = dataList.get(position);
        holder.title.setText(data.getTitle());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public Object[] getSections() {
        List<String> sections = new ArrayList<>();
        mSectionPositions = new ArrayList<>();
        for (int i = 0, size = dataList.size(); i < size; i++) {
            String section = String.valueOf(dataList.get(i).getTitle().charAt(0)).toUpperCase();
            if (!sections.contains(section)) {
                sections.add(section);
                mSectionPositions.add(i);
            }
        }
        return sections.toArray(new String[0]);
    }

    @Override
    public int getPositionForSection(int i) {
        return mSectionPositions.get(i);    }

    @Override
    public int getSectionForPosition(int i) {
        return 0;
    }

```
#### Note: mDataArray: this is your recycler data array model.

### Features

* Change IndexTextSize:
``` java
recyclerView.setIndexTextSize(12);
```

* Change IndexBarTextColor:
 ``` java
 recyclerView.setIndexBarTextColor("#FFFFFF");
 recyclerView.setIndexBarTextColor(R.color.index_bar_text_color);

```

* Change IndexBarColor:
 ``` java
 recyclerView.setIndexBarColor("#33334c");
 recyclerView.setIndexBarColor(R.color.index_bar_color);
 ```
 
* Change IndexBarCornerRadius:
 ``` java
 recyclerView.setIndexBarCornerRadius(3);
 ```
* Change IndexBarTransparentValue:
``` java
recyclerView.setIndexBarTransparentValue((float) 0.4);
```

* Change IndexbarMargin:
``` java
 recyclerView.setIndexbarMargin(4);
 ```
* Change IndexbarWidth:
``` java
 recyclerView.setIndexbarWidth(40);
 ```
 
*Change PreviewPadding:
``` java
 recyclerView.setPreviewPadding(2);
 ```
* Change PreviewVisibility:
 ``` java
 recyclerView.setPreviewVisibility(false);
 ```
* Change Typeface:
 ``` java
 Typeface typeface = Typeface.createFromAsset(context.getAssets(), "Custom-Font.ttf");
 recyclerView.setTypeface(typeface);
 ```
* To hide/show Fast Scroll IndexBar:
``` java
recyclerView.setIndexBarVisibility(true);
```

* Change IndexBarHighLateTextColor:
``` java
recyclerView.setIndexbarHighLateTextColor("#33334c);

recyclerView.setIndexbarHighLateTextColor(R.color.index_bar_highlight_text_color);
```

* To hide/show IndexBarHighLateText:
``` java
recyclerView.setIndexBarHighLateTextVisibility(true);
```

