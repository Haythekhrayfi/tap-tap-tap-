package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.l.ai;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class l extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f8170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f8171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f8172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f8173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f8174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f8176g;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.ui.l$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8178a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f8178a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8178a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8178a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(Context context) {
        this(context, null);
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8172c = Collections.emptyList();
        this.f8173d = c.f8039a;
        this.f8174e = 0.0533f;
        this.f8175f = 0;
        this.f8176g = 0.08f;
        b bVar = new b(context, attributeSet);
        this.f8170a = bVar;
        WebView webView = new WebView(context, attributeSet) { // from class: com.applovin.exoplayer2.ui.l.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.f8171b = webView;
        webView.setBackgroundColor(0);
        addView(bVar);
        addView(webView);
    }

    private static String a(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    private String a(int i10, float f10) {
        float fA = j.a(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fA == -3.4028235E38f ? "unset" : ai.a("%.2fpx", Float.valueOf(fA / getContext().getResources().getDisplayMetrics().density));
    }

    private static String a(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = AnonymousClass2.f8178a[alignment.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "center" : "end";
        }
        return "start";
    }

    private static String a(com.applovin.exoplayer2.i.a aVar) {
        float f10 = aVar.f6754r;
        if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return "";
        }
        int i10 = aVar.f6753q;
        return ai.a("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    private static String a(c cVar) {
        int i10 = cVar.f8043e;
        if (i10 == 1) {
            return ai.a("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", e.a(cVar.f8044f));
        }
        if (i10 == 2) {
            return ai.a("0.1em 0.12em 0.15em %s", e.a(cVar.f8044f));
        }
        if (i10 != 3) {
            return i10 != 4 ? "unset" : ai.a("-0.05em -0.05em 0.15em %s", e.a(cVar.f8044f));
        }
        return ai.a("0.06em 0.08em 0.15em %s", e.a(cVar.f8044f));
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:26:0x0107  */
    /* JADX WARN: Code duplicated, block: B:29:0x0121  */
    /* JADX WARN: Code duplicated, block: B:30:0x0124  */
    /* JADX WARN: Code duplicated, block: B:33:0x013b  */
    /* JADX WARN: Code duplicated, block: B:35:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0140  */
    /* JADX WARN: Code duplicated, block: B:38:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0149  */
    /* JADX WARN: Code duplicated, block: B:48:0x015b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x021f  */
    /* JADX WARN: Code duplicated, block: B:63:0x023b  */
    private void b() {
        String strA;
        int iB;
        int i10;
        float f10;
        String strA2;
        int i11;
        int i12;
        int i13;
        String str;
        String str2;
        int i14;
        String str3;
        String str4;
        int i15;
        h.a aVarA;
        Iterator it;
        h.a aVar;
        Layout.Alignment alignment;
        String str5;
        boolean z10;
        l lVar = this;
        StringBuilder sb2 = new StringBuilder();
        int i16 = 0;
        int i17 = 1;
        float f11 = 1.2f;
        sb2.append(ai.a("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", e.a(lVar.f8173d.f8040b), lVar.a(lVar.f8175f, lVar.f8174e), Float.valueOf(1.2f), a(lVar.f8173d)));
        HashMap map = new HashMap();
        map.put(e.a("default_bg"), ai.a("background-color:%s;", e.a(lVar.f8173d.f8041c)));
        int i18 = 0;
        while (i18 < lVar.f8172c.size()) {
            com.applovin.exoplayer2.i.a aVar2 = lVar.f8172c.get(i18);
            float f12 = aVar2.f6745i;
            float f13 = f12 != -3.4028235E38f ? f12 * 100.0f : 50.0f;
            int iB2 = b(aVar2.f6746j);
            float f14 = aVar2.f6742f;
            if (f14 != -3.4028235E38f) {
                if (aVar2.f6743g != i17) {
                    Object[] objArr = new Object[i17];
                    objArr[i16] = Float.valueOf(f14 * 100.0f);
                    strA = ai.a("%.2f%%", objArr);
                    iB = aVar2.f6753q == i17 ? -b(aVar2.f6744h) : b(aVar2.f6744h);
                } else if (f14 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    Object[] objArr2 = new Object[i17];
                    objArr2[i16] = Float.valueOf(f14 * f11);
                    strA = ai.a("%.2fem", objArr2);
                    iB = i16;
                    i10 = iB;
                } else {
                    Object[] objArr3 = new Object[i17];
                    objArr3[i16] = Float.valueOf(((-f14) - 1.0f) * f11);
                    strA = ai.a("%.2fem", objArr3);
                    iB = i16;
                    i10 = i17;
                }
                f10 = aVar2.f6747k;
                if (f10 != -3.4028235E38f) {
                    Object[] objArr4 = new Object[i17];
                    objArr4[0] = Float.valueOf(f10 * 100.0f);
                    strA2 = ai.a("%.2f%%", objArr4);
                } else {
                    strA2 = "fit-content";
                }
                String strA3 = a(aVar2.f6739c);
                String strA4 = a(aVar2.f6753q);
                String strA5 = lVar.a(aVar2.f6751o, aVar2.f6752p);
                if (aVar2.f6749m) {
                    i11 = aVar2.f6750n;
                } else {
                    i11 = lVar.f8173d.f8042d;
                }
                String strA6 = e.a(i11);
                i12 = iB;
                i13 = aVar2.f6753q;
                str = "right";
                str2 = "left";
                if (i13 != 1) {
                    if (i10 != 0) {
                        str = "left";
                    }
                    str2 = "top";
                    i14 = 2;
                    str3 = str;
                } else if (i13 != 2) {
                    str3 = i10 != 0 ? "bottom" : "top";
                    i14 = 2;
                } else {
                    if (i10 == 0) {
                        str = "left";
                    }
                    str2 = "top";
                    i14 = 2;
                    str3 = str;
                }
                if (i13 != i14 || i13 == 1) {
                    str4 = "height";
                    i15 = i12;
                    i12 = iB2;
                } else {
                    str4 = "width";
                    i15 = iB2;
                }
                aVarA = h.a(aVar2.f6738b, getContext().getResources().getDisplayMetrics().density);
                it = map.keySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    String str6 = (String) it.next();
                    h.a aVar3 = aVarA;
                    str5 = (String) map.put(str6, (String) map.get(str6));
                    if (str5 != null || str5.equals(map.get(str6))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    com.applovin.exoplayer2.l.a.b(z10);
                    it = it2;
                    aVarA = aVar3;
                }
                aVar = aVarA;
                sb2.append(ai.a("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i18), str2, Float.valueOf(f13), str3, strA, str4, strA2, strA3, strA4, strA5, strA6, Integer.valueOf(i15), Integer.valueOf(i12), a(aVar2)));
                sb2.append(ai.a("<span class='%s'>", "default_bg"));
                alignment = aVar2.f6740d;
                if (alignment != null) {
                    sb2.append(ai.a("<span style='display:inline-block; text-align:%s;'>", a(alignment)));
                    sb2.append(aVar.f8134a);
                    sb2.append("</span>");
                } else {
                    sb2.append(aVar.f8134a);
                }
                sb2.append("</span>");
                sb2.append("</div>");
                i18++;
                f11 = 1.2f;
                i16 = 0;
                lVar = this;
                i17 = 1;
            } else {
                Object[] objArr5 = new Object[i17];
                objArr5[i16] = Float.valueOf((1.0f - lVar.f8176g) * 100.0f);
                strA = ai.a("%.2f%%", objArr5);
                iB = -100;
            }
            i10 = i16;
            f10 = aVar2.f6747k;
            if (f10 != -3.4028235E38f) {
                Object[] objArr6 = new Object[i17];
                objArr6[0] = Float.valueOf(f10 * 100.0f);
                strA2 = ai.a("%.2f%%", objArr6);
            } else {
                strA2 = "fit-content";
            }
            String strA7 = a(aVar2.f6739c);
            String strA8 = a(aVar2.f6753q);
            String strA9 = lVar.a(aVar2.f6751o, aVar2.f6752p);
            if (aVar2.f6749m) {
                i11 = aVar2.f6750n;
            } else {
                i11 = lVar.f8173d.f8042d;
            }
            String strA10 = e.a(i11);
            i12 = iB;
            i13 = aVar2.f6753q;
            str = "right";
            str2 = "left";
            if (i13 != 1) {
                if (i10 != 0) {
                    str = "left";
                }
                str2 = "top";
                i14 = 2;
                str3 = str;
            } else if (i13 != 2) {
                if (i10 != 0) {
                }
                i14 = 2;
            } else {
                if (i10 == 0) {
                    str = "left";
                }
                str2 = "top";
                i14 = 2;
                str3 = str;
            }
            if (i13 != i14) {
                str4 = "height";
                i15 = i12;
                i12 = iB2;
            } else {
                str4 = "height";
                i15 = i12;
                i12 = iB2;
            }
            aVarA = h.a(aVar2.f6738b, getContext().getResources().getDisplayMetrics().density);
            it = map.keySet().iterator();
            while (it.hasNext()) {
                Iterator it3 = it;
                String str7 = (String) it.next();
                h.a aVar4 = aVarA;
                str5 = (String) map.put(str7, (String) map.get(str7));
                if (str5 != null) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                com.applovin.exoplayer2.l.a.b(z10);
                it = it3;
                aVarA = aVar4;
            }
            aVar = aVarA;
            sb2.append(ai.a("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i18), str2, Float.valueOf(f13), str3, strA, str4, strA2, strA7, strA8, strA9, strA10, Integer.valueOf(i15), Integer.valueOf(i12), a(aVar2)));
            sb2.append(ai.a("<span class='%s'>", "default_bg"));
            alignment = aVar2.f6740d;
            if (alignment != null) {
                sb2.append(ai.a("<span style='display:inline-block; text-align:%s;'>", a(alignment)));
                sb2.append(aVar.f8134a);
                sb2.append("</span>");
            } else {
                sb2.append(aVar.f8134a);
            }
            sb2.append("</span>");
            sb2.append("</div>");
            i18++;
            f11 = 1.2f;
            i16 = 0;
            lVar = this;
            i17 = 1;
        }
        sb2.append("</div></body></html>");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<html><head><style>");
        for (String str8 : map.keySet()) {
            sb3.append(str8);
            sb3.append("{");
            sb3.append((String) map.get(str8));
            sb3.append("}");
        }
        sb3.append("</style></head>");
        sb2.insert(0, sb3.toString());
        this.f8171b.loadData(Base64.encodeToString(sb2.toString().getBytes(Charsets.UTF_8), 1), "text/html", "base64");
    }

    public void a() {
        this.f8171b.destroy();
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List<com.applovin.exoplayer2.i.a> list, c cVar, float f10, int i10, float f11) {
        this.f8173d = cVar;
        this.f8174e = f10;
        this.f8175f = i10;
        this.f8176g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.applovin.exoplayer2.i.a aVar = list.get(i11);
            if (aVar.f6741e != null) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        if (!this.f8172c.isEmpty() || !arrayList2.isEmpty()) {
            this.f8172c = arrayList2;
            b();
        }
        this.f8170a.a(arrayList, cVar, f10, i10, f11);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f8172c.isEmpty()) {
            return;
        }
        b();
    }
}
