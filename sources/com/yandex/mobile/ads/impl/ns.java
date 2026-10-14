package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class ns extends wq0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yv f23536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jc0 f23538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23539i;

    static {
        yn1 yn1Var = yn1.f26963w;
    }

    private ns(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    private ns(int i10, Throwable th, String str, int i11, String str2, int i12, yv yvVar, int i13, boolean z10) {
        this(a(i10, str, str2, i12, yvVar, i13), th, i11, i10, str2, i12, yvVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private ns(Bundle bundle) {
        super(bundle);
        this.f23533c = bundle.getInt(wq0.a(1001), 2);
        this.f23534d = bundle.getString(wq0.a(1002));
        this.f23535e = bundle.getInt(wq0.a(1003), -1);
        Bundle bundle2 = bundle.getBundle(wq0.a(1004));
        this.f23536f = bundle2 == null ? null : (yv) yv.H.fromBundle(bundle2);
        this.f23537g = bundle.getInt(wq0.a(WebSocketProtocol.CLOSE_NO_STATUS_CODE), 4);
        this.f23539i = bundle.getBoolean(wq0.a(1006), false);
        this.f23538h = null;
    }

    private ns(String str, Throwable th, int i10, int i11, String str2, int i12, yv yvVar, int i13, nc0.b bVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        pa.a(!z10 || i11 == 1);
        pa.a(th != null || i11 == 3);
        this.f23533c = i11;
        this.f23534d = str2;
        this.f23535e = i12;
        this.f23536f = yvVar;
        this.f23537g = i13;
        this.f23538h = bVar;
        this.f23539i = z10;
    }

    public static ns a() {
        return new ns(3, null, "Video load error occurred", 1001, null, -1, null, 4, false);
    }

    public static ns a(IOException iOException, int i10) {
        return new ns(0, iOException, i10);
    }

    public static ns a(Exception exc, String str, int i10, yv yvVar, int i11, boolean z10, int i12) {
        return new ns(1, exc, null, i12, str, i10, yvVar, yvVar == null ? 4 : i11, z10);
    }

    public static ns a(RuntimeException runtimeException, int i10) {
        return new ns(2, runtimeException, i10);
    }

    private static String a(int i10, String str, String str2, int i11, yv yvVar, int i12) {
        String string;
        String str3;
        if (i10 == 0) {
            string = "Source error";
        } else if (i10 != 1) {
            string = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i11);
            sb2.append(", format=");
            sb2.append(yvVar);
            sb2.append(", format_supported=");
            int i13 = da1.f19803a;
            if (i12 == 0) {
                str3 = "NO";
            } else if (i12 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        return !TextUtils.isEmpty(str) ? androidx.activity.j.a(string, ": ", str) : string;
    }

    public static /* synthetic */ ns b(Bundle bundle) {
        return new ns(bundle);
    }

    public final ns a(nc0.b bVar) {
        String message = getMessage();
        int i10 = da1.f19803a;
        return new ns(message, getCause(), this.f26344a, this.f23533c, this.f23534d, this.f23535e, this.f23536f, this.f23537g, bVar, this.f26345b, this.f23539i);
    }
}
