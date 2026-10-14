package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class FullLifecycleObserverAdapter implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f2129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f2130d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2131a;

        static {
            int[] iArr = new int[i.b.values().length];
            f2131a = iArr;
            try {
                iArr[i.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2131a[i.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2131a[i.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2131a[i.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2131a[i.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2131a[i.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2131a[i.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(f fVar, n nVar) {
        this.f2129c = fVar;
        this.f2130d = nVar;
    }

    @Override // androidx.lifecycle.n
    public void g(p pVar, i.b bVar) {
        switch (a.f2131a[bVar.ordinal()]) {
            case 1:
                this.f2129c.b(pVar);
                break;
            case 2:
                this.f2129c.f(pVar);
                break;
            case 3:
                this.f2129c.a(pVar);
                break;
            case 4:
                this.f2129c.c(pVar);
                break;
            case 5:
                this.f2129c.d(pVar);
                break;
            case 6:
                this.f2129c.e(pVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        n nVar = this.f2130d;
        if (nVar != null) {
            nVar.g(pVar, bVar);
        }
    }
}
