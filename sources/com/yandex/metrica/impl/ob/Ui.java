package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15192a;

    public Ui(long j10) {
        this.f15192a = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Ui.class == obj.getClass() && this.f15192a == ((Ui) obj).f15192a;
    }

    public int hashCode() {
        long j10 = this.f15192a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return o2.a.a(defpackage.a.a("StatSending{disabledReportingInterval="), this.f15192a, '}');
    }
}
