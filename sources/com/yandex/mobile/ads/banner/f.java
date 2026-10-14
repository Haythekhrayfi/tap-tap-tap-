package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements Serializable {
    private static final long serialVersionUID = -7571518881522543353L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SizeInfo f18140a;

    public f(int i10, int i11, int i12) {
        this.f18140a = new SizeInfo(i10, i11, i12);
    }

    public final SizeInfo a() {
        return this.f18140a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f18140a.equals(((f) obj).f18140a);
    }

    public int getHeight() {
        return this.f18140a.c();
    }

    public int getHeight(Context context) {
        return this.f18140a.a(context);
    }

    public int getHeightInPixels(Context context) {
        return this.f18140a.b(context);
    }

    public int getWidth() {
        return this.f18140a.e();
    }

    public int getWidth(Context context) {
        return this.f18140a.c(context);
    }

    public int getWidthInPixels(Context context) {
        return this.f18140a.d(context);
    }

    public int hashCode() {
        return this.f18140a.hashCode();
    }

    public String toString() {
        return this.f18140a.toString();
    }
}
