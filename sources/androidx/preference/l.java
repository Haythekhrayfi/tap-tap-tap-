package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class l extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f2386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0.a f2387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0.a f2388c;

    public class a extends p0.a {
        public a() {
        }

        @Override // p0.a
        public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
            l.this.f2387b.onInitializeAccessibilityNodeInfo(view, cVar);
            int childAdapterPosition = l.this.f2386a.getChildAdapterPosition(view);
            RecyclerView.g adapter = l.this.f2386a.getAdapter();
            if (adapter instanceof h) {
                ((h) adapter).f(childAdapterPosition);
            }
        }

        @Override // p0.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return l.this.f2387b.performAccessibilityAction(view, i10, bundle);
        }
    }

    public l(RecyclerView recyclerView) {
        super(recyclerView);
        this.f2387b = super.getItemDelegate();
        this.f2388c = new a();
        this.f2386a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.a0
    public p0.a getItemDelegate() {
        return this.f2388c;
    }
}
