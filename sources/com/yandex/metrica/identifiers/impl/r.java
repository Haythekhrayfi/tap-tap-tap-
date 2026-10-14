package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13608a;

    public r() {
        this(new e(s.f13609a, da.c.f28917c, "huawei"));
    }

    public r(e eVar) {
        j0.i(eVar, "connectionController");
        this.f13608a = eVar;
    }

    @Override // com.yandex.metrica.identifiers.impl.i
    public g a(Context context) {
        g gVar;
        g gVar2;
        try {
            try {
                try {
                    da.e eVar = (da.e) this.f13608a.a(context);
                    gVar2 = new g(l.f13602b, new f("huawei", eVar.a(), Boolean.valueOf(eVar.c())), null, 4);
                } catch (Throwable th) {
                    String str = "exception while fetching hoaid: " + th.getMessage();
                    j0.i(str, "errorMessage");
                    gVar = new g(l.f13603c, null, str);
                    gVar2 = gVar;
                }
            } catch (j e10) {
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown exception during binding huawei services";
                }
                gVar = new g(l.f13603c, null, message);
                gVar2 = gVar;
            }
            return gVar2;
        } finally {
            try {
                e eVar2 = this.f13608a;
                Objects.requireNonNull(eVar2);
                eVar2.f13591a.a(context);
            } catch (Throwable unused) {
            }
        }
    }
}
