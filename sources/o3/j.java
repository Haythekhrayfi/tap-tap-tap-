package o3;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f33904a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f33905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f33906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f33907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f33908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d3.d<j> f33909f;

    public static class a extends j {
        @Override // o3.j
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // o3.j
        public float b(int i10, int i11, int i12, int i13) {
            int iMin = Math.min(i11 / i13, i10 / i12);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    public static class b extends j {
        @Override // o3.j
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // o3.j
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    public static class c extends j {
        @Override // o3.j
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // o3.j
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, j.f33904a.b(i10, i11, i12, i13));
        }
    }

    public static class d extends j {
        @Override // o3.j
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // o3.j
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    public static class e extends j {
        @Override // o3.j
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // o3.j
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(i12 / i10, i13 / i11);
        }
    }

    public static class f extends j {
        @Override // o3.j
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // o3.j
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f33905b = dVar;
        new a();
        new b();
        f33906c = new c();
        f33907d = new f();
        f33908e = dVar;
        f33909f = d3.d.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
