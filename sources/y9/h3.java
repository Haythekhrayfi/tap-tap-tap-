package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum h3 {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit"),
    STRETCH("stretch");

    private final String value;
    public static final b Converter = new b(null);
    private static final uc.l<String, h3> FROM_STRING = a.f40268c;

    public static final class a extends vc.l implements uc.l<String, h3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40268c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public h3 invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            h3 h3Var = h3.FILL;
            if (fd.j0.d(str2, h3Var.value)) {
                return h3Var;
            }
            h3 h3Var2 = h3.NO_SCALE;
            if (fd.j0.d(str2, h3Var2.value)) {
                return h3Var2;
            }
            h3 h3Var3 = h3.FIT;
            if (fd.j0.d(str2, h3Var3.value)) {
                return h3Var3;
            }
            h3 h3Var4 = h3.STRETCH;
            if (fd.j0.d(str2, h3Var4.value)) {
                return h3Var4;
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

    h3(String str) {
        this.value = str;
    }
}
