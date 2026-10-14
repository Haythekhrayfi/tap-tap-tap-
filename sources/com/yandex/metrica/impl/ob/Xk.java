package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15525c = a();

    public Xk(int i10, String str) {
        this.f15523a = i10;
        this.f15524b = str;
    }

    private int a() {
        return this.f15524b.length() + (this.f15523a * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Xk.class != obj.getClass()) {
            return false;
        }
        Xk xk = (Xk) obj;
        if (this.f15523a != xk.f15523a) {
            return false;
        }
        return this.f15524b.equals(xk.f15524b);
    }

    public int hashCode() {
        return this.f15525c;
    }
}
