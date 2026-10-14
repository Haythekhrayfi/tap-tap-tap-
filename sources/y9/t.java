package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum t {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right");

    public static final b Converter = new b(null);
    private static final uc.l<String, t> FROM_STRING = a.f42673c;
    private final String value;

    public static final class a extends vc.l implements uc.l<String, t> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42673c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public t invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            t tVar = t.LEFT;
            if (fd.j0.d(str2, tVar.value)) {
                return tVar;
            }
            t tVar2 = t.CENTER;
            if (fd.j0.d(str2, tVar2.value)) {
                return tVar2;
            }
            t tVar3 = t.RIGHT;
            if (fd.j0.d(str2, tVar3.value)) {
                return tVar3;
            }
            return null;
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    t(String str) {
        this.value = str;
    }
}
