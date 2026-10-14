package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public class q implements Spannable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1841c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spannable f1842d;

    public static class a {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof n0.d;
        }
    }

    public static class b extends a {
        @Override // androidx.emoji2.text.q.a
        public boolean a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof n0.d);
        }
    }

    public q(Spannable spannable) {
        this.f1842d = spannable;
    }

    public q(CharSequence charSequence) {
        this.f1842d = new SpannableString(charSequence);
    }

    public final void a() {
        Spannable spannable = this.f1842d;
        if (!this.f1841c) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).a(spannable)) {
                this.f1842d = new SpannableString(spannable);
            }
        }
        this.f1841c = true;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f1842d.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return this.f1842d.chars();
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return this.f1842d.codePoints();
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f1842d.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f1842d.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f1842d.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f1842d.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f1842d.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f1842d.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f1842d.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f1842d.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f1842d.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f1842d.toString();
    }
}
