package com.google.android.play.core.ktx;

import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import fd.j0;
import fd.k;
import hd.v;
import jc.i;
import jc.w;
import mc.d;
import nc.b;
import uc.a;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskUtilsKt {

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.TaskUtilsKt$runTask$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l implements a<w> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public static final <T> Object runTask(Task<T> task, a<w> aVar, d<? super T> dVar) {
        Object objF;
        final k kVar = new k(b.c(dVar), 1);
        kVar.u();
        kVar.s(new TaskUtilsKt$runTask$$inlined$suspendCancellableCoroutine$lambda$1(aVar, task));
        if (task.isComplete()) {
            if (task.isSuccessful()) {
                objF = task.getResult();
                i.a aVar2 = i.f31813c;
            } else {
                Exception exception = task.getException();
                if (exception == null) {
                    j0.q();
                    throw null;
                }
                j0.e(exception, "task.exception!!");
                i.a aVar3 = i.f31813c;
                objF = h9.d.f(exception);
            }
            kVar.resumeWith(objF);
        } else {
            task.addOnSuccessListener(new OnSuccessListener<T>() { // from class: com.google.android.play.core.ktx.TaskUtilsKt$runTask$3$2
                @Override // com.google.android.play.core.tasks.OnSuccessListener
                public final void onSuccess(T t10) {
                    fd.i iVar = kVar;
                    i.a aVar4 = i.f31813c;
                    iVar.resumeWith(t10);
                }
            });
            j0.e(task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.TaskUtilsKt$runTask$3$3
                @Override // com.google.android.play.core.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    fd.i iVar = kVar;
                    j0.e(exc, "exception");
                    i.a aVar4 = i.f31813c;
                    iVar.resumeWith(h9.d.f(exc));
                }
            }), "task.addOnFailureListene…ithException(exception) }");
        }
        Object objR = kVar.r();
        if (objR == nc.a.COROUTINE_SUSPENDED) {
            j0.i(dVar, "frame");
        }
        return objR;
    }

    public static /* synthetic */ Object runTask$default(Task task, a aVar, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = AnonymousClass2.INSTANCE;
        }
        return runTask(task, aVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(v<? super E> vVar, E e10) {
        j0.j(vVar, "$this$tryOffer");
        try {
            return vVar.offer(e10);
        } catch (Exception unused) {
            return false;
        }
    }
}
