package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1552c7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f15873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Um<File> f15874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1568cn f15875c;

    public RunnableC1552c7(Context context, File file, Um<File> um) {
        this(file, um, C1568cn.a(context));
    }

    public RunnableC1552c7(File file, Um<File> um, C1568cn c1568cn) {
        this.f15873a = file;
        this.f15874b = um;
        this.f15875c = c1568cn;
    }

    @Override // java.lang.Runnable
    public void run() {
        File[] fileArrListFiles;
        if (this.f15873a.exists() && this.f15873a.isDirectory() && (fileArrListFiles = this.f15873a.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                C1518an c1518anA = this.f15875c.a(file.getName());
                try {
                    c1518anA.a();
                    this.f15874b.b(file);
                } catch (Throwable unused) {
                }
                c1518anA.c();
            }
        }
    }
}
