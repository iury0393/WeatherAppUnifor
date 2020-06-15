package br.com.weatherappunifor.retrofit;

import io.reactivex.Observable;

import br.com.weatherappunifor.model.WeatherResult;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                 @Query("lng") String lng,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);
}
