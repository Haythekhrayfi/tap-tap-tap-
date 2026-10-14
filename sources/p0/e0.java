package p0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.inscode.autoclicker.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, m0> f34354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f34355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f34356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f34357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f34358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34359f;

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f34360c = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f34360c.entrySet()) {
                    View key = entry.getKey();
                    boolean zBooleanValue = entry.getValue().booleanValue();
                    boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
                    if (zBooleanValue != z10) {
                        e0.j(key, z10 ? 16 : 32);
                        this.f34360c.put(key, Boolean.valueOf(z10));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f34361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<T> f34362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f34363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f34364d;

        public b(int i10, Class<T> cls, int i11) {
            this.f34361a = i10;
            this.f34362b = cls;
            this.f34364d = 0;
            this.f34363c = i11;
        }

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f34361a = i10;
            this.f34362b = cls;
            this.f34364d = i11;
            this.f34363c = i12;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t10);

        public T d(View view) {
            if (Build.VERSION.SDK_INT >= this.f34363c) {
                return b(view);
            }
            T t10 = (T) view.getTag(this.f34361a);
            if (this.f34362b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        public void e(View view, T t10) {
            if (Build.VERSION.SDK_INT >= this.f34363c) {
                c(view, t10);
                return;
            }
            if (f(d(view), t10)) {
                p0.a aVarE = e0.e(view);
                if (aVarE == null) {
                    aVarE = new p0.a();
                }
                e0.q(view, aVarE);
                view.setTag(this.f34361a, t10);
                e0.j(view, this.f34364d);
            }
        }

        public abstract boolean f(T t10, T t11);
    }

    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class i {

        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public s0 f34365a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f34366b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ u f34367c;

            public a(View view, u uVar) {
                this.f34366b = view;
                this.f34367c = uVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                s0 s0VarK = s0.k(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    i.a(windowInsets, this.f34366b);
                    if (s0VarK.equals(this.f34365a)) {
                        return this.f34367c.onApplyWindowInsets(view, s0VarK).i();
                    }
                }
                this.f34365a = s0VarK;
                s0 s0VarOnApplyWindowInsets = this.f34367c.onApplyWindowInsets(view, s0VarK);
                if (i10 >= 30) {
                    return s0VarOnApplyWindowInsets.i();
                }
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                h.c(view);
                return s0VarOnApplyWindowInsets.i();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static s0 b(View view, s0 s0Var, Rect rect) {
            WindowInsets windowInsetsI = s0Var.i();
            if (windowInsetsI != null) {
                return s0.k(view.computeSystemWindowInsets(windowInsetsI, rect), view);
            }
            rect.setEmpty();
            return s0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static s0 j(View view) {
            if (!s0.a.f34408d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = s0.a.f34405a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) s0.a.f34406b.get(obj);
                Rect rect2 = (Rect) s0.a.f34407c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                s0.b bVar = new s0.b();
                bVar.f34409a.c(h0.g.b(rect.left, rect.top, rect.right, rect.bottom));
                bVar.f34409a.d(h0.g.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                s0 s0VarA = bVar.a();
                s0VarA.f34404a.s(s0VarA);
                s0VarA.f34404a.d(view.getRootView());
                return s0VarA;
            } catch (IllegalAccessException e10) {
                StringBuilder sbA = defpackage.a.a("Failed to get insets from AttachInfo. ");
                sbA.append(e10.getMessage());
                Log.w("WindowInsetsCompat", sbA.toString(), e10);
                return null;
            }
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, u uVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, uVar);
            }
            if (uVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, uVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class j {
        public static s0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            s0 s0VarK = s0.k(rootWindowInsets, null);
            s0VarK.f34404a.s(s0VarK);
            s0VarK.f34404a.d(view.getRootView());
            return s0VarK;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static class l {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class m {
        public static void a(View view, final r rVar) {
            q.h hVar = (q.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null) {
                hVar = new q.h();
                view.setTag(R.id.tag_unhandled_key_listeners, hVar);
            }
            Objects.requireNonNull(rVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: p0.f0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return rVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            hVar.put(rVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            q.h hVar = (q.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.getOrDefault(rVar, null)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class o {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class p {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static p0.c b(View view, p0.c cVar) {
            ContentInfo contentInfoA = cVar.a();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoA);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoA ? cVar : new p0.c(new p0.c.e(contentInfoPerformReceiveContent));
        }

        public static void c(View view, String[] strArr, v vVar) {
            if (vVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(vVar));
            }
        }
    }

    public static final class q implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f34368a;

        public q(v vVar) {
            this.f34368a = vVar;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            p0.c cVar = new p0.c(new p0.c.e(contentInfo));
            p0.c cVarA = this.f34368a.a(view, cVar);
            if (cVarA == null) {
                return null;
            }
            return cVarA == cVar ? contentInfo : cVarA.a();
        }
    }

    public interface r {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    public static class s {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f34369d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f34370a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f34371b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f34372c = null;

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f34370a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewA != null) {
                            return viewA;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((r) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        f34354a = null;
        f34356c = false;
        f34357d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f34358e = new w() { // from class: p0.z
            @Override // p0.w
            public final c onReceiveContent(c cVar) {
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                return cVar;
            }
        };
        f34359f = new a();
    }

    public static void a(View view, q0.c.a aVar) {
        p0.a aVarE = e(view);
        if (aVarE == null) {
            aVarE = new p0.a();
        }
        q(view, aVarE);
        n(aVar.a(), view);
        h(view).add(aVar);
        j(view, 0);
    }

    public static m0 b(View view) {
        if (f34354a == null) {
            f34354a = new WeakHashMap<>();
        }
        m0 m0Var = f34354a.get(view);
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0(view);
        f34354a.put(view, m0Var2);
        return m0Var2;
    }

    public static s0 c(View view, s0 s0Var) {
        WindowInsets windowInsetsI = s0Var.i();
        if (windowInsetsI != null) {
            WindowInsets windowInsetsA = h.a(view, windowInsetsI);
            if (!windowInsetsA.equals(windowInsetsI)) {
                return s0.k(windowInsetsA, view);
            }
        }
        return s0Var;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f34369d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f34370a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f34369d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f34370a == null) {
                        sVar.f34370a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.f34369d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f34370a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f34370a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewA = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f34371b == null) {
                    sVar.f34371b = new SparseArray<>();
                }
                sVar.f34371b.put(keyCode, new WeakReference<>(viewA));
            }
        }
        return viewA != null;
    }

    public static p0.a e(View view) {
        View.AccessibilityDelegate accessibilityDelegateF = f(view);
        if (accessibilityDelegateF == null) {
            return null;
        }
        return accessibilityDelegateF instanceof p0.a.C0382a ? ((p0.a.C0382a) accessibilityDelegateF).f34335a : new p0.a(accessibilityDelegateF);
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (f34356c) {
            return null;
        }
        if (f34355b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f34355b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f34356c = true;
                return null;
            }
        }
        Object obj = f34355b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static CharSequence g(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = m.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static List<q0.c.a> h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] i(View view) {
        return Build.VERSION.SDK_INT >= 31 ? p.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void j(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (g.a(view) != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                g.g(accessibilityEventObtain, i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(g(view));
                    if (d.c(view) == 0) {
                        d.s(view, 1);
                    }
                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                        if (d.c((View) parent) == 4) {
                            d.s(view, 2);
                            break;
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                g.g(accessibilityEventObtain2, i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(g(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static s0 k(View view, s0 s0Var) {
        WindowInsets windowInsetsI = s0Var.i();
        if (windowInsetsI != null) {
            WindowInsets windowInsetsB = h.b(view, windowInsetsI);
            if (!windowInsetsB.equals(windowInsetsI)) {
                return s0.k(windowInsetsB, view);
            }
        }
        return s0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p0.c l(View view, p0.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, cVar);
        }
        v vVar = (v) view.getTag(R.id.tag_on_receive_content_listener);
        if (vVar == null) {
            return (view instanceof w ? (w) view : f34358e).onReceiveContent(cVar);
        }
        p0.c cVarA = vVar.a(view, cVar);
        if (cVarA == null) {
            return null;
        }
        return (view instanceof w ? (w) view : f34358e).onReceiveContent(cVarA);
    }

    public static void m(View view, int i10) {
        n(i10, view);
        j(view, 0);
    }

    public static void n(int i10, View view) {
        List<q0.c.a> listH = h(view);
        for (int i11 = 0; i11 < listH.size(); i11++) {
            if (listH.get(i11).a() == i10) {
                listH.remove(i11);
                return;
            }
        }
    }

    public static void o(View view, q0.c.a aVar, CharSequence charSequence, q0.g gVar) {
        if (gVar != null) {
            a(view, new q0.c.a(null, aVar.f34761b, null, gVar, aVar.f34762c));
        } else {
            n(aVar.a(), view);
            j(view, 0);
        }
    }

    public static void p(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static void q(View view, p0.a aVar) {
        if (aVar == null && (f(view) instanceof p0.a.C0382a)) {
            aVar = new p0.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.getBridge());
    }

    public static void r(View view, CharSequence charSequence) {
        new b0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).e(view, charSequence);
        if (charSequence == null) {
            a aVar = f34359f;
            aVar.f34360c.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            d.o(view.getViewTreeObserver(), aVar);
            return;
        }
        a aVar2 = f34359f;
        aVar2.f34360c.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
        view.addOnAttachStateChangeListener(aVar2);
        if (g.b(view)) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(aVar2);
        }
    }

    public static void s(View view, CharSequence charSequence) {
        new c0(R.id.tag_state_description, CharSequence.class, 64, 30).e(view, charSequence);
    }
}
