package q0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import ch.qos.logback.core.util.FileUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f34745d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f34746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34747b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34748c = -1;

    public static class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f34749e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f34750f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f34751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f34752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f34753i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f34754j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f34755k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f34756l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f34757m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f34758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f34759o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f34760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class<? extends g.a> f34762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g f34763d;

        static {
            new a(4, null);
            new a(8, null);
            f34751g = new a(16, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, (CharSequence) null, (Class<? extends g.a>) g.b.class);
            new a(512, (CharSequence) null, (Class<? extends g.a>) g.b.class);
            new a(1024, (CharSequence) null, (Class<? extends g.a>) g.c.class);
            new a(2048, (CharSequence) null, (Class<? extends g.a>) g.c.class);
            f34752h = new a(4096, null);
            f34753i = new a(8192, null);
            new a(Http2.INITIAL_MAX_FRAME_SIZE, null);
            new a(FileUtil.BUF_SIZE, null);
            new a(65536, null);
            new a(131072, (CharSequence) null, (Class<? extends g.a>) g.C0390g.class);
            f34754j = new a(262144, null);
            f34755k = new a(524288, null);
            f34756l = new a(1048576, null);
            new a(2097152, (CharSequence) null, (Class<? extends g.a>) g.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, g.e.class);
            f34757m = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f34758n = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f34759o = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, g.f.class);
            new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, g.d.class);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a(int i10, CharSequence charSequence, Class<? extends g.a> cls) {
            this(null, i10, null, null, cls);
        }

        public a(int i10, CharSequence charSequence, g gVar) {
            this(null, i10, charSequence, gVar, null);
        }

        public a(Object obj, int i10, CharSequence charSequence, g gVar, Class<? extends g.a> cls) {
            this.f34761b = i10;
            this.f34763d = gVar;
            this.f34760a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f34762c = cls;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f34760a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f34760a).getLabel();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f34760a;
            Object obj3 = ((a) obj).f34760a;
            if (obj2 == null) {
                return obj3 == null;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f34760a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f34764a;

        public b(Object obj) {
            this.f34764a = obj;
        }

        public static b a(int i10, int i11, boolean z10, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* JADX INFO: renamed from: q0.c$c, reason: collision with other inner class name */
    public static class C0389c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f34765a;

        public C0389c(Object obj) {
            this.f34765a = obj;
        }

        public static C0389c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new C0389c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f34746a = accessibilityNodeInfo;
    }

    @Deprecated
    public c(Object obj) {
        this.f34746a = (AccessibilityNodeInfo) obj;
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return "ACTION_COPY";
            case FileUtil.BUF_SIZE /* 32768 */:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] f(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void a(a aVar) {
        this.f34746a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f34760a);
    }

    public final List<Integer> b(String str) {
        ArrayList<Integer> integerArrayList = this.f34746a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f34746a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    public int d() {
        return this.f34746a.getActions();
    }

    public CharSequence e() {
        return this.f34746a.getClassName();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f34746a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f34746a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f34746a)) {
            return false;
        }
        return this.f34748c == cVar.f34748c && this.f34747b == cVar.f34747b;
    }

    public CharSequence g() {
        return this.f34746a.getContentDescription();
    }

    public Bundle h() {
        return this.f34746a.getExtras();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f34746a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public CharSequence i() {
        if (!(!b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f34746a.getText();
        }
        List<Integer> listB = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listB2 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listB3 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listB4 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f34746a.getText(), 0, this.f34746a.getText().length()));
        for (int i10 = 0; i10 < listB.size(); i10++) {
            spannableString.setSpan(new q0.a(listB4.get(i10).intValue(), this, h().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listB.get(i10).intValue(), listB2.get(i10).intValue(), listB3.get(i10).intValue());
        }
        return spannableString;
    }

    public boolean j() {
        return this.f34746a.isEnabled();
    }

    public boolean k(a aVar) {
        return this.f34746a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f34760a);
    }

    public final void l(int i10, boolean z10) {
        Bundle bundleH = h();
        if (bundleH != null) {
            int i11 = bundleH.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleH.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public void m(Object obj) {
        this.f34746a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f34764a);
    }

    public void n(Object obj) {
        this.f34746a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C0389c) obj).f34765a);
    }

    public void o(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f34746a.setHintText(charSequence);
        } else {
            this.f34746a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void p(View view) {
        this.f34747b = -1;
        this.f34746a.setParent(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public String toString() {
        ?? EmptyList;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        this.f34746a.getBoundsInParent(rect);
        sb2.append("; boundsInParent: " + rect);
        this.f34746a.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(this.f34746a.getPackageName());
        sb2.append("; className: ");
        sb2.append(e());
        sb2.append("; text: ");
        sb2.append(i());
        sb2.append("; contentDescription: ");
        sb2.append(g());
        sb2.append("; viewId: ");
        sb2.append(this.f34746a.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        sb2.append(l0.a.c() ? this.f34746a.getUniqueId() : this.f34746a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb2.append("; checkable: ");
        sb2.append(this.f34746a.isCheckable());
        sb2.append("; checked: ");
        sb2.append(this.f34746a.isChecked());
        sb2.append("; focusable: ");
        sb2.append(this.f34746a.isFocusable());
        sb2.append("; focused: ");
        sb2.append(this.f34746a.isFocused());
        sb2.append("; selected: ");
        sb2.append(this.f34746a.isSelected());
        sb2.append("; clickable: ");
        sb2.append(this.f34746a.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(this.f34746a.isLongClickable());
        sb2.append("; enabled: ");
        sb2.append(j());
        sb2.append("; password: ");
        sb2.append(this.f34746a.isPassword());
        sb2.append("; scrollable: " + this.f34746a.isScrollable());
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f34746a.getActionList();
        if (actionList != null) {
            EmptyList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                EmptyList.add(new a(actionList.get(i10), 0, null, null, null));
            }
        } else {
            EmptyList = Collections.emptyList();
        }
        for (int i11 = 0; i11 < EmptyList.size(); i11++) {
            a aVar = (a) EmptyList.get(i11);
            String strC = c(aVar.a());
            if (strC.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                strC = aVar.b().toString();
            }
            sb2.append(strC);
            if (i11 != EmptyList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
