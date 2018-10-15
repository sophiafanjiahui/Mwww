package com.example.sophia.mwww;
import android.app.Activity;
import android.os.Bundle;
public class MainActivity extends Activity  {
    //private ImageView mUpdateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_info);
    }
}
        //mUpdateBtn = (ImageView) findViewById(R.id.title_update_btn);
        //mUpdateBtn.setOnClickListener(this);
        //  if (NetUtil.getNetworkState(this) != NetUtil.NETWORN_NONE) {
        //     Log.d("myWeather", "网络OK");
        //    Toast.makeText(MainActivity.this, "网络OK！", Toast.LENGTH_LONG).show();
        // } else {
        //      Log.d("myWeather", "网络挂了");
        //      Toast.makeText(MainActivity.this, "网络挂了！", Toast.LENGTH_LONG).show();
        //    }
        // }

//    public void onClick(View view) {
//        if (view.getId() == R.id.title_update_btn) {
//            Log.d("myWeather", "点击更新");
//            SharedPreferences sharedPreferences = getSharedPreferences("config", MODE_PRIVATE);
//            String cityCode = sharedPreferences.getString("main_ city_code", "101010100");
//            Log.d("myWeather", cityCode);
//            if (NetUtil.getNetworkState(this) != NetUtil.NETWORN_NONE) {
//                Log.d("myWeather", "网络OK");
//                queryWeatherCode(cityCode);
//            } else {
//                Log.d("myWeather", "网络挂了");
//                Toast.makeText(MainActivity.this, "网络挂了！", Toast.LENGTH_LONG).show();
//            }
//        }
//    }
