package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: loaded from: classes.dex */
public class Yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mg f15593a;

    public class a implements Mg {
        @Override // com.yandex.metrica.impl.ob.Mg
        public void a(Xg xg) throws Throwable {
            throw new IllegalStateException("No class: com.android.installreferrer.api.InstallReferrerClient");
        }
    }

    public Yg(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(a(context, interfaceExecutorC1966sn));
    }

    public Yg(Mg mg) {
        this.f15593a = mg;
    }

    private static Mg a(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        Sg sg;
        if (B2.a("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                sg = new Sg(InstallReferrerClient.newBuilder(context).build(), interfaceExecutorC1966sn);
            } catch (Throwable unused) {
                sg = null;
            }
        } else {
            sg = null;
        }
        return sg == null ? new a() : sg;
    }

    public void a(Xg xg) {
        try {
            this.f15593a.a(xg);
        } catch (Throwable th) {
            xg.a(th);
        }
    }
}
