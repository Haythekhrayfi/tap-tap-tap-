package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0023a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f657a;

        public C0023a(int i10) {
            this(-2, -1, i10);
        }

        public C0023a(int i10, int i11) {
            super(i10, i11);
            this.f657a = 0;
            this.f657a = 8388627;
        }

        public C0023a(int i10, int i11, int i12) {
            super(i10, i11);
            this.f657a = 0;
            this.f657a = i12;
        }

        public C0023a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f657a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f28460b);
            this.f657a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0023a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f657a = 0;
        }

        public C0023a(C0023a c0023a) {
            super((ViewGroup.MarginLayoutParams) c0023a);
            this.f657a = 0;
            this.f657a = c0023a.f657a;
        }
    }

    public interface b {
        void a(boolean z10);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public void c(boolean z10) {
    }

    public abstract int d();

    public Context e() {
        return null;
    }

    public abstract void f();

    public boolean g() {
        return false;
    }

    public void h(Configuration configuration) {
    }

    public void i() {
    }

    public boolean j(int i10, KeyEvent keyEvent) {
        return false;
    }

    public boolean k(KeyEvent keyEvent) {
        return false;
    }

    public boolean l() {
        return false;
    }

    public abstract void m(Drawable drawable);

    public void n(boolean z10) {
    }

    public abstract void o(boolean z10);

    public void p(boolean z10) {
    }

    public abstract void q(CharSequence charSequence);

    public void r(CharSequence charSequence) {
    }

    public i.a s(i.a.InterfaceC0307a interfaceC0307a) {
        return null;
    }
}
