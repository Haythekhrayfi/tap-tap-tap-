package com.yandex.metrica.impl.ob;

import java.io.File;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1527b7<Output> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f15810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Vm<File, Output> f15811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Um<File> f15812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Um<Output> f15813d;

    public RunnableC1527b7(File file, Vm<File, Output> vm, Um<File> um, Um<Output> um2) {
        this.f15810a = file;
        this.f15811b = vm;
        this.f15812c = um;
        this.f15813d = um2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f15810a.exists()) {
            try {
                Output outputA = this.f15811b.a(this.f15810a);
                if (outputA != null) {
                    this.f15813d.b(outputA);
                }
            } catch (Throwable unused) {
            }
            this.f15812c.b(this.f15810a);
        }
    }
}
