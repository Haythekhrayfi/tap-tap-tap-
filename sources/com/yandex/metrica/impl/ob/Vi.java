package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f15319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f15320b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15322b;

        public a(int i10, long j10) {
            this.f15321a = i10;
            this.f15322b = j10;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Item{refreshEventCount=");
            sbA.append(this.f15321a);
            sbA.append(", refreshPeriodSeconds=");
            return o2.a.a(sbA, this.f15322b, '}');
        }
    }

    public enum b {
        WIFI,
        CELL
    }

    public Vi(a aVar, a aVar2) {
        this.f15319a = aVar;
        this.f15320b = aVar2;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ThrottlingConfig{cell=");
        sbA.append(this.f15319a);
        sbA.append(", wifi=");
        sbA.append(this.f15320b);
        sbA.append('}');
        return sbA.toString();
    }
}
