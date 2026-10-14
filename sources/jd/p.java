package jd;

import jc.w;
import vc.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uc.q<id.e<Object>, Object, mc.d<? super w>, Object> f31874a;

    public /* synthetic */ class a extends vc.k implements uc.q<id.e<? super Object>, Object, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f31875c = new a();

        public a() {
            super(3, id.e.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // uc.q
        public Object b(id.e<? super Object> eVar, Object obj, mc.d<? super w> dVar) {
            return eVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f31875c;
        f0.c(aVar, 3);
        f31874a = aVar;
    }
}
