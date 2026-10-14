package y9;

/* JADX INFO: loaded from: classes2.dex */
public enum y0 {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");

    public static final b Converter = new b(null);
    private static final uc.l<String, y0> FROM_STRING = a.f44195c;
    private final String value;

    public static final class a extends vc.l implements uc.l<String, y0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44195c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public y0 invoke(String str) {
            String str2 = str;
            fd.j0.i(str2, "string");
            y0 y0Var = y0.LEFT;
            if (fd.j0.d(str2, y0Var.value)) {
                return y0Var;
            }
            y0 y0Var2 = y0.CENTER;
            if (fd.j0.d(str2, y0Var2.value)) {
                return y0Var2;
            }
            y0 y0Var3 = y0.RIGHT;
            if (fd.j0.d(str2, y0Var3.value)) {
                return y0Var3;
            }
            y0 y0Var4 = y0.SPACE_BETWEEN;
            if (fd.j0.d(str2, y0Var4.value)) {
                return y0Var4;
            }
            y0 y0Var5 = y0.SPACE_AROUND;
            if (fd.j0.d(str2, y0Var5.value)) {
                return y0Var5;
            }
            y0 y0Var6 = y0.SPACE_EVENLY;
            if (fd.j0.d(str2, y0Var6.value)) {
                return y0Var6;
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

    y0(String str) {
        this.value = str;
    }
}
