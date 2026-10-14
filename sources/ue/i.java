package ue;

import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i<ResponseT, ReturnT> extends c0<ReturnT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f36412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f36413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f<ResponseBody, ResponseT> f36414c;

    public static final class a<ResponseT, ReturnT> extends i<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ue.c<ResponseT, ReturnT> f36415d;

        public a(y yVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, ue.c<ResponseT, ReturnT> cVar) {
            super(yVar, factory, fVar);
            this.f36415d = cVar;
        }

        @Override // ue.i
        public ReturnT c(ue.b<ResponseT> bVar, Object[] objArr) {
            return this.f36415d.a(bVar);
        }
    }

    public static final class b<ResponseT> extends i<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ue.c<ResponseT, ue.b<ResponseT>> f36416d;

        public b(y yVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, ue.c<ResponseT, ue.b<ResponseT>> cVar, boolean z10) {
            super(yVar, factory, fVar);
            this.f36416d = cVar;
        }

        @Override // ue.i
        public Object c(ue.b<ResponseT> bVar, Object[] objArr) {
            ue.b<ResponseT> bVarA = this.f36416d.a(bVar);
            mc.d dVar = (mc.d) objArr[objArr.length - 1];
            try {
                fd.k kVar = new fd.k(nc.b.c(dVar), 1);
                kVar.s(new k(bVarA));
                bVarA.a(new l(kVar));
                Object objR = kVar.r();
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                return objR;
            } catch (Exception e10) {
                return o.a(e10, dVar);
            }
        }
    }

    public static final class c<ResponseT> extends i<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ue.c<ResponseT, ue.b<ResponseT>> f36417d;

        public c(y yVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, ue.c<ResponseT, ue.b<ResponseT>> cVar) {
            super(yVar, factory, fVar);
            this.f36417d = cVar;
        }

        @Override // ue.i
        public Object c(ue.b<ResponseT> bVar, Object[] objArr) {
            ue.b<ResponseT> bVarA = this.f36417d.a(bVar);
            mc.d dVar = (mc.d) objArr[objArr.length - 1];
            try {
                fd.k kVar = new fd.k(nc.b.c(dVar), 1);
                kVar.s(new m(bVarA));
                bVarA.a(new n(kVar));
                Object objR = kVar.r();
                nc.a aVar = nc.a.COROUTINE_SUSPENDED;
                return objR;
            } catch (Exception e10) {
                return o.a(e10, dVar);
            }
        }
    }

    public i(y yVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar) {
        this.f36412a = yVar;
        this.f36413b = factory;
        this.f36414c = fVar;
    }

    @Override // ue.c0
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new p(this.f36412a, objArr, this.f36413b, this.f36414c), objArr);
    }

    @Nullable
    public abstract ReturnT c(ue.b<ResponseT> bVar, Object[] objArr);
}
