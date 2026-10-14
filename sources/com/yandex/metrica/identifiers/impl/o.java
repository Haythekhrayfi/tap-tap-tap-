package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13606a;

    public o() {
        this(new e(p.f13607a, da.b.f28916c, "yandex"));
    }

    public o(e eVar) {
        j0.i(eVar, "connectionController");
        this.f13606a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.yandex.metrica.identifiers.impl.g] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // com.yandex.metrica.identifiers.impl.i
    public g a(Context context) {
        g gVar;
        e eVar;
        ?? r10 = 2;
        try {
            try {
                try {
                    g gVarB = b(context);
                    eVar = this.f13606a;
                    Objects.requireNonNull(eVar);
                    r10 = gVarB;
                } catch (Throwable unused) {
                }
            } catch (m e10) {
                String message = e10.getMessage();
                if (message == null) {
                    message = "No yandex adv_id service";
                }
                gVar = new g(l.f13603c, null, message, 2);
                r10 = gVar;
                eVar = this.f13606a;
                Objects.requireNonNull(eVar);
            } catch (j e11) {
                String message2 = e11.getMessage();
                if (message2 == null) {
                    message2 = "unknown exception while binding yandex adv_id service";
                }
                gVar = new g(l.f13603c, null, message2, 2);
                r10 = gVar;
                eVar = this.f13606a;
                Objects.requireNonNull(eVar);
            } catch (Throwable th) {
                gVar = new g(l.f13604d, null, "exception while fetching yandex adv_id: " + th.getMessage(), 2);
                r10 = gVar;
                eVar = this.f13606a;
                Objects.requireNonNull(eVar);
            }
            eVar.f13591a.a(context);
            return r10;
        } catch (Throwable th2) {
            try {
                e eVar2 = this.f13606a;
                Objects.requireNonNull(eVar2);
                eVar2.f13591a.a(context);
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    public final g b(Context context) {
        c cVar = (c) this.f13606a.a(context);
        String strB = cVar.b();
        j0.h(strB, "service.advId");
        return new g(l.f13602b, new f("yandex", strB, Boolean.valueOf(cVar.d())), null, 4);
    }
}
