package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f13751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CounterConfiguration.b f13752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E2 f13753d;

    public C2(String str, Context context, CounterConfiguration.b bVar, E2 e10) {
        this.f13750a = str;
        this.f13751b = context;
        int iOrdinal = bVar.ordinal();
        this.f13752c = iOrdinal != 0 ? iOrdinal != 1 ? null : CounterConfiguration.b.SELF_DIAGNOSTIC_MANUAL : CounterConfiguration.b.SELF_DIAGNOSTIC_MAIN;
        this.f13753d = e10;
    }

    public void a(C1744k0 c1744k0) {
        if (this.f13752c != null) {
            try {
                String str = this.f13750a;
                CounterConfiguration counterConfiguration = new CounterConfiguration();
                synchronized (counterConfiguration) {
                    synchronized (counterConfiguration) {
                        counterConfiguration.f13444c.put("CFG_API_KEY", str);
                    }
                    counterConfiguration.e(this.f13752c);
                    this.f13753d.a(c1744k0.b(new C1746k2(new U3(this.f13751b, (ResultReceiver) null), counterConfiguration, null).c()));
                }
                counterConfiguration.e(this.f13752c);
                this.f13753d.a(c1744k0.b(new C1746k2(new U3(this.f13751b, (ResultReceiver) null), counterConfiguration, null).c()));
            } catch (Throwable unused) {
            }
        }
    }
}
