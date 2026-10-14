package i8;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0.a f31303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.p<View, q0.c, jc.w> f31304b;

    /* JADX INFO: renamed from: i8.a$a, reason: collision with other inner class name */
    public static final class C0310a extends vc.l implements uc.p<View, q0.c, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0310a f31305c = new C0310a();

        public C0310a() {
            super(2);
        }

        @Override // uc.p
        public /* bridge */ /* synthetic */ jc.w invoke(View view, q0.c cVar) {
            return jc.w.f31842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(p0.a aVar, uc.p<? super View, ? super q0.c, jc.w> pVar) {
        fd.j0.i(pVar, "initializeAccessibilityNodeInfo");
        this.f31303a = aVar;
        this.f31304b = pVar;
    }

    public /* synthetic */ a(p0.a aVar, uc.p pVar, int i10, vc.g gVar) {
        this(aVar, (i10 & 2) != 0 ? C0310a.f31305c : pVar);
    }

    @Override // p0.a
    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        p0.a aVar = this.f31303a;
        Boolean boolValueOf = aVar == null ? null : Boolean.valueOf(aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent));
        return boolValueOf == null ? super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : boolValueOf.booleanValue();
    }

    @Override // p0.a
    public q0.d getAccessibilityNodeProvider(View view) {
        p0.a aVar = this.f31303a;
        q0.d accessibilityNodeProvider = aVar == null ? null : aVar.getAccessibilityNodeProvider(view);
        return accessibilityNodeProvider == null ? super.getAccessibilityNodeProvider(view) : accessibilityNodeProvider;
    }

    @Override // p0.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        jc.w wVar;
        p0.a aVar = this.f31303a;
        if (aVar == null) {
            wVar = null;
        } else {
            aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            wVar = jc.w.f31842a;
        }
        if (wVar == null) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // p0.a
    public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
        jc.w wVar;
        p0.a aVar = this.f31303a;
        if (aVar == null) {
            wVar = null;
        } else {
            aVar.onInitializeAccessibilityNodeInfo(view, cVar);
            wVar = jc.w.f31842a;
        }
        if (wVar == null) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
        }
        this.f31304b.invoke(view, cVar);
    }

    @Override // p0.a
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        jc.w wVar;
        p0.a aVar = this.f31303a;
        if (aVar == null) {
            wVar = null;
        } else {
            aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            wVar = jc.w.f31842a;
        }
        if (wVar == null) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // p0.a
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        p0.a aVar = this.f31303a;
        Boolean boolValueOf = aVar == null ? null : Boolean.valueOf(aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent));
        return boolValueOf == null ? super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : boolValueOf.booleanValue();
    }

    @Override // p0.a
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        p0.a aVar = this.f31303a;
        Boolean boolValueOf = aVar == null ? null : Boolean.valueOf(aVar.performAccessibilityAction(view, i10, bundle));
        return boolValueOf == null ? super.performAccessibilityAction(view, i10, bundle) : boolValueOf.booleanValue();
    }

    @Override // p0.a
    public void sendAccessibilityEvent(View view, int i10) {
        jc.w wVar;
        p0.a aVar = this.f31303a;
        if (aVar == null) {
            wVar = null;
        } else {
            aVar.sendAccessibilityEvent(view, i10);
            wVar = jc.w.f31842a;
        }
        if (wVar == null) {
            super.sendAccessibilityEvent(view, i10);
        }
    }

    @Override // p0.a
    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        jc.w wVar;
        p0.a aVar = this.f31303a;
        if (aVar == null) {
            wVar = null;
        } else {
            aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            wVar = jc.w.f31842a;
        }
        if (wVar == null) {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
