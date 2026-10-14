package h9;

import android.net.Uri;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k<Boolean> f30997a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k<Long> f30998b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k<String> f30999c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k<Double> f31000d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k<Uri> f31001e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k<Integer> f31002f = new b();

    public static final class a implements k<Boolean> {
        @Override // h9.k
        public /* bridge */ /* synthetic */ Boolean a() {
            return Boolean.FALSE;
        }

        @Override // h9.k
        public boolean b(Object obj) {
            j0.i(obj, "value");
            return obj instanceof Boolean;
        }
    }

    public static final class b implements k<Integer> {
        @Override // h9.k
        public Integer a() {
            return -16777216;
        }

        @Override // h9.k
        public boolean b(Object obj) {
            j0.i(obj, "value");
            return obj instanceof Integer;
        }
    }

    public static final class c implements k<Double> {
        @Override // h9.k
        public Double a() {
            return Double.valueOf(0.0d);
        }

        @Override // h9.k
        public boolean b(Object obj) {
            j0.i(obj, "value");
            return obj instanceof Double;
        }
    }

    public static final class d implements k<Long> {
        @Override // h9.k
        public Long a() {
            return 0L;
        }

        @Override // h9.k
        public boolean b(Object obj) {
            j0.i(obj, "value");
            return obj instanceof Long;
        }
    }

    public static final class e implements k<String> {
        @Override // h9.k
        public /* bridge */ /* synthetic */ String a() {
            return "";
        }

        @Override // h9.k
        public boolean b(Object obj) {
            j0.i(obj, "value");
            return obj instanceof String;
        }
    }

    public static final class f implements k<Uri> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f31003b = Uri.EMPTY;

        @Override // h9.k
        public Uri a() {
            return this.f31003b;
        }

        @Override // h9.k
        public boolean b(Object obj) {
            j0.i(obj, "value");
            return obj instanceof Uri;
        }
    }
}
