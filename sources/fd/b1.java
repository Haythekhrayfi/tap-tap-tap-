package fd;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b1 extends c0 implements Closeable {

    public static final class a extends mc.b<c0, b1> {

        /* JADX INFO: renamed from: fd.b1$a$a, reason: collision with other inner class name */
        public static final class C0260a extends vc.l implements uc.l<mc.f.a, b1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0260a f29547c = new C0260a();

            public C0260a() {
                super(1);
            }

            @Override // uc.l
            public b1 invoke(mc.f.a aVar) {
                mc.f.a aVar2 = aVar;
                if (aVar2 instanceof b1) {
                    return (b1) aVar2;
                }
                return null;
            }
        }

        public a() {
            super(c0.f29554d, C0260a.f29547c);
        }

        public a(vc.g gVar) {
            super(c0.f29554d, C0260a.f29547c);
        }
    }

    static {
        new a(null);
    }
}
