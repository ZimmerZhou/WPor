package com.lans.lwk.wpor.model.entity;

import java.util.List;

/**
 * Created by Li on 2017/11/13.
 */

public class Bean {


    /**
     * error : 0
     * status : success
     * date : 2016-03-05
     * results : [{"currentCity":"北京","pm25":"144","index":[{"title":"穿衣","zs":"较冷","tipt":"穿衣指数","des":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},{"title":"洗车","zs":"不宜","tipt":"洗车指数","des":"不宜洗车，未来24小时内有扬沙或浮尘，如果在此期间洗车，极易很快蒙上新的灰尘。"},{"title":"旅游","zs":"一般","tipt":"旅游指数","des":"风稍大，扬沙或浮尘天气对能见度和空气质量都会有些影响，出行请注意交通安全和采取适当的防尘措施。"},{"title":"感冒","zs":"易发","tipt":"感冒指数","des":"昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},{"title":"运动","zs":"较不宜","tipt":"运动指数","des":"有扬沙或浮尘，建议适当停止户外运动，选择在室内进行运动，以避免吸入更多沙尘，有损健康。"},{"title":"紫外线强度","zs":"最弱","tipt":"紫外线强度指数","des":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}],"weather_data":[{"date":"周六 03月05日 (实时：12℃)","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/fuchen.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"浮尘转晴","wind":"北风4-5级","temperature":"12 ~ -1℃"},{"date":"周日","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"多云","wind":"微风","temperature":"10 ~ -3℃"},{"date":"周一","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/yin.png","weather":"多云转阴","wind":"微风","temperature":"13 ~ 2℃"},{"date":"周二","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/yin.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"阴转多云","wind":"北风3-4级","temperature":"6 ~ -1℃"}]}]
     */

    private int error;
    private String status;
    private String date;
    private List<ResultsBean> results;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * currentCity : 北京
         * pm25 : 144
         * index : [{"title":"穿衣","zs":"较冷","tipt":"穿衣指数","des":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},{"title":"洗车","zs":"不宜","tipt":"洗车指数","des":"不宜洗车，未来24小时内有扬沙或浮尘，如果在此期间洗车，极易很快蒙上新的灰尘。"},{"title":"旅游","zs":"一般","tipt":"旅游指数","des":"风稍大，扬沙或浮尘天气对能见度和空气质量都会有些影响，出行请注意交通安全和采取适当的防尘措施。"},{"title":"感冒","zs":"易发","tipt":"感冒指数","des":"昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},{"title":"运动","zs":"较不宜","tipt":"运动指数","des":"有扬沙或浮尘，建议适当停止户外运动，选择在室内进行运动，以避免吸入更多沙尘，有损健康。"},{"title":"紫外线强度","zs":"最弱","tipt":"紫外线强度指数","des":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}]
         * weather_data : [{"date":"周六 03月05日 (实时：12℃)","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/fuchen.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"浮尘转晴","wind":"北风4-5级","temperature":"12 ~ -1℃"},{"date":"周日","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"多云","wind":"微风","temperature":"10 ~ -3℃"},{"date":"周一","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/yin.png","weather":"多云转阴","wind":"微风","temperature":"13 ~ 2℃"},{"date":"周二","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/yin.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"阴转多云","wind":"北风3-4级","temperature":"6 ~ -1℃"}]
         */

        private String currentCity;
        private String pm25;
        private List<IndexBean> index;
        private List<WeatherDataBean> weather_data;

        public String getCurrentCity() {
            return currentCity;
        }

        public void setCurrentCity(String currentCity) {
            this.currentCity = currentCity;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public List<IndexBean> getIndex() {
            return index;
        }

        public void setIndex(List<IndexBean> index) {
            this.index = index;
        }

        public List<WeatherDataBean> getWeather_data() {
            return weather_data;
        }

        public void setWeather_data(List<WeatherDataBean> weather_data) {
            this.weather_data = weather_data;
        }

        public static class IndexBean {
            /**
             * title : 穿衣
             * zs : 较冷
             * tipt : 穿衣指数
             * des : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
             */

            private String title;
            private String zs;
            private String tipt;
            private String des;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getZs() {
                return zs;
            }

            public void setZs(String zs) {
                this.zs = zs;
            }

            public String getTipt() {
                return tipt;
            }

            public void setTipt(String tipt) {
                this.tipt = tipt;
            }

            public String getDes() {
                return des;
            }

            public void setDes(String des) {
                this.des = des;
            }
        }

        public static class WeatherDataBean {
            /**
             * date : 周六 03月05日 (实时：12℃)
             * dayPictureUrl : http://api.map.baidu.com/images/weather/day/fuchen.png
             * nightPictureUrl : http://api.map.baidu.com/images/weather/night/qing.png
             * weather : 浮尘转晴
             * wind : 北风4-5级
             * temperature : 12 ~ -1℃
             */

            private String date;
            private String dayPictureUrl;
            private String nightPictureUrl;
            private String weather;
            private String wind;
            private String temperature;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDayPictureUrl() {
                return dayPictureUrl;
            }

            public void setDayPictureUrl(String dayPictureUrl) {
                this.dayPictureUrl = dayPictureUrl;
            }

            public String getNightPictureUrl() {
                return nightPictureUrl;
            }

            public void setNightPictureUrl(String nightPictureUrl) {
                this.nightPictureUrl = nightPictureUrl;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }
        }
    }
}