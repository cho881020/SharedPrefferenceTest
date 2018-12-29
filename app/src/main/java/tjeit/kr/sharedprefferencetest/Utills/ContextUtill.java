package tjeit.kr.sharedprefferencetest.Utills;

import android.content.Context;
import android.content.SharedPreferences;

public class ContextUtill {
//    메모장 파일 명 같은 개념
    private static final String prefName = "pref";

//    저장할 항목들의 이름도 미리 세팅
    private static final String EMAIL = "EMAIL";
    private  static  final String PASSWORD = "PASSWORD";

//
    public static void setEmail (Context context, String inputEmail){
//        pref라는 메모장을 열기
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

//        열린메모장에 이메일 항목저장(기존에 값이 있다면 덮어쓰기)
        pref.edit().putString(EMAIL,inputEmail).apply();

    }

//    이메일을 불러내는 기능(getter)
    public static String getEmail(Context context){
//        메모장을 열기
        SharedPreferences pref = context.getSharedPreferences(prefName,Context.MODE_PRIVATE);
//        열린 메모장에 이메일 항목 뽑아서 리턴
        return pref.getString(EMAIL,"저장내용 없음");
    }

}
