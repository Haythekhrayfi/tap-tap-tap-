package hm.mod.update;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class up5 {
    private static up5 prefsInstance;
    private static SharedPreferences sharedPreferences;

    public static void setUpdateShow(Context context) {
        with(context).writeBoolean("show", true);
    }

    public static boolean isUpdateShowed(Context context) {
        return with(context).readBoolean("show", false);
    }

    public static void setShowTimes(Context context) {
        with(context).writeInt("show_times", getShowTimes(context) + 1);
    }

    public static int getShowTimes(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        return with(context).readInt("show_times", 0);
    }

    public static void setLastShow(Context context) {
        with(context).writeLong("last_show", System.currentTimeMillis() / 1000);
    }

    public static long getLastShow(Context context) {
        return with(context).readLong("last_show", 0L).longValue();
    }

    private up5(Context context) {
        sharedPreferences = context.getApplicationContext().getSharedPreferences(context.getPackageName() + "_forceupdate", 0);
    }

    public static up5 with(Context context) {
        if (prefsInstance == null) {
            prefsInstance = new up5(context);
        }
        return prefsInstance;
    }

    public void writeLong(String str, long j10) {
        sharedPreferences.edit().putLong(str, j10).apply();
    }

    public Long readLong(String str, long j10) {
        return Long.valueOf(sharedPreferences.getLong(str, j10));
    }

    public void writeInt(String str, int i10) {
        sharedPreferences.edit().putInt(str, i10).apply();
    }

    public int readInt(String str, int i10) {
        return sharedPreferences.getInt(str, i10);
    }

    public void writeBoolean(String str, boolean z10) {
        sharedPreferences.edit().putBoolean(str, z10).apply();
    }

    public boolean readBoolean(String str, boolean z10) {
        return sharedPreferences.getBoolean(str, z10);
    }

    public static String getLang() {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale != null ? locale.getLanguage() : "en";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "en";
        }
    }

    public static String getCountry() {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale != null ? locale.getCountry() : "US";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "US";
        }
    }

    public static boolean isScreenLandscape(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static int dip2px(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
