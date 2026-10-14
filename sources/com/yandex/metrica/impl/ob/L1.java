package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class L1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L0 f14382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14383b;

    public L1(Dm dm) {
        this(dm, new L0());
    }

    public L1(Dm dm, L0 l10) {
        this.f14383b = false;
        this.f14382a = l10;
    }

    public void a(Context context) {
        long jOptLong;
        synchronized (this) {
        }
        if (this.f14383b) {
            return;
        }
        synchronized (this) {
            try {
                String strA = V0.a(this.f14382a.a(context, "metrica_service_settings.dat"));
                jOptLong = !TextUtils.isEmpty(strA) ? new JSONObject(strA).optLong("delay") : 0L;
            } catch (Throwable unused) {
            }
        }
        if (jOptLong > 0) {
            try {
                Thread.sleep(jOptLong);
            } catch (Throwable unused2) {
            }
        }
        this.f14383b = true;
    }
}
