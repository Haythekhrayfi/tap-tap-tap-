package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.s;
import java.util.HashMap;
import java.util.WeakHashMap;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends s implements d.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3147f = m.e("SystemAlarmService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f3148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3149e;

    public final void a() {
        d dVar = new d(this);
        this.f3148d = dVar;
        if (dVar.f3179l != null) {
            m.c().b(d.f3169m, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            dVar.f3179l = this;
        }
    }

    public void b() {
        this.f3149e = true;
        m.c().a(f3147f, "All commands completed in dispatcher", new Throwable[0]);
        String str = h2.m.f30519a;
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = h2.m.f30520b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                m.c().g(h2.m.f30519a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
        this.f3149e = false;
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3149e = true;
        this.f3148d.c();
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f3149e) {
            m.c().d(f3147f, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f3148d.c();
            a();
            this.f3149e = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3148d.a(intent, i11);
        return 3;
    }
}
