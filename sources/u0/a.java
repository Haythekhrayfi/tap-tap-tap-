package u0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import ch.qos.logback.core.util.FileUtil;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import q.i;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends p0.a {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final u0.b.a<q0.c> NODE_ADAPTER = new C0421a();
    private static final u0.b.InterfaceC0422b<i<q0.c>, q0.c> SPARSE_VALUES_ADAPTER = new b();
    private final View mHost;
    private final AccessibilityManager mManager;
    private c mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    public int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: u0.a$a, reason: collision with other inner class name */
    public class C0421a implements u0.b.a<q0.c> {
        public void a(Object obj, Rect rect) {
            ((q0.c) obj).f34746a.getBoundsInParent(rect);
        }
    }

    public class b implements u0.b.InterfaceC0422b<i<q0.c>, q0.c> {
    }

    public class c extends q0.d {
        public c() {
        }

        @Override // q0.d
        public q0.c a(int i10) {
            return new q0.c(AccessibilityNodeInfo.obtain(a.this.obtainAccessibilityNodeInfo(i10).f34746a));
        }

        @Override // q0.d
        public q0.c b(int i10) {
            int i11 = i10 == 2 ? a.this.mAccessibilityFocusedVirtualViewId : a.this.mKeyboardFocusedVirtualViewId;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return new q0.c(AccessibilityNodeInfo.obtain(a.this.obtainAccessibilityNodeInfo(i11).f34746a));
        }

        @Override // q0.d
        public boolean c(int i10, int i11, Bundle bundle) {
            return a.this.performAction(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (e0.d.c(view) == 0) {
            e0.d.s(view, 1);
        }
    }

    private boolean clearAccessibilityFocus(int i10) {
        if (this.mAccessibilityFocusedVirtualViewId != i10) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i10, 65536);
        return true;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i10 = this.mKeyboardFocusedVirtualViewId;
        return i10 != Integer.MIN_VALUE && onPerformActionForVirtualView(i10, 16, null);
    }

    private AccessibilityEvent createEvent(int i10, int i11) {
        return i10 != -1 ? createEventForChild(i10, i11) : createEventForHost(i11);
    }

    private AccessibilityEvent createEventForChild(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        q0.c cVarObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i10);
        accessibilityEventObtain.getText().add(cVarObtainAccessibilityNodeInfo.i());
        accessibilityEventObtain.setContentDescription(cVarObtainAccessibilityNodeInfo.g());
        accessibilityEventObtain.setScrollable(cVarObtainAccessibilityNodeInfo.f34746a.isScrollable());
        accessibilityEventObtain.setPassword(cVarObtainAccessibilityNodeInfo.f34746a.isPassword());
        accessibilityEventObtain.setEnabled(cVarObtainAccessibilityNodeInfo.j());
        accessibilityEventObtain.setChecked(cVarObtainAccessibilityNodeInfo.f34746a.isChecked());
        onPopulateEventForVirtualView(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(cVarObtainAccessibilityNodeInfo.e());
        f.a(accessibilityEventObtain, this.mHost, i10);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent createEventForHost(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private q0.c createNodeForChild(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        q0.c cVar = new q0.c(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = INVALID_PARENT_BOUNDS;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        cVar.p(this.mHost);
        onPopulateNodeForVirtualView(i10, cVar);
        if (cVar.i() == null && cVar.g() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.getBoundsInParent(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iD = cVar.d();
        if ((iD & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iD & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(this.mHost.getContext().getPackageName());
        View view = this.mHost;
        cVar.f34748c = i10;
        accessibilityNodeInfoObtain.setSource(view, i10);
        if (this.mAccessibilityFocusedVirtualViewId == i10) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            accessibilityNodeInfoObtain.addAction(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            accessibilityNodeInfoObtain.addAction(64);
        }
        boolean z10 = this.mKeyboardFocusedVirtualViewId == i10;
        if (z10) {
            accessibilityNodeInfoObtain.addAction(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            accessibilityNodeInfoObtain.addAction(1);
        }
        accessibilityNodeInfoObtain.setFocused(z10);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        accessibilityNodeInfoObtain.getBoundsInScreen(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            accessibilityNodeInfoObtain.getBoundsInParent(this.mTempScreenRect);
            if (cVar.f34747b != -1) {
                q0.c cVar2 = new q0.c(AccessibilityNodeInfo.obtain());
                for (int i11 = cVar.f34747b; i11 != -1; i11 = cVar2.f34747b) {
                    View view2 = this.mHost;
                    cVar2.f34747b = -1;
                    cVar2.f34746a.setParent(view2, -1);
                    cVar2.f34746a.setBoundsInParent(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i11, cVar2);
                    cVar2.f34746a.getBoundsInParent(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
                cVar2.f34746a.recycle();
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                cVar.f34746a.setBoundsInScreen(this.mTempScreenRect);
                if (isVisibleToUser(this.mTempScreenRect)) {
                    cVar.f34746a.setVisibleToUser(true);
                }
            }
        }
        return cVar;
    }

    private q0.c createNodeForHost() {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.mHost);
        q0.c cVar = new q0.c(accessibilityNodeInfoObtain);
        View view = this.mHost;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            cVar.f34746a.addChild(this.mHost, ((Integer) arrayList.get(i10)).intValue());
        }
        return cVar;
    }

    private i<q0.c> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        i<q0.c> iVar = new i<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iVar.g(((Integer) arrayList.get(i10)).intValue(), createNodeForChild(((Integer) arrayList.get(i10)).intValue()));
        }
        return iVar;
    }

    private void getBoundsInParent(int i10, Rect rect) {
        obtainAccessibilityNodeInfo(i10).f34746a.getBoundsInParent(rect);
    }

    private static Rect guessPreviouslyFocusedRect(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.mHost;
        do {
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    private static int keyToDirection(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:77:0x0146  */
    private boolean moveFocus(int i10, Rect rect) {
        Object obj;
        q0.c cVar;
        int iF;
        int iWidth;
        int iH;
        Rect rect2;
        int i11;
        q0.c cVar2;
        boolean z10;
        int i12;
        int iD;
        int iE;
        int iHeight;
        i<q0.c> allNodes = getAllNodes();
        int i13 = this.mKeyboardFocusedVirtualViewId;
        q0.c cVarD = i13 == Integer.MIN_VALUE ? null : allNodes.d(i13);
        int i14 = -1;
        if (i10 == 1 || i10 == 2) {
            View view = this.mHost;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            boolean z11 = e0.e.d(view) == 1;
            u0.b.InterfaceC0422b<i<q0.c>, q0.c> interfaceC0422b = SPARSE_VALUES_ADAPTER;
            u0.b.a<q0.c> aVar = NODE_ADAPTER;
            Objects.requireNonNull((b) interfaceC0422b);
            int iH2 = allNodes.h();
            ArrayList arrayList = new ArrayList(iH2);
            for (int i15 = 0; i15 < iH2; i15++) {
                arrayList.add((q0.c) allNodes.f34740d[i15]);
            }
            Collections.sort(arrayList, new u0.b.c(z11, aVar));
            if (i10 == 1) {
                int size = arrayList.size();
                if (cVarD != null) {
                    size = arrayList.indexOf(cVarD);
                }
                int i16 = size - 1;
                if (i16 >= 0) {
                    obj = arrayList.get(i16);
                } else {
                    obj = null;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList.size();
                int iLastIndexOf = (cVarD == null ? -1 : arrayList.lastIndexOf(cVarD)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            cVar = (q0.c) obj;
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect3 = new Rect();
            int i17 = this.mKeyboardFocusedVirtualViewId;
            if (i17 != Integer.MIN_VALUE) {
                getBoundsInParent(i17, rect3);
            } else if (rect != null) {
                rect3.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i10, rect3);
            }
            u0.b.InterfaceC0422b<i<q0.c>, q0.c> interfaceC0422b2 = SPARSE_VALUES_ADAPTER;
            u0.b.a<q0.c> aVar2 = NODE_ADAPTER;
            Rect rect4 = new Rect(rect3);
            if (i10 != 17) {
                if (i10 == 33) {
                    iHeight = rect3.height() + 1;
                } else if (i10 == 66) {
                    iWidth = -(rect3.width() + 1);
                } else {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    iHeight = -(rect3.height() + 1);
                }
                rect4.offset(0, iHeight);
                Objects.requireNonNull((b) interfaceC0422b2);
                iH = allNodes.h();
                rect2 = new Rect();
                cVar = null;
                for (i11 = 0; i11 < iH; i11++) {
                    cVar2 = (q0.c) allNodes.f34740d[i11];
                    if (cVar2 == cVarD) {
                        ((C0421a) aVar2).a(cVar2, rect2);
                        if (u0.b.c(rect3, rect2, i10)) {
                            if (u0.b.c(rect3, rect4, i10) && !u0.b.a(i10, rect3, rect2, rect4)) {
                                if (!u0.b.a(i10, rect3, rect4, rect2)) {
                                    int iD2 = u0.b.d(i10, rect3, rect2);
                                    int iE2 = u0.b.e(i10, rect3, rect2);
                                    i12 = (iE2 * iE2) + (iD2 * 13 * iD2);
                                    iD = u0.b.d(i10, rect3, rect4);
                                    iE = u0.b.e(i10, rect3, rect4);
                                    if (i12 < (iE * iE) + (iD * 13 * iD)) {
                                    }
                                }
                                z10 = false;
                            }
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            rect4.set(rect2);
                            cVar = cVar2;
                        }
                    }
                }
            } else {
                iWidth = rect3.width() + 1;
            }
            rect4.offset(iWidth, 0);
            Objects.requireNonNull((b) interfaceC0422b2);
            iH = allNodes.h();
            rect2 = new Rect();
            cVar = null;
            while (i11 < iH) {
                cVar2 = (q0.c) allNodes.f34740d[i11];
                if (cVar2 == cVarD) {
                    ((C0421a) aVar2).a(cVar2, rect2);
                    if (u0.b.c(rect3, rect2, i10)) {
                        if (u0.b.c(rect3, rect4, i10)) {
                            if (!u0.b.a(i10, rect3, rect4, rect2)) {
                                int iD3 = u0.b.d(i10, rect3, rect2);
                                int iE3 = u0.b.e(i10, rect3, rect2);
                                i12 = (iE3 * iE3) + (iD3 * 13 * iD3);
                                iD = u0.b.d(i10, rect3, rect4);
                                iE = u0.b.e(i10, rect3, rect4);
                                if (i12 < (iE * iE) + (iD * 13 * iD)) {
                                }
                            }
                            z10 = false;
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        rect4.set(rect2);
                        cVar = cVar2;
                    }
                }
            }
        }
        q0.c cVar3 = cVar;
        if (cVar3 == null) {
            iF = Integer.MIN_VALUE;
        } else {
            Objects.requireNonNull(allNodes);
            for (int i18 = 0; i18 < allNodes.f34741e; i18++) {
                if (allNodes.f34740d[i18] == cVar3) {
                    i14 = i18;
                    break;
                }
            }
            iF = allNodes.f(i14);
        }
        return requestKeyboardFocusForVirtualView(iF);
    }

    private boolean performActionForChild(int i10, int i11, Bundle bundle) {
        if (i11 == 1) {
            return requestKeyboardFocusForVirtualView(i10);
        }
        if (i11 == 2) {
            return clearKeyboardFocusForVirtualView(i10);
        }
        if (i11 != 64) {
            return i11 != 128 ? onPerformActionForVirtualView(i10, i11, bundle) : clearAccessibilityFocus(i10);
        }
        return requestAccessibilityFocus(i10);
    }

    private boolean performActionForHost(int i10, Bundle bundle) {
        View view = this.mHost;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        return e0.d.j(view, i10, bundle);
    }

    private boolean requestAccessibilityFocus(int i10) {
        int i11;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i11 = this.mAccessibilityFocusedVirtualViewId) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i11);
        }
        this.mAccessibilityFocusedVirtualViewId = i10;
        this.mHost.invalidate();
        sendEventForVirtualView(i10, FileUtil.BUF_SIZE);
        return true;
    }

    private void updateHoveredVirtualView(int i10) {
        int i11 = this.mHoveredVirtualViewId;
        if (i11 == i10) {
            return;
        }
        this.mHoveredVirtualViewId = i10;
        sendEventForVirtualView(i10, 128);
        sendEventForVirtualView(i11, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i10) {
        if (this.mKeyboardFocusedVirtualViewId != i10) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i10, false);
        sendEventForVirtualView(i10, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            updateHoveredVirtualView(virtualViewAt);
            return virtualViewAt != Integer.MIN_VALUE;
        }
        if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
            return false;
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return moveFocus(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return moveFocus(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iKeyToDirection = keyToDirection(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z10 = false;
                    while (i10 < repeatCount && moveFocus(iKeyToDirection, null)) {
                        i10++;
                        z10 = true;
                    }
                    return z10;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        clickKeyboardFocusedVirtualView();
        return true;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // p0.a
    public q0.d getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new c();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f10, float f11);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i10) {
        invalidateVirtualView(i10, 0);
    }

    public final void invalidateVirtualView(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i10, 2048);
        q0.b.b(accessibilityEventCreateEvent, i11);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventCreateEvent);
    }

    public q0.c obtainAccessibilityNodeInfo(int i10) {
        return i10 == -1 ? createNodeForHost() : createNodeForChild(i10);
    }

    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11 = this.mKeyboardFocusedVirtualViewId;
        if (i11 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i11);
        }
        if (z10) {
            moveFocus(i10, rect);
        }
    }

    @Override // p0.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // p0.a
    public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        onPopulateNodeForHost(cVar);
    }

    public abstract boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle);

    public void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i10, AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(q0.c cVar) {
    }

    public abstract void onPopulateNodeForVirtualView(int i10, q0.c cVar);

    public void onVirtualViewKeyboardFocusChanged(int i10, boolean z10) {
    }

    public boolean performAction(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? performActionForChild(i10, i11, bundle) : performActionForHost(i11, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i10) {
        int i11;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i11 = this.mKeyboardFocusedVirtualViewId) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i10;
        onVirtualViewKeyboardFocusChanged(i10, true);
        sendEventForVirtualView(i10, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i10, i11));
    }
}
