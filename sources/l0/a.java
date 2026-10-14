package l0;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || (i10 >= 30 && a("S", Build.VERSION.CODENAME));
    }

    public static boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 || (i10 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
