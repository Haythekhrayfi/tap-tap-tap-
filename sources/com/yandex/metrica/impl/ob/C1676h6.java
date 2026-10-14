package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1676h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set<Integer> f16262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16264d;

    public C1676h6() {
        this(false, 0, 0, new HashSet());
    }

    public C1676h6(boolean z10, int i10, int i11, Set<Integer> set) {
        this.f16261a = z10;
        this.f16262b = set;
        this.f16263c = i10;
        this.f16264d = i11;
    }

    public void a() {
        this.f16262b = new HashSet();
        this.f16264d = 0;
    }

    public void a(int i10) {
        this.f16262b.add(Integer.valueOf(i10));
        this.f16264d++;
    }

    public void a(boolean z10) {
        this.f16261a = z10;
    }

    public Set<Integer> b() {
        return this.f16262b;
    }

    public void b(int i10) {
        this.f16263c = i10;
        this.f16264d = 0;
    }

    public int c() {
        return this.f16264d;
    }

    public int d() {
        return this.f16263c;
    }

    public boolean e() {
        return this.f16261a;
    }
}
