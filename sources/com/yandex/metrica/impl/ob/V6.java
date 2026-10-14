package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class V6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L0 f15215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U6 f15216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f15217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1568cn f15218d;

    public V6(Context context) {
        this(context, new L0(), new U6(), C1568cn.a(context));
    }

    public V6(Context context, L0 l10, U6 u10, C1568cn c1568cn) {
        this.f15217c = context;
        this.f15215a = l10;
        this.f15216b = u10;
        this.f15218d = c1568cn;
    }

    public void a(C1846o2.f fVar) {
        File fileA = this.f15215a.a(this.f15217c, "appmetrica_crashes");
        if (this.f15216b.a(fileA)) {
            U3 u3A = fVar.a().a();
            String str = u3A.g() + "-" + u3A.h();
            C1518an c1518anA = this.f15218d.a(str);
            PrintWriter printWriter = null;
            try {
                c1518anA.a();
                Objects.requireNonNull(this.f15215a);
                PrintWriter printWriter2 = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(fileA, str))));
                try {
                    printWriter2.write(new H7(fVar.b(), fVar.a(), fVar.c()).k());
                    U2.a((Closeable) printWriter2);
                } catch (Throwable unused) {
                    printWriter = printWriter2;
                    U2.a((Closeable) printWriter);
                }
            } catch (Throwable unused2) {
            }
            c1518anA.c();
        }
    }
}
