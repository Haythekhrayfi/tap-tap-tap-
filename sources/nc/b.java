package nc;

import fd.j0;
import jc.w;
import mc.f;
import mc.h;
import oc.g;
import uc.l;
import uc.p;
import vc.f0;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    public static final class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f33762d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc.d dVar, l lVar) {
            super(dVar);
            this.f33762d = lVar;
            j0.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // oc.a
        public Object invokeSuspend(Object obj) {
            int i10 = this.f33761c;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f33761c = 2;
                h9.d.t(obj);
                return obj;
            }
            this.f33761c = 1;
            h9.d.t(obj);
            j0.g(this.f33762d, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            l lVar = this.f33762d;
            f0.c(lVar, 1);
            return lVar.invoke(this);
        }
    }

    /* JADX INFO: renamed from: nc.b$b, reason: collision with other inner class name */
    public static final class C0370b extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f33764d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0370b(mc.d dVar, f fVar, l lVar) {
            super(dVar, fVar);
            this.f33764d = lVar;
            j0.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // oc.a
        public Object invokeSuspend(Object obj) {
            int i10 = this.f33763c;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f33763c = 2;
                h9.d.t(obj);
                return obj;
            }
            this.f33763c = 1;
            h9.d.t(obj);
            j0.g(this.f33764d, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            l lVar = this.f33764d;
            f0.c(lVar, 1);
            return lVar.invoke(this);
        }
    }

    public static final class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f33766d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f33767e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f33766d = pVar;
            this.f33767e = obj;
            j0.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // oc.a
        public Object invokeSuspend(Object obj) {
            int i10 = this.f33765c;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f33765c = 2;
                h9.d.t(obj);
                return obj;
            }
            this.f33765c = 1;
            h9.d.t(obj);
            j0.g(this.f33766d, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            p pVar = this.f33766d;
            f0.c(pVar, 2);
            return pVar.invoke(this.f33767e, this);
        }
    }

    public static final class d extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f33769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f33770e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mc.d dVar, f fVar, p pVar, Object obj) {
            super(dVar, fVar);
            this.f33769d = pVar;
            this.f33770e = obj;
            j0.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // oc.a
        public Object invokeSuspend(Object obj) {
            int i10 = this.f33768c;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f33768c = 2;
                h9.d.t(obj);
                return obj;
            }
            this.f33768c = 1;
            h9.d.t(obj);
            j0.g(this.f33769d, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            p pVar = this.f33769d;
            f0.c(pVar, 2);
            return pVar.invoke(this.f33770e, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> mc.d<w> a(l<? super mc.d<? super T>, ? extends Object> lVar, mc.d<? super T> dVar) {
        j0.i(lVar, "<this>");
        j0.i(dVar, "completion");
        j0.i(dVar, "completion");
        if (lVar instanceof oc.a) {
            return ((oc.a) lVar).create(dVar);
        }
        f context = dVar.getContext();
        return context == h.f33539c ? new a(dVar, lVar) : new C0370b(dVar, context, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <R, T> mc.d<w> b(p<? super R, ? super mc.d<? super T>, ? extends Object> pVar, R r10, mc.d<? super T> dVar) {
        j0.i(pVar, "<this>");
        j0.i(dVar, "completion");
        j0.i(dVar, "completion");
        if (pVar instanceof oc.a) {
            return ((oc.a) pVar).create(r10, dVar);
        }
        f context = dVar.getContext();
        return context == h.f33539c ? new c(dVar, pVar, r10) : new d(dVar, context, pVar, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> mc.d<T> c(mc.d<? super T> dVar) {
        mc.d<T> dVar2;
        j0.i(dVar, "<this>");
        oc.c cVar = dVar instanceof oc.c ? (oc.c) dVar : null;
        return (cVar == null || (dVar2 = (mc.d<T>) cVar.intercepted()) == null) ? dVar : dVar2;
    }
}
