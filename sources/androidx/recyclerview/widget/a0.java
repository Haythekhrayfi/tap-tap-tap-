package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends p0.a {
    private final a mItemDelegate;
    public final RecyclerView mRecyclerView;

    public static class a extends p0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f2582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<View, p0.a> f2583b = new WeakHashMap();

        public a(a0 a0Var) {
            this.f2582a = a0Var;
        }

        @Override // p0.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            p0.a aVar = this.f2583b.get(view);
            return aVar != null ? aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // p0.a
        public q0.d getAccessibilityNodeProvider(View view) {
            p0.a aVar = this.f2583b.get(view);
            return aVar != null ? aVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // p0.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            p0.a aVar = this.f2583b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p0.a
        public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
            if (!this.f2582a.shouldIgnore() && this.f2582a.mRecyclerView.getLayoutManager() != null) {
                this.f2582a.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, cVar);
                p0.a aVar = this.f2583b.get(view);
                if (aVar != null) {
                    aVar.onInitializeAccessibilityNodeInfo(view, cVar);
                    return;
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, cVar);
        }

        @Override // p0.a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            p0.a aVar = this.f2583b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p0.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            p0.a aVar = this.f2583b.get(viewGroup);
            return aVar != null ? aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // p0.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (this.f2582a.shouldIgnore() || this.f2582a.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            p0.a aVar = this.f2583b.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i10, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            return this.f2582a.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i10, bundle);
        }

        @Override // p0.a
        public void sendAccessibilityEvent(View view, int i10) {
            p0.a aVar = this.f2583b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i10);
            } else {
                super.sendAccessibilityEvent(view, i10);
            }
        }

        @Override // p0.a
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            p0.a aVar = this.f2583b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public a0(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        p0.a itemDelegate = getItemDelegate();
        this.mItemDelegate = (itemDelegate == null || !(itemDelegate instanceof a)) ? new a(this) : (a) itemDelegate;
    }

    public p0.a getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // p0.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // p0.a
    public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(cVar);
    }

    @Override // p0.a
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i10, bundle);
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
