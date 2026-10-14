package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7085f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7087h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f7094o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7080a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7081b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f7082c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f7083d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7084e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7086g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7088i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7089j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7090k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7091l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7092m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7093n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f7095p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f7096q = false;

    private static int a(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public int a() {
        int i10 = this.f7091l;
        if (i10 == -1 && this.f7092m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f7092m == 1 ? 2 : 0);
    }

    public int a(String str, String str2, Set<String> set, String str3) {
        if (this.f7080a.isEmpty() && this.f7081b.isEmpty() && this.f7082c.isEmpty() && this.f7083d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f7080a, str, 1073741824), this.f7081b, str2, 2), this.f7083d, str3, 4);
        if (iA == -1 || !set.containsAll(this.f7082c)) {
            return 0;
        }
        return (this.f7082c.size() * 4) + iA;
    }

    public d a(float f10) {
        this.f7094o = f10;
        return this;
    }

    public d a(int i10) {
        this.f7085f = i10;
        this.f7086g = true;
        return this;
    }

    public d a(boolean z10) {
        this.f7090k = z10 ? 1 : 0;
        return this;
    }

    public void a(String str) {
        this.f7080a = str;
    }

    public void a(String[] strArr) {
        this.f7082c = new HashSet(Arrays.asList(strArr));
    }

    public d b(int i10) {
        this.f7087h = i10;
        this.f7088i = true;
        return this;
    }

    public d b(boolean z10) {
        this.f7091l = z10 ? 1 : 0;
        return this;
    }

    public void b(String str) {
        this.f7081b = str;
    }

    public boolean b() {
        return this.f7089j == 1;
    }

    public d c(int i10) {
        this.f7093n = i10;
        return this;
    }

    public d c(boolean z10) {
        this.f7092m = z10 ? 1 : 0;
        return this;
    }

    public void c(String str) {
        this.f7083d = str;
    }

    public boolean c() {
        return this.f7090k == 1;
    }

    public d d(int i10) {
        this.f7095p = i10;
        return this;
    }

    public d d(String str) {
        this.f7084e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public d d(boolean z10) {
        this.f7096q = z10;
        return this;
    }

    public String d() {
        return this.f7084e;
    }

    public int e() {
        if (this.f7086g) {
            return this.f7085f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public boolean f() {
        return this.f7086g;
    }

    public int g() {
        if (this.f7088i) {
            return this.f7087h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean h() {
        return this.f7088i;
    }

    public int i() {
        return this.f7093n;
    }

    public float j() {
        return this.f7094o;
    }

    public int k() {
        return this.f7095p;
    }

    public boolean l() {
        return this.f7096q;
    }
}
