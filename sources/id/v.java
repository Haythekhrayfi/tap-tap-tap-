package id;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class v<T> extends jd.b<x> implements n<T>, jd.l<T>, jd.l {
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31621f;

    @oc.e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    public static final class a extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f31622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f31623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f31624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f31625f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f31626g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f31627h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ v<T> f31628i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f31629j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v<T> vVar, mc.d<? super a> dVar) {
            super(dVar);
            this.f31628i = vVar;
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f31627h = obj;
            this.f31629j |= Integer.MIN_VALUE;
            return this.f31628i.a(null, this);
        }
    }

    public v(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00aa A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:14:0x003c, B:34:0x00a6, B:36:0x00aa, B:39:0x00b1, B:40:0x00b5, B:42:0x00b8, B:52:0x00d9, B:57:0x00f0, B:44:0x00be, B:48:0x00c5, B:19:0x005a, B:22:0x006d, B:33:0x0095), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:14:0x003c, B:34:0x00a6, B:36:0x00aa, B:39:0x00b1, B:40:0x00b5, B:42:0x00b8, B:52:0x00d9, B:57:0x00f0, B:44:0x00be, B:48:0x00c5, B:19:0x005a, B:22:0x006d, B:33:0x0095), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00be A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:14:0x003c, B:34:0x00a6, B:36:0x00aa, B:39:0x00b1, B:40:0x00b5, B:42:0x00b8, B:52:0x00d9, B:57:0x00f0, B:44:0x00be, B:48:0x00c5, B:19:0x005a, B:22:0x006d, B:33:0x0095), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:14:0x003c, B:34:0x00a6, B:36:0x00aa, B:39:0x00b1, B:40:0x00b5, B:42:0x00b8, B:52:0x00d9, B:57:0x00f0, B:44:0x00be, B:48:0x00c5, B:19:0x005a, B:22:0x006d, B:33:0x0095), top: B:64:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0100 -> B:34:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:44:0x00be
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // id.q, id.d
    public java.lang.Object a(id.e<? super T> r12, mc.d<?> r13) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: id.v.a(id.e, mc.d):java.lang.Object");
    }

    @Override // jd.l
    public d<T> b(mc.f fVar, int i10, hd.e eVar) {
        return w.b(this, fVar, i10, eVar);
    }

    @Override // jd.b
    public jd.d d() {
        return new x();
    }

    @Override // jd.b
    public jd.d[] e(int i10) {
        return new x[i10];
    }

    @Override // id.m, id.e
    public Object emit(T t10, mc.d<? super jc.w> dVar) {
        setValue(t10);
        return jc.w.f31842a;
    }

    @Override // id.n, id.u
    public T getValue() {
        kd.z zVar = jd.n.f31867a;
        T t10 = (T) this._state;
        if (t10 == zVar) {
            return null;
        }
        return t10;
    }

    @Override // id.n
    public void setValue(T t10) {
        int i10;
        Object obj;
        kd.z zVar;
        if (t10 == null) {
            t10 = (T) jd.n.f31867a;
        }
        synchronized (this) {
            if (!j0.d(this._state, t10)) {
                this._state = t10;
                int i11 = this.f31621f;
                if ((i11 & 1) == 0) {
                    int i12 = i11 + 1;
                    this.f31621f = i12;
                    Object obj2 = this.f31846c;
                    while (true) {
                        x[] xVarArr = (x[]) obj2;
                        if (xVarArr != null) {
                            for (x xVar : xVarArr) {
                                if (xVar != null) {
                                    while (true) {
                                        Object obj3 = xVar._state;
                                        if (obj3 == null || obj3 == (zVar = w.f31631b)) {
                                            break;
                                        }
                                        kd.z zVar2 = w.f31630a;
                                        if (obj3 != zVar2) {
                                            if (x.f31632a.compareAndSet(xVar, obj3, zVar2)) {
                                                jc.i.a aVar = jc.i.f31813c;
                                                ((fd.k) obj3).resumeWith(jc.w.f31842a);
                                                break;
                                            }
                                        } else {
                                            if (x.f31632a.compareAndSet(xVar, obj3, zVar)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        synchronized (this) {
                            i10 = this.f31621f;
                            if (i10 == i12) {
                                break;
                            } else {
                                obj = this.f31846c;
                            }
                        }
                        obj2 = obj;
                        i12 = i10;
                    }
                    this.f31621f = i12 + 1;
                } else {
                    this.f31621f = i11 + 2;
                }
            }
        }
    }
}
