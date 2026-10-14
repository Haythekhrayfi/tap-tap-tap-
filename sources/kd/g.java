package kd;

import fd.c2;
import fd.h2;
import fd.j1;
import fd.x0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f32038a = new z("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f32039b = new z("REUSABLE_CLAIMED");

    public static final <T> void a(mc.d<? super T> dVar, Object obj, uc.l<? super Throwable, jc.w> lVar) {
        boolean z10;
        if (!(dVar instanceof f)) {
            dVar.resumeWith(obj);
            return;
        }
        f fVar = (f) dVar;
        Object objR = fd.z.R(obj, lVar);
        if (fVar.f32034f.d0(fVar.getContext())) {
            fVar.f32036h = objR;
            fVar.f29617e = 1;
            fVar.f32034f.c0(fVar.getContext(), fVar);
            return;
        }
        c2 c2Var = c2.f29557a;
        x0 x0VarA = c2.a();
        if (x0VarA.i0()) {
            fVar.f32036h = objR;
            fVar.f29617e = 1;
            x0VarA.g0(fVar);
            return;
        }
        x0VarA.h0(true);
        try {
            j1 j1Var = (j1) fVar.getContext().b(j1.b.f29580c);
            if (j1Var == null || j1Var.a()) {
                z10 = false;
            } else {
                CancellationException cancellationExceptionQ = j1Var.q();
                if (objR instanceof fd.w) {
                    ((fd.w) objR).f29632b.invoke(cancellationExceptionQ);
                }
                jc.i.a aVar = jc.i.f31813c;
                fVar.resumeWith(h9.d.f(cancellationExceptionQ));
                z10 = true;
            }
            if (!z10) {
                mc.d<T> dVar2 = fVar.f32035g;
                Object obj2 = fVar.f32037i;
                mc.f context = dVar2.getContext();
                Object objC = b0.c(context, obj2);
                h2<?> h2VarD = objC != b0.f32018a ? fd.b0.d(dVar2, context, objC) : null;
                try {
                    fVar.f32035g.resumeWith(obj);
                    if (h2VarD == null || h2VarD.z0()) {
                        b0.a(context, objC);
                    }
                } catch (Throwable th) {
                    if (h2VarD == null || h2VarD.z0()) {
                        b0.a(context, objC);
                    }
                    throw th;
                }
            }
            while (x0VarA.j0()) {
            }
        } catch (Throwable th2) {
            try {
                fVar.g(th2, null);
            } finally {
                x0VarA.e0(true);
            }
        }
    }
}
