package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15606c;

    public Z1(int i10, int i11, int i12) {
        this.f15604a = i10;
        this.f15605b = i11;
        this.f15606c = i12;
    }

    public final int a(Boolean bool) {
        if (bool == null) {
            return this.f15604a;
        }
        if (fd.j0.d(bool, Boolean.FALSE)) {
            return this.f15605b;
        }
        if (fd.j0.d(bool, Boolean.TRUE)) {
            return this.f15606c;
        }
        throw new jc.g();
    }

    public final Boolean a(int i10) {
        if (i10 == this.f15605b) {
            return Boolean.FALSE;
        }
        if (i10 == this.f15606c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
