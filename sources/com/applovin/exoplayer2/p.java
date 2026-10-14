package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ak {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g.a<p> f7917h = com.applovin.exoplayer2.a.p.B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f7921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.applovin.exoplayer2.h.o f7923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7924g;

    private p(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    private p(int i10, Throwable th, String str, int i11, String str2, int i12, v vVar, int i13, boolean z10) {
        this(a(i10, str, str2, i12, vVar, i13), th, i11, i10, str2, i12, vVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private p(Bundle bundle) {
        super(bundle);
        this.f7918a = bundle.getInt(ak.a(1001), 2);
        this.f7919b = bundle.getString(ak.a(1002));
        this.f7920c = bundle.getInt(ak.a(1003), -1);
        this.f7921d = (v) com.applovin.exoplayer2.l.c.a(v.F, bundle.getBundle(ak.a(1004)));
        this.f7922e = bundle.getInt(ak.a(WebSocketProtocol.CLOSE_NO_STATUS_CODE), 4);
        this.f7924g = bundle.getBoolean(ak.a(1006), false);
        this.f7923f = null;
    }

    private p(String str, Throwable th, int i10, int i11, String str2, int i12, v vVar, int i13, com.applovin.exoplayer2.h.o oVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        com.applovin.exoplayer2.l.a.a(!z10 || i11 == 1);
        com.applovin.exoplayer2.l.a.a(th != null || i11 == 3);
        this.f7918a = i11;
        this.f7919b = str2;
        this.f7920c = i12;
        this.f7921d = vVar;
        this.f7922e = i13;
        this.f7923f = oVar;
        this.f7924g = z10;
    }

    public static p a(IOException iOException, int i10) {
        return new p(0, iOException, i10);
    }

    @Deprecated
    public static p a(RuntimeException runtimeException) {
        return a(runtimeException, 1000);
    }

    public static p a(RuntimeException runtimeException, int i10) {
        return new p(2, runtimeException, i10);
    }

    public static p a(Throwable th, String str, int i10, v vVar, int i11, boolean z10, int i12) {
        return new p(1, th, null, i12, str, i10, vVar, vVar == null ? 4 : i11, z10);
    }

    private static String a(int i10, String str, String str2, int i11, v vVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + vVar + ", format_supported=" + h.a(i12);
        }
        return !TextUtils.isEmpty(str) ? androidx.activity.j.a(str3, ": ", str) : str3;
    }

    public static /* synthetic */ p b(Bundle bundle) {
        return new p(bundle);
    }

    public p a(com.applovin.exoplayer2.h.o oVar) {
        return new p((String) com.applovin.exoplayer2.l.ai.a(getMessage()), getCause(), this.f4229i, this.f7918a, this.f7919b, this.f7920c, this.f7921d, this.f7922e, oVar, this.f4230j, this.f7924g);
    }
}
