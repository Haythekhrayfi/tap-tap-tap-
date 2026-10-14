package ed;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IGNORE_CASE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements e {
    private static final /* synthetic */ g[] $VALUES = $values();
    public static final g CANON_EQ;
    public static final g COMMENTS;
    public static final g DOT_MATCHES_ALL;
    public static final g IGNORE_CASE;
    public static final g LITERAL;
    public static final g MULTILINE;
    public static final g UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ g[] $values() {
        return new g[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        int i10 = 2;
        IGNORE_CASE = new g("IGNORE_CASE", 0, i10, 0, 2, null);
        int i11 = 0;
        int i12 = 2;
        vc.g gVar = null;
        MULTILINE = new g("MULTILINE", 1, 8, i11, i12, gVar);
        int i13 = 0;
        int i14 = 2;
        vc.g gVar2 = null;
        LITERAL = new g("LITERAL", i10, 16, i13, i14, gVar2);
        UNIX_LINES = new g("UNIX_LINES", 3, 1, i11, i12, gVar);
        COMMENTS = new g("COMMENTS", 4, 4, i13, i14, gVar2);
        DOT_MATCHES_ALL = new g("DOT_MATCHES_ALL", 5, 32, i11, i12, gVar);
        CANON_EQ = new g("CANON_EQ", 6, 128, i13, i14, gVar2);
    }

    private g(String str, int i10, int i11, int i12) {
        super(str, i10);
        this.value = i11;
        this.mask = i12;
    }

    public /* synthetic */ g(String str, int i10, int i11, int i12, int i13, vc.g gVar) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public int getMask() {
        return this.mask;
    }

    @Override // ed.e
    public int getValue() {
        return this.value;
    }
}
