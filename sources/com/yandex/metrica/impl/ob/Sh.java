package com.yandex.metrica.impl.ob;

import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class Sh implements C2047w.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f15013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1613ei f15014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ei f15015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uh f15016e;

    public Sh(Uh uh, String str, File file, C1613ei c1613ei, Ei ei) {
        this.f15016e = uh;
        this.f15012a = str;
        this.f15013b = file;
        this.f15014c = c1613ei;
        this.f15015d = ei;
    }

    @Override // com.yandex.metrica.impl.ob.C2047w.c
    public void a() {
        Qd qd2 = this.f15016e.f15186d;
        String str = this.f15012a;
        Uh uh = this.f15016e;
        File file = this.f15013b;
        C1613ei c1613ei = this.f15014c;
        Ei ei = this.f15015d;
        Objects.requireNonNull(uh);
        qd2.a(str, new Th(uh, ei, file, c1613ei));
    }
}
