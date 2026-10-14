package com.yandex.mobile.ads.impl;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class qg implements Comparable<qg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f24487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f24488f;

    public qg(String str, long j10, long j11, long j12, File file) {
        this.f24483a = str;
        this.f24484b = j10;
        this.f24485c = j11;
        this.f24486d = file != null;
        this.f24487e = file;
        this.f24488f = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(qg qgVar) {
        qg qgVar2 = qgVar;
        if (!this.f24483a.equals(qgVar2.f24483a)) {
            return this.f24483a.compareTo(qgVar2.f24483a);
        }
        long j10 = this.f24484b - qgVar2.f24484b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("[");
        sbA.append(this.f24484b);
        sbA.append(", ");
        return android.support.v4.media.session.e.a(sbA, this.f24485c, "]");
    }
}
