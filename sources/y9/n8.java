package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum n8 {
    VISIBLE("visible"),
    INVISIBLE("invisible"),
    GONE("gone");

    public static final b Converter = new b(null);
    private static final uc.l<String, n8> FROM_STRING = a.f41699c;
    private final String value;

    public static final class a extends vc.l implements uc.l<String, n8> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41699c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public n8 invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            n8 n8Var = n8.VISIBLE;
            if (fd.j0.d(str2, n8Var.value)) {
                return n8Var;
            }
            n8 n8Var2 = n8.INVISIBLE;
            if (fd.j0.d(str2, n8Var2.value)) {
                return n8Var2;
            }
            n8 n8Var3 = n8.GONE;
            if (fd.j0.d(str2, n8Var3.value)) {
                return n8Var3;
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

    n8(String str) {
        this.value = str;
    }
}
