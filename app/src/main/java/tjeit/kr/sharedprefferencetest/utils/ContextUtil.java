package tjeit.kr.sharedprefferencetest.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class ContextUtil {
//    메모장 파일명 같은 개념
    private static final String prefName = "pref";

//    저장할 항목들의 이름도 미리 세팅.
    private static final String EMAIL = "EMAIL";
    private static final String PASSWORD = "PASSWORD";

//    이베일을 저장하는 기능 (setter)
    public static void setEmail(Context context, String inputEmail){

//        pref라는 이름의 메모장을 열기.
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

//        열린 메모장에 이메일 항목 저장 (기존에 값이 있다면 덮어쓰기)
        pref.edit().putString(EMAIL, inputEmail).apply();

    }

//    이메일을 불러내는 기능 (getter)
    public static String getEmail(Context context){

//        메모장을 열기
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

//        열린 메모장에서 이메일 항목 뽑아서 리턴

        return pref.getString(EMAIL, "저장내용없음");
    }

}
