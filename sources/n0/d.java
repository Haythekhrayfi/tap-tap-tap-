package n0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public class d implements Spannable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f33591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f33592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f33593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f33594d;

        /* JADX INFO: renamed from: n0.d$a$a, reason: collision with other inner class name */
        public static class C0367a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextPaint f33595a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f33597c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f33598d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f33596b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0367a(TextPaint textPaint) {
                this.f33595a = textPaint;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f33591a = params.getTextPaint();
            this.f33592b = params.getTextDirection();
            this.f33593c = params.getBreakStrategy();
            this.f33594d = params.getHyphenationFrequency();
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f33591a = textPaint;
            this.f33592b = textDirectionHeuristic;
            this.f33593c = i10;
            this.f33594d = i11;
        }

        public boolean a(a aVar) {
            if (this.f33593c != aVar.f33593c || this.f33594d != aVar.f33594d || this.f33591a.getTextSize() != aVar.f33591a.getTextSize() || this.f33591a.getTextScaleX() != aVar.f33591a.getTextScaleX() || this.f33591a.getTextSkewX() != aVar.f33591a.getTextSkewX() || this.f33591a.getLetterSpacing() != aVar.f33591a.getLetterSpacing() || !TextUtils.equals(this.f33591a.getFontFeatureSettings(), aVar.f33591a.getFontFeatureSettings()) || this.f33591a.getFlags() != aVar.f33591a.getFlags() || !this.f33591a.getTextLocales().equals(aVar.f33591a.getTextLocales())) {
                return false;
            }
            if (this.f33591a.getTypeface() == null) {
                return aVar.f33591a.getTypeface() == null;
            }
            return this.f33591a.getTypeface().equals(aVar.f33591a.getTypeface());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f33592b == aVar.f33592b;
        }

        public int hashCode() {
            return o0.b.b(Float.valueOf(this.f33591a.getTextSize()), Float.valueOf(this.f33591a.getTextScaleX()), Float.valueOf(this.f33591a.getTextSkewX()), Float.valueOf(this.f33591a.getLetterSpacing()), Integer.valueOf(this.f33591a.getFlags()), this.f33591a.getTextLocales(), this.f33591a.getTypeface(), Boolean.valueOf(this.f33591a.isElegantTextHeight()), this.f33592b, Integer.valueOf(this.f33593c), Integer.valueOf(this.f33594d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sbA = defpackage.a.a("textSize=");
            sbA.append(this.f33591a.getTextSize());
            sb2.append(sbA.toString());
            sb2.append(", textScaleX=" + this.f33591a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f33591a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            StringBuilder sbA2 = defpackage.a.a(", letterSpacing=");
            sbA2.append(this.f33591a.getLetterSpacing());
            sb2.append(sbA2.toString());
            sb2.append(", elegantTextHeight=" + this.f33591a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f33591a.getTextLocales());
            sb2.append(", typeface=" + this.f33591a.getTypeface());
            if (i10 >= 26) {
                StringBuilder sbA3 = defpackage.a.a(", variationSettings=");
                sbA3.append(this.f33591a.getFontVariationSettings());
                sb2.append(sbA3.toString());
            }
            StringBuilder sbA4 = defpackage.a.a(", textDir=");
            sbA4.append(this.f33592b);
            sb2.append(sbA4.toString());
            sb2.append(", breakStrategy=" + this.f33593c);
            sb2.append(", hyphenationFrequency=" + this.f33594d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        int i12 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        int i10 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        int i13 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw null;
    }
}
