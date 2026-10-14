package com.yandex.metrica;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.yandex.metrica.impl.ob.F6;
import com.yandex.metrica.impl.ob.J6;
import com.yandex.metrica.impl.ob.N6;
import com.yandex.metrica.impl.ob.P0;
import com.yandex.metrica.impl.ob.P6;
import com.yandex.metrica.impl.ob.Q6;
import com.yandex.metrica.impl.ob.R6;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ConfigurationService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, P6> f13442c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public J6 f13443d;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        P0.a(getApplicationContext());
        String.format("[ConfigurationService:%s]", getPackageName());
        this.f13443d = new J6();
        Context applicationContext = getApplicationContext();
        N6 n10 = new N6(applicationContext, this.f13443d.a(), new F6(applicationContext));
        this.f13442c.put("com.yandex.metrica.configuration.ACTION_INIT", new R6(getApplicationContext(), n10));
        this.f13442c.put("com.yandex.metrica.configuration.ACTION_SCHEDULED_START", new Q6(getApplicationContext(), n10));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        P6 p10 = this.f13442c.get(intent == null ? null : intent.getAction());
        if (p10 == null) {
            return 2;
        }
        this.f13443d.a(p10, intent != null ? intent.getExtras() : null);
        return 2;
    }
}
