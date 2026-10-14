package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import android.view.Window;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f23182b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile n0 f23183c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f23184a = new HashMap();

    private n0() {
        a("window_type_browser", new j0());
    }

    public static n0 a() {
        if (f23183c == null) {
            synchronized (f23182b) {
                if (f23183c == null) {
                    f23183c = new n0();
                }
            }
        }
        return f23183c;
    }

    public final synchronized l0 a(Context context, RelativeLayout relativeLayout, ResultReceiver resultReceiver, a1 a1Var, q0 q0Var, Intent intent, Window window) {
        m0 m0Var;
        String stringExtra = intent.getStringExtra("window_type");
        if (stringExtra == null || (m0Var = (m0) this.f23184a.get(stringExtra)) == null) {
            return null;
        }
        return m0Var.a(context, relativeLayout, a1Var, q0Var, intent, window);
    }

    public final synchronized void a(String str, m0 m0Var) {
        if (!this.f23184a.containsKey(str)) {
            this.f23184a.put(str, m0Var);
        }
    }
}
