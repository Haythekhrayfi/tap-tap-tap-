package com.yandex.metrica.impl.ob;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class Th implements Qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ei f15104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f15105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1613ei f15106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uh f15107d;

    public Th(Uh uh, Ei ei, File file, C1613ei c1613ei) {
        this.f15107d = uh;
        this.f15104a = ei;
        this.f15105b = file;
        this.f15106c = c1613ei;
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void a() {
        Uh.a(this.f15107d, this.f15104a.f13921i);
        Uh.c(this.f15107d);
        this.f15106c.a(this.f15105b);
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void a(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        Uh.a(this.f15107d, this.f15104a.f13921i);
        Uh.c(this.f15107d);
        this.f15107d.f15187e.a(str);
        Uh uh = this.f15107d;
        File file = this.f15105b;
        Objects.requireNonNull(uh);
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
        U2.a((Closeable) fileOutputStream);
        this.f15106c.a(this.f15105b);
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public String b() {
        return this.f15107d.f15187e.b();
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void c() {
        Uh.a(this.f15107d, this.f15104a.f13920h);
        Uh.c(this.f15107d);
    }
}
