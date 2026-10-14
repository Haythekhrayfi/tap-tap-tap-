package rc;

import zc.b;
import zc.c;

/* JADX INFO: loaded from: classes3.dex */
public class a extends qc.a {

    /* JADX INFO: renamed from: rc.a$a, reason: collision with other inner class name */
    public static final class C0405a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Integer f35362a;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null) {
                if (num.intValue() > 0) {
                    num2 = num;
                }
            }
            f35362a = num2;
        }
    }

    @Override // pc.a
    public c b() {
        Integer num = C0405a.f35362a;
        return num == null || num.intValue() >= 34 ? new ad.a() : new b();
    }
}
