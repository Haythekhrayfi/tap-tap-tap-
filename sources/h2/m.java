package h2;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30519a = x1.m.e("WakeLocks");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f30520b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strA = i.f.a("WorkManager: ", str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strA);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f30520b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strA);
        }
        return wakeLockNewWakeLock;
    }
}
