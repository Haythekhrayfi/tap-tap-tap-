package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1917qn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1892pn f17192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile C1941rn f17193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile InterfaceExecutorC1966sn f17194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile InterfaceExecutorC1966sn f17195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Handler f17196e;

    public C1917qn() {
        this(new C1892pn());
    }

    public C1917qn(C1892pn c1892pn) {
        this.f17192a = c1892pn;
    }

    public InterfaceExecutorC1966sn a() {
        if (this.f17194c == null) {
            synchronized (this) {
                if (this.f17194c == null) {
                    Objects.requireNonNull(this.f17192a);
                    this.f17194c = new C1941rn("YMM-APT");
                }
            }
        }
        return this.f17194c;
    }

    public C1941rn b() {
        if (this.f17193b == null) {
            synchronized (this) {
                if (this.f17193b == null) {
                    Objects.requireNonNull(this.f17192a);
                    this.f17193b = new C1941rn("YMM-YM");
                }
            }
        }
        return this.f17193b;
    }

    public Handler c() {
        if (this.f17196e == null) {
            synchronized (this) {
                if (this.f17196e == null) {
                    Objects.requireNonNull(this.f17192a);
                    this.f17196e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return this.f17196e;
    }

    public InterfaceExecutorC1966sn d() {
        if (this.f17195d == null) {
            synchronized (this) {
                if (this.f17195d == null) {
                    Objects.requireNonNull(this.f17192a);
                    this.f17195d = new C1941rn("YMM-RS");
                }
            }
        }
        return this.f17195d;
    }
}
