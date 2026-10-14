package p0;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends e0.b<CharSequence> {
    public b0(int i10, Class cls, int i11, int i12) {
        super(i10, cls, i11, i12);
    }

    @Override // p0.e0.b
    public CharSequence b(View view) {
        return e0.m.b(view);
    }

    @Override // p0.e0.b
    public void c(View view, CharSequence charSequence) {
        e0.m.h(view, charSequence);
    }

    @Override // p0.e0.b
    public boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
