package i3;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.g<d3.c, String> f31244a = new b4.g<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0.e<b> f31245b = c4.a.a(10, new a(this));

    public class a implements c4.a.b<b> {
        public a(j jVar) {
        }

        @Override // c4.a.b
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final class b implements c4.a.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MessageDigest f31246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c4.d f31247d = new c4.d.b();

        public b(MessageDigest messageDigest) {
            this.f31246c = messageDigest;
        }

        @Override // c4.a.d
        public c4.d f() {
            return this.f31247d;
        }
    }

    public String a(d3.c cVar) {
        String strA;
        synchronized (this.f31244a) {
            strA = this.f31244a.a(cVar);
        }
        if (strA == null) {
            b bVarB = this.f31245b.b();
            Objects.requireNonNull(bVarB, "Argument must not be null");
            b bVar = bVarB;
            try {
                cVar.a(bVar.f31246c);
                byte[] bArrDigest = bVar.f31246c.digest();
                char[] cArr = b4.j.f3308b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < bArrDigest.length; i10++) {
                        int i11 = bArrDigest[i10] & 255;
                        int i12 = i10 * 2;
                        char[] cArr2 = b4.j.f3307a;
                        cArr[i12] = cArr2[i11 >>> 4];
                        cArr[i12 + 1] = cArr2[i11 & 15];
                    }
                    strA = new String(cArr);
                }
                this.f31245b.a(bVar);
            } catch (Throwable th) {
                this.f31245b.a(bVar);
                throw th;
            }
        }
        synchronized (this.f31244a) {
            this.f31244a.d(cVar, strA);
        }
        return strA;
    }
}
