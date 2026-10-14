package d6;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<String> f28751d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f28752e;

    public z(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f28748a = sharedPreferences;
        this.f28749b = str;
        this.f28750c = str2;
        this.f28752e = executor;
    }

    public static z b(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        z zVar = new z(sharedPreferences, str, str2, executor);
        synchronized (zVar.f28751d) {
            zVar.f28751d.clear();
            String string = zVar.f28748a.getString(zVar.f28749b, "");
            if (!TextUtils.isEmpty(string) && string.contains(zVar.f28750c)) {
                String[] strArrSplit = string.split(zVar.f28750c, -1);
                if (strArrSplit.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str3 : strArrSplit) {
                    if (!TextUtils.isEmpty(str3)) {
                        zVar.f28751d.add(str3);
                    }
                }
            }
        }
        return zVar;
    }

    public boolean a(String str) {
        boolean zAdd;
        if (TextUtils.isEmpty(str) || str.contains(this.f28750c)) {
            return false;
        }
        synchronized (this.f28751d) {
            zAdd = this.f28751d.add(str);
            if (zAdd) {
                this.f28752e.execute(new androidx.activity.c(this));
            }
        }
        return zAdd;
    }
}
