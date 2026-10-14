package t9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class l extends ViewPager {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final k9.g f35826j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public u0.c f35827k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f35828l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f35829m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f35830n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f35831o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Set<Integer> f35832p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public m9.h f35833q0;

    public class a extends u0.c.AbstractC0423c {
        public a() {
        }

        @Override // u0.c.AbstractC0423c
        public void onEdgeDragStarted(int i10, int i11) {
            super.onEdgeDragStarted(i10, i11);
            l lVar = l.this;
            boolean z10 = true;
            if ((i10 & 2) == 0 && (i10 & 1) == 0) {
                z10 = false;
            }
            lVar.f35830n0 = z10;
        }

        @Override // u0.c.AbstractC0423c
        public boolean tryCaptureView(View view, int i10) {
            return false;
        }
    }

    public l(Context context) {
        this(context, null);
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35826j0 = new k9.g((ViewPager) this);
        this.f35828l0 = true;
        this.f35829m0 = true;
        this.f35830n0 = false;
        this.f35831o0 = false;
    }

    public final boolean C(MotionEvent motionEvent) {
        if (!this.f35829m0 && this.f35827k0 != null) {
            if ((motionEvent.getAction() & 255) == 0) {
                this.f35830n0 = false;
            }
            this.f35827k0.p(motionEvent);
        }
        Set<Integer> set = this.f35832p0;
        if (set != null) {
            this.f35831o0 = this.f35828l0 && set.contains(Integer.valueOf(getCurrentItem()));
        }
        return (this.f35830n0 || this.f35831o0 || !this.f35828l0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f35826j0.a(motionEvent);
        return zDispatchTouchEvent;
    }

    public m9.h getOnInterceptTouchEventListener() {
        return this.f35833q0;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m9.h hVar = this.f35833q0;
        return (hVar != null ? hVar.a(this, motionEvent) : false) || (C(motionEvent) && super.onInterceptTouchEvent(motionEvent));
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        this.f35826j0.f31942b = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return C(motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setDisabledScrollPages(Set<Integer> set) {
        this.f35832p0 = set;
    }

    public void setEdgeScrollEnabled(boolean z10) {
        this.f35829m0 = z10;
        if (z10) {
            return;
        }
        u0.c cVar = new u0.c(getContext(), this, new a());
        this.f35827k0 = cVar;
        cVar.f35938q = 3;
    }

    public void setOnInterceptTouchEventListener(m9.h hVar) {
        this.f35833q0 = hVar;
    }

    public void setScrollEnabled(boolean z10) {
        this.f35828l0 = z10;
    }
}
