package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public final class Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15108a;

    public Ti(int i10) {
        this.f15108a = i10;
    }

    public final int a() {
        return this.f15108a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Ti) && this.f15108a == ((Ti) obj).f15108a;
        }
        return true;
    }

    public int hashCode() {
        return this.f15108a;
    }

    public String toString() {
        return android.support.v4.media.b.a(defpackage.a.a("StartupUpdateConfig(intervalSeconds="), this.f15108a, ")");
    }
}
