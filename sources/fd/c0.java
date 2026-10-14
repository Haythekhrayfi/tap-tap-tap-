package fd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 extends mc.a implements mc.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29554d = new a(null);

    public static final class a extends mc.b<mc.e, c0> {

        /* JADX INFO: renamed from: fd.c0$a$a, reason: collision with other inner class name */
        public static final class C0261a extends vc.l implements uc.l<mc.f.a, c0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0261a f29555c = new C0261a();

            public C0261a() {
                super(1);
            }

            @Override // uc.l
            public c0 invoke(mc.f.a aVar) {
                mc.f.a aVar2 = aVar;
                if (aVar2 instanceof c0) {
                    return (c0) aVar2;
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(mc.e.a.f33537c, C0261a.f29555c);
            int i10 = mc.e.B1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vc.g gVar) {
            super(mc.e.a.f33537c, C0261a.f29555c);
            int i10 = mc.e.B1;
        }
    }

    public c0() {
        super(mc.e.a.f33537c);
    }

    @Override // mc.e
    public final <T> mc.d<T> C(mc.d<? super T> dVar) {
        return new kd.f(this, dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to fd.c0 for r3v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // mc.a, mc.f.a, mc.f
    public <E extends mc.f.a> E b(mc.f.b<E> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            fd.j0.i(r4, r0)
            boolean r1 = r4 instanceof mc.b
            r2 = 0
            if (r1 == 0) goto L32
            mc.b r4 = (mc.b) r4
            mc.f$b r1 = r3.getKey()
            fd.j0.i(r1, r0)
            if (r1 == r4) goto L1c
            mc.f$b<?> r0 = r4.f33533d
            if (r0 != r1) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r0 == 0) goto L3c
            java.lang.String r0 = "element"
            fd.j0.i(r3, r0)
            uc.l<mc.f$a, E extends B> r4 = r4.f33532c
            java.lang.Object r4 = r4.invoke(r3)
            mc.f$a r4 = (mc.f.a) r4
            boolean r0 = r4 instanceof mc.f.a
            if (r0 == 0) goto L3c
            r2 = r4
            goto L3c
        L32:
            mc.e$a r0 = mc.e.a.f33537c
            if (r0 != r4) goto L3c
            java.lang.String r4 = "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get"
            fd.j0.g(r3, r4)
            r2 = r3
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.c0.b(mc.f$b):mc.f$a");
    }

    public abstract void c0(mc.f fVar, Runnable runnable);

    public boolean d0(mc.f fVar) {
        return !(this instanceof g2);
    }

    @Override // mc.e
    public final void h(mc.d<?> dVar) {
        ((kd.f) dVar).m();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to fd.c0 for r2v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // mc.a, mc.f
    public mc.f p(mc.f.b<?> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            fd.j0.i(r3, r0)
            boolean r1 = r3 instanceof mc.b
            if (r1 == 0) goto L32
            mc.b r3 = (mc.b) r3
            mc.f$b r1 = r2.getKey()
            fd.j0.i(r1, r0)
            if (r1 == r3) goto L1b
            mc.f$b<?> r0 = r3.f33533d
            if (r0 != r1) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            if (r0 == 0) goto L30
            java.lang.String r0 = "element"
            fd.j0.i(r2, r0)
            uc.l<mc.f$a, E extends B> r3 = r3.f33532c
            java.lang.Object r3 = r3.invoke(r2)
            mc.f$a r3 = (mc.f.a) r3
            if (r3 == 0) goto L30
        L2d:
            mc.h r3 = mc.h.f33539c
            goto L37
        L30:
            r3 = r2
            goto L37
        L32:
            mc.e$a r0 = mc.e.a.f33537c
            if (r0 != r3) goto L30
            goto L2d
        L37:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.c0.p(mc.f$b):mc.f");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + j0.n(this);
    }
}
