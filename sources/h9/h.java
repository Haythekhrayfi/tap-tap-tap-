package h9;

import android.net.Uri;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uc.l<Object, Integer> f30978a = d.f30986c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uc.l<String, Uri> f30979b = e.f30987c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final uc.l<Object, Boolean> f30980c = a.f30983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uc.l<Number, Double> f30981d = b.f30984c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uc.l<Number, Long> f30982e = c.f30985c;

    public static final class a extends vc.l implements uc.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f30983c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(Object obj) {
            j0.i(obj, "value");
            if (!(obj instanceof Number)) {
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                throw new ClassCastException("Received value of wrong type");
            }
            Number number = (Number) obj;
            uc.l<Object, Integer> lVar = h.f30978a;
            j0.i(number, "<this>");
            int iIntValue = number.intValue();
            if (iIntValue == 0) {
                return Boolean.FALSE;
            }
            if (iIntValue != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
    }

    public static final class b extends vc.l implements uc.l<Number, Double> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f30984c = new b();

        public b() {
            super(1);
        }

        @Override // uc.l
        public Double invoke(Number number) {
            Number number2 = number;
            j0.i(number2, GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
            return Double.valueOf(number2.doubleValue());
        }
    }

    public static final class c extends vc.l implements uc.l<Number, Long> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f30985c = new c();

        public c() {
            super(1);
        }

        @Override // uc.l
        public Long invoke(Number number) {
            Number number2 = number;
            j0.i(number2, GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
            return Long.valueOf(number2.longValue());
        }
    }

    public static final class d extends vc.l implements uc.l<Object, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f30986c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public Integer invoke(Object obj) {
            int iB;
            if (obj instanceof String) {
                iB = a9.a.f201b.b((String) obj);
            } else {
                if (!(obj instanceof a9.a)) {
                    if (obj == null) {
                        return null;
                    }
                    throw new ClassCastException("Received value of wrong type");
                }
                iB = ((a9.a) obj).f202a;
            }
            return Integer.valueOf(iB);
        }
    }

    public static final class e extends vc.l implements uc.l<String, Uri> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f30987c = new e();

        public e() {
            super(1);
        }

        @Override // uc.l
        public Uri invoke(String str) {
            String str2 = str;
            j0.i(str2, "value");
            Uri uri = Uri.parse(str2);
            j0.h(uri, "parse(value)");
            return uri;
        }
    }
}
