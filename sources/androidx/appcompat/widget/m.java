package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0.f f1300b;

    public m(TextView textView) {
        this.f1299a = textView;
        this.f1300b = new z0.f(textView, false);
    }

    public boolean a() {
        return this.f1300b.f44989a.b();
    }

    public void b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f1299a.getContext().obtainStyledAttributes(attributeSet, d.a.f28467i, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void c(boolean z10) {
        this.f1300b.f44989a.d(z10);
    }
}
