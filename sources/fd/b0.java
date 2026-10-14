package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    public static final class a extends vc.l implements uc.p<mc.f, mc.f.a, mc.f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f29543c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public mc.f invoke(mc.f fVar, mc.f.a aVar) {
            mc.f fVar2 = fVar;
            mc.f.a aVarK = aVar;
            if (aVarK instanceof a0) {
                aVarK = ((a0) aVarK).K();
            }
            return fVar2.i(aVarK);
        }
    }

    public static final class b extends vc.l implements uc.p<mc.f, mc.f.a, mc.f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vc.a0<mc.f> f29544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f29545d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vc.a0<mc.f> a0Var, boolean z10) {
            super(2);
            this.f29544c = a0Var;
            this.f29545d = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, mc.f] */
        @Override // uc.p
        public mc.f invoke(mc.f fVar, mc.f.a aVar) {
            a0 a0Var;
            mc.f fVar2 = fVar;
            mc.f.a aVar2 = aVar;
            boolean z10 = aVar2 instanceof a0;
            mc.f fVarV = aVar2;
            if (z10) {
                mc.f.a aVarB = this.f29544c.f36988c.b(aVar2.getKey());
                if (aVarB == null) {
                    a0Var = (a0) aVar2;
                    if (this.f29545d) {
                        fVarV = a0Var;
                        fVarV = a0Var.K();
                    }
                } else {
                    vc.a0<mc.f> a0Var2 = this.f29544c;
                    a0Var2.f36988c = a0Var2.f36988c.p(aVar2.getKey());
                    fVarV = ((a0) aVar2).V(aVarB);
                }
            }
            fVarV = a0Var;
            return fVar2.i(fVarV);
        }
    }

    public static final class c extends vc.l implements uc.p<Boolean, mc.f.a, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f29546c = new c();

        public c() {
            super(2);
        }

        @Override // uc.p
        public Boolean invoke(Boolean bool, mc.f.a aVar) {
            return Boolean.valueOf(bool.booleanValue() || (aVar instanceof a0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final mc.f a(mc.f fVar, mc.f fVar2, boolean z10) {
        boolean zB = b(fVar);
        boolean zB2 = b(fVar2);
        if (!zB && !zB2) {
            return fVar.i(fVar2);
        }
        vc.a0 a0Var = new vc.a0();
        a0Var.f36988c = fVar2;
        mc.h hVar = mc.h.f33539c;
        mc.f fVar3 = (mc.f) fVar.Y(hVar, new b(a0Var, z10));
        if (zB2) {
            a0Var.f36988c = ((mc.f) a0Var.f36988c).Y(hVar, a.f29543c);
        }
        return fVar3.i((mc.f) a0Var.f36988c);
    }

    public static final boolean b(mc.f fVar) {
        return ((Boolean) fVar.Y(Boolean.FALSE, c.f29546c)).booleanValue();
    }

    public static final mc.f c(g0 g0Var, mc.f fVar) {
        mc.f fVarA = a(g0Var.w(), fVar, true);
        c0 c0Var = s0.f29619a;
        if (fVarA == c0Var) {
            return fVarA;
        }
        int i10 = mc.e.B1;
        return fVarA.b(mc.e.a.f33537c) == null ? fVarA.i(c0Var) : fVarA;
    }

    public static final h2<?> d(mc.d<?> dVar, mc.f fVar, Object obj) {
        h2<?> h2Var = null;
        if (!(dVar instanceof oc.d)) {
            return null;
        }
        if (!(fVar.b(i2.f29578c) != null)) {
            return null;
        }
        oc.d callerFrame = (oc.d) dVar;
        while (!(callerFrame instanceof q0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
            if (callerFrame instanceof h2) {
                h2Var = (h2) callerFrame;
                break;
            }
        }
        if (h2Var != null) {
            h2Var.f29576f.set(new jc.h<>(fVar, obj));
        }
        return h2Var;
    }
}
