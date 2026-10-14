package k9;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f31941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f31945e;

    public g(View view) {
        float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f31941a = view;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.i.t(view, true);
        this.f31943c = scaledTouchSlop;
    }

    public void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f31944d = motionEvent.getX();
            this.f31945e = motionEvent.getY();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.f31944d);
                float fAbs2 = Math.abs(motionEvent.getY() - this.f31945e);
                if (this.f31942b || fAbs < this.f31943c || fAbs <= fAbs2) {
                    return;
                }
                this.f31942b = true;
                View view = this.f31941a;
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.i.y(view, 1);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.f31942b = false;
        View view2 = this.f31941a;
        WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
        e0.i.z(view2);
    }

    public g(ViewPager viewPager) {
        float scaledTouchSlop = ViewConfiguration.get(viewPager.getContext()).getScaledTouchSlop();
        this.f31941a = viewPager;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.i.t(viewPager, true);
        this.f31943c = scaledTouchSlop;
    }
}
