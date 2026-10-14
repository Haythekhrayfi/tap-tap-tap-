package l8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.div.core.view2.divs.DivBackgroundSpan;
import com.yandex.div.internal.spannable.NoStrikethroughSpan;
import com.yandex.div.internal.spannable.NoUnderlineSpan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import y9.l7;
import y9.m7;

/* JADX INFO: loaded from: classes2.dex */
public final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f32591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i8.e0 f32592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z7.d f32593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32594d;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i8.k f32595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f32596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v9.d f32597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f32598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f32599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final y9.p2 f32600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<l7.n> f32601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<y9.q> f32602h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Context f32603i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final DisplayMetrics f32604j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SpannableStringBuilder f32605k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List<l7.m> f32606l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public uc.l<? super CharSequence, jc.w> f32607m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ m5 f32608n;

        /* JADX INFO: renamed from: l8.m5$a$a, reason: collision with other inner class name */
        public final class C0340a extends ClickableSpan {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List<y9.q> f32609c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f32610d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0340a(a aVar, List<? extends y9.q> list) {
                fd.j0.i(aVar, "this$0");
                fd.j0.i(list, "actions");
                this.f32610d = aVar;
                this.f32609c = list;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Object next;
                List<y9.q.d> list;
                fd.j0.i(view, "p0");
                j jVar = ((r7.a.b) this.f32610d.f32595a.getDiv2Component$div_release()).K.get();
                fd.j0.h(jVar, "divView.div2Component.actionBinder");
                i8.k kVar = this.f32610d.f32595a;
                List<y9.q> list2 = this.f32609c;
                fd.j0.i(kVar, "divView");
                fd.j0.i(list2, "actions");
                Iterator<T> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        list = ((y9.q) next).f42098c;
                    }
                } while (!(!(list == null || list.isEmpty())));
                y9.q qVar = (y9.q) next;
                if (qVar == null) {
                    jVar.c(kVar, view, list2, "click");
                    return;
                }
                List<y9.q.d> list3 = qVar.f42098c;
                if (list3 == null) {
                    int i10 = e9.a.f29114a;
                    return;
                }
                q9.b bVar = new q9.b(view.getContext(), view, kVar);
                bVar.f34850d = new j.a(jVar, kVar, list3);
                kVar.s();
                kVar.C(new n(bVar));
                jVar.f32461b.j(kVar, view, qVar);
                jVar.f32462c.a(qVar, kVar.getExpressionResolver());
                new y6.d(bVar).onClick(view);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                fd.j0.i(textPaint, "ds");
            }
        }

        public final class b extends p7.p0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f32611a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f32612b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, int i10) {
                super(aVar.f32595a);
                fd.j0.i(aVar, "this$0");
                this.f32612b = aVar;
                this.f32611a = i10;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0096  */
            @Override // z7.c
            public void b(z7.b bVar) {
                float fDescent;
                int i10;
                float size;
                l7.m mVar = this.f32612b.f32606l.get(this.f32611a);
                a aVar = this.f32612b;
                SpannableStringBuilder spannableStringBuilder = aVar.f32605k;
                Bitmap bitmap = bVar.f45158a;
                fd.j0.h(bitmap, "cachedBitmap.bitmap");
                y9.l2 l2Var = mVar.f41323a;
                DisplayMetrics displayMetrics = aVar.f32604j;
                fd.j0.h(displayMetrics, "metrics");
                int iY = l8.b.Y(l2Var, displayMetrics, aVar.f32597c);
                int i11 = 0;
                int i12 = Integer.MAX_VALUE;
                if (spannableStringBuilder.length() == 0) {
                    fDescent = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                } else {
                    long jLongValue = mVar.f41324b.b(aVar.f32597c).longValue();
                    long j10 = jLongValue >> 31;
                    if (j10 == 0 || j10 == -1) {
                        i10 = (int) jLongValue;
                    } else {
                        int i13 = e9.a.f29114a;
                        i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    int i14 = i10 == 0 ? 0 : i10 - 1;
                    AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(i14, i14 + 1, AbsoluteSizeSpan.class);
                    TextPaint paint = aVar.f32596b.getPaint();
                    if (absoluteSizeSpanArr == null) {
                        size = 1.0f;
                    } else {
                        if (true ^ (absoluteSizeSpanArr.length == 0)) {
                            size = absoluteSizeSpanArr[0].getSize() / aVar.f32596b.getTextSize();
                        } else {
                            size = 1.0f;
                        }
                    }
                    float f10 = 2;
                    fDescent = (((paint.descent() + paint.ascent()) / f10) * size) - ((-iY) / f10);
                }
                Context context = aVar.f32603i;
                fd.j0.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                y9.l2 l2Var2 = mVar.f41328f;
                DisplayMetrics displayMetrics2 = aVar.f32604j;
                fd.j0.h(displayMetrics2, "metrics");
                int iY2 = l8.b.Y(l2Var2, displayMetrics2, aVar.f32597c);
                v9.b<Integer> bVar2 = mVar.f41325c;
                com.yandex.div.internal.spannable.a aVar2 = new com.yandex.div.internal.spannable.a(context, bitmap, fDescent, iY2, iY, bVar2 == null ? null : bVar2.b(aVar.f32597c), l8.b.W(mVar.f41326d.b(aVar.f32597c)), false, com.yandex.div.internal.spannable.a.EnumC0169a.BASELINE);
                long jLongValue2 = mVar.f41324b.b(this.f32612b.f32597c).longValue();
                long j11 = jLongValue2 >> 31;
                if (j11 == 0 || j11 == -1) {
                    i12 = (int) jLongValue2;
                } else {
                    int i15 = e9.a.f29114a;
                    if (jLongValue2 <= 0) {
                        i12 = Integer.MIN_VALUE;
                    }
                }
                int i16 = i12 + this.f32611a;
                int i17 = i16 + 1;
                Object[] spans = this.f32612b.f32605k.getSpans(i16, i17, i9.a.class);
                fd.j0.h(spans, "getSpans(start, end, T::class.java)");
                a aVar3 = this.f32612b;
                int length = spans.length;
                while (i11 < length) {
                    Object obj = spans[i11];
                    i11++;
                    aVar3.f32605k.removeSpan((i9.a) obj);
                }
                this.f32612b.f32605k.setSpan(aVar2, i16, i17, 18);
                a aVar4 = this.f32612b;
                uc.l<? super CharSequence, jc.w> lVar = aVar4.f32607m;
                if (lVar == null) {
                    return;
                }
                lVar.invoke(aVar4.f32605k);
            }
        }

        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f32613a;

            static {
                int[] iArr = new int[y9.f4.values().length];
                iArr[y9.f4.SINGLE.ordinal()] = 1;
                iArr[y9.f4.NONE.ordinal()] = 2;
                f32613a = iArr;
            }
        }

        public static final class d<T> implements Comparator {
            public d() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return lc.a.a(((l7.m) t10).f41324b.b(a.this.f32597c), ((l7.m) t11).f41324b.b(a.this.f32597c));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(m5 m5Var, i8.k kVar, TextView textView, v9.d dVar, String str, long j10, y9.p2 p2Var, List<? extends l7.n> list, List<? extends y9.q> list2, List<? extends l7.m> list3) {
            List<l7.m> listC;
            fd.j0.i(m5Var, "this$0");
            fd.j0.i(kVar, "divView");
            fd.j0.i(textView, "textView");
            fd.j0.i(dVar, "resolver");
            fd.j0.i(str, "text");
            fd.j0.i(p2Var, "fontFamily");
            this.f32608n = m5Var;
            this.f32595a = kVar;
            this.f32596b = textView;
            this.f32597c = dVar;
            this.f32598d = str;
            this.f32599e = j10;
            this.f32600f = p2Var;
            this.f32601g = list;
            this.f32602h = list2;
            this.f32603i = kVar.getContext();
            this.f32604j = kVar.getResources().getDisplayMetrics();
            this.f32605k = new SpannableStringBuilder(str);
            if (list3 == null) {
                listC = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (((l7.m) obj).f41324b.b(this.f32597c).longValue() <= ((long) this.f32598d.length())) {
                        arrayList.add(obj);
                    }
                }
                listC = kc.t.C(arrayList, new d());
            }
            this.f32606l = listC == null ? kc.w.f32009c : listC;
        }

        /* JADX WARN: Code duplicated, block: B:152:0x0256  */
        /* JADX WARN: Code duplicated, block: B:155:0x0264  */
        public final void a() {
            int i10;
            float fDescent;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            boolean z10;
            h8.b textRoundedBgHelper$div_release;
            Object underlineSpan;
            Object strikethroughSpan;
            Double dB;
            Integer numB;
            Long lB;
            h8.b textRoundedBgHelper$div_release2;
            List<l7.n> list = this.f32601g;
            if (list == null || list.isEmpty()) {
                List<l7.m> list2 = this.f32606l;
                if (list2 == null || list2.isEmpty()) {
                    uc.l<? super CharSequence, jc.w> lVar = this.f32607m;
                    if (lVar == null) {
                        return;
                    }
                    lVar.invoke(this.f32598d);
                    return;
                }
            }
            TextView textView = this.f32596b;
            if ((textView instanceof o8.i) && (textRoundedBgHelper$div_release2 = ((o8.i) textView).getTextRoundedBgHelper$div_release()) != null) {
                textRoundedBgHelper$div_release2.f30961c.clear();
            }
            List<l7.n> list3 = this.f32601g;
            long j10 = -1;
            long j11 = 0;
            if (list3 != null) {
                for (l7.n nVar : list3) {
                    SpannableStringBuilder spannableStringBuilder = this.f32605k;
                    long jLongValue = nVar.f41352j.b(this.f32597c).longValue();
                    long j12 = jLongValue >> 31;
                    if (j12 == j11 || j12 == j10) {
                        i14 = (int) jLongValue;
                    } else {
                        int i16 = e9.a.f29114a;
                        i14 = jLongValue > j11 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    int length = this.f32598d.length();
                    if (i14 > length) {
                        i14 = length;
                    }
                    long jLongValue2 = nVar.f41346d.b(this.f32597c).longValue();
                    long j13 = jLongValue2 >> 31;
                    if (j13 == j11 || j13 == j10) {
                        i15 = (int) jLongValue2;
                    } else {
                        int i17 = e9.a.f29114a;
                        i15 = jLongValue2 > j11 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    int length2 = this.f32598d.length();
                    if (i15 > length2) {
                        i15 = length2;
                    }
                    if (i14 <= i15) {
                        v9.b<Long> bVar = nVar.f41347e;
                        if (bVar != null && (lB = bVar.b(this.f32597c)) != null) {
                            Long lValueOf = Long.valueOf(lB.longValue());
                            DisplayMetrics displayMetrics = this.f32604j;
                            fd.j0.h(displayMetrics, "metrics");
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(l8.b.c0(lValueOf, displayMetrics, nVar.f41348f.b(this.f32597c))), i14, i15, 18);
                        }
                        v9.b<Integer> bVar2 = nVar.f41354l;
                        if (bVar2 != null && (numB = bVar2.b(this.f32597c)) != null) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(numB.intValue()), i14, i15, 18);
                        }
                        v9.b<Double> bVar3 = nVar.f41350h;
                        if (bVar3 != null && (dB = bVar3.b(this.f32597c)) != null) {
                            double dDoubleValue = dB.doubleValue();
                            v9.b<Long> bVar4 = nVar.f41347e;
                            Long lB2 = bVar4 == null ? null : bVar4.b(this.f32597c);
                            spannableStringBuilder.setSpan(new i9.b(((float) dDoubleValue) / (lB2 == null ? this.f32599e : lB2.longValue())), i14, i15, 18);
                        }
                        v9.b<y9.f4> bVar5 = nVar.f41353k;
                        if (bVar5 != null) {
                            int i18 = c.f32613a[bVar5.b(this.f32597c).ordinal()];
                            if (i18 == 1) {
                                strikethroughSpan = new StrikethroughSpan();
                            } else if (i18 == 2) {
                                strikethroughSpan = new NoStrikethroughSpan();
                            }
                            spannableStringBuilder.setSpan(strikethroughSpan, i14, i15, 18);
                        }
                        v9.b<y9.f4> bVar6 = nVar.f41356n;
                        if (bVar6 != null) {
                            int i19 = c.f32613a[bVar6.b(this.f32597c).ordinal()];
                            if (i19 == 1) {
                                underlineSpan = new UnderlineSpan();
                            } else if (i19 == 2) {
                                underlineSpan = new NoUnderlineSpan();
                            }
                            spannableStringBuilder.setSpan(underlineSpan, i14, i15, 18);
                        }
                        v9.b<y9.q2> bVar7 = nVar.f41349g;
                        if (bVar7 != null) {
                            spannableStringBuilder.setSpan(new i9.c(this.f32608n.f32592b.a(this.f32600f, bVar7.b(this.f32597c))), i14, i15, 18);
                        }
                        List<y9.q> list4 = nVar.f41343a;
                        if (list4 != null) {
                            this.f32596b.setMovementMethod(LinkMovementMethod.getInstance());
                            spannableStringBuilder.setSpan(new C0340a(this, list4), i14, i15, 18);
                        }
                        if (nVar.f41345c != null || nVar.f41344b != null) {
                            DivBackgroundSpan divBackgroundSpan = new DivBackgroundSpan(nVar.f41345c, nVar.f41344b);
                            TextView textView2 = this.f32596b;
                            if (textView2 instanceof o8.i) {
                                o8.i iVar = (o8.i) textView2;
                                if (iVar.getTextRoundedBgHelper$div_release() == null) {
                                    iVar.setTextRoundedBgHelper$div_release(new h8.b(iVar, this.f32597c));
                                } else {
                                    h8.b textRoundedBgHelper$div_release3 = iVar.getTextRoundedBgHelper$div_release();
                                    fd.j0.f(textRoundedBgHelper$div_release3);
                                    fd.j0.i(spannableStringBuilder, "spannable");
                                    fd.j0.i(divBackgroundSpan, "backgroundSpan");
                                    ArrayList<DivBackgroundSpan> arrayList = textRoundedBgHelper$div_release3.f30961c;
                                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                                        Iterator<T> it = arrayList.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                DivBackgroundSpan divBackgroundSpan2 = (DivBackgroundSpan) it.next();
                                                if (fd.j0.d(divBackgroundSpan2.f13419c, divBackgroundSpan.f13419c) && fd.j0.d(divBackgroundSpan2.f13420d, divBackgroundSpan.f13420d) && i15 == spannableStringBuilder.getSpanEnd(divBackgroundSpan2) && i14 == spannableStringBuilder.getSpanStart(divBackgroundSpan2)) {
                                                    z10 = true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (!z10) {
                                        spannableStringBuilder.setSpan(divBackgroundSpan, i14, i15, 18);
                                        textRoundedBgHelper$div_release = ((o8.i) this.f32596b).getTextRoundedBgHelper$div_release();
                                        if (textRoundedBgHelper$div_release != null) {
                                            fd.j0.i(divBackgroundSpan, "span");
                                            textRoundedBgHelper$div_release.f30961c.add(divBackgroundSpan);
                                        }
                                    }
                                }
                                z10 = false;
                                if (!z10) {
                                    spannableStringBuilder.setSpan(divBackgroundSpan, i14, i15, 18);
                                    textRoundedBgHelper$div_release = ((o8.i) this.f32596b).getTextRoundedBgHelper$div_release();
                                    if (textRoundedBgHelper$div_release != null) {
                                        fd.j0.i(divBackgroundSpan, "span");
                                        textRoundedBgHelper$div_release.f30961c.add(divBackgroundSpan);
                                    }
                                }
                            }
                        }
                        if (nVar.f41351i != null || nVar.f41355m != null) {
                            v9.b<Long> bVar8 = nVar.f41355m;
                            Long lB3 = bVar8 == null ? null : bVar8.b(this.f32597c);
                            DisplayMetrics displayMetrics2 = this.f32604j;
                            fd.j0.h(displayMetrics2, "metrics");
                            int iC0 = l8.b.c0(lB3, displayMetrics2, nVar.f41348f.b(this.f32597c));
                            v9.b<Long> bVar9 = nVar.f41351i;
                            Long lB4 = bVar9 == null ? null : bVar9.b(this.f32597c);
                            DisplayMetrics displayMetrics3 = this.f32604j;
                            fd.j0.h(displayMetrics3, "metrics");
                            spannableStringBuilder.setSpan(new s8.a(iC0, l8.b.c0(lB4, displayMetrics3, nVar.f41348f.b(this.f32597c))), i14, i15, 18);
                        }
                    }
                    j10 = -1;
                    j11 = 0;
                }
            }
            for (l7.m mVar : kc.t.B(this.f32606l)) {
                SpannableStringBuilder spannableStringBuilder2 = this.f32605k;
                long jLongValue3 = mVar.f41324b.b(this.f32597c).longValue();
                long j14 = jLongValue3 >> 31;
                if (j14 == 0 || j14 == -1) {
                    i13 = (int) jLongValue3;
                } else {
                    int i20 = e9.a.f29114a;
                    i13 = jLongValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                spannableStringBuilder2.insert(i13, (CharSequence) "#");
            }
            int i21 = 0;
            for (Object obj : this.f32606l) {
                int i22 = i21 + 1;
                if (i21 < 0) {
                    kc.l.i();
                    throw null;
                }
                l7.m mVar2 = (l7.m) obj;
                y9.l2 l2Var = mVar2.f41328f;
                DisplayMetrics displayMetrics4 = this.f32604j;
                fd.j0.h(displayMetrics4, "metrics");
                int iY = l8.b.Y(l2Var, displayMetrics4, this.f32597c);
                y9.l2 l2Var2 = mVar2.f41323a;
                DisplayMetrics displayMetrics5 = this.f32604j;
                fd.j0.h(displayMetrics5, "metrics");
                int iY2 = l8.b.Y(l2Var2, displayMetrics5, this.f32597c);
                if (this.f32605k.length() > 0) {
                    long jLongValue4 = mVar2.f41324b.b(this.f32597c).longValue();
                    long j15 = jLongValue4 >> 31;
                    if (j15 == 0 || j15 == -1) {
                        i12 = (int) jLongValue4;
                    } else {
                        int i23 = e9.a.f29114a;
                        i12 = jLongValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    int i24 = i12 == 0 ? 0 : i12 - 1;
                    AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) this.f32605k.getSpans(i24, i24 + 1, AbsoluteSizeSpan.class);
                    TextPaint paint = this.f32596b.getPaint();
                    if (absoluteSizeSpanArr != null) {
                        float size = (absoluteSizeSpanArr.length == 0) ^ true ? absoluteSizeSpanArr[0].getSize() / this.f32596b.getTextSize() : 1.0f;
                        float f10 = 2;
                        fDescent = (((paint.descent() + paint.ascent()) / f10) * size) - ((-iY2) / f10);
                    }
                    float f11 = 2;
                    fDescent = (((paint.descent() + paint.ascent()) / f11) * size) - ((-iY2) / f11);
                } else {
                    fDescent = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                }
                i9.a aVar = new i9.a(iY, iY2, fDescent);
                long jLongValue5 = mVar2.f41324b.b(this.f32597c).longValue();
                long j16 = jLongValue5 >> 31;
                if (j16 == 0 || j16 == -1) {
                    i11 = (int) jLongValue5;
                } else {
                    int i25 = e9.a.f29114a;
                    i11 = jLongValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                int i26 = i11 + i21;
                this.f32605k.setSpan(aVar, i26, i26 + 1, 18);
                i21 = i22;
            }
            List<y9.q> list5 = this.f32602h;
            if (list5 == null) {
                i10 = 0;
            } else {
                this.f32596b.setMovementMethod(LinkMovementMethod.getInstance());
                i10 = 0;
                this.f32605k.setSpan(new C0340a(this, list5), 0, this.f32605k.length(), 18);
            }
            uc.l<? super CharSequence, jc.w> lVar2 = this.f32607m;
            if (lVar2 != null) {
                lVar2.invoke(this.f32605k);
            }
            List<l7.m> list6 = this.f32606l;
            m5 m5Var = this.f32608n;
            for (Object obj2 : list6) {
                int i27 = i10 + 1;
                if (i10 < 0) {
                    kc.l.i();
                    throw null;
                }
                z7.e eVarLoadImage = m5Var.f32593c.loadImage(((l7.m) obj2).f41327e.b(this.f32597c).toString(), new b(this, i10));
                fd.j0.h(eVarLoadImage, "imageLoader.loadImage(im…(), ImageCallback(index))");
                this.f32595a.m(eVarLoadImage, this.f32596b);
                i10 = i27;
            }
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f32616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f32617c;

        static {
            int[] iArr = new int[y9.t.values().length];
            iArr[y9.t.LEFT.ordinal()] = 1;
            iArr[y9.t.CENTER.ordinal()] = 2;
            iArr[y9.t.RIGHT.ordinal()] = 3;
            f32615a = iArr;
            int[] iArr2 = new int[y9.f4.values().length];
            iArr2[y9.f4.SINGLE.ordinal()] = 1;
            iArr2[y9.f4.NONE.ordinal()] = 2;
            f32616b = iArr2;
            int[] iArr3 = new int[y9.q5.c.values().length];
            iArr3[y9.q5.c.FARTHEST_CORNER.ordinal()] = 1;
            iArr3[y9.q5.c.NEAREST_CORNER.ordinal()] = 2;
            iArr3[y9.q5.c.FARTHEST_SIDE.ordinal()] = 3;
            iArr3[y9.q5.c.NEAREST_SIDE.ordinal()] = 4;
            f32617c = iArr3;
        }
    }

    public static final class c extends vc.l implements uc.l<CharSequence, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m9.f f32618c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m9.f fVar) {
            super(1);
            this.f32618c = fVar;
        }

        @Override // uc.l
        public jc.w invoke(CharSequence charSequence) {
            CharSequence charSequence2 = charSequence;
            fd.j0.i(charSequence2, "text");
            this.f32618c.setEllipsis(charSequence2);
            return jc.w.f31842a;
        }
    }

    public static final class d extends vc.l implements uc.l<CharSequence, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f32619c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextView textView) {
            super(1);
            this.f32619c = textView;
        }

        @Override // uc.l
        public jc.w invoke(CharSequence charSequence) {
            CharSequence charSequence2 = charSequence;
            fd.j0.i(charSequence2, "text");
            this.f32619c.setText(charSequence2, TextView.BufferType.NORMAL);
            return jc.w.f31842a;
        }
    }

    public static final class e implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f32620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m7 f32621d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v9.d f32622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m5 f32623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ DisplayMetrics f32624g;

        public e(TextView textView, m7 m7Var, v9.d dVar, m5 m5Var, DisplayMetrics displayMetrics) {
            this.f32620c = textView;
            this.f32621d = m7Var;
            this.f32622e = dVar;
            this.f32623f = m5Var;
            this.f32624g = displayMetrics;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            fd.j0.i(view, "view");
            view.removeOnLayoutChangeListener(this);
            TextPaint paint = this.f32620c.getPaint();
            m7 m7Var = this.f32621d;
            Shader shaderB = null;
            Object objA = m7Var == null ? null : m7Var.a();
            if (objA instanceof y9.g4) {
                y9.g4 g4Var = (y9.g4) objA;
                shaderB = g9.b.f30061e.a(g4Var.f40163a.b(this.f32622e).longValue(), kc.t.G(g4Var.f40164b.b(this.f32622e)), this.f32620c.getWidth(), this.f32620c.getHeight());
            } else if (objA instanceof y9.h5) {
                g9.d.b bVar = g9.d.f30072g;
                m5 m5Var = this.f32623f;
                y9.h5 h5Var = (y9.h5) objA;
                y9.m5 m5Var2 = h5Var.f40288d;
                fd.j0.h(this.f32624g, "metrics");
                g9.d.c cVarB = m5.b(m5Var, m5Var2, this.f32624g, this.f32622e);
                fd.j0.f(cVarB);
                m5 m5Var3 = this.f32623f;
                y9.i5 i5Var = h5Var.f40285a;
                fd.j0.h(this.f32624g, "metrics");
                g9.d.a aVarA = m5.a(m5Var3, i5Var, this.f32624g, this.f32622e);
                fd.j0.f(aVarA);
                m5 m5Var4 = this.f32623f;
                y9.i5 i5Var2 = h5Var.f40286b;
                fd.j0.h(this.f32624g, "metrics");
                g9.d.a aVarA2 = m5.a(m5Var4, i5Var2, this.f32624g, this.f32622e);
                fd.j0.f(aVarA2);
                shaderB = bVar.b(cVarB, aVarA, aVarA2, kc.t.G(h5Var.f40287c.b(this.f32622e)), this.f32620c.getWidth(), this.f32620c.getHeight());
            }
            paint.setShader(shaderB);
        }
    }

    public m5(v vVar, i8.e0 e0Var, z7.d dVar, boolean z10) {
        fd.j0.i(vVar, "baseBinder");
        fd.j0.i(e0Var, "typefaceResolver");
        fd.j0.i(dVar, "imageLoader");
        this.f32591a = vVar;
        this.f32592b = e0Var;
        this.f32593c = dVar;
        this.f32594d = z10;
    }

    public static final g9.d.a a(m5 m5Var, y9.i5 i5Var, DisplayMetrics displayMetrics, v9.d dVar) {
        Objects.requireNonNull(m5Var);
        Object objA = i5Var.a();
        if (objA instanceof y9.k5) {
            return new g9.d.a.C0272a(l8.b.v(((y9.k5) objA).f41101b.b(dVar), displayMetrics));
        }
        if (objA instanceof y9.o5) {
            return new g9.d.a.b((float) ((y9.o5) objA).f41823a.b(dVar).doubleValue());
        }
        return null;
    }

    public static final g9.d.c b(m5 m5Var, y9.m5 m5Var2, DisplayMetrics displayMetrics, v9.d dVar) {
        g9.d.c.b.a aVar;
        Objects.requireNonNull(m5Var);
        Object objA = m5Var2.a();
        if (objA instanceof y9.l2) {
            return new g9.d.c.a(l8.b.v(((y9.l2) objA).f41216b.b(dVar), displayMetrics));
        }
        if (!(objA instanceof y9.q5)) {
            return null;
        }
        int i10 = b.f32617c[((y9.q5) objA).f42155a.b(dVar).ordinal()];
        if (i10 == 1) {
            aVar = g9.d.c.b.a.FARTHEST_CORNER;
        } else if (i10 == 2) {
            aVar = g9.d.c.b.a.NEAREST_CORNER;
        } else if (i10 == 3) {
            aVar = g9.d.c.b.a.FARTHEST_SIDE;
        } else {
            if (i10 != 4) {
                throw new jc.g();
            }
            aVar = g9.d.c.b.a.NEAREST_SIDE;
        }
        return new g9.d.c.b(aVar);
    }

    public final void c(m9.f fVar, i8.k kVar, v9.d dVar, l7 l7Var) {
        l7.l lVar = l7Var.f41282n;
        if (lVar == null) {
            return;
        }
        a aVar = new a(this, kVar, fVar, dVar, lVar.f41314d.b(dVar), l7Var.f41287s.b(dVar).longValue(), l7Var.f41286r.b(dVar), lVar.f41313c, lVar.f41311a, lVar.f41312b);
        aVar.f32607m = new c(fVar);
        aVar.a();
    }

    public final void d(o8.i iVar, v9.d dVar, l7 l7Var) {
        int i10;
        long jLongValue = l7Var.f41287s.b(dVar).longValue();
        long j10 = jLongValue >> 31;
        if (j10 == 0 || j10 == -1) {
            i10 = (int) jLongValue;
        } else {
            int i11 = e9.a.f29114a;
            i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        l8.b.d(iVar, i10, l7Var.f41288t.b(dVar));
        l8.b.g(iVar, l7Var.f41293y.b(dVar).doubleValue(), i10);
    }

    public final void e(TextView textView, v9.d dVar, l7 l7Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            int hyphenationFrequency = textView.getHyphenationFrequency();
            int i10 = (!this.f32594d || TextUtils.indexOf((CharSequence) l7Var.K.b(dVar), (char) 173, 0, Math.min(l7Var.K.b(dVar).length(), 10)) <= 0) ? 0 : 1;
            if (hyphenationFrequency != i10) {
                textView.setHyphenationFrequency(i10);
            }
        }
    }

    public final void f(o8.i iVar, v9.d dVar, v9.b<Long> bVar, v9.b<Long> bVar2) {
        int i10;
        u8.a adaptiveMaxLines$div_release = iVar.getAdaptiveMaxLines$div_release();
        if (adaptiveMaxLines$div_release != null) {
            View.OnAttachStateChangeListener onAttachStateChangeListener = adaptiveMaxLines$div_release.f36060b;
            if (onAttachStateChangeListener != null) {
                adaptiveMaxLines$div_release.f36059a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
            adaptiveMaxLines$div_release.f36060b = null;
            adaptiveMaxLines$div_release.b();
        }
        Long lB = bVar == null ? null : bVar.b(dVar);
        Long lB2 = bVar2 != null ? bVar2.b(dVar) : null;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        if (lB == null || lB2 == null) {
            if (lB != null) {
                long jLongValue = lB.longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i11 = (int) jLongValue;
                } else {
                    int i13 = e9.a.f29114a;
                    if (jLongValue > 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                }
                i12 = i11;
            }
            iVar.setMaxLines(i12);
            return;
        }
        u8.a aVar = new u8.a(iVar);
        long jLongValue2 = lB.longValue();
        long j11 = jLongValue2 >> 31;
        if (j11 == 0 || j11 == -1) {
            i10 = (int) jLongValue2;
        } else {
            int i14 = e9.a.f29114a;
            i10 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue3 = lB2.longValue();
        long j12 = jLongValue3 >> 31;
        if (j12 == 0 || j12 == -1) {
            i11 = (int) jLongValue3;
        } else {
            int i15 = e9.a.f29114a;
            if (jLongValue3 > 0) {
                i11 = Integer.MAX_VALUE;
            }
        }
        u8.a.C0426a c0426a = new u8.a.C0426a(i10, i11);
        fd.j0.i(c0426a, "params");
        if (!fd.j0.d(aVar.f36062d, c0426a)) {
            aVar.f36062d = c0426a;
            TextView textView = aVar.f36059a;
            WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
            if (p0.e0.g.b(textView)) {
                aVar.a();
            }
            if (aVar.f36060b == null) {
                u8.b bVar3 = new u8.b(aVar);
                aVar.f36059a.addOnAttachStateChangeListener(bVar3);
                aVar.f36060b = bVar3;
            }
        }
        iVar.setAdaptiveMaxLines$div_release(aVar);
    }

    public final void g(TextView textView, i8.k kVar, v9.d dVar, l7 l7Var) {
        a aVar = new a(this, kVar, textView, dVar, l7Var.K.b(dVar), l7Var.f41287s.b(dVar).longValue(), l7Var.f41286r.b(dVar), l7Var.F, null, l7Var.f41292x);
        aVar.f32607m = new d(textView);
        aVar.a();
    }

    public final void h(TextView textView, y9.t tVar, y9.u uVar) {
        textView.setGravity(l8.b.x(tVar, uVar));
        int i10 = b.f32615a[tVar.ordinal()];
        int i11 = 5;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 4;
            } else if (i10 == 3) {
                i11 = 6;
            }
        }
        textView.setTextAlignment(i11);
    }

    public final void i(TextView textView, v9.d dVar, m7 m7Var) {
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        if (!x1.q.k(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new e(textView, m7Var, dVar, this, displayMetrics));
            return;
        }
        TextPaint paint = textView.getPaint();
        Shader shaderB = null;
        Object objA = m7Var == null ? null : m7Var.a();
        if (objA instanceof y9.g4) {
            y9.g4 g4Var = (y9.g4) objA;
            shaderB = g9.b.f30061e.a(g4Var.f40163a.b(dVar).longValue(), kc.t.G(g4Var.f40164b.b(dVar)), textView.getWidth(), textView.getHeight());
        } else if (objA instanceof y9.h5) {
            g9.d.b bVar = g9.d.f30072g;
            y9.h5 h5Var = (y9.h5) objA;
            y9.m5 m5Var = h5Var.f40288d;
            fd.j0.h(displayMetrics, "metrics");
            g9.d.c cVarB = b(this, m5Var, displayMetrics, dVar);
            fd.j0.f(cVarB);
            g9.d.a aVarA = a(this, h5Var.f40285a, displayMetrics, dVar);
            fd.j0.f(aVarA);
            g9.d.a aVarA2 = a(this, h5Var.f40286b, displayMetrics, dVar);
            fd.j0.f(aVarA2);
            shaderB = bVar.b(cVarB, aVarA, aVarA2, kc.t.G(h5Var.f40287c.b(dVar)), textView.getWidth(), textView.getHeight());
        }
        paint.setShader(shaderB);
    }
}
