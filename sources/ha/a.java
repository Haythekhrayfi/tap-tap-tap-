package ha;

import com.zipoapps.ads.config.PHAdSize;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: ha.a$a, reason: collision with other inner class name */
    public static final class C0303a {
        public C0303a() {
        }

        public C0303a(vc.g gVar) {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31004a;

        static {
            int[] iArr = new int[PHAdSize.SizeType.values().length];
            try {
                iArr[PHAdSize.SizeType.ADAPTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PHAdSize.SizeType.MEDIUM_RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31004a = iArr;
        }
    }

    static {
        new C0303a(null);
    }
}
