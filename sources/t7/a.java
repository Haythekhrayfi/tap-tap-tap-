package t7;

import vc.g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'VISIBILITY_BEACONS_ENABLED' uses external variables
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
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final a ACCESSIBILITY_ENABLED;
    public static final a HYPHENATION_SUPPORT_ENABLED;
    public static final a IGNORE_ACTION_MENU_ITEMS_ENABLED;
    public static final a LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED;
    public static final a MULTIPLE_STATE_CHANGE_ENABLED;
    public static final a VIEW_POOL_PROFILING_ENABLED;
    public static final a VISIBILITY_BEACONS_ENABLED;
    public static final a VISUAL_ERRORS_ENABLED;
    private final boolean defaultValue;
    private final String key;
    public static final a TAP_BEACONS_ENABLED = new a("TAP_BEACONS_ENABLED", 0, "tap_beacons_enabled", false, 2, null);
    public static final a VIEW_POOL_ENABLED = new a("VIEW_POOL_ENABLED", 7, "view_pool_enabled", true);
    public static final a RESOURCE_CACHE_ENABLED = new a("RESOURCE_CACHE_ENABLED", 9, "resource_cache_enabled", true);
    public static final a SHOW_RENDERING_TIME = new a("SHOW_RENDERING_TIME", 10, "demo_activity_rendering_time_enabled", false);
    public static final a BIND_ON_ATTACH_ENABLED = new a("BIND_ON_ATTACH_ENABLED", 12, "bind_on_attach_enabled", false, 2, null);
    private static final /* synthetic */ a[] $VALUES = $values();

    private static final /* synthetic */ a[] $values() {
        return new a[]{TAP_BEACONS_ENABLED, VISIBILITY_BEACONS_ENABLED, LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED, IGNORE_ACTION_MENU_ITEMS_ENABLED, HYPHENATION_SUPPORT_ENABLED, VISUAL_ERRORS_ENABLED, ACCESSIBILITY_ENABLED, VIEW_POOL_ENABLED, VIEW_POOL_PROFILING_ENABLED, RESOURCE_CACHE_ENABLED, SHOW_RENDERING_TIME, MULTIPLE_STATE_CHANGE_ENABLED, BIND_ON_ATTACH_ENABLED};
    }

    static {
        boolean z10 = false;
        int i10 = 2;
        g gVar = null;
        VISIBILITY_BEACONS_ENABLED = new a("VISIBILITY_BEACONS_ENABLED", 1, "visibility_beacons_enabled", z10, i10, gVar);
        boolean z11 = false;
        int i11 = 2;
        g gVar2 = null;
        LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED = new a("LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED", 2, "longtap_actions_pass_to_child", z11, i11, gVar2);
        IGNORE_ACTION_MENU_ITEMS_ENABLED = new a("IGNORE_ACTION_MENU_ITEMS_ENABLED", 3, "override_context_menu_handler", z10, i10, gVar);
        HYPHENATION_SUPPORT_ENABLED = new a("HYPHENATION_SUPPORT_ENABLED", 4, "support_hyphenation", z11, i11, gVar2);
        VISUAL_ERRORS_ENABLED = new a("VISUAL_ERRORS_ENABLED", 5, "visual_errors", z10, i10, gVar);
        ACCESSIBILITY_ENABLED = new a("ACCESSIBILITY_ENABLED", 6, "accessibility_enabled", z11, i11, gVar2);
        boolean z12 = false;
        int i12 = 2;
        g gVar3 = null;
        VIEW_POOL_PROFILING_ENABLED = new a("VIEW_POOL_PROFILING_ENABLED", 8, "view_pool_profiling_enabled", z12, i12, gVar3);
        MULTIPLE_STATE_CHANGE_ENABLED = new a("MULTIPLE_STATE_CHANGE_ENABLED", 11, "multiple_state_change_enabled", z12, i12, gVar3);
    }

    private a(String str, int i10, String str2, boolean z10) {
        super(str, i10);
        this.key = str2;
        this.defaultValue = z10;
    }

    public /* synthetic */ a(String str, int i10, String str2, boolean z10, int i11, g gVar) {
        this(str, i10, str2, (i11 & 2) != 0 ? false : z10);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean getDefaultValue() {
        return this.defaultValue;
    }

    public final String getKey() {
        return this.key;
    }
}
