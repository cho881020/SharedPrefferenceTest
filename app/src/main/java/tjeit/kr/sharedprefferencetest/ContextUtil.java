package tjeit.kr.sharedprefferencetest;

import android.content.Context;
import android.content.SharedPreferences;

public class ContextUtil {


    private static final String prefName = "pref";
    private static final String EMAIL = "EMAIL";
    private static final String PASSWORD = "PASSWORD";


    public static void setEmail(Context context, String inputEmail){

        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

        pref.edit().putString(EMAIL, inputEmail).apply();

    }

    public static String getEmail(Context context){
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE){
            return pref.getString(EMAIL, defValue)
        }

    }


}
