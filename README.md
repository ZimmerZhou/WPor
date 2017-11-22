本应用是一个查看相关天气信息的应用，用户可以在上面查看到所在地区的相关天气情况。


    项目采用MVP架构，在网络请求方面使用了RXjava+Retrofit+okhttp,并对其做了一些简单的
封装，使每一次的网络请求后可以被缓存起来，这样以后再使用就可以使用缓存的网络请求。

主要使用的控件为RecyclerView,使用了它用来展示相关的天气信息等，如下所示。
![](https://github.com/815065046/Pictures/raw/master/Pictures/_4.png)

本应用主要使用到的天气API有：
彩云天气
心知天气

应用对返回的Json数据进行解析并进行显示。

图片加载方面使用了Picasso进行网络图片的加载。

应用相关截图如下：
<div align=center><img width="400"height="710"src="https://github.com/815065046/Pictures/raw/master/Pictures/_1.png"/></div>
<div align=center><img width="400"height="710"src="https://github.com/815065046/Pictures/raw/master/Pictures/_2.png"/></div>
<div align=center><img width="400"height="710"src="https://github.com/815065046/Pictures/raw/master/Pictures/_3.png"/></div>
<div align=center><img width="400"height="710"src="https://github.com/815065046/Pictures/raw/master/Pictures/_4.png"/></div>




