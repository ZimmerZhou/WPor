package com.lans.lwk.wpor.model.entity;

import java.util.List;

/**
 * Created by Li on 2017/11/12.
 */

public class Forecast_WeatherInfo {

    /**
     * status : ok
     * lang : zh_CN
     * server_time : 1443418212
     * tzshift : 28800
     * location : [25.1552,121.6544]
     * unit : metric
     * result : {"status":"ok","hourly":{"status":"ok","pm25":[{"value":8,"datetime":"2015-09-28 13:00"},{"value":8,"datetime":"2015-09-28 14:00"},{"value":7,"datetime":"2015-09-28 15:00"},{"value":3,"datetime":"2015-09-28 16:00"},{"value":-0,"datetime":"2015-09-28 17:00"},{"value":-0,"datetime":"2015-09-28 18:00"},{"value":-0,"datetime":"2015-09-28 19:00"},{"value":-0,"datetime":"2015-09-28 20:00"},{"value":-0,"datetime":"2015-09-28 21:00"},{"value":-0,"datetime":"2015-09-28 22:00"},{"value":-0,"datetime":"2015-09-28 23:00"},{"value":-0,"datetime":"2015-09-29 00:00"},{"value":-0,"datetime":"2015-09-29 01:00"},{"value":-0,"datetime":"2015-09-29 02:00"},{"value":-0,"datetime":"2015-09-29 03:00"},{"value":-0,"datetime":"2015-09-29 04:00"},{"value":-0,"datetime":"2015-09-29 05:00"},{"value":-0,"datetime":"2015-09-29 06:00"},{"value":-0,"datetime":"2015-09-29 07:00"},{"value":-0,"datetime":"2015-09-29 08:00"},{"value":-0,"datetime":"2015-09-29 09:00"},{"value":-0,"datetime":"2015-09-29 10:00"},{"value":-0,"datetime":"2015-09-29 11:00"},{"value":-0,"datetime":"2015-09-29 12:00"},{"value":-0,"datetime":"2015-09-29 13:00"},{"value":-0,"datetime":"2015-09-29 14:00"},{"value":-0,"datetime":"2015-09-29 15:00"},{"value":-0,"datetime":"2015-09-29 16:00"},{"value":-0,"datetime":"2015-09-29 17:00"},{"value":-0,"datetime":"2015-09-29 18:00"},{"value":-0,"datetime":"2015-09-29 19:00"},{"value":-0,"datetime":"2015-09-29 20:00"},{"value":-0,"datetime":"2015-09-29 21:00"},{"value":-0,"datetime":"2015-09-29 22:00"},{"value":-0,"datetime":"2015-09-29 23:00"},{"value":-0,"datetime":"2015-09-30 00:00"},{"value":-0,"datetime":"2015-09-30 01:00"},{"value":-0,"datetime":"2015-09-30 02:00"},{"value":-0,"datetime":"2015-09-30 03:00"},{"value":-0,"datetime":"2015-09-30 04:00"},{"value":-0,"datetime":"2015-09-30 05:00"},{"value":3,"datetime":"2015-09-30 06:00"},{"value":8,"datetime":"2015-09-30 07:00"},{"value":14,"datetime":"2015-09-30 08:00"},{"value":19,"datetime":"2015-09-30 09:00"},{"value":24,"datetime":"2015-09-30 10:00"},{"value":29,"datetime":"2015-09-30 11:00"},{"value":33,"datetime":"2015-09-30 12:00"}],"description":"暴雨渐大，今天晚间21点钟后大雨，其后阴","skycon":[{"value":"RAIN","datetime":"2015-09-28 13:00"},{"value":"RAIN","datetime":"2015-09-28 14:00"},{"value":"RAIN","datetime":"2015-09-28 15:00"},{"value":"RAIN","datetime":"2015-09-28 16:00"},{"value":"RAIN","datetime":"2015-09-28 17:00"},{"value":"RAIN","datetime":"2015-09-28 18:00"},{"value":"RAIN","datetime":"2015-09-28 19:00"},{"value":"RAIN","datetime":"2015-09-28 20:00"},{"value":"RAIN","datetime":"2015-09-28 21:00"},{"value":"RAIN","datetime":"2015-09-28 22:00"},{"value":"RAIN","datetime":"2015-09-28 23:00"},{"value":"RAIN","datetime":"2015-09-29 00:00"},{"value":"RAIN","datetime":"2015-09-29 01:00"},{"value":"RAIN","datetime":"2015-09-29 02:00"},{"value":"RAIN","datetime":"2015-09-29 03:00"},{"value":"RAIN","datetime":"2015-09-29 04:00"},{"value":"RAIN","datetime":"2015-09-29 05:00"},{"value":"RAIN","datetime":"2015-09-29 06:00"},{"value":"RAIN","datetime":"2015-09-29 07:00"},{"value":"RAIN","datetime":"2015-09-29 08:00"},{"value":"RAIN","datetime":"2015-09-29 09:00"},{"value":"RAIN","datetime":"2015-09-29 10:00"},{"value":"CLOUDY","datetime":"2015-09-29 11:00"},{"value":"CLOUDY","datetime":"2015-09-29 12:00"},{"value":"CLOUDY","datetime":"2015-09-29 13:00"},{"value":"CLOUDY","datetime":"2015-09-29 14:00"},{"value":"CLOUDY","datetime":"2015-09-29 15:00"},{"value":"CLOUDY","datetime":"2015-09-29 16:00"},{"value":"CLOUDY","datetime":"2015-09-29 17:00"},{"value":"CLOUDY","datetime":"2015-09-29 18:00"},{"value":"CLOUDY","datetime":"2015-09-29 19:00"},{"value":"CLOUDY","datetime":"2015-09-29 20:00"},{"value":"CLOUDY","datetime":"2015-09-29 21:00"},{"value":"CLOUDY","datetime":"2015-09-29 22:00"},{"value":"CLOUDY","datetime":"2015-09-29 23:00"},{"value":"CLOUDY","datetime":"2015-09-30 00:00"},{"value":"CLOUDY","datetime":"2015-09-30 01:00"},{"value":"CLOUDY","datetime":"2015-09-30 02:00"},{"value":"CLOUDY","datetime":"2015-09-30 03:00"},{"value":"CLOUDY","datetime":"2015-09-30 04:00"},{"value":"CLOUDY","datetime":"2015-09-30 05:00"},{"value":"CLOUDY","datetime":"2015-09-30 06:00"},{"value":"CLOUDY","datetime":"2015-09-30 07:00"},{"value":"CLOUDY","datetime":"2015-09-30 08:00"},{"value":"CLOUDY","datetime":"2015-09-30 09:00"},{"value":"CLOUDY","datetime":"2015-09-30 10:00"},{"value":"CLOUDY","datetime":"2015-09-30 11:00"},{"value":"CLOUDY","datetime":"2015-09-30 12:00"}],"cloudrate":[{"value":1,"datetime":"2015-09-28 13:00"},{"value":1,"datetime":"2015-09-28 14:00"},{"value":1,"datetime":"2015-09-28 15:00"},{"value":1,"datetime":"2015-09-28 16:00"},{"value":1,"datetime":"2015-09-28 17:00"},{"value":1,"datetime":"2015-09-28 18:00"},{"value":1,"datetime":"2015-09-28 19:00"},{"value":1,"datetime":"2015-09-28 20:00"},{"value":1,"datetime":"2015-09-28 21:00"},{"value":1,"datetime":"2015-09-28 22:00"},{"value":1,"datetime":"2015-09-28 23:00"},{"value":1,"datetime":"2015-09-29 00:00"},{"value":1,"datetime":"2015-09-29 01:00"},{"value":1,"datetime":"2015-09-29 02:00"},{"value":1,"datetime":"2015-09-29 03:00"},{"value":1,"datetime":"2015-09-29 04:00"},{"value":1,"datetime":"2015-09-29 05:00"},{"value":1,"datetime":"2015-09-29 06:00"},{"value":1,"datetime":"2015-09-29 07:00"},{"value":1,"datetime":"2015-09-29 08:00"},{"value":1,"datetime":"2015-09-29 09:00"},{"value":1,"datetime":"2015-09-29 10:00"},{"value":1,"datetime":"2015-09-29 11:00"},{"value":1,"datetime":"2015-09-29 12:00"},{"value":1,"datetime":"2015-09-29 13:00"},{"value":1,"datetime":"2015-09-29 14:00"},{"value":1,"datetime":"2015-09-29 15:00"},{"value":1,"datetime":"2015-09-29 16:00"},{"value":1,"datetime":"2015-09-29 17:00"},{"value":1,"datetime":"2015-09-29 18:00"},{"value":0.99,"datetime":"2015-09-29 19:00"},{"value":0.98,"datetime":"2015-09-29 20:00"},{"value":0.98,"datetime":"2015-09-29 21:00"},{"value":0.97,"datetime":"2015-09-29 22:00"},{"value":0.95,"datetime":"2015-09-29 23:00"},{"value":0.93,"datetime":"2015-09-30 00:00"},{"value":0.9,"datetime":"2015-09-30 01:00"},{"value":0.89,"datetime":"2015-09-30 02:00"},{"value":0.89,"datetime":"2015-09-30 03:00"},{"value":0.89,"datetime":"2015-09-30 04:00"},{"value":0.91,"datetime":"2015-09-30 05:00"},{"value":0.92,"datetime":"2015-09-30 06:00"},{"value":0.93,"datetime":"2015-09-30 07:00"},{"value":0.94,"datetime":"2015-09-30 08:00"},{"value":0.96,"datetime":"2015-09-30 09:00"},{"value":0.97,"datetime":"2015-09-30 10:00"},{"value":0.98,"datetime":"2015-09-30 11:00"},{"value":0.99,"datetime":"2015-09-30 12:00"}],"aqi":[{"value":33,"datetime":"2015-09-28 13:00"},{"value":33,"datetime":"2015-09-28 14:00"},{"value":33,"datetime":"2015-09-28 15:00"},{"value":28,"datetime":"2015-09-28 16:00"},{"value":25,"datetime":"2015-09-28 17:00"},{"value":25,"datetime":"2015-09-28 18:00"},{"value":25,"datetime":"2015-09-28 19:00"},{"value":25,"datetime":"2015-09-28 20:00"},{"value":26,"datetime":"2015-09-28 21:00"},{"value":27,"datetime":"2015-09-28 22:00"},{"value":27,"datetime":"2015-09-28 23:00"},{"value":26,"datetime":"2015-09-29 00:00"},{"value":26,"datetime":"2015-09-29 01:00"},{"value":26,"datetime":"2015-09-29 02:00"},{"value":26,"datetime":"2015-09-29 03:00"},{"value":26,"datetime":"2015-09-29 04:00"},{"value":26,"datetime":"2015-09-29 05:00"},{"value":26,"datetime":"2015-09-29 06:00"},{"value":26,"datetime":"2015-09-29 07:00"},{"value":26,"datetime":"2015-09-29 08:00"},{"value":27,"datetime":"2015-09-29 09:00"},{"value":27,"datetime":"2015-09-29 10:00"},{"value":28,"datetime":"2015-09-29 11:00"},{"value":28,"datetime":"2015-09-29 12:00"},{"value":28,"datetime":"2015-09-29 13:00"},{"value":27,"datetime":"2015-09-29 14:00"},{"value":27,"datetime":"2015-09-29 15:00"},{"value":27,"datetime":"2015-09-29 16:00"},{"value":27,"datetime":"2015-09-29 17:00"},{"value":27,"datetime":"2015-09-29 18:00"},{"value":26,"datetime":"2015-09-29 19:00"},{"value":26,"datetime":"2015-09-29 20:00"},{"value":26,"datetime":"2015-09-29 21:00"},{"value":26,"datetime":"2015-09-29 22:00"},{"value":26,"datetime":"2015-09-29 23:00"},{"value":26,"datetime":"2015-09-30 00:00"},{"value":26,"datetime":"2015-09-30 01:00"},{"value":26,"datetime":"2015-09-30 02:00"},{"value":25,"datetime":"2015-09-30 03:00"},{"value":25,"datetime":"2015-09-30 04:00"},{"value":25,"datetime":"2015-09-30 05:00"},{"value":28,"datetime":"2015-09-30 06:00"},{"value":34,"datetime":"2015-09-30 07:00"},{"value":40,"datetime":"2015-09-30 08:00"},{"value":46,"datetime":"2015-09-30 09:00"},{"value":51,"datetime":"2015-09-30 10:00"},{"value":56,"datetime":"2015-09-30 11:00"},{"value":60,"datetime":"2015-09-30 12:00"}],"humidity":[{"value":0.92,"datetime":"2015-09-28 13:00"},{"value":0.9,"datetime":"2015-09-28 14:00"},{"value":0.86,"datetime":"2015-09-28 15:00"},{"value":0.82,"datetime":"2015-09-28 16:00"},{"value":0.8,"datetime":"2015-09-28 17:00"},{"value":0.81,"datetime":"2015-09-28 18:00"},{"value":0.84,"datetime":"2015-09-28 19:00"},{"value":0.87,"datetime":"2015-09-28 20:00"},{"value":0.87,"datetime":"2015-09-28 21:00"},{"value":0.86,"datetime":"2015-09-28 22:00"},{"value":0.84,"datetime":"2015-09-28 23:00"},{"value":0.83,"datetime":"2015-09-29 00:00"},{"value":0.84,"datetime":"2015-09-29 01:00"},{"value":0.84,"datetime":"2015-09-29 02:00"},{"value":0.85,"datetime":"2015-09-29 03:00"},{"value":0.85,"datetime":"2015-09-29 04:00"},{"value":0.85,"datetime":"2015-09-29 05:00"},{"value":0.86,"datetime":"2015-09-29 06:00"},{"value":0.86,"datetime":"2015-09-29 07:00"},{"value":0.85,"datetime":"2015-09-29 08:00"},{"value":0.84,"datetime":"2015-09-29 09:00"},{"value":0.81,"datetime":"2015-09-29 10:00"},{"value":0.78,"datetime":"2015-09-29 11:00"},{"value":0.76,"datetime":"2015-09-29 12:00"},{"value":0.74,"datetime":"2015-09-29 13:00"},{"value":0.74,"datetime":"2015-09-29 14:00"},{"value":0.75,"datetime":"2015-09-29 15:00"},{"value":0.77,"datetime":"2015-09-29 16:00"},{"value":0.79,"datetime":"2015-09-29 17:00"},{"value":0.81,"datetime":"2015-09-29 18:00"},{"value":0.84,"datetime":"2015-09-29 19:00"},{"value":0.86,"datetime":"2015-09-29 20:00"},{"value":0.87,"datetime":"2015-09-29 21:00"},{"value":0.88,"datetime":"2015-09-29 22:00"},{"value":0.88,"datetime":"2015-09-29 23:00"},{"value":0.88,"datetime":"2015-09-30 00:00"},{"value":0.87,"datetime":"2015-09-30 01:00"},{"value":0.87,"datetime":"2015-09-30 02:00"},{"value":0.86,"datetime":"2015-09-30 03:00"},{"value":0.85,"datetime":"2015-09-30 04:00"},{"value":0.84,"datetime":"2015-09-30 05:00"},{"value":0.82,"datetime":"2015-09-30 06:00"},{"value":0.8,"datetime":"2015-09-30 07:00"},{"value":0.78,"datetime":"2015-09-30 08:00"},{"value":0.75,"datetime":"2015-09-30 09:00"},{"value":0.72,"datetime":"2015-09-30 10:00"},{"value":0.7,"datetime":"2015-09-30 11:00"},{"value":0.69,"datetime":"2015-09-30 12:00"}],"precipitation":[{"value":0.5902,"datetime":"2015-09-28 13:00"},{"value":0.5811,"datetime":"2015-09-28 14:00"},{"value":6.3074,"datetime":"2015-09-28 15:00"},{"value":6.1533,"datetime":"2015-09-28 16:00"},{"value":6.516,"datetime":"2015-09-28 17:00"},{"value":7.7872,"datetime":"2015-09-28 18:00"},{"value":9.179,"datetime":"2015-09-28 19:00"},{"value":9.6091,"datetime":"2015-09-28 20:00"},{"value":8.3625,"datetime":"2015-09-28 21:00"},{"value":6.1934,"datetime":"2015-09-28 22:00"},{"value":4.2239,"datetime":"2015-09-28 23:00"},{"value":3.2836,"datetime":"2015-09-29 00:00"},{"value":3.034,"datetime":"2015-09-29 01:00"},{"value":2.8445,"datetime":"2015-09-29 02:00"},{"value":2.2507,"datetime":"2015-09-29 03:00"},{"value":1.4529,"datetime":"2015-09-29 04:00"},{"value":0.8175,"datetime":"2015-09-29 05:00"},{"value":0.6051,"datetime":"2015-09-29 06:00"},{"value":0.6534,"datetime":"2015-09-29 07:00"},{"value":0.6944,"datetime":"2015-09-29 08:00"},{"value":0.531,"datetime":"2015-09-29 09:00"},{"value":0.2498,"datetime":"2015-09-29 10:00"},{"value":0,"datetime":"2015-09-29 11:00"},{"value":0,"datetime":"2015-09-29 12:00"},{"value":0,"datetime":"2015-09-29 13:00"},{"value":0,"datetime":"2015-09-29 14:00"},{"value":0,"datetime":"2015-09-29 15:00"},{"value":0,"datetime":"2015-09-29 16:00"},{"value":0,"datetime":"2015-09-29 17:00"},{"value":0,"datetime":"2015-09-29 18:00"},{"value":0,"datetime":"2015-09-29 19:00"},{"value":0,"datetime":"2015-09-29 20:00"},{"value":0,"datetime":"2015-09-29 21:00"},{"value":0,"datetime":"2015-09-29 22:00"},{"value":0,"datetime":"2015-09-29 23:00"},{"value":0,"datetime":"2015-09-30 00:00"},{"value":0,"datetime":"2015-09-30 01:00"},{"value":0,"datetime":"2015-09-30 02:00"},{"value":0,"datetime":"2015-09-30 03:00"},{"value":0,"datetime":"2015-09-30 04:00"},{"value":0,"datetime":"2015-09-30 05:00"},{"value":0,"datetime":"2015-09-30 06:00"},{"value":0,"datetime":"2015-09-30 07:00"},{"value":0,"datetime":"2015-09-30 08:00"},{"value":0,"datetime":"2015-09-30 09:00"},{"value":0,"datetime":"2015-09-30 10:00"},{"value":0,"datetime":"2015-09-30 11:00"},{"value":0,"datetime":"2015-09-30 12:00"}],"wind":[{"direction":23.09,"speed":80.66,"datetime":"2015-09-28 13:00"},{"direction":29.65,"speed":84.26,"datetime":"2015-09-28 14:00"},{"direction":45.83,"speed":84.38,"datetime":"2015-09-28 15:00"},{"direction":65.63,"speed":90.21,"datetime":"2015-09-28 16:00"},{"direction":79.94,"speed":99.98,"datetime":"2015-09-28 17:00"},{"direction":86.6,"speed":103.67,"datetime":"2015-09-28 18:00"},{"direction":89.83,"speed":100.6,"datetime":"2015-09-28 19:00"},{"direction":93.26,"speed":95.57,"datetime":"2015-09-28 20:00"},{"direction":99.25,"speed":93.52,"datetime":"2015-09-28 21:00"},{"direction":106.71,"speed":94.64,"datetime":"2015-09-28 22:00"},{"direction":113.91,"speed":96.91,"datetime":"2015-09-28 23:00"},{"direction":120.02,"speed":97.84,"datetime":"2015-09-29 00:00"},{"direction":124.93,"speed":96.62,"datetime":"2015-09-29 01:00"},{"direction":128.49,"speed":92.93,"datetime":"2015-09-29 02:00"},{"direction":130.57,"speed":86.72,"datetime":"2015-09-29 03:00"},{"direction":131.69,"speed":79.14,"datetime":"2015-09-29 04:00"},{"direction":132.56,"speed":71.79,"datetime":"2015-09-29 05:00"},{"direction":133.92,"speed":65.93,"datetime":"2015-09-29 06:00"},{"direction":135.82,"speed":60.99,"datetime":"2015-09-29 07:00"},{"direction":138.14,"speed":55.96,"datetime":"2015-09-29 08:00"},{"direction":140.84,"speed":50.07,"datetime":"2015-09-29 09:00"},{"direction":143.67,"speed":43.65,"datetime":"2015-09-29 10:00"},{"direction":145.99,"speed":37.24,"datetime":"2015-09-29 11:00"},{"direction":146.87,"speed":31.28,"datetime":"2015-09-29 12:00"},{"direction":146.18,"speed":26.12,"datetime":"2015-09-29 13:00"},{"direction":144.51,"speed":22.13,"datetime":"2015-09-29 14:00"},{"direction":143.11,"speed":19.54,"datetime":"2015-09-29 15:00"},{"direction":142.53,"speed":18.05,"datetime":"2015-09-29 16:00"},{"direction":142.87,"speed":17.23,"datetime":"2015-09-29 17:00"},{"direction":143.91,"speed":16.72,"datetime":"2015-09-29 18:00"},{"direction":145.01,"speed":16.34,"datetime":"2015-09-29 19:00"},{"direction":145.36,"speed":15.95,"datetime":"2015-09-29 20:00"},{"direction":144.5,"speed":15.43,"datetime":"2015-09-29 21:00"},{"direction":143.4,"speed":14.73,"datetime":"2015-09-29 22:00"},{"direction":143.63,"speed":13.8,"datetime":"2015-09-29 23:00"},{"direction":146.65,"speed":12.64,"datetime":"2015-09-30 00:00"},{"direction":151.88,"speed":11.39,"datetime":"2015-09-30 01:00"},{"direction":157.62,"speed":10.17,"datetime":"2015-09-30 02:00"},{"direction":161.93,"speed":8.96,"datetime":"2015-09-30 03:00"},{"direction":165.03,"speed":7.95,"datetime":"2015-09-30 04:00"},{"direction":167.9,"speed":7.39,"datetime":"2015-09-30 05:00"},{"direction":171.13,"speed":7.47,"datetime":"2015-09-30 06:00"},{"direction":173.88,"speed":7.86,"datetime":"2015-09-30 07:00"},{"direction":175.68,"speed":8.11,"datetime":"2015-09-30 08:00"},{"direction":176.8,"speed":7.8,"datetime":"2015-09-30 09:00"},{"direction":178.65,"speed":6.86,"datetime":"2015-09-30 10:00"},{"direction":184.3,"speed":5.31,"datetime":"2015-09-30 11:00"},{"direction":202.11,"speed":3.44,"datetime":"2015-09-30 12:00"}],"temperature":[{"value":25.11,"datetime":"2015-09-28 13:00"},{"value":25.32,"datetime":"2015-09-28 14:00"},{"value":25.33,"datetime":"2015-09-28 15:00"},{"value":25.3,"datetime":"2015-09-28 16:00"},{"value":25.5,"datetime":"2015-09-28 17:00"},{"value":25.19,"datetime":"2015-09-28 18:00"},{"value":24.9,"datetime":"2015-09-28 19:00"},{"value":25.28,"datetime":"2015-09-28 20:00"},{"value":25.59,"datetime":"2015-09-28 21:00"},{"value":26.54,"datetime":"2015-09-28 22:00"},{"value":26.74,"datetime":"2015-09-28 23:00"},{"value":26.21,"datetime":"2015-09-29 00:00"},{"value":25.69,"datetime":"2015-09-29 01:00"},{"value":25.59,"datetime":"2015-09-29 02:00"},{"value":25.93,"datetime":"2015-09-29 03:00"},{"value":26.08,"datetime":"2015-09-29 04:00"},{"value":26.31,"datetime":"2015-09-29 05:00"},{"value":26.35,"datetime":"2015-09-29 06:00"},{"value":26.39,"datetime":"2015-09-29 07:00"},{"value":26.18,"datetime":"2015-09-29 08:00"},{"value":26.67,"datetime":"2015-09-29 09:00"},{"value":27.25,"datetime":"2015-09-29 10:00"},{"value":27.5,"datetime":"2015-09-29 11:00"},{"value":27.59,"datetime":"2015-09-29 12:00"},{"value":27.53,"datetime":"2015-09-29 13:00"},{"value":27.38,"datetime":"2015-09-29 14:00"},{"value":27.35,"datetime":"2015-09-29 15:00"},{"value":27.17,"datetime":"2015-09-29 16:00"},{"value":26.87,"datetime":"2015-09-29 17:00"},{"value":26.51,"datetime":"2015-09-29 18:00"},{"value":26.18,"datetime":"2015-09-29 19:00"},{"value":25.93,"datetime":"2015-09-29 20:00"},{"value":25.75,"datetime":"2015-09-29 21:00"},{"value":25.68,"datetime":"2015-09-29 22:00"},{"value":25.73,"datetime":"2015-09-29 23:00"},{"value":25.77,"datetime":"2015-09-30 00:00"},{"value":25.69,"datetime":"2015-09-30 01:00"},{"value":25.53,"datetime":"2015-09-30 02:00"},{"value":25.35,"datetime":"2015-09-30 03:00"},{"value":25.23,"datetime":"2015-09-30 04:00"},{"value":25.23,"datetime":"2015-09-30 05:00"},{"value":25.39,"datetime":"2015-09-30 06:00"},{"value":25.68,"datetime":"2015-09-30 07:00"},{"value":26.23,"datetime":"2015-09-30 08:00"},{"value":26.7,"datetime":"2015-09-30 09:00"},{"value":27.11,"datetime":"2015-09-30 10:00"},{"value":27.25,"datetime":"2015-09-30 11:00"},{"value":27.23,"datetime":"2015-09-30 12:00"}]},"minutely":{"status":"ok","precipitation":[0.2812,0.2959,0.3125,0.3288,0.3427,0.3519,0.3542,0.3481,0.3351,0.3176,0.2978,0.278,0.2604,0.2469,0.2371,0.2302,0.2254,0.2218,0.2188,0.2154,0.2119,0.2082,0.2046,0.2011,0.1979,0.1951,0.1928,0.1908,0.1893,0.1882,0.1875,0.1872,0.1873,0.1874,0.1876,0.1877,0.1875,0.187,0.1867,0.187,0.1886,0.1921,0.1979,0.2064,0.2166,0.2273,0.2372,0.2452,0.25,0.2507,0.248,0.2425,0.2352,0.227,0.2188,0.2111,0.2044,0.1985,0.1937,0.19],"datasource":"radar","description":"16分钟后雨渐小，转为小雨"},"daily":{"status":"ok","astro":[{"date":"2015-09-28","sunset":{"time":"17:44"},"sunrise":{"time":"05:44"}},{"date":"2015-09-29","sunset":{"time":"17:43"},"sunrise":{"time":"05:44"}},{"date":"2015-09-30","sunset":{"time":"17:42"},"sunrise":{"time":"05:44"}},{"date":"2015-10-01","sunset":{"time":"17:41"},"sunrise":{"time":"05:45"}},{"date":"2015-10-02","sunset":{"time":"17:40"},"sunrise":{"time":"05:45"}}],"temperature":[{"date":"2015-09-28","max":26.86,"avg":25.39,"min":24.97},{"date":"2015-09-29","max":27.58,"avg":26.5,"min":25.59},{"date":"2015-09-30","max":27.25,"avg":26.22,"min":25.21},{"date":"2015-10-01","max":27.3,"avg":26.27,"min":25.42},{"date":"2015-10-02","max":26.57,"avg":23.06,"min":21.77}],"pm25":[{"date":"2015-09-28","max":13,"avg":6,"min":-0},{"date":"2015-09-29","max":-0,"avg":0,"min":-0},{"date":"2015-09-30","max":35,"avg":20,"min":-0},{"date":"2015-10-01","max":15,"avg":5,"min":-0},{"date":"2015-10-02","max":2,"avg":0,"min":-0}],"skycon":[{"date":"2015-09-28","value":"RAIN"},{"date":"2015-09-29","value":"RAIN"},{"date":"2015-09-30","value":"CLOUDY"},{"date":"2015-10-01","value":"RAIN"},{"date":"2015-10-02","value":"RAIN"}],"cloudrate":[{"date":"2015-09-28","max":1,"avg":1,"min":1},{"date":"2015-09-29","max":1,"avg":0.99,"min":0.95},{"date":"2015-09-30","max":1,"avg":0.95,"min":0.89},{"date":"2015-10-01","max":0.99,"avg":0.96,"min":0.91},{"date":"2015-10-02","max":1,"avg":0.91,"min":0.79}],"aqi":[{"date":"2015-09-28","max":38,"avg":32,"min":26},{"date":"2015-09-29","max":28,"avg":26,"min":25},{"date":"2015-09-30","max":61,"avg":47,"min":27},{"date":"2015-10-01","max":41,"avg":30,"min":24},{"date":"2015-10-02","max":25,"avg":24,"min":22}],"precipitation":[{"date":"2015-09-28","max":9.6091,"avg":4.4194,"min":1.4964},{"date":"2015-09-29","max":3.2836,"avg":0.684,"min":0},{"date":"2015-09-30","max":0.5972,"avg":0.0541,"min":0},{"date":"2015-10-01","max":0.5944,"avg":0.0967,"min":0},{"date":"2015-10-02","max":0.8844,"avg":0.2504,"min":0}],"wind":[{"date":"2015-09-28","max":{"direction":86.6,"speed":103.66},"avg":{"direction":56.13,"speed":55.22},"min":{"direction":11.12,"speed":35.05}},{"date":"2015-09-29","max":{"direction":120.02,"speed":97.84},"avg":{"direction":134.58,"speed":43.98},"min":{"direction":143.64,"speed":13.8}},{"date":"2015-09-30","max":{"direction":146.65,"speed":12.64},"avg":{"direction":171.3,"speed":5.09},"min":{"direction":19.89,"speed":1}},{"date":"2015-10-01","max":{"direction":251.76,"speed":9.14},"avg":{"direction":218.53,"speed":6.08},"min":{"direction":204.15,"speed":3.72}},{"date":"2015-10-02","max":{"direction":37.58,"speed":28.53},"avg":{"direction":54.28,"speed":16.31},"min":{"direction":257.06,"speed":6.61}}],"humidity":[{"date":"2015-09-28","max":0.93,"avg":0.89,"min":0.8},{"date":"2015-09-29","max":0.88,"avg":0.82,"min":0.74},{"date":"2015-09-30","max":0.89,"avg":0.79,"min":0.69},{"date":"2015-10-01","max":0.92,"avg":0.84,"min":0.76},{"date":"2015-10-02","max":0.9,"avg":0.84,"min":0.78}]}}
     */

    private String status;
    private String lang;
    private int server_time;
    private int tzshift;
    private String unit;
    private ResultBean result;
    private List<Double> location;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getServer_time() {
        return server_time;
    }

    public void setServer_time(int server_time) {
        this.server_time = server_time;
    }

    public int getTzshift() {
        return tzshift;
    }

    public void setTzshift(int tzshift) {
        this.tzshift = tzshift;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public static class ResultBean {
        /**
         * status : ok
         * hourly : {"status":"ok","pm25":[{"value":8,"datetime":"2015-09-28 13:00"},{"value":8,"datetime":"2015-09-28 14:00"},{"value":7,"datetime":"2015-09-28 15:00"},{"value":3,"datetime":"2015-09-28 16:00"},{"value":-0,"datetime":"2015-09-28 17:00"},{"value":-0,"datetime":"2015-09-28 18:00"},{"value":-0,"datetime":"2015-09-28 19:00"},{"value":-0,"datetime":"2015-09-28 20:00"},{"value":-0,"datetime":"2015-09-28 21:00"},{"value":-0,"datetime":"2015-09-28 22:00"},{"value":-0,"datetime":"2015-09-28 23:00"},{"value":-0,"datetime":"2015-09-29 00:00"},{"value":-0,"datetime":"2015-09-29 01:00"},{"value":-0,"datetime":"2015-09-29 02:00"},{"value":-0,"datetime":"2015-09-29 03:00"},{"value":-0,"datetime":"2015-09-29 04:00"},{"value":-0,"datetime":"2015-09-29 05:00"},{"value":-0,"datetime":"2015-09-29 06:00"},{"value":-0,"datetime":"2015-09-29 07:00"},{"value":-0,"datetime":"2015-09-29 08:00"},{"value":-0,"datetime":"2015-09-29 09:00"},{"value":-0,"datetime":"2015-09-29 10:00"},{"value":-0,"datetime":"2015-09-29 11:00"},{"value":-0,"datetime":"2015-09-29 12:00"},{"value":-0,"datetime":"2015-09-29 13:00"},{"value":-0,"datetime":"2015-09-29 14:00"},{"value":-0,"datetime":"2015-09-29 15:00"},{"value":-0,"datetime":"2015-09-29 16:00"},{"value":-0,"datetime":"2015-09-29 17:00"},{"value":-0,"datetime":"2015-09-29 18:00"},{"value":-0,"datetime":"2015-09-29 19:00"},{"value":-0,"datetime":"2015-09-29 20:00"},{"value":-0,"datetime":"2015-09-29 21:00"},{"value":-0,"datetime":"2015-09-29 22:00"},{"value":-0,"datetime":"2015-09-29 23:00"},{"value":-0,"datetime":"2015-09-30 00:00"},{"value":-0,"datetime":"2015-09-30 01:00"},{"value":-0,"datetime":"2015-09-30 02:00"},{"value":-0,"datetime":"2015-09-30 03:00"},{"value":-0,"datetime":"2015-09-30 04:00"},{"value":-0,"datetime":"2015-09-30 05:00"},{"value":3,"datetime":"2015-09-30 06:00"},{"value":8,"datetime":"2015-09-30 07:00"},{"value":14,"datetime":"2015-09-30 08:00"},{"value":19,"datetime":"2015-09-30 09:00"},{"value":24,"datetime":"2015-09-30 10:00"},{"value":29,"datetime":"2015-09-30 11:00"},{"value":33,"datetime":"2015-09-30 12:00"}],"description":"暴雨渐大，今天晚间21点钟后大雨，其后阴","skycon":[{"value":"RAIN","datetime":"2015-09-28 13:00"},{"value":"RAIN","datetime":"2015-09-28 14:00"},{"value":"RAIN","datetime":"2015-09-28 15:00"},{"value":"RAIN","datetime":"2015-09-28 16:00"},{"value":"RAIN","datetime":"2015-09-28 17:00"},{"value":"RAIN","datetime":"2015-09-28 18:00"},{"value":"RAIN","datetime":"2015-09-28 19:00"},{"value":"RAIN","datetime":"2015-09-28 20:00"},{"value":"RAIN","datetime":"2015-09-28 21:00"},{"value":"RAIN","datetime":"2015-09-28 22:00"},{"value":"RAIN","datetime":"2015-09-28 23:00"},{"value":"RAIN","datetime":"2015-09-29 00:00"},{"value":"RAIN","datetime":"2015-09-29 01:00"},{"value":"RAIN","datetime":"2015-09-29 02:00"},{"value":"RAIN","datetime":"2015-09-29 03:00"},{"value":"RAIN","datetime":"2015-09-29 04:00"},{"value":"RAIN","datetime":"2015-09-29 05:00"},{"value":"RAIN","datetime":"2015-09-29 06:00"},{"value":"RAIN","datetime":"2015-09-29 07:00"},{"value":"RAIN","datetime":"2015-09-29 08:00"},{"value":"RAIN","datetime":"2015-09-29 09:00"},{"value":"RAIN","datetime":"2015-09-29 10:00"},{"value":"CLOUDY","datetime":"2015-09-29 11:00"},{"value":"CLOUDY","datetime":"2015-09-29 12:00"},{"value":"CLOUDY","datetime":"2015-09-29 13:00"},{"value":"CLOUDY","datetime":"2015-09-29 14:00"},{"value":"CLOUDY","datetime":"2015-09-29 15:00"},{"value":"CLOUDY","datetime":"2015-09-29 16:00"},{"value":"CLOUDY","datetime":"2015-09-29 17:00"},{"value":"CLOUDY","datetime":"2015-09-29 18:00"},{"value":"CLOUDY","datetime":"2015-09-29 19:00"},{"value":"CLOUDY","datetime":"2015-09-29 20:00"},{"value":"CLOUDY","datetime":"2015-09-29 21:00"},{"value":"CLOUDY","datetime":"2015-09-29 22:00"},{"value":"CLOUDY","datetime":"2015-09-29 23:00"},{"value":"CLOUDY","datetime":"2015-09-30 00:00"},{"value":"CLOUDY","datetime":"2015-09-30 01:00"},{"value":"CLOUDY","datetime":"2015-09-30 02:00"},{"value":"CLOUDY","datetime":"2015-09-30 03:00"},{"value":"CLOUDY","datetime":"2015-09-30 04:00"},{"value":"CLOUDY","datetime":"2015-09-30 05:00"},{"value":"CLOUDY","datetime":"2015-09-30 06:00"},{"value":"CLOUDY","datetime":"2015-09-30 07:00"},{"value":"CLOUDY","datetime":"2015-09-30 08:00"},{"value":"CLOUDY","datetime":"2015-09-30 09:00"},{"value":"CLOUDY","datetime":"2015-09-30 10:00"},{"value":"CLOUDY","datetime":"2015-09-30 11:00"},{"value":"CLOUDY","datetime":"2015-09-30 12:00"}],"cloudrate":[{"value":1,"datetime":"2015-09-28 13:00"},{"value":1,"datetime":"2015-09-28 14:00"},{"value":1,"datetime":"2015-09-28 15:00"},{"value":1,"datetime":"2015-09-28 16:00"},{"value":1,"datetime":"2015-09-28 17:00"},{"value":1,"datetime":"2015-09-28 18:00"},{"value":1,"datetime":"2015-09-28 19:00"},{"value":1,"datetime":"2015-09-28 20:00"},{"value":1,"datetime":"2015-09-28 21:00"},{"value":1,"datetime":"2015-09-28 22:00"},{"value":1,"datetime":"2015-09-28 23:00"},{"value":1,"datetime":"2015-09-29 00:00"},{"value":1,"datetime":"2015-09-29 01:00"},{"value":1,"datetime":"2015-09-29 02:00"},{"value":1,"datetime":"2015-09-29 03:00"},{"value":1,"datetime":"2015-09-29 04:00"},{"value":1,"datetime":"2015-09-29 05:00"},{"value":1,"datetime":"2015-09-29 06:00"},{"value":1,"datetime":"2015-09-29 07:00"},{"value":1,"datetime":"2015-09-29 08:00"},{"value":1,"datetime":"2015-09-29 09:00"},{"value":1,"datetime":"2015-09-29 10:00"},{"value":1,"datetime":"2015-09-29 11:00"},{"value":1,"datetime":"2015-09-29 12:00"},{"value":1,"datetime":"2015-09-29 13:00"},{"value":1,"datetime":"2015-09-29 14:00"},{"value":1,"datetime":"2015-09-29 15:00"},{"value":1,"datetime":"2015-09-29 16:00"},{"value":1,"datetime":"2015-09-29 17:00"},{"value":1,"datetime":"2015-09-29 18:00"},{"value":0.99,"datetime":"2015-09-29 19:00"},{"value":0.98,"datetime":"2015-09-29 20:00"},{"value":0.98,"datetime":"2015-09-29 21:00"},{"value":0.97,"datetime":"2015-09-29 22:00"},{"value":0.95,"datetime":"2015-09-29 23:00"},{"value":0.93,"datetime":"2015-09-30 00:00"},{"value":0.9,"datetime":"2015-09-30 01:00"},{"value":0.89,"datetime":"2015-09-30 02:00"},{"value":0.89,"datetime":"2015-09-30 03:00"},{"value":0.89,"datetime":"2015-09-30 04:00"},{"value":0.91,"datetime":"2015-09-30 05:00"},{"value":0.92,"datetime":"2015-09-30 06:00"},{"value":0.93,"datetime":"2015-09-30 07:00"},{"value":0.94,"datetime":"2015-09-30 08:00"},{"value":0.96,"datetime":"2015-09-30 09:00"},{"value":0.97,"datetime":"2015-09-30 10:00"},{"value":0.98,"datetime":"2015-09-30 11:00"},{"value":0.99,"datetime":"2015-09-30 12:00"}],"aqi":[{"value":33,"datetime":"2015-09-28 13:00"},{"value":33,"datetime":"2015-09-28 14:00"},{"value":33,"datetime":"2015-09-28 15:00"},{"value":28,"datetime":"2015-09-28 16:00"},{"value":25,"datetime":"2015-09-28 17:00"},{"value":25,"datetime":"2015-09-28 18:00"},{"value":25,"datetime":"2015-09-28 19:00"},{"value":25,"datetime":"2015-09-28 20:00"},{"value":26,"datetime":"2015-09-28 21:00"},{"value":27,"datetime":"2015-09-28 22:00"},{"value":27,"datetime":"2015-09-28 23:00"},{"value":26,"datetime":"2015-09-29 00:00"},{"value":26,"datetime":"2015-09-29 01:00"},{"value":26,"datetime":"2015-09-29 02:00"},{"value":26,"datetime":"2015-09-29 03:00"},{"value":26,"datetime":"2015-09-29 04:00"},{"value":26,"datetime":"2015-09-29 05:00"},{"value":26,"datetime":"2015-09-29 06:00"},{"value":26,"datetime":"2015-09-29 07:00"},{"value":26,"datetime":"2015-09-29 08:00"},{"value":27,"datetime":"2015-09-29 09:00"},{"value":27,"datetime":"2015-09-29 10:00"},{"value":28,"datetime":"2015-09-29 11:00"},{"value":28,"datetime":"2015-09-29 12:00"},{"value":28,"datetime":"2015-09-29 13:00"},{"value":27,"datetime":"2015-09-29 14:00"},{"value":27,"datetime":"2015-09-29 15:00"},{"value":27,"datetime":"2015-09-29 16:00"},{"value":27,"datetime":"2015-09-29 17:00"},{"value":27,"datetime":"2015-09-29 18:00"},{"value":26,"datetime":"2015-09-29 19:00"},{"value":26,"datetime":"2015-09-29 20:00"},{"value":26,"datetime":"2015-09-29 21:00"},{"value":26,"datetime":"2015-09-29 22:00"},{"value":26,"datetime":"2015-09-29 23:00"},{"value":26,"datetime":"2015-09-30 00:00"},{"value":26,"datetime":"2015-09-30 01:00"},{"value":26,"datetime":"2015-09-30 02:00"},{"value":25,"datetime":"2015-09-30 03:00"},{"value":25,"datetime":"2015-09-30 04:00"},{"value":25,"datetime":"2015-09-30 05:00"},{"value":28,"datetime":"2015-09-30 06:00"},{"value":34,"datetime":"2015-09-30 07:00"},{"value":40,"datetime":"2015-09-30 08:00"},{"value":46,"datetime":"2015-09-30 09:00"},{"value":51,"datetime":"2015-09-30 10:00"},{"value":56,"datetime":"2015-09-30 11:00"},{"value":60,"datetime":"2015-09-30 12:00"}],"humidity":[{"value":0.92,"datetime":"2015-09-28 13:00"},{"value":0.9,"datetime":"2015-09-28 14:00"},{"value":0.86,"datetime":"2015-09-28 15:00"},{"value":0.82,"datetime":"2015-09-28 16:00"},{"value":0.8,"datetime":"2015-09-28 17:00"},{"value":0.81,"datetime":"2015-09-28 18:00"},{"value":0.84,"datetime":"2015-09-28 19:00"},{"value":0.87,"datetime":"2015-09-28 20:00"},{"value":0.87,"datetime":"2015-09-28 21:00"},{"value":0.86,"datetime":"2015-09-28 22:00"},{"value":0.84,"datetime":"2015-09-28 23:00"},{"value":0.83,"datetime":"2015-09-29 00:00"},{"value":0.84,"datetime":"2015-09-29 01:00"},{"value":0.84,"datetime":"2015-09-29 02:00"},{"value":0.85,"datetime":"2015-09-29 03:00"},{"value":0.85,"datetime":"2015-09-29 04:00"},{"value":0.85,"datetime":"2015-09-29 05:00"},{"value":0.86,"datetime":"2015-09-29 06:00"},{"value":0.86,"datetime":"2015-09-29 07:00"},{"value":0.85,"datetime":"2015-09-29 08:00"},{"value":0.84,"datetime":"2015-09-29 09:00"},{"value":0.81,"datetime":"2015-09-29 10:00"},{"value":0.78,"datetime":"2015-09-29 11:00"},{"value":0.76,"datetime":"2015-09-29 12:00"},{"value":0.74,"datetime":"2015-09-29 13:00"},{"value":0.74,"datetime":"2015-09-29 14:00"},{"value":0.75,"datetime":"2015-09-29 15:00"},{"value":0.77,"datetime":"2015-09-29 16:00"},{"value":0.79,"datetime":"2015-09-29 17:00"},{"value":0.81,"datetime":"2015-09-29 18:00"},{"value":0.84,"datetime":"2015-09-29 19:00"},{"value":0.86,"datetime":"2015-09-29 20:00"},{"value":0.87,"datetime":"2015-09-29 21:00"},{"value":0.88,"datetime":"2015-09-29 22:00"},{"value":0.88,"datetime":"2015-09-29 23:00"},{"value":0.88,"datetime":"2015-09-30 00:00"},{"value":0.87,"datetime":"2015-09-30 01:00"},{"value":0.87,"datetime":"2015-09-30 02:00"},{"value":0.86,"datetime":"2015-09-30 03:00"},{"value":0.85,"datetime":"2015-09-30 04:00"},{"value":0.84,"datetime":"2015-09-30 05:00"},{"value":0.82,"datetime":"2015-09-30 06:00"},{"value":0.8,"datetime":"2015-09-30 07:00"},{"value":0.78,"datetime":"2015-09-30 08:00"},{"value":0.75,"datetime":"2015-09-30 09:00"},{"value":0.72,"datetime":"2015-09-30 10:00"},{"value":0.7,"datetime":"2015-09-30 11:00"},{"value":0.69,"datetime":"2015-09-30 12:00"}],"precipitation":[{"value":0.5902,"datetime":"2015-09-28 13:00"},{"value":0.5811,"datetime":"2015-09-28 14:00"},{"value":6.3074,"datetime":"2015-09-28 15:00"},{"value":6.1533,"datetime":"2015-09-28 16:00"},{"value":6.516,"datetime":"2015-09-28 17:00"},{"value":7.7872,"datetime":"2015-09-28 18:00"},{"value":9.179,"datetime":"2015-09-28 19:00"},{"value":9.6091,"datetime":"2015-09-28 20:00"},{"value":8.3625,"datetime":"2015-09-28 21:00"},{"value":6.1934,"datetime":"2015-09-28 22:00"},{"value":4.2239,"datetime":"2015-09-28 23:00"},{"value":3.2836,"datetime":"2015-09-29 00:00"},{"value":3.034,"datetime":"2015-09-29 01:00"},{"value":2.8445,"datetime":"2015-09-29 02:00"},{"value":2.2507,"datetime":"2015-09-29 03:00"},{"value":1.4529,"datetime":"2015-09-29 04:00"},{"value":0.8175,"datetime":"2015-09-29 05:00"},{"value":0.6051,"datetime":"2015-09-29 06:00"},{"value":0.6534,"datetime":"2015-09-29 07:00"},{"value":0.6944,"datetime":"2015-09-29 08:00"},{"value":0.531,"datetime":"2015-09-29 09:00"},{"value":0.2498,"datetime":"2015-09-29 10:00"},{"value":0,"datetime":"2015-09-29 11:00"},{"value":0,"datetime":"2015-09-29 12:00"},{"value":0,"datetime":"2015-09-29 13:00"},{"value":0,"datetime":"2015-09-29 14:00"},{"value":0,"datetime":"2015-09-29 15:00"},{"value":0,"datetime":"2015-09-29 16:00"},{"value":0,"datetime":"2015-09-29 17:00"},{"value":0,"datetime":"2015-09-29 18:00"},{"value":0,"datetime":"2015-09-29 19:00"},{"value":0,"datetime":"2015-09-29 20:00"},{"value":0,"datetime":"2015-09-29 21:00"},{"value":0,"datetime":"2015-09-29 22:00"},{"value":0,"datetime":"2015-09-29 23:00"},{"value":0,"datetime":"2015-09-30 00:00"},{"value":0,"datetime":"2015-09-30 01:00"},{"value":0,"datetime":"2015-09-30 02:00"},{"value":0,"datetime":"2015-09-30 03:00"},{"value":0,"datetime":"2015-09-30 04:00"},{"value":0,"datetime":"2015-09-30 05:00"},{"value":0,"datetime":"2015-09-30 06:00"},{"value":0,"datetime":"2015-09-30 07:00"},{"value":0,"datetime":"2015-09-30 08:00"},{"value":0,"datetime":"2015-09-30 09:00"},{"value":0,"datetime":"2015-09-30 10:00"},{"value":0,"datetime":"2015-09-30 11:00"},{"value":0,"datetime":"2015-09-30 12:00"}],"wind":[{"direction":23.09,"speed":80.66,"datetime":"2015-09-28 13:00"},{"direction":29.65,"speed":84.26,"datetime":"2015-09-28 14:00"},{"direction":45.83,"speed":84.38,"datetime":"2015-09-28 15:00"},{"direction":65.63,"speed":90.21,"datetime":"2015-09-28 16:00"},{"direction":79.94,"speed":99.98,"datetime":"2015-09-28 17:00"},{"direction":86.6,"speed":103.67,"datetime":"2015-09-28 18:00"},{"direction":89.83,"speed":100.6,"datetime":"2015-09-28 19:00"},{"direction":93.26,"speed":95.57,"datetime":"2015-09-28 20:00"},{"direction":99.25,"speed":93.52,"datetime":"2015-09-28 21:00"},{"direction":106.71,"speed":94.64,"datetime":"2015-09-28 22:00"},{"direction":113.91,"speed":96.91,"datetime":"2015-09-28 23:00"},{"direction":120.02,"speed":97.84,"datetime":"2015-09-29 00:00"},{"direction":124.93,"speed":96.62,"datetime":"2015-09-29 01:00"},{"direction":128.49,"speed":92.93,"datetime":"2015-09-29 02:00"},{"direction":130.57,"speed":86.72,"datetime":"2015-09-29 03:00"},{"direction":131.69,"speed":79.14,"datetime":"2015-09-29 04:00"},{"direction":132.56,"speed":71.79,"datetime":"2015-09-29 05:00"},{"direction":133.92,"speed":65.93,"datetime":"2015-09-29 06:00"},{"direction":135.82,"speed":60.99,"datetime":"2015-09-29 07:00"},{"direction":138.14,"speed":55.96,"datetime":"2015-09-29 08:00"},{"direction":140.84,"speed":50.07,"datetime":"2015-09-29 09:00"},{"direction":143.67,"speed":43.65,"datetime":"2015-09-29 10:00"},{"direction":145.99,"speed":37.24,"datetime":"2015-09-29 11:00"},{"direction":146.87,"speed":31.28,"datetime":"2015-09-29 12:00"},{"direction":146.18,"speed":26.12,"datetime":"2015-09-29 13:00"},{"direction":144.51,"speed":22.13,"datetime":"2015-09-29 14:00"},{"direction":143.11,"speed":19.54,"datetime":"2015-09-29 15:00"},{"direction":142.53,"speed":18.05,"datetime":"2015-09-29 16:00"},{"direction":142.87,"speed":17.23,"datetime":"2015-09-29 17:00"},{"direction":143.91,"speed":16.72,"datetime":"2015-09-29 18:00"},{"direction":145.01,"speed":16.34,"datetime":"2015-09-29 19:00"},{"direction":145.36,"speed":15.95,"datetime":"2015-09-29 20:00"},{"direction":144.5,"speed":15.43,"datetime":"2015-09-29 21:00"},{"direction":143.4,"speed":14.73,"datetime":"2015-09-29 22:00"},{"direction":143.63,"speed":13.8,"datetime":"2015-09-29 23:00"},{"direction":146.65,"speed":12.64,"datetime":"2015-09-30 00:00"},{"direction":151.88,"speed":11.39,"datetime":"2015-09-30 01:00"},{"direction":157.62,"speed":10.17,"datetime":"2015-09-30 02:00"},{"direction":161.93,"speed":8.96,"datetime":"2015-09-30 03:00"},{"direction":165.03,"speed":7.95,"datetime":"2015-09-30 04:00"},{"direction":167.9,"speed":7.39,"datetime":"2015-09-30 05:00"},{"direction":171.13,"speed":7.47,"datetime":"2015-09-30 06:00"},{"direction":173.88,"speed":7.86,"datetime":"2015-09-30 07:00"},{"direction":175.68,"speed":8.11,"datetime":"2015-09-30 08:00"},{"direction":176.8,"speed":7.8,"datetime":"2015-09-30 09:00"},{"direction":178.65,"speed":6.86,"datetime":"2015-09-30 10:00"},{"direction":184.3,"speed":5.31,"datetime":"2015-09-30 11:00"},{"direction":202.11,"speed":3.44,"datetime":"2015-09-30 12:00"}],"temperature":[{"value":25.11,"datetime":"2015-09-28 13:00"},{"value":25.32,"datetime":"2015-09-28 14:00"},{"value":25.33,"datetime":"2015-09-28 15:00"},{"value":25.3,"datetime":"2015-09-28 16:00"},{"value":25.5,"datetime":"2015-09-28 17:00"},{"value":25.19,"datetime":"2015-09-28 18:00"},{"value":24.9,"datetime":"2015-09-28 19:00"},{"value":25.28,"datetime":"2015-09-28 20:00"},{"value":25.59,"datetime":"2015-09-28 21:00"},{"value":26.54,"datetime":"2015-09-28 22:00"},{"value":26.74,"datetime":"2015-09-28 23:00"},{"value":26.21,"datetime":"2015-09-29 00:00"},{"value":25.69,"datetime":"2015-09-29 01:00"},{"value":25.59,"datetime":"2015-09-29 02:00"},{"value":25.93,"datetime":"2015-09-29 03:00"},{"value":26.08,"datetime":"2015-09-29 04:00"},{"value":26.31,"datetime":"2015-09-29 05:00"},{"value":26.35,"datetime":"2015-09-29 06:00"},{"value":26.39,"datetime":"2015-09-29 07:00"},{"value":26.18,"datetime":"2015-09-29 08:00"},{"value":26.67,"datetime":"2015-09-29 09:00"},{"value":27.25,"datetime":"2015-09-29 10:00"},{"value":27.5,"datetime":"2015-09-29 11:00"},{"value":27.59,"datetime":"2015-09-29 12:00"},{"value":27.53,"datetime":"2015-09-29 13:00"},{"value":27.38,"datetime":"2015-09-29 14:00"},{"value":27.35,"datetime":"2015-09-29 15:00"},{"value":27.17,"datetime":"2015-09-29 16:00"},{"value":26.87,"datetime":"2015-09-29 17:00"},{"value":26.51,"datetime":"2015-09-29 18:00"},{"value":26.18,"datetime":"2015-09-29 19:00"},{"value":25.93,"datetime":"2015-09-29 20:00"},{"value":25.75,"datetime":"2015-09-29 21:00"},{"value":25.68,"datetime":"2015-09-29 22:00"},{"value":25.73,"datetime":"2015-09-29 23:00"},{"value":25.77,"datetime":"2015-09-30 00:00"},{"value":25.69,"datetime":"2015-09-30 01:00"},{"value":25.53,"datetime":"2015-09-30 02:00"},{"value":25.35,"datetime":"2015-09-30 03:00"},{"value":25.23,"datetime":"2015-09-30 04:00"},{"value":25.23,"datetime":"2015-09-30 05:00"},{"value":25.39,"datetime":"2015-09-30 06:00"},{"value":25.68,"datetime":"2015-09-30 07:00"},{"value":26.23,"datetime":"2015-09-30 08:00"},{"value":26.7,"datetime":"2015-09-30 09:00"},{"value":27.11,"datetime":"2015-09-30 10:00"},{"value":27.25,"datetime":"2015-09-30 11:00"},{"value":27.23,"datetime":"2015-09-30 12:00"}]}
         * minutely : {"status":"ok","precipitation":[0.2812,0.2959,0.3125,0.3288,0.3427,0.3519,0.3542,0.3481,0.3351,0.3176,0.2978,0.278,0.2604,0.2469,0.2371,0.2302,0.2254,0.2218,0.2188,0.2154,0.2119,0.2082,0.2046,0.2011,0.1979,0.1951,0.1928,0.1908,0.1893,0.1882,0.1875,0.1872,0.1873,0.1874,0.1876,0.1877,0.1875,0.187,0.1867,0.187,0.1886,0.1921,0.1979,0.2064,0.2166,0.2273,0.2372,0.2452,0.25,0.2507,0.248,0.2425,0.2352,0.227,0.2188,0.2111,0.2044,0.1985,0.1937,0.19],"datasource":"radar","description":"16分钟后雨渐小，转为小雨"}
         * daily : {"status":"ok","astro":[{"date":"2015-09-28","sunset":{"time":"17:44"},"sunrise":{"time":"05:44"}},{"date":"2015-09-29","sunset":{"time":"17:43"},"sunrise":{"time":"05:44"}},{"date":"2015-09-30","sunset":{"time":"17:42"},"sunrise":{"time":"05:44"}},{"date":"2015-10-01","sunset":{"time":"17:41"},"sunrise":{"time":"05:45"}},{"date":"2015-10-02","sunset":{"time":"17:40"},"sunrise":{"time":"05:45"}}],"temperature":[{"date":"2015-09-28","max":26.86,"avg":25.39,"min":24.97},{"date":"2015-09-29","max":27.58,"avg":26.5,"min":25.59},{"date":"2015-09-30","max":27.25,"avg":26.22,"min":25.21},{"date":"2015-10-01","max":27.3,"avg":26.27,"min":25.42},{"date":"2015-10-02","max":26.57,"avg":23.06,"min":21.77}],"pm25":[{"date":"2015-09-28","max":13,"avg":6,"min":-0},{"date":"2015-09-29","max":-0,"avg":0,"min":-0},{"date":"2015-09-30","max":35,"avg":20,"min":-0},{"date":"2015-10-01","max":15,"avg":5,"min":-0},{"date":"2015-10-02","max":2,"avg":0,"min":-0}],"skycon":[{"date":"2015-09-28","value":"RAIN"},{"date":"2015-09-29","value":"RAIN"},{"date":"2015-09-30","value":"CLOUDY"},{"date":"2015-10-01","value":"RAIN"},{"date":"2015-10-02","value":"RAIN"}],"cloudrate":[{"date":"2015-09-28","max":1,"avg":1,"min":1},{"date":"2015-09-29","max":1,"avg":0.99,"min":0.95},{"date":"2015-09-30","max":1,"avg":0.95,"min":0.89},{"date":"2015-10-01","max":0.99,"avg":0.96,"min":0.91},{"date":"2015-10-02","max":1,"avg":0.91,"min":0.79}],"aqi":[{"date":"2015-09-28","max":38,"avg":32,"min":26},{"date":"2015-09-29","max":28,"avg":26,"min":25},{"date":"2015-09-30","max":61,"avg":47,"min":27},{"date":"2015-10-01","max":41,"avg":30,"min":24},{"date":"2015-10-02","max":25,"avg":24,"min":22}],"precipitation":[{"date":"2015-09-28","max":9.6091,"avg":4.4194,"min":1.4964},{"date":"2015-09-29","max":3.2836,"avg":0.684,"min":0},{"date":"2015-09-30","max":0.5972,"avg":0.0541,"min":0},{"date":"2015-10-01","max":0.5944,"avg":0.0967,"min":0},{"date":"2015-10-02","max":0.8844,"avg":0.2504,"min":0}],"wind":[{"date":"2015-09-28","max":{"direction":86.6,"speed":103.66},"avg":{"direction":56.13,"speed":55.22},"min":{"direction":11.12,"speed":35.05}},{"date":"2015-09-29","max":{"direction":120.02,"speed":97.84},"avg":{"direction":134.58,"speed":43.98},"min":{"direction":143.64,"speed":13.8}},{"date":"2015-09-30","max":{"direction":146.65,"speed":12.64},"avg":{"direction":171.3,"speed":5.09},"min":{"direction":19.89,"speed":1}},{"date":"2015-10-01","max":{"direction":251.76,"speed":9.14},"avg":{"direction":218.53,"speed":6.08},"min":{"direction":204.15,"speed":3.72}},{"date":"2015-10-02","max":{"direction":37.58,"speed":28.53},"avg":{"direction":54.28,"speed":16.31},"min":{"direction":257.06,"speed":6.61}}],"humidity":[{"date":"2015-09-28","max":0.93,"avg":0.89,"min":0.8},{"date":"2015-09-29","max":0.88,"avg":0.82,"min":0.74},{"date":"2015-09-30","max":0.89,"avg":0.79,"min":0.69},{"date":"2015-10-01","max":0.92,"avg":0.84,"min":0.76},{"date":"2015-10-02","max":0.9,"avg":0.84,"min":0.78}]}
         */

        private String status;
        private HourlyBean hourly;
        private MinutelyBean minutely;
        private DailyBean daily;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public HourlyBean getHourly() {
            return hourly;
        }

        public void setHourly(HourlyBean hourly) {
            this.hourly = hourly;
        }

        public MinutelyBean getMinutely() {
            return minutely;
        }

        public void setMinutely(MinutelyBean minutely) {
            this.minutely = minutely;
        }

        public DailyBean getDaily() {
            return daily;
        }

        public void setDaily(DailyBean daily) {
            this.daily = daily;
        }

        public static class HourlyBean {
            /**
             * status : ok
             * pm25 : [{"value":8,"datetime":"2015-09-28 13:00"},{"value":8,"datetime":"2015-09-28 14:00"},{"value":7,"datetime":"2015-09-28 15:00"},{"value":3,"datetime":"2015-09-28 16:00"},{"value":-0,"datetime":"2015-09-28 17:00"},{"value":-0,"datetime":"2015-09-28 18:00"},{"value":-0,"datetime":"2015-09-28 19:00"},{"value":-0,"datetime":"2015-09-28 20:00"},{"value":-0,"datetime":"2015-09-28 21:00"},{"value":-0,"datetime":"2015-09-28 22:00"},{"value":-0,"datetime":"2015-09-28 23:00"},{"value":-0,"datetime":"2015-09-29 00:00"},{"value":-0,"datetime":"2015-09-29 01:00"},{"value":-0,"datetime":"2015-09-29 02:00"},{"value":-0,"datetime":"2015-09-29 03:00"},{"value":-0,"datetime":"2015-09-29 04:00"},{"value":-0,"datetime":"2015-09-29 05:00"},{"value":-0,"datetime":"2015-09-29 06:00"},{"value":-0,"datetime":"2015-09-29 07:00"},{"value":-0,"datetime":"2015-09-29 08:00"},{"value":-0,"datetime":"2015-09-29 09:00"},{"value":-0,"datetime":"2015-09-29 10:00"},{"value":-0,"datetime":"2015-09-29 11:00"},{"value":-0,"datetime":"2015-09-29 12:00"},{"value":-0,"datetime":"2015-09-29 13:00"},{"value":-0,"datetime":"2015-09-29 14:00"},{"value":-0,"datetime":"2015-09-29 15:00"},{"value":-0,"datetime":"2015-09-29 16:00"},{"value":-0,"datetime":"2015-09-29 17:00"},{"value":-0,"datetime":"2015-09-29 18:00"},{"value":-0,"datetime":"2015-09-29 19:00"},{"value":-0,"datetime":"2015-09-29 20:00"},{"value":-0,"datetime":"2015-09-29 21:00"},{"value":-0,"datetime":"2015-09-29 22:00"},{"value":-0,"datetime":"2015-09-29 23:00"},{"value":-0,"datetime":"2015-09-30 00:00"},{"value":-0,"datetime":"2015-09-30 01:00"},{"value":-0,"datetime":"2015-09-30 02:00"},{"value":-0,"datetime":"2015-09-30 03:00"},{"value":-0,"datetime":"2015-09-30 04:00"},{"value":-0,"datetime":"2015-09-30 05:00"},{"value":3,"datetime":"2015-09-30 06:00"},{"value":8,"datetime":"2015-09-30 07:00"},{"value":14,"datetime":"2015-09-30 08:00"},{"value":19,"datetime":"2015-09-30 09:00"},{"value":24,"datetime":"2015-09-30 10:00"},{"value":29,"datetime":"2015-09-30 11:00"},{"value":33,"datetime":"2015-09-30 12:00"}]
             * description : 暴雨渐大，今天晚间21点钟后大雨，其后阴
             * skycon : [{"value":"RAIN","datetime":"2015-09-28 13:00"},{"value":"RAIN","datetime":"2015-09-28 14:00"},{"value":"RAIN","datetime":"2015-09-28 15:00"},{"value":"RAIN","datetime":"2015-09-28 16:00"},{"value":"RAIN","datetime":"2015-09-28 17:00"},{"value":"RAIN","datetime":"2015-09-28 18:00"},{"value":"RAIN","datetime":"2015-09-28 19:00"},{"value":"RAIN","datetime":"2015-09-28 20:00"},{"value":"RAIN","datetime":"2015-09-28 21:00"},{"value":"RAIN","datetime":"2015-09-28 22:00"},{"value":"RAIN","datetime":"2015-09-28 23:00"},{"value":"RAIN","datetime":"2015-09-29 00:00"},{"value":"RAIN","datetime":"2015-09-29 01:00"},{"value":"RAIN","datetime":"2015-09-29 02:00"},{"value":"RAIN","datetime":"2015-09-29 03:00"},{"value":"RAIN","datetime":"2015-09-29 04:00"},{"value":"RAIN","datetime":"2015-09-29 05:00"},{"value":"RAIN","datetime":"2015-09-29 06:00"},{"value":"RAIN","datetime":"2015-09-29 07:00"},{"value":"RAIN","datetime":"2015-09-29 08:00"},{"value":"RAIN","datetime":"2015-09-29 09:00"},{"value":"RAIN","datetime":"2015-09-29 10:00"},{"value":"CLOUDY","datetime":"2015-09-29 11:00"},{"value":"CLOUDY","datetime":"2015-09-29 12:00"},{"value":"CLOUDY","datetime":"2015-09-29 13:00"},{"value":"CLOUDY","datetime":"2015-09-29 14:00"},{"value":"CLOUDY","datetime":"2015-09-29 15:00"},{"value":"CLOUDY","datetime":"2015-09-29 16:00"},{"value":"CLOUDY","datetime":"2015-09-29 17:00"},{"value":"CLOUDY","datetime":"2015-09-29 18:00"},{"value":"CLOUDY","datetime":"2015-09-29 19:00"},{"value":"CLOUDY","datetime":"2015-09-29 20:00"},{"value":"CLOUDY","datetime":"2015-09-29 21:00"},{"value":"CLOUDY","datetime":"2015-09-29 22:00"},{"value":"CLOUDY","datetime":"2015-09-29 23:00"},{"value":"CLOUDY","datetime":"2015-09-30 00:00"},{"value":"CLOUDY","datetime":"2015-09-30 01:00"},{"value":"CLOUDY","datetime":"2015-09-30 02:00"},{"value":"CLOUDY","datetime":"2015-09-30 03:00"},{"value":"CLOUDY","datetime":"2015-09-30 04:00"},{"value":"CLOUDY","datetime":"2015-09-30 05:00"},{"value":"CLOUDY","datetime":"2015-09-30 06:00"},{"value":"CLOUDY","datetime":"2015-09-30 07:00"},{"value":"CLOUDY","datetime":"2015-09-30 08:00"},{"value":"CLOUDY","datetime":"2015-09-30 09:00"},{"value":"CLOUDY","datetime":"2015-09-30 10:00"},{"value":"CLOUDY","datetime":"2015-09-30 11:00"},{"value":"CLOUDY","datetime":"2015-09-30 12:00"}]
             * cloudrate : [{"value":1,"datetime":"2015-09-28 13:00"},{"value":1,"datetime":"2015-09-28 14:00"},{"value":1,"datetime":"2015-09-28 15:00"},{"value":1,"datetime":"2015-09-28 16:00"},{"value":1,"datetime":"2015-09-28 17:00"},{"value":1,"datetime":"2015-09-28 18:00"},{"value":1,"datetime":"2015-09-28 19:00"},{"value":1,"datetime":"2015-09-28 20:00"},{"value":1,"datetime":"2015-09-28 21:00"},{"value":1,"datetime":"2015-09-28 22:00"},{"value":1,"datetime":"2015-09-28 23:00"},{"value":1,"datetime":"2015-09-29 00:00"},{"value":1,"datetime":"2015-09-29 01:00"},{"value":1,"datetime":"2015-09-29 02:00"},{"value":1,"datetime":"2015-09-29 03:00"},{"value":1,"datetime":"2015-09-29 04:00"},{"value":1,"datetime":"2015-09-29 05:00"},{"value":1,"datetime":"2015-09-29 06:00"},{"value":1,"datetime":"2015-09-29 07:00"},{"value":1,"datetime":"2015-09-29 08:00"},{"value":1,"datetime":"2015-09-29 09:00"},{"value":1,"datetime":"2015-09-29 10:00"},{"value":1,"datetime":"2015-09-29 11:00"},{"value":1,"datetime":"2015-09-29 12:00"},{"value":1,"datetime":"2015-09-29 13:00"},{"value":1,"datetime":"2015-09-29 14:00"},{"value":1,"datetime":"2015-09-29 15:00"},{"value":1,"datetime":"2015-09-29 16:00"},{"value":1,"datetime":"2015-09-29 17:00"},{"value":1,"datetime":"2015-09-29 18:00"},{"value":0.99,"datetime":"2015-09-29 19:00"},{"value":0.98,"datetime":"2015-09-29 20:00"},{"value":0.98,"datetime":"2015-09-29 21:00"},{"value":0.97,"datetime":"2015-09-29 22:00"},{"value":0.95,"datetime":"2015-09-29 23:00"},{"value":0.93,"datetime":"2015-09-30 00:00"},{"value":0.9,"datetime":"2015-09-30 01:00"},{"value":0.89,"datetime":"2015-09-30 02:00"},{"value":0.89,"datetime":"2015-09-30 03:00"},{"value":0.89,"datetime":"2015-09-30 04:00"},{"value":0.91,"datetime":"2015-09-30 05:00"},{"value":0.92,"datetime":"2015-09-30 06:00"},{"value":0.93,"datetime":"2015-09-30 07:00"},{"value":0.94,"datetime":"2015-09-30 08:00"},{"value":0.96,"datetime":"2015-09-30 09:00"},{"value":0.97,"datetime":"2015-09-30 10:00"},{"value":0.98,"datetime":"2015-09-30 11:00"},{"value":0.99,"datetime":"2015-09-30 12:00"}]
             * aqi : [{"value":33,"datetime":"2015-09-28 13:00"},{"value":33,"datetime":"2015-09-28 14:00"},{"value":33,"datetime":"2015-09-28 15:00"},{"value":28,"datetime":"2015-09-28 16:00"},{"value":25,"datetime":"2015-09-28 17:00"},{"value":25,"datetime":"2015-09-28 18:00"},{"value":25,"datetime":"2015-09-28 19:00"},{"value":25,"datetime":"2015-09-28 20:00"},{"value":26,"datetime":"2015-09-28 21:00"},{"value":27,"datetime":"2015-09-28 22:00"},{"value":27,"datetime":"2015-09-28 23:00"},{"value":26,"datetime":"2015-09-29 00:00"},{"value":26,"datetime":"2015-09-29 01:00"},{"value":26,"datetime":"2015-09-29 02:00"},{"value":26,"datetime":"2015-09-29 03:00"},{"value":26,"datetime":"2015-09-29 04:00"},{"value":26,"datetime":"2015-09-29 05:00"},{"value":26,"datetime":"2015-09-29 06:00"},{"value":26,"datetime":"2015-09-29 07:00"},{"value":26,"datetime":"2015-09-29 08:00"},{"value":27,"datetime":"2015-09-29 09:00"},{"value":27,"datetime":"2015-09-29 10:00"},{"value":28,"datetime":"2015-09-29 11:00"},{"value":28,"datetime":"2015-09-29 12:00"},{"value":28,"datetime":"2015-09-29 13:00"},{"value":27,"datetime":"2015-09-29 14:00"},{"value":27,"datetime":"2015-09-29 15:00"},{"value":27,"datetime":"2015-09-29 16:00"},{"value":27,"datetime":"2015-09-29 17:00"},{"value":27,"datetime":"2015-09-29 18:00"},{"value":26,"datetime":"2015-09-29 19:00"},{"value":26,"datetime":"2015-09-29 20:00"},{"value":26,"datetime":"2015-09-29 21:00"},{"value":26,"datetime":"2015-09-29 22:00"},{"value":26,"datetime":"2015-09-29 23:00"},{"value":26,"datetime":"2015-09-30 00:00"},{"value":26,"datetime":"2015-09-30 01:00"},{"value":26,"datetime":"2015-09-30 02:00"},{"value":25,"datetime":"2015-09-30 03:00"},{"value":25,"datetime":"2015-09-30 04:00"},{"value":25,"datetime":"2015-09-30 05:00"},{"value":28,"datetime":"2015-09-30 06:00"},{"value":34,"datetime":"2015-09-30 07:00"},{"value":40,"datetime":"2015-09-30 08:00"},{"value":46,"datetime":"2015-09-30 09:00"},{"value":51,"datetime":"2015-09-30 10:00"},{"value":56,"datetime":"2015-09-30 11:00"},{"value":60,"datetime":"2015-09-30 12:00"}]
             * humidity : [{"value":0.92,"datetime":"2015-09-28 13:00"},{"value":0.9,"datetime":"2015-09-28 14:00"},{"value":0.86,"datetime":"2015-09-28 15:00"},{"value":0.82,"datetime":"2015-09-28 16:00"},{"value":0.8,"datetime":"2015-09-28 17:00"},{"value":0.81,"datetime":"2015-09-28 18:00"},{"value":0.84,"datetime":"2015-09-28 19:00"},{"value":0.87,"datetime":"2015-09-28 20:00"},{"value":0.87,"datetime":"2015-09-28 21:00"},{"value":0.86,"datetime":"2015-09-28 22:00"},{"value":0.84,"datetime":"2015-09-28 23:00"},{"value":0.83,"datetime":"2015-09-29 00:00"},{"value":0.84,"datetime":"2015-09-29 01:00"},{"value":0.84,"datetime":"2015-09-29 02:00"},{"value":0.85,"datetime":"2015-09-29 03:00"},{"value":0.85,"datetime":"2015-09-29 04:00"},{"value":0.85,"datetime":"2015-09-29 05:00"},{"value":0.86,"datetime":"2015-09-29 06:00"},{"value":0.86,"datetime":"2015-09-29 07:00"},{"value":0.85,"datetime":"2015-09-29 08:00"},{"value":0.84,"datetime":"2015-09-29 09:00"},{"value":0.81,"datetime":"2015-09-29 10:00"},{"value":0.78,"datetime":"2015-09-29 11:00"},{"value":0.76,"datetime":"2015-09-29 12:00"},{"value":0.74,"datetime":"2015-09-29 13:00"},{"value":0.74,"datetime":"2015-09-29 14:00"},{"value":0.75,"datetime":"2015-09-29 15:00"},{"value":0.77,"datetime":"2015-09-29 16:00"},{"value":0.79,"datetime":"2015-09-29 17:00"},{"value":0.81,"datetime":"2015-09-29 18:00"},{"value":0.84,"datetime":"2015-09-29 19:00"},{"value":0.86,"datetime":"2015-09-29 20:00"},{"value":0.87,"datetime":"2015-09-29 21:00"},{"value":0.88,"datetime":"2015-09-29 22:00"},{"value":0.88,"datetime":"2015-09-29 23:00"},{"value":0.88,"datetime":"2015-09-30 00:00"},{"value":0.87,"datetime":"2015-09-30 01:00"},{"value":0.87,"datetime":"2015-09-30 02:00"},{"value":0.86,"datetime":"2015-09-30 03:00"},{"value":0.85,"datetime":"2015-09-30 04:00"},{"value":0.84,"datetime":"2015-09-30 05:00"},{"value":0.82,"datetime":"2015-09-30 06:00"},{"value":0.8,"datetime":"2015-09-30 07:00"},{"value":0.78,"datetime":"2015-09-30 08:00"},{"value":0.75,"datetime":"2015-09-30 09:00"},{"value":0.72,"datetime":"2015-09-30 10:00"},{"value":0.7,"datetime":"2015-09-30 11:00"},{"value":0.69,"datetime":"2015-09-30 12:00"}]
             * precipitation : [{"value":0.5902,"datetime":"2015-09-28 13:00"},{"value":0.5811,"datetime":"2015-09-28 14:00"},{"value":6.3074,"datetime":"2015-09-28 15:00"},{"value":6.1533,"datetime":"2015-09-28 16:00"},{"value":6.516,"datetime":"2015-09-28 17:00"},{"value":7.7872,"datetime":"2015-09-28 18:00"},{"value":9.179,"datetime":"2015-09-28 19:00"},{"value":9.6091,"datetime":"2015-09-28 20:00"},{"value":8.3625,"datetime":"2015-09-28 21:00"},{"value":6.1934,"datetime":"2015-09-28 22:00"},{"value":4.2239,"datetime":"2015-09-28 23:00"},{"value":3.2836,"datetime":"2015-09-29 00:00"},{"value":3.034,"datetime":"2015-09-29 01:00"},{"value":2.8445,"datetime":"2015-09-29 02:00"},{"value":2.2507,"datetime":"2015-09-29 03:00"},{"value":1.4529,"datetime":"2015-09-29 04:00"},{"value":0.8175,"datetime":"2015-09-29 05:00"},{"value":0.6051,"datetime":"2015-09-29 06:00"},{"value":0.6534,"datetime":"2015-09-29 07:00"},{"value":0.6944,"datetime":"2015-09-29 08:00"},{"value":0.531,"datetime":"2015-09-29 09:00"},{"value":0.2498,"datetime":"2015-09-29 10:00"},{"value":0,"datetime":"2015-09-29 11:00"},{"value":0,"datetime":"2015-09-29 12:00"},{"value":0,"datetime":"2015-09-29 13:00"},{"value":0,"datetime":"2015-09-29 14:00"},{"value":0,"datetime":"2015-09-29 15:00"},{"value":0,"datetime":"2015-09-29 16:00"},{"value":0,"datetime":"2015-09-29 17:00"},{"value":0,"datetime":"2015-09-29 18:00"},{"value":0,"datetime":"2015-09-29 19:00"},{"value":0,"datetime":"2015-09-29 20:00"},{"value":0,"datetime":"2015-09-29 21:00"},{"value":0,"datetime":"2015-09-29 22:00"},{"value":0,"datetime":"2015-09-29 23:00"},{"value":0,"datetime":"2015-09-30 00:00"},{"value":0,"datetime":"2015-09-30 01:00"},{"value":0,"datetime":"2015-09-30 02:00"},{"value":0,"datetime":"2015-09-30 03:00"},{"value":0,"datetime":"2015-09-30 04:00"},{"value":0,"datetime":"2015-09-30 05:00"},{"value":0,"datetime":"2015-09-30 06:00"},{"value":0,"datetime":"2015-09-30 07:00"},{"value":0,"datetime":"2015-09-30 08:00"},{"value":0,"datetime":"2015-09-30 09:00"},{"value":0,"datetime":"2015-09-30 10:00"},{"value":0,"datetime":"2015-09-30 11:00"},{"value":0,"datetime":"2015-09-30 12:00"}]
             * wind : [{"direction":23.09,"speed":80.66,"datetime":"2015-09-28 13:00"},{"direction":29.65,"speed":84.26,"datetime":"2015-09-28 14:00"},{"direction":45.83,"speed":84.38,"datetime":"2015-09-28 15:00"},{"direction":65.63,"speed":90.21,"datetime":"2015-09-28 16:00"},{"direction":79.94,"speed":99.98,"datetime":"2015-09-28 17:00"},{"direction":86.6,"speed":103.67,"datetime":"2015-09-28 18:00"},{"direction":89.83,"speed":100.6,"datetime":"2015-09-28 19:00"},{"direction":93.26,"speed":95.57,"datetime":"2015-09-28 20:00"},{"direction":99.25,"speed":93.52,"datetime":"2015-09-28 21:00"},{"direction":106.71,"speed":94.64,"datetime":"2015-09-28 22:00"},{"direction":113.91,"speed":96.91,"datetime":"2015-09-28 23:00"},{"direction":120.02,"speed":97.84,"datetime":"2015-09-29 00:00"},{"direction":124.93,"speed":96.62,"datetime":"2015-09-29 01:00"},{"direction":128.49,"speed":92.93,"datetime":"2015-09-29 02:00"},{"direction":130.57,"speed":86.72,"datetime":"2015-09-29 03:00"},{"direction":131.69,"speed":79.14,"datetime":"2015-09-29 04:00"},{"direction":132.56,"speed":71.79,"datetime":"2015-09-29 05:00"},{"direction":133.92,"speed":65.93,"datetime":"2015-09-29 06:00"},{"direction":135.82,"speed":60.99,"datetime":"2015-09-29 07:00"},{"direction":138.14,"speed":55.96,"datetime":"2015-09-29 08:00"},{"direction":140.84,"speed":50.07,"datetime":"2015-09-29 09:00"},{"direction":143.67,"speed":43.65,"datetime":"2015-09-29 10:00"},{"direction":145.99,"speed":37.24,"datetime":"2015-09-29 11:00"},{"direction":146.87,"speed":31.28,"datetime":"2015-09-29 12:00"},{"direction":146.18,"speed":26.12,"datetime":"2015-09-29 13:00"},{"direction":144.51,"speed":22.13,"datetime":"2015-09-29 14:00"},{"direction":143.11,"speed":19.54,"datetime":"2015-09-29 15:00"},{"direction":142.53,"speed":18.05,"datetime":"2015-09-29 16:00"},{"direction":142.87,"speed":17.23,"datetime":"2015-09-29 17:00"},{"direction":143.91,"speed":16.72,"datetime":"2015-09-29 18:00"},{"direction":145.01,"speed":16.34,"datetime":"2015-09-29 19:00"},{"direction":145.36,"speed":15.95,"datetime":"2015-09-29 20:00"},{"direction":144.5,"speed":15.43,"datetime":"2015-09-29 21:00"},{"direction":143.4,"speed":14.73,"datetime":"2015-09-29 22:00"},{"direction":143.63,"speed":13.8,"datetime":"2015-09-29 23:00"},{"direction":146.65,"speed":12.64,"datetime":"2015-09-30 00:00"},{"direction":151.88,"speed":11.39,"datetime":"2015-09-30 01:00"},{"direction":157.62,"speed":10.17,"datetime":"2015-09-30 02:00"},{"direction":161.93,"speed":8.96,"datetime":"2015-09-30 03:00"},{"direction":165.03,"speed":7.95,"datetime":"2015-09-30 04:00"},{"direction":167.9,"speed":7.39,"datetime":"2015-09-30 05:00"},{"direction":171.13,"speed":7.47,"datetime":"2015-09-30 06:00"},{"direction":173.88,"speed":7.86,"datetime":"2015-09-30 07:00"},{"direction":175.68,"speed":8.11,"datetime":"2015-09-30 08:00"},{"direction":176.8,"speed":7.8,"datetime":"2015-09-30 09:00"},{"direction":178.65,"speed":6.86,"datetime":"2015-09-30 10:00"},{"direction":184.3,"speed":5.31,"datetime":"2015-09-30 11:00"},{"direction":202.11,"speed":3.44,"datetime":"2015-09-30 12:00"}]
             * temperature : [{"value":25.11,"datetime":"2015-09-28 13:00"},{"value":25.32,"datetime":"2015-09-28 14:00"},{"value":25.33,"datetime":"2015-09-28 15:00"},{"value":25.3,"datetime":"2015-09-28 16:00"},{"value":25.5,"datetime":"2015-09-28 17:00"},{"value":25.19,"datetime":"2015-09-28 18:00"},{"value":24.9,"datetime":"2015-09-28 19:00"},{"value":25.28,"datetime":"2015-09-28 20:00"},{"value":25.59,"datetime":"2015-09-28 21:00"},{"value":26.54,"datetime":"2015-09-28 22:00"},{"value":26.74,"datetime":"2015-09-28 23:00"},{"value":26.21,"datetime":"2015-09-29 00:00"},{"value":25.69,"datetime":"2015-09-29 01:00"},{"value":25.59,"datetime":"2015-09-29 02:00"},{"value":25.93,"datetime":"2015-09-29 03:00"},{"value":26.08,"datetime":"2015-09-29 04:00"},{"value":26.31,"datetime":"2015-09-29 05:00"},{"value":26.35,"datetime":"2015-09-29 06:00"},{"value":26.39,"datetime":"2015-09-29 07:00"},{"value":26.18,"datetime":"2015-09-29 08:00"},{"value":26.67,"datetime":"2015-09-29 09:00"},{"value":27.25,"datetime":"2015-09-29 10:00"},{"value":27.5,"datetime":"2015-09-29 11:00"},{"value":27.59,"datetime":"2015-09-29 12:00"},{"value":27.53,"datetime":"2015-09-29 13:00"},{"value":27.38,"datetime":"2015-09-29 14:00"},{"value":27.35,"datetime":"2015-09-29 15:00"},{"value":27.17,"datetime":"2015-09-29 16:00"},{"value":26.87,"datetime":"2015-09-29 17:00"},{"value":26.51,"datetime":"2015-09-29 18:00"},{"value":26.18,"datetime":"2015-09-29 19:00"},{"value":25.93,"datetime":"2015-09-29 20:00"},{"value":25.75,"datetime":"2015-09-29 21:00"},{"value":25.68,"datetime":"2015-09-29 22:00"},{"value":25.73,"datetime":"2015-09-29 23:00"},{"value":25.77,"datetime":"2015-09-30 00:00"},{"value":25.69,"datetime":"2015-09-30 01:00"},{"value":25.53,"datetime":"2015-09-30 02:00"},{"value":25.35,"datetime":"2015-09-30 03:00"},{"value":25.23,"datetime":"2015-09-30 04:00"},{"value":25.23,"datetime":"2015-09-30 05:00"},{"value":25.39,"datetime":"2015-09-30 06:00"},{"value":25.68,"datetime":"2015-09-30 07:00"},{"value":26.23,"datetime":"2015-09-30 08:00"},{"value":26.7,"datetime":"2015-09-30 09:00"},{"value":27.11,"datetime":"2015-09-30 10:00"},{"value":27.25,"datetime":"2015-09-30 11:00"},{"value":27.23,"datetime":"2015-09-30 12:00"}]
             */

            private String status;
            private String description;
            private List<Pm25Bean> pm25;
            private List<SkyconBean> skycon;
            private List<CloudrateBean> cloudrate;
            private List<AqiBean> aqi;
            private List<HumidityBean> humidity;
            private List<PrecipitationBean> precipitation;
            private List<WindBean> wind;
            private List<TemperatureBean> temperature;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public List<Pm25Bean> getPm25() {
                return pm25;
            }

            public void setPm25(List<Pm25Bean> pm25) {
                this.pm25 = pm25;
            }

            public List<SkyconBean> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconBean> skycon) {
                this.skycon = skycon;
            }

            public List<CloudrateBean> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateBean> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<AqiBean> getAqi() {
                return aqi;
            }

            public void setAqi(List<AqiBean> aqi) {
                this.aqi = aqi;
            }

            public List<HumidityBean> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityBean> humidity) {
                this.humidity = humidity;
            }

            public List<PrecipitationBean> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationBean> precipitation) {
                this.precipitation = precipitation;
            }

            public List<WindBean> getWind() {
                return wind;
            }

            public void setWind(List<WindBean> wind) {
                this.wind = wind;
            }

            public List<TemperatureBean> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureBean> temperature) {
                this.temperature = temperature;
            }

            public static class Pm25Bean {
                /**
                 * value : 8.0
                 * datetime : 2015-09-28 13:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                @Override
                public String toString() {
                    return "Pm25Bean{" +
                            "value=" + value +
                            ", datetime='" + datetime + '\'' +
                            '}';
                }
            }

            public static class SkyconBean {
                /**
                 * value : RAIN
                 * datetime : 2015-09-28 13:00
                 */

                private String value;
                private String datetime;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class CloudrateBean {
                /**
                 * value : 1.0
                 * datetime : 2015-09-28 13:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class AqiBean {
                /**
                 * value : 33.0
                 * datetime : 2015-09-28 13:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class HumidityBean {
                /**
                 * value : 0.92
                 * datetime : 2015-09-28 13:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class PrecipitationBean {
                /**
                 * value : 0.5902
                 * datetime : 2015-09-28 13:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class WindBean {
                /**
                 * direction : 23.09
                 * speed : 80.66
                 * datetime : 2015-09-28 13:00
                 */

                private double direction;
                private double speed;
                private String datetime;

                public double getDirection() {
                    return direction;
                }

                public void setDirection(double direction) {
                    this.direction = direction;
                }

                public double getSpeed() {
                    return speed;
                }

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class TemperatureBean {
                /**
                 * value : 25.11
                 * datetime : 2015-09-28 13:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }
        }

        public static class MinutelyBean {
            /**
             * status : ok
             * precipitation : [0.2812,0.2959,0.3125,0.3288,0.3427,0.3519,0.3542,0.3481,0.3351,0.3176,0.2978,0.278,0.2604,0.2469,0.2371,0.2302,0.2254,0.2218,0.2188,0.2154,0.2119,0.2082,0.2046,0.2011,0.1979,0.1951,0.1928,0.1908,0.1893,0.1882,0.1875,0.1872,0.1873,0.1874,0.1876,0.1877,0.1875,0.187,0.1867,0.187,0.1886,0.1921,0.1979,0.2064,0.2166,0.2273,0.2372,0.2452,0.25,0.2507,0.248,0.2425,0.2352,0.227,0.2188,0.2111,0.2044,0.1985,0.1937,0.19]
             * datasource : radar
             * description : 16分钟后雨渐小，转为小雨
             */

            private String status;
            private String datasource;
            private String description;
            private List<Double> precipitation;
            private List<AlertBean> alert;

            public List<AlertBean> getAlert() {
                return alert;
            }

            public void setAlert(List<AlertBean> alert) {
                this.alert = alert;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDatasource() {
                return datasource;
            }

            public void setDatasource(String datasource) {
                this.datasource = datasource;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public List<Double> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<Double> precipitation) {
                this.precipitation = precipitation;
            }
        }

        public static class DailyBean {
            /**
             * status : ok
             * astro : [{"date":"2015-09-28","sunset":{"time":"17:44"},"sunrise":{"time":"05:44"}},{"date":"2015-09-29","sunset":{"time":"17:43"},"sunrise":{"time":"05:44"}},{"date":"2015-09-30","sunset":{"time":"17:42"},"sunrise":{"time":"05:44"}},{"date":"2015-10-01","sunset":{"time":"17:41"},"sunrise":{"time":"05:45"}},{"date":"2015-10-02","sunset":{"time":"17:40"},"sunrise":{"time":"05:45"}}]
             * temperature : [{"date":"2015-09-28","max":26.86,"avg":25.39,"min":24.97},{"date":"2015-09-29","max":27.58,"avg":26.5,"min":25.59},{"date":"2015-09-30","max":27.25,"avg":26.22,"min":25.21},{"date":"2015-10-01","max":27.3,"avg":26.27,"min":25.42},{"date":"2015-10-02","max":26.57,"avg":23.06,"min":21.77}]
             * pm25 : [{"date":"2015-09-28","max":13,"avg":6,"min":-0},{"date":"2015-09-29","max":-0,"avg":0,"min":-0},{"date":"2015-09-30","max":35,"avg":20,"min":-0},{"date":"2015-10-01","max":15,"avg":5,"min":-0},{"date":"2015-10-02","max":2,"avg":0,"min":-0}]
             * skycon : [{"date":"2015-09-28","value":"RAIN"},{"date":"2015-09-29","value":"RAIN"},{"date":"2015-09-30","value":"CLOUDY"},{"date":"2015-10-01","value":"RAIN"},{"date":"2015-10-02","value":"RAIN"}]
             * cloudrate : [{"date":"2015-09-28","max":1,"avg":1,"min":1},{"date":"2015-09-29","max":1,"avg":0.99,"min":0.95},{"date":"2015-09-30","max":1,"avg":0.95,"min":0.89},{"date":"2015-10-01","max":0.99,"avg":0.96,"min":0.91},{"date":"2015-10-02","max":1,"avg":0.91,"min":0.79}]
             * aqi : [{"date":"2015-09-28","max":38,"avg":32,"min":26},{"date":"2015-09-29","max":28,"avg":26,"min":25},{"date":"2015-09-30","max":61,"avg":47,"min":27},{"date":"2015-10-01","max":41,"avg":30,"min":24},{"date":"2015-10-02","max":25,"avg":24,"min":22}]
             * precipitation : [{"date":"2015-09-28","max":9.6091,"avg":4.4194,"min":1.4964},{"date":"2015-09-29","max":3.2836,"avg":0.684,"min":0},{"date":"2015-09-30","max":0.5972,"avg":0.0541,"min":0},{"date":"2015-10-01","max":0.5944,"avg":0.0967,"min":0},{"date":"2015-10-02","max":0.8844,"avg":0.2504,"min":0}]
             * wind : [{"date":"2015-09-28","max":{"direction":86.6,"speed":103.66},"avg":{"direction":56.13,"speed":55.22},"min":{"direction":11.12,"speed":35.05}},{"date":"2015-09-29","max":{"direction":120.02,"speed":97.84},"avg":{"direction":134.58,"speed":43.98},"min":{"direction":143.64,"speed":13.8}},{"date":"2015-09-30","max":{"direction":146.65,"speed":12.64},"avg":{"direction":171.3,"speed":5.09},"min":{"direction":19.89,"speed":1}},{"date":"2015-10-01","max":{"direction":251.76,"speed":9.14},"avg":{"direction":218.53,"speed":6.08},"min":{"direction":204.15,"speed":3.72}},{"date":"2015-10-02","max":{"direction":37.58,"speed":28.53},"avg":{"direction":54.28,"speed":16.31},"min":{"direction":257.06,"speed":6.61}}]
             * humidity : [{"date":"2015-09-28","max":0.93,"avg":0.89,"min":0.8},{"date":"2015-09-29","max":0.88,"avg":0.82,"min":0.74},{"date":"2015-09-30","max":0.89,"avg":0.79,"min":0.69},{"date":"2015-10-01","max":0.92,"avg":0.84,"min":0.76},{"date":"2015-10-02","max":0.9,"avg":0.84,"min":0.78}]
             */

            private String status;
            private List<AstroBean> astro;
            private List<TemperatureBeanX> temperature;
            private List<Pm25BeanX> pm25;
            private List<SkyconBeanX> skycon;
            private List<CloudrateBeanX> cloudrate;
            private List<AqiBeanX> aqi;
            private List<PrecipitationBeanX> precipitation;
            private List<WindBeanX> wind;
            private List<HumidityBeanX> humidity;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public List<AstroBean> getAstro() {
                return astro;
            }

            public void setAstro(List<AstroBean> astro) {
                this.astro = astro;
            }

            public List<TemperatureBeanX> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureBeanX> temperature) {
                this.temperature = temperature;
            }

            public List<Pm25BeanX> getPm25() {
                return pm25;
            }

            public void setPm25(List<Pm25BeanX> pm25) {
                this.pm25 = pm25;
            }

            public List<SkyconBeanX> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconBeanX> skycon) {
                this.skycon = skycon;
            }

            public List<CloudrateBeanX> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateBeanX> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<AqiBeanX> getAqi() {
                return aqi;
            }

            public void setAqi(List<AqiBeanX> aqi) {
                this.aqi = aqi;
            }

            public List<PrecipitationBeanX> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationBeanX> precipitation) {
                this.precipitation = precipitation;
            }

            public List<WindBeanX> getWind() {
                return wind;
            }

            public void setWind(List<WindBeanX> wind) {
                this.wind = wind;
            }

            public List<HumidityBeanX> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityBeanX> humidity) {
                this.humidity = humidity;
            }

            public static class AstroBean {
                /**
                 * date : 2015-09-28
                 * sunset : {"time":"17:44"}
                 * sunrise : {"time":"05:44"}
                 */

                private String date;
                private SunsetBean sunset;
                private SunriseBean sunrise;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public SunsetBean getSunset() {
                    return sunset;
                }

                public void setSunset(SunsetBean sunset) {
                    this.sunset = sunset;
                }

                public SunriseBean getSunrise() {
                    return sunrise;
                }

                public void setSunrise(SunriseBean sunrise) {
                    this.sunrise = sunrise;
                }

                public static class SunsetBean {
                    /**
                     * time : 17:44
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }

                public static class SunriseBean {
                    /**
                     * time : 05:44
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }
            }

            public static class TemperatureBeanX {
                /**
                 * date : 2015-09-28
                 * max : 26.86
                 * avg : 25.39
                 * min : 24.97
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class Pm25BeanX {
                /**
                 * date : 2015-09-28
                 * max : 13.0
                 * avg : 6.0
                 * min : -0.0
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class SkyconBeanX {
                /**
                 * date : 2015-09-28
                 * value : RAIN
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class CloudrateBeanX {
                /**
                 * date : 2015-09-28
                 * max : 1.0
                 * avg : 1.0
                 * min : 1.0
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class AqiBeanX {
                /**
                 * date : 2015-09-28
                 * max : 38.0
                 * avg : 32.0
                 * min : 26.0
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class PrecipitationBeanX {
                /**
                 * date : 2015-09-28
                 * max : 9.6091
                 * avg : 4.4194
                 * min : 1.4964
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class WindBeanX {
                /**
                 * date : 2015-09-28
                 * max : {"direction":86.6,"speed":103.66}
                 * avg : {"direction":56.13,"speed":55.22}
                 * min : {"direction":11.12,"speed":35.05}
                 */

                private String date;
                private MaxBean max;
                private AvgBean avg;
                private MinBean min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public MaxBean getMax() {
                    return max;
                }

                public void setMax(MaxBean max) {
                    this.max = max;
                }

                public AvgBean getAvg() {
                    return avg;
                }

                public void setAvg(AvgBean avg) {
                    this.avg = avg;
                }

                public MinBean getMin() {
                    return min;
                }

                public void setMin(MinBean min) {
                    this.min = min;
                }

                public static class MaxBean {
                    /**
                     * direction : 86.6
                     * speed : 103.66
                     */

                    private double direction;
                    private double speed;

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }
                }

                public static class AvgBean {
                    /**
                     * direction : 56.13
                     * speed : 55.22
                     */

                    private double direction;
                    private double speed;

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }
                }

                public static class MinBean {
                    /**
                     * direction : 11.12
                     * speed : 35.05
                     */

                    private double direction;
                    private double speed;

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }
                }
            }

            public static class HumidityBeanX {
                /**
                 * date : 2015-09-28
                 * max : 0.93
                 * avg : 0.89
                 * min : 0.8
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }
        }
        public static class AlertBean{
            public List<Double> getBound_coord() {
                return bound_coord;
            }

            public void setBound_coord(List<Double> bound_coord) {
                this.bound_coord = bound_coord;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getPubdate() {
                return pubdate;
            }

            public void setPubdate(String pubdate) {
                this.pubdate = pubdate;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            private String status;
            private String code;
            private String description;
            private String pubdate;
            private String location;
            private List<Double> bound_coord;

        }

    }
}
