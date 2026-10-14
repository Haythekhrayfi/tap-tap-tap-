package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1746k2 extends T3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H0 f16558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Pe f16559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f16560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f16561f;

    public C1746k2(U3 u10, CounterConfiguration counterConfiguration) {
        this(u10, counterConfiguration, null);
    }

    public C1746k2(U3 u10, CounterConfiguration counterConfiguration, String str) {
        super(u10, counterConfiguration);
        this.f16560e = true;
        this.f16561f = str;
    }

    public void a(Ki ki) {
        if (ki != null) {
            CounterConfiguration counterConfigurationB = b();
            String strE = ((Ii) ki).e();
            synchronized (counterConfigurationB) {
                counterConfigurationB.f13444c.put("CFG_UUID", strE);
            }
        }
    }

    public void a(Ln ln) {
        this.f16558c = new H0(ln);
    }

    public void a(Pe pe2) {
        this.f16559d = pe2;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        CounterConfiguration counterConfigurationB = b();
        synchronized (counterConfigurationB) {
            bundle.putParcelable("COUNTER_CFG_OBJ", counterConfigurationB);
        }
        U3 u3A = a();
        synchronized (u3A) {
            bundle.putParcelable("PROCESS_CFG_OBJ", u3A);
        }
        return bundle;
    }

    public String d() {
        return this.f16558c.a();
    }

    public String e() {
        return this.f16561f;
    }

    public boolean f() {
        return this.f16560e;
    }

    public void g() {
        this.f16560e = true;
    }

    public void h() {
        this.f16560e = false;
    }
}
