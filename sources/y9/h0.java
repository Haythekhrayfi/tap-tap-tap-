package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum h0 {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN("screen");

    private final String value;
    public static final b Converter = new b(null);
    private static final uc.l<String, h0> FROM_STRING = a.f40252c;

    public static final class a extends vc.l implements uc.l<String, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40252c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public h0 invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            h0 h0Var = h0.SOURCE_IN;
            if (fd.j0.d(str2, h0Var.value)) {
                return h0Var;
            }
            h0 h0Var2 = h0.SOURCE_ATOP;
            if (fd.j0.d(str2, h0Var2.value)) {
                return h0Var2;
            }
            h0 h0Var3 = h0.DARKEN;
            if (fd.j0.d(str2, h0Var3.value)) {
                return h0Var3;
            }
            h0 h0Var4 = h0.LIGHTEN;
            if (fd.j0.d(str2, h0Var4.value)) {
                return h0Var4;
            }
            h0 h0Var5 = h0.MULTIPLY;
            if (fd.j0.d(str2, h0Var5.value)) {
                return h0Var5;
            }
            h0 h0Var6 = h0.SCREEN;
            if (fd.j0.d(str2, h0Var6.value)) {
                return h0Var6;
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

    h0(String str) {
        this.value = str;
    }
}
