package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
class Gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L0 f14105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rm f14106c;

    public Gj(Context context, L0 l10, Rm rm) {
        this.f14104a = context;
        this.f14105b = l10;
        this.f14106c = rm;
    }

    public String a() {
        return V0.a(this.f14105b.a(this.f14104a, "uuid.dat"));
    }

    public String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.f14106c.a();
            }
            File fileA = this.f14105b.a(this.f14104a, "uuid.dat");
            if (fileA != null) {
                V0.a(str, "uuid.dat", new FileOutputStream(fileA));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }
}
