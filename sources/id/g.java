package id;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uc.l<Object, Object> f31568a = b.f31571c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.p<Object, Object, Boolean> f31569b = a.f31570c;

    public static final class a extends vc.l implements uc.p<Object, Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f31570c = new a();

        public a() {
            super(2);
        }

        @Override // uc.p
        public Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(j0.d(obj, obj2));
        }
    }

    public static final class b extends vc.l implements uc.l<Object, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f31571c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
