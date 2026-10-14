package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum f4 {
    NONE("none"),
    SINGLE("single");

    public static final b Converter = new b(null);
    private static final uc.l<String, f4> FROM_STRING = a.f39957c;
    private final String value;

    public static final class a extends vc.l implements uc.l<String, f4> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f39957c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public f4 invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            f4 f4Var = f4.NONE;
            if (fd.j0.d(str2, f4Var.value)) {
                return f4Var;
            }
            f4 f4Var2 = f4.SINGLE;
            if (fd.j0.d(str2, f4Var2.value)) {
                return f4Var2;
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

    f4(String str) {
        this.value = str;
    }
}
