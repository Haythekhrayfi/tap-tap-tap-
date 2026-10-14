package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class dj1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19876f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19878h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f19885o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19871a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19872b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f19873c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f19874d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f19875e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19877g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19879i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19880j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19881k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f19882l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19883m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19884n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19886p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19887q = false;

    public final int a() {
        if (this.f19879i) {
            return this.f19878h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final int a(String str, String str2, Set<String> set, String str3) {
        int i10;
        if (this.f19871a.isEmpty() && this.f19872b.isEmpty() && this.f19873c.isEmpty() && this.f19874d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f19871a;
        if (str4.isEmpty()) {
            i10 = 0;
        } else {
            i10 = str4.equals(str) ? 1073741824 : -1;
        }
        String str5 = this.f19872b;
        if (!str5.isEmpty() && i10 != -1) {
            i10 = str5.equals(str2) ? i10 + 2 : -1;
        }
        String str6 = this.f19874d;
        if (!str6.isEmpty() && i10 != -1) {
            i10 = str6.equals(str3) ? i10 + 4 : -1;
        }
        if (i10 == -1 || !set.containsAll(this.f19873c)) {
            return 0;
        }
        return (this.f19873c.size() * 4) + i10;
    }

    public final void a(float f10) {
        this.f19885o = f10;
    }

    public final void a(int i10) {
        this.f19878h = i10;
        this.f19879i = true;
    }

    public final void a(String str) {
        this.f19875e = na.b(str);
    }

    public final void a(boolean z10) {
        this.f19887q = z10;
    }

    public final void a(String[] strArr) {
        this.f19873c = new HashSet(Arrays.asList(strArr));
    }

    public final void b(int i10) {
        this.f19876f = i10;
        this.f19877g = true;
    }

    public final void b(String str) {
        this.f19871a = str;
    }

    public final boolean b() {
        return this.f19887q;
    }

    public final int c() {
        if (this.f19877g) {
            return this.f19876f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final void c(int i10) {
        this.f19884n = i10;
    }

    public final void c(String str) {
        this.f19872b = str;
    }

    public final String d() {
        return this.f19875e;
    }

    public final void d(int i10) {
        this.f19886p = i10;
    }

    public final void d(String str) {
        this.f19874d = str;
    }

    public final float e() {
        return this.f19885o;
    }

    public final int f() {
        return this.f19884n;
    }

    public final int g() {
        return this.f19886p;
    }

    public final int h() {
        int i10 = this.f19882l;
        if (i10 == -1 && this.f19883m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f19883m == 1 ? 2 : 0);
    }

    public final boolean i() {
        return this.f19879i;
    }

    public final boolean j() {
        return this.f19877g;
    }

    public final boolean k() {
        return this.f19880j == 1;
    }

    public final boolean l() {
        return this.f19881k == 1;
    }

    public final void m() {
        this.f19882l = 1;
    }

    public final void n() {
        this.f19883m = 1;
    }

    public final void o() {
        this.f19881k = 1;
    }
}
