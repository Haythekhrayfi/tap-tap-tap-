package m9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import fd.j0;
import vc.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f33326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f33327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33331h;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    public d(int i10, int i11) {
        super(i10, i11);
        this.f33324a = 51;
        this.f33328e = 1;
        this.f33329f = 1;
        this.f33330g = Integer.MAX_VALUE;
        this.f33331h = Integer.MAX_VALUE;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33324a = 51;
        this.f33328e = 1;
        this.f33329f = 1;
        this.f33330g = Integer.MAX_VALUE;
        this.f33331h = Integer.MAX_VALUE;
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f33324a = 51;
        this.f33328e = 1;
        this.f33329f = 1;
        this.f33330g = Integer.MAX_VALUE;
        this.f33331h = Integer.MAX_VALUE;
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f33324a = 51;
        this.f33328e = 1;
        this.f33329f = 1;
        this.f33330g = Integer.MAX_VALUE;
        this.f33331h = Integer.MAX_VALUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        j0.i(dVar, "source");
        this.f33324a = 51;
        this.f33328e = 1;
        this.f33329f = 1;
        this.f33330g = Integer.MAX_VALUE;
        this.f33331h = Integer.MAX_VALUE;
        this.f33324a = dVar.f33324a;
        this.f33325b = dVar.f33325b;
        this.f33326c = dVar.f33326c;
        this.f33327d = dVar.f33327d;
        this.f33328e = dVar.f33328e;
        this.f33329f = dVar.f33329f;
        this.f33330g = dVar.f33330g;
        this.f33331h = dVar.f33331h;
    }

    public final int a() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin + ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final int b() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin + ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j0.d(b0.a(d.class), b0.a(obj.getClass()))) {
            return false;
        }
        d dVar = (d) obj;
        if (((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) dVar).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) dVar).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) dVar).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) dVar).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) dVar).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) dVar).bottomMargin && this.f33324a == dVar.f33324a && this.f33325b == dVar.f33325b && this.f33328e == dVar.f33328e && this.f33329f == dVar.f33329f) {
            if (this.f33326c == dVar.f33326c) {
                if ((this.f33327d == dVar.f33327d) && this.f33330g == dVar.f33330g && this.f33331h == dVar.f33331h) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.f33327d) + ((Float.floatToIntBits(this.f33326c) + (((((((((super.hashCode() * 31) + this.f33324a) * 31) + (this.f33325b ? 1 : 0)) * 31) + this.f33328e) * 31) + this.f33329f) * 31)) * 31)) * 31;
        int i10 = this.f33330g;
        if (i10 == Integer.MAX_VALUE) {
            i10 = 0;
        }
        int i11 = (iFloatToIntBits + i10) * 31;
        int i12 = this.f33331h;
        return i11 + (i12 != Integer.MAX_VALUE ? i12 : 0);
    }
}
