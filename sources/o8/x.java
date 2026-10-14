package o8;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements m9.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34142b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f34143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f34144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34145e;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    public x(int i10) {
        this.f34141a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    @Override // m9.h
    public boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        j0.i(motionEvent, "event");
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            return false;
        }
        if (this.f34142b == -1) {
            this.f34142b = ViewConfiguration.get(viewGroup.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 1;
        if (actionMasked == 0) {
            this.f34143c = motionEvent.getX();
            this.f34144d = motionEvent.getY();
            this.f34145e = 0;
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1) {
            parent.requestDisallowInterceptTouchEvent(false);
        } else if (actionMasked == 2) {
            if (this.f34145e == 0) {
                float fAbs = Math.abs(this.f34143c - motionEvent.getX());
                float fAbs2 = Math.abs(this.f34144d - motionEvent.getY());
                float f10 = this.f34142b;
                if (fAbs < f10 && fAbs2 < f10) {
                    i10 = 0;
                } else if (fAbs <= fAbs2) {
                    i10 = 2;
                }
                this.f34145e = i10;
            }
            int i11 = this.f34145e;
            if (i11 != 0 && (i11 & this.f34141a) == 0) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        } else if (actionMasked == 3) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
